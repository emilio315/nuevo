/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication63;
import java.util.Scanner;
/**
 *
 * @author Carlos
 */
public class JavaApplication63 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        System.out.print("Base : ");
        int b=leer.nextInt();
        System.out.print("Sumando A : ");
        String num1=leer.next();
        System.out.print("Sumando B : ");
       String num2=leer.next();
       int may=Math.max(num1.length(), num2.length())+1;
       char matriz[][]=new char[3][may];
       for(int i=matriz[0].length-1,v=num1.length()-1;v>=0;v--,i--){
           matriz[0][i]=num1.charAt(v);
       }
       for(int e=matriz[1].length-1,v=num2.length()-1;v>=0;v--,e--){
           matriz[1][e]=num2.charAt(v);
       }
  for(int cont=matriz[2].length-1;cont>=0;cont--){
      switch(matriz[1][cont]){
          case('1'):matriz[2][cont]=(char)(matriz[0][cont]+1);
              break;
          case('2'): matriz[2][cont]=(char)(matriz[0][cont]+2);
              break;
          case('3'):matriz[2][cont]=(char)(matriz[0][cont]+3);
              break;
         case('4'):matriz[2][cont]=(char)(matriz[0][cont]+4);
             break;
          case('5'):matriz[2][cont]=(char)(matriz[0][cont]+5);
              break;
           case('6'):matriz[2][cont]=(char)(matriz[0][cont]+6);
               break;
            case('7'):matriz[2][cont]=(char)(matriz[0][cont]+7);
                break;
             case('8'):matriz[2][cont]=(char)(matriz[0][cont]+8);  
                 break;
             case('9'):matriz[2][cont]=(char)(matriz[0][cont]+9);
                 break;
              case('A'):matriz[2][cont]=(char)(matriz[0][cont]+10);
                  break;
               case('B'):matriz[2][cont]=(char)(matriz[0][cont]+11);
                   break;
               case('C'):matriz[2][cont]=(char)(matriz[0][cont]+12);
                   break;
               case('D'):matriz[2][cont]=(char)(matriz[0][cont]+13);
                   break;
                case('E'):matriz[2][cont]=(char)(matriz[0][cont]+14);    
                    break;
                 case('F'):matriz[2][cont]=(char)(matriz[0][cont]+15);
                 break;
               case('G'):matriz[2][cont]=(char)(matriz[0][cont]+16);
                   break;
               case('0'):matriz[2][cont]=(char)(matriz[0][cont]+0);
                   break;
              }
      if(matriz[2][cont]>57 && matriz[2][cont]<65){
          matriz[2][cont]=(char)(matriz[2][cont]+7);
      }
      if(matriz[2][cont]>(char)b){
          matriz[2][cont]=(char)(matriz[2][cont]-b);
      }
      
  }
  imprimir(matriz);
       
}
    public static void imprimir(char matriz[][]){
        for(int r=0;r<matriz.length;r++){
            for(int c=0;c<matriz[r].length;c++){
                System.out.print(matriz[r][c]+"\t");
            }
            System.out.println("");
        }
    }
}
