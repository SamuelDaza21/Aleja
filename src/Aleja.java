
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author dazas
 */
public class Aleja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int[] num=new int[5];
         int[]cont=new int[5];
   for(int a=0;a<5;a++){
       String n=JOptionPane.showInputDialog(null,"ingresa cinco numeros","Datos",JOptionPane.QUESTION_MESSAGE);
       num[a]=Integer.parseInt(n);
       }
   for(int b=0;b<5;b++){
       int temp=0;
           for(int c=0;c<5;c++){
               if(num[b]==num[c]){
                   temp++;
               }
               
           }
           cont[b]=temp;
          
       }
    String resultado = "";
        for(int b = 0; b < 5; b++){
            boolean confirmacion=false;
            for(int d=0;d<b;d++){
                if(num[b]==num[d]){
                    confirmacion=true;
                    break;
                }
            }
            if(!confirmacion){
            resultado += "Número " + num[b] + " se repite " + cont[b] + " veces.\n";
            }
        }

        JOptionPane.showMessageDialog(null, resultado, "Resultados", JOptionPane.INFORMATION_MESSAGE);
  
}
  
}
