/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javajdbcex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author mhcrnl
 */
public class JavaJDBCEx {

    /**
     * @param args the command line arguments
     */
    static final String JDBC_DRIVER = "con.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mariadb://localhost:3306/test";
    static final String USER = null;
    static final String PASS = null;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Connection conn = null;
        Statement stm =  null;
        
        try { 
            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("Conexiune la baza de date.....");
            conn = DriverManager.getConnection(DB_URL);
            System.out.println("Crearea Statement .............");
            stm = conn.createStatement();
            String sql = "CREATE TABLE REGISTRATION " +
                   "(id INTEGER not NULL, " +
                   " nume VARCHAR(255), " + 
                   " prenume VARCHAR(255), " + 
                   " varsta INTEGER, " + 
                   " PRIMARY KEY ( id ))"; 
            String insertData = "INSERT INTO REGISTRATION " +
                    "VALUES(100, 'Mihai','Cornel',40)";
            stm.executeUpdate(insertData);
            System.out.println("Crearea Tabelului Registration in:"+
                    DB_URL);
            
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception ex){
            ex.printStackTrace();
        }
        finally { 
            try {
                if(stm != null){
                    stm.close();
                }
            }catch (SQLException se){
                // nu faci nimic
            }
            try  {
                if(conn != null) conn.close();
            } catch (SQLException se){
                se.printStackTrace();
            }
                
            //conn.close();
        }
        System.out.println("La revedere");
    }
    
}
