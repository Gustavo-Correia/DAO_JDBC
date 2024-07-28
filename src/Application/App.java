package Application;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import db.DB;
import db.DbException;
import model_dao.DaoFactory;
import model_dao.SellerDao;
import model_entities.Department;
import model_entities.Seller;


public class App {
public static void main(String[] args) {
    
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
}
     
}

