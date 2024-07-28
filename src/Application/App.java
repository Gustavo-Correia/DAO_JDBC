package Application;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;
import model_dao.DaoFactory;
import model_dao.SellerDao;
import model_entities.Seller;


public class App {
public static void main(String[] args) {
    
    SellerDao sellerDao = DaoFactory.createSellerDao();

    Seller seller = sellerDao.findById(3);

    System.out.println(seller);

}
     
}

