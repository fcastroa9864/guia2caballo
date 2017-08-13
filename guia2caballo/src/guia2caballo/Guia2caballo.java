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
public class Guia2caballo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);  //crear un objeto Scanner
        System.out.print("Introduzca valores entre 0 y 7 \n");
        System.out.print("Introduzca la fila del caballo: ");
        int filaCaballo = sc.nextInt();
        System.out.print("Introduzca la columna del caballo: ");
        int colCaballo = sc.nextInt();
        System.out.print("Introduzca la fila de la ficha: ");
        int filaFicha = sc.nextInt();
        System.out.print("Introduzca la columna de la ficha: ");
        int colFicha = sc.nextInt();
        DibujaMatriClass matriz = new DibujaMatriClass();
        matriz.DibujaMatriClass(filaCaballo, colCaballo, filaFicha, colFicha);
       
        int restafila = filaCaballo - filaFicha;
        
        if (restafila < filaFicha){
           filaCaballo = filaCaballo + 2;
           colCaballo  = colCaballo + 1;  
           matriz.DibujaMatriClass(filaCaballo, colCaballo, filaFicha, colFicha);
           
        }
        
        
    }
    
}
