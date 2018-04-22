/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javajdbcex;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author mhcrnl
 */
public class BazaDateEx {
    
    static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
    static final String DB_URL = "jdbc:mariadb://localhost:3306/test";
    static final String USER = null;
    static final String PASS = null;
    Connection conn = null;
    Statement stm = null;
    
    public static void main(String[] args) {
       BazaDateEx bde = new BazaDateEx();
       //bde.adaugareInregistrari();
       bde.citireInregistrari();
    }

    private void citireInregistrari() {
        //To change body of generated methods, choose Tools | Templates.
        
        try {
            //Step 2: Inregistrarea driverului JDBC
            Class.forName("org.mariadb.jdbc.Driver");
            //Step 3: Deschiderea unei conexiuni
            System.out.println("Conexiune la baza de date.....");
            conn = DriverManager.getConnection(DB_URL);
            System.out.println("Crearea Statement .............");
            //Step 4: Executarea unei interogari
            stm = conn.createStatement();
            String sql = "SELECT id, nume, prenume, varsta FROM REGISTRATION";
            ResultSet rs = stm.executeQuery(sql);
            //Step 5: Extragerea datelor din ResultSet rs
            printColoane();
            while (rs.next()){
                int id = rs.getInt("id");
                int varsta = rs.getInt("varsta");
                String nume = rs.getString("nume");
                String prenume = rs.getString("prenume");
                printSiruri(id, varsta, nume, prenume);
                
//                System.out.print("ID: "+id);
//                System.out.print(" VARSTA: "+varsta);
//                System.out.print(" NUME: "+nume);
//                System.out.print(" PRENUME: "+prenume);
            }
            rs.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(stm != null) conn.close();
            } catch (SQLException e) {
                //nu adaugam nimic
            }
            try {
                if(conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\nLA REVEDERE!");
    }

    private void adaugareInregistrari() {
        //To change body of generated methods, choose Tools | Templates.
        try {
            //Step 2: inregistrarea driverului JDBC
            Class.forName("org.mariadb.jdbc.Driver");
            //Step 3: Crearea unei conexiuni
            System.out.println("Se incearca conectarea la baza de date....");
            conn = DriverManager.getConnection(DB_URL);
            //Step 4: Introducerea datelor in baza de date
            System.out.println("Crearea unui statement pt introducerea datelor..,");
            stm = conn.createStatement();
            
            String insertData = "INSERT INTO REGISTRATION " +
                    "VALUES(102, 'Mihai','Viorel',65)";
            stm.executeQuery(insertData);
            String insertData1 = "INSERT INTO REGISTRATION " +
                    "VALUES(101, 'Mihai','Irina',40)";
            stm.executeQuery(insertData1);
            
            System.out.println("Datele au fost inregistrate......");
            
        } catch (SQLException e) { //Erorile pt JDBC
            e.printStackTrace();
        } catch (Exception ex){ // erorile pt Class.forName
            ex.printStackTrace();
        } finally {
            try {
                if(stm != null) conn.close();
            } catch (SQLException e) { 
                //nu se face nimic
            } 
            try {
                if(conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("La revedere!");
    }

    private void printColoane() {
        //To change body of generated methods, choose Tools | Templates.
        System.out.printf("\n%-20s %10s %10s %10s", "ID", "VARSTA","NUME", "PRENUME");
    }

    private void printSiruri(int id, int varsta, String nume, String prenume) {
        //To change body of generated methods, choose Tools | Templates.
        System.out.printf("\n%-20d %10d %10s %10s", id, varsta, nume, prenume);
    }
    
    
    
}
