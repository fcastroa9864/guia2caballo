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
public class MovimientosNewClass {
    public void MovimientosNewClass (int fic, int colc, int filfi,int colfi){
          
        int contador = 0;
          int xcab = fic;
          int ycab = colc;
          int xfic = filfi;
          int yfic = colfi;
          
         // System.out.print(xcab);
         // System.out.print(ycab);
        DibujaMatriClass matri = new DibujaMatriClass();
        if ((xcab -xfic ) == (ycab -yfic))  {
            xcab = xcab + 2;
            ycab = ycab + 1;
            matri.DibujaMatriClass(xcab, ycab, xfic, yfic);
                       
        }
          
        if ((xcab -xfic ) < (ycab -yfic))  {
            xcab = xcab + 2;
            ycab = ycab + 1;
            matri.DibujaMatriClass(xcab, ycab, xfic, yfic);  
        }
        
         if ((xcab -xfic ) > (ycab -yfic))  {
            xcab = xcab - 2;
            ycab = ycab + 1;
            matri.DibujaMatriClass(xcab, ycab, xfic, yfic);  
        }
        //System.out.print(xcab);
        //System.out.print(ycab);
          
          
    }
}

