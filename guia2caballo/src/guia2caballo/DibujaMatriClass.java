/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2caballo;
import java.util.Scanner;

/**
 *
 * @author FREDY CASTRO
 */
public class DibujaMatriClass {
    public int fc, cc, ff, cf, x, y;
    public void DibujaMatriClass (int fica, int colca, int filfic,int colfic){
        fc = fica;
        cc = colca;
        ff = filfic;
        cf = colfic;
        
        char matriz[][] = new char[8][8];
        
        System.out.print("TABLERO \n");
        
          for (int xx=0; xx < matriz.length; xx++) {
             for (int yy=0; yy < matriz[xx].length; yy++) {
                matriz [xx][yy] = '.';
        
            }
         }
          matriz[fc][cc] = 'c';
          matriz[ff][cf] = 'f';
        // imprime la matriz
        for (int xx=0; xx < matriz.length; xx++) {
          //  System.out.print("|");
         for (int yy=0; yy < matriz[x].length; yy++) {
            System.out.print("|");
            System.out.print (matriz[xx][yy]);
            System.out.print("|");
         if (yy!=matriz[xx].length-1) System.out.print("\t");
        }
            System.out.println(" ");
        }
        
    }
    
}
