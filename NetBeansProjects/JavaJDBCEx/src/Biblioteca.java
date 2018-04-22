
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mhcrnl
 */
public class Biblioteca {
    
    static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
    static final String DB_URL = "jdbc:mariadb://localhost:3306/BIBLIOTECA";
    static final String USER = "root";
    static final String PASS = null;
    
    static Connection con = null;
    static Statement stm = null;
    
    public static void main(String[] args) {
        Biblioteca bib = new Biblioteca();
        bib.conectareBDBiblioteca();
        //bib.creareBDBiblioteca(con);
        //bib.creareTabelInBiblioteca(con);
        bib.inserareDateCuStatement(con);
        try {
            con.close();
            stm.close();
            System.out.println("Conexiunea a fost inchisa............");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    private Connection conectareBDBiblioteca() {
        //To change body of generated methods, choose Tools | Templates.
        try {
            Class.forName(JDBC_DRIVER);
            System.out.println("Conectare la baza de date..............");
            con = DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("Conectarea la baza de date este activa.");
            return con;
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    private void creareBDBiblioteca(Connection con){
        try {
            System.out.println("Crearea bazei de date biblioteca.......");
            stm = con.createStatement();
            String sql = "CREATE DATABASE BIBLIOTECA";
            stm.executeUpdate(sql);
            System.out.println("Baza de date BIBLIOTECA a fost creata...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void creareTabelInBiblioteca(Connection con){
        try {
            System.out.println("Creare tabelului CARTE in baza de date BIBLIOTECA");
            stm = con.createStatement();
            String sql = "CREATE TABLE CARTE "+
                    "(id INTEGER not NULL, "+
                    "titlu VARCHAR(255), " +
                    "autor VARCHAR(255), " +
                    "editura VARCHAR(255), "+
                    "PRIMARY KEY (id))" ;
            stm.executeUpdate(sql);
            System.out.println("Tabelul carte a fost creat....");
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
    private void inserareDateCuStatement(Connection con){
        try {
            System.out.println("Inserare date in CARTE cu Statement....");
            stm = con.createStatement();
            
            String sql = "INSERT INTO CARTE " +
                    "VALUES(1, 'Ani Pustii', 'Caterine Cookson', 'Munca')";
            //stm.executeUpdate(sql);
            
            String sql1 = "INSERT INTO CARTE " +
                    "VALUES(2, 'Ani Pustii', 'Caterine Cookson', 'Munca')";
            stm.executeUpdate(sql1);
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
    
}
