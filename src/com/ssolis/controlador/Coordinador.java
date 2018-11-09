package com.ssolis.controlador;

import com.ssolis.modelo.Punto;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.JOptionPane;

/**
  * @Instituto Rumiñahui
 * @author SSolis
 */
public class Coordinador {
    
    ArrayList<Punto> listaPuntos=new ArrayList<Punto>();
    
    public void almacenarPuntos(){
      int resp=0;
        do{
          if(resp==0){
              Punto p= new Punto();
              p.setX(Integer.parseInt(JOptionPane.showInputDialog("ingresa X")));
              p.setY(Integer.parseInt(JOptionPane.showInputDialog("ingresa Y")));
              
             listaPuntos.add(p);
          }
      }while(resp==JOptionPane.showConfirmDialog(null, "deseas ingresar mas"
              + "puntos..?"));
    }

    public void imprimir(){
        String acu="";
        for (Punto listaPunto : listaPuntos) {
            acu +=listaPunto.toString()+"\n";
        }
        JOptionPane.showMessageDialog(null,acu);
    }
    
    public void menu(){
        int op=0;
       
           do {
               try{            
            op= Integer.parseInt(JOptionPane.showInputDialog("Ingresa una opción: \n"
                    + "1.- Ingresar Punto\n"
                    + "2.- Modificar coordenadas\n"
                    + "3.- Calcular la distancia entre 2 puntos\n"
                    + "4.- Imprimir\n"
                    + "5.- Salir"));
            switch(op){
                case 1:
                    almacenarPuntos();
                    break;
                case 2:
                    int i=Integer.parseInt(JOptionPane.showInputDialog(listaPuntos.toString()));
                    listaPuntos.get(i).setX(Integer.parseInt(JOptionPane.showInputDialog("ingrese nuevo parametro")));
                    listaPuntos.get(i).setY(Integer.parseInt(JOptionPane.showInputDialog("ingrese nuevo parametro")));
                    break;
                case 3:
                    break;
                case 4:
                    imprimir();
                    break;
            }
          }catch(Exception e){
           System.out.println("error");
           
              
    }  
        } while (op!=5);
       
    }
    
}










