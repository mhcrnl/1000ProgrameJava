/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacodecheftheleadgame;

/**
 *
 * @author mhcrnl
 */
import java.util.Scanner;

class JavaCodeChefTheLeadGame {
    Scanner scanner = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public JavaCodeChefTheLeadGame(){
        int numOfRound = scanner.nextInt();
        int leadScore = 0;
        int leader = 0;
        int leadOne = 0;
        int leadTwo = 0;
        while(numOfRound > 0){
            int score1 = scanner.nextInt();
            int score2 = scanner.nextInt();
            leadOne += score1;
            leadTwo += score2;
            if(leadOne-leadTwo > leadScore){
                leader = 1;
                leadScore = leadOne-leadTwo;
            } else if(leadTwo-leadOne > leadScore){
                leader = 2;
                leadScore = leadTwo-leadOne;
            }
            numOfRound--;
        }
        System.out.printf("%d %d",leader, leadScore);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new JavaCodeChefTheLeadGame();
    }
    
}
