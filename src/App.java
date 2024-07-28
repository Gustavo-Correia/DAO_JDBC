import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;


public class App {

     
    public static void main(String[] args) throws Exception {
    Connection conn = null;
    Statement st = null;
    try{
        conn = DB.GetConnection();

        conn.setAutoCommit(false);
        
        st = conn.createStatement();

        int linhas = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 where departmentid = 1");
        
        // int x=1;
        // if(x<2){
        //     throw new SQLException("fake error");
        // }  
        int linhas2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 where departmentid = 2");

        conn.commit();
        System.out.println("linha 1" + linhas);
        System.out.println("linha 2" + linhas2);
    }
    catch(SQLException e){
        try {
            conn.rollback();
            throw new DbException("ERRO! A TRANSAÇÃO FOI DISFEITA E NÃO OCORREU! CAUSA DO ERRO: " + e.getMessage());
        } catch (SQLException e1) {
            
            throw new DbException("Erro na tentativa de desfazer a transação! CAUSA DO ERRO: " + e1.getMessage());
        }
    }
    finally{
        DB.CloseStatement(st);
        DB.closeConnection();
    }
}
}
