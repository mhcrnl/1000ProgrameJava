/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysTest;

/**
 *
 * @author mhcrnl
 */
public class ArrayTest {
    public static void main(String[] args) {
        int [][] table = new int[5][10];
        //incarcarea tabloului cu valori
        for(int row=0; row<table.length; row++)
            for(int col=0; col<table[row].length; col++)
                table[row][col] = row *10 +col;
        //Afisarea valori;or
        for(int row=0; row<table.length; row++){
            for(int col=0; col<table[row].length; col++){
                System.out.print(table[row][col]+"\t");
            }
            System.out.println();
        }
    }
    
}
