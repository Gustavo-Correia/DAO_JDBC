package Application;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import db.DB;
import db.DbException;
import model_dao.DaoFactory;
import model_dao.SellerDao;
import model_entities.Department;
import model_entities.Seller;


public class App {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    SellerDao sellerDao = DaoFactory.createSellerDao();

    System.out.println("=== TESTE1: seller findById =====");

    Seller seller = sellerDao.findById(3);

    System.out.println(seller);

    System.out.println("=== TESTE2: seller findByDepartment =====");

    Department department = new Department(2, null);

    List<Seller> list = sellerDao.findByDepartment(department);

    for (Seller seller2 : list) {
        System.out.println(seller2);
    }

    System.out.println("=== TESTE3: seller findall =====");

    list = sellerDao.findAll();

    for (Seller seller2 : list) {
        System.out.println(seller2);
    }

    System.out.println("=== TESTE4: insert new seller =====");
    Seller newseller = new Seller("GREG", null,"GREG@GMAIL.COM",new Date(),4000.0,department);

    sellerDao.insert(newseller);

    System.out.println("inserido!");

    System.out.println("=== TESTE5: Seller Update =====");
    seller = sellerDao.findById(1);
    seller.setNome("jorge");
    sellerDao.update(seller);
    System.out.println("Atualizado!");

    System.out.println("=== TESTE6: Delete Update =====");
    System.out.println("digite o id que sera deletado: ");
    int id = sc.nextInt();
    sellerDao.deleteById(id);
    
    System.out.println("Deletado!");
}
     
}

