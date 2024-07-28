package Application;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import db.DB;
import db.DbException;
import model_entities.Department;
import model_entities.Seller;


public class App {

     Department obj = new Department(1,"DEPARTAMENTO DE LIVROS");

     Seller seller = new Seller("Bob", 1,"bob@gmail.com",new Date(),1500.00, obj);
}

