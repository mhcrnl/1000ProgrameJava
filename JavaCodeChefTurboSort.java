/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.lang.*;
import java.util.*;



/**
 *
 * @author mhcrnl
 */
 class JavaCodeChefTurboSort {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[]T = new int[n];
        
        for(int i= 0; i<n;i++){
            T[i]= sc.nextInt();
        }
        Arrays.sort(T);
        for(int i=0; i<n; i++){
            System.out.println(T[i]);
        }
    }
    
}
