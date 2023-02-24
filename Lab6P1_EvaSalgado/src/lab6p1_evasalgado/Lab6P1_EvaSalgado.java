
package lab6p1_evasalgado;

/**
 *
 * @author Eva Salgado
 */

import java.util.*; 
import static lab6p1_evasalgado.Lab6P1_EvaSalgado.leer;
import static lab6p1_evasalgado.Lab6P1_EvaSalgado.llenar;

public class Lab6P1_EvaSalgado {
    static Scanner leer = new Scanner(System.in);
    static Random alea = new Random();  
  
    public static void menu(){
      
    System.out.println("***Menu***");
    System.out.println("1. Suma de arreglos");
    System.out.println("2. Vocales y Consonantes");
    System.out.println("3. Floor and Cealing\n");
    System.out.println("Ingrese una opcion: ");
    
}
    
    public static void main(String[] args) {
        char resp = 's'; 
      do{
        menu(); 
        int opcion = leer.nextInt();
        switch (opcion){
            case 1:{
               System.out.println("Ingrese cantidad de clase de estudiante 1: ");
               int est1 = leer.nextInt();
               System.out.println("Ingrese cantidad de clase de estudiante 2: ");
               int est2= leer.nextInt();
               
               int[] num1 = new int [est1];
               num1 = llenar(est1);
               System.out.println("Estudiante 1:");
               imprimirint(num1); 
               System.out.println();
               
               int[] num2 = new int[est2]; 
               System.out.println("Estudiante 2: ");
               num2 = llenar(est2); 
               imprimirint(num2); 
               
               System.out.println("Total de ambos estudiantes");
               imprimirint(sumanotas(num1,num2));
               
               
               
               

            } break;
            
            case 2:{
                System.out.println("Ingrese una cadena: ");
                String cadena = leer.next(); 
                
                
                imprimirstring(vocales(cadena));
            } break; 
            
            case 3:{
                System.out.println("Ingrese tamaño de arreglo: ");
                int tam = leer.nextInt();
                
                int[] num = new int[tam]; 
                num = llenar(tam);
                System.out.println("Arreglo generado: ");
                imprimirint(pisosuelo(num));
                
                int[] comp1 = new int [tam];
                comp1 = llenar(tam);
                int[] comp2 = new int[tam]; 
                comp2 = llenar(tam); 
                
                imprimirint(mayoromenor(comp1));
                imprimirint(mayoromenor(comp2));
                
                
            }
        } 
        System.out.println("Desea intentar otra vez?: ");
        resp = leer.next().charAt(0);
      } while(resp=='s'||resp=='S'); 
    } 
    
  public static int[] llenar(int tam){
      int[]temp = new int [tam]; 
      for(int i=0;i<tam;i++){
          temp[i] = alea.nextInt(100);
      } return temp;
  } 
  
  
    
  public static void imprimirint (int[] array){
      for(int i=0;i<array.length;i++){
           System.out.println("["+ array[i] +"]");
      }
          
  }  
  
  public static void imprimirstring (String arrayst){
      for(int i=0;i<arrayst.length();i++){
           System.out.println("["+arrayst+"]");
      } 
          
  }  
    
  public static int[] arreglonotas (int[] array1, int[] array2){
   
    int[] temp = new int [array1.length]; 
    
    for(int i=0;i<array1.length;i++){
      
    
    if (array1.length<=100||array1.length>=0){
       temp[i] = alea.nextInt(2);
    } 
    for(int j=0;j<array1.length;j++){
        if (array2.length<=100||array2.length>=0){
    temp[j] = alea.nextInt(2);  
    }  
        }
    
    break;
    
    } return temp; 
   
}
  
  public static int[] sumanotas(int[]array1,int[]array2){
      int[]temp = new int[array1.length];
      int[] cont = new int[temp.length];
      for(int i=0;i<array1.length;i++){
          temp[i]=array1[i]+array2[i];
          cont[i] = temp[i]/temp.length;
      } return cont;
  } 
  
  public static String vocales(String x){
      int numletramin = 0;
      int numletramayus = 0;
      String acum = " ";
      String acum2 = " ";
      char[] arreglo = new char[5]; 
      for(int i=0;i<x.length();i++){
          arreglo[i] = x.charAt(i);
          numletramin = arreglo[i]; 
          numletramayus = arreglo[i];
        for(int j=0;j<arreglo.length;j++){
            if(numletramin<123&&numletramin>96){
             acum = acum + arreglo[j]; 
             
          } else if(numletramayus<91&&numletramayus>64){
              acum2 = acum2 + arreglo[j];  
          }  
        } 
        break; 
      } 
      String tot = acum + acum2;
      return tot;
  }
  
  public static int[] pisosuelo (int[] array){
      int[] temp = new int[array.length];
      
      for(int i=0;i<array.length;i++){
        if (array.length<=2570||array.length>=1000){
          temp[i] = alea.nextInt(2571); 
      }   
        
     } return temp;
  } 
  public static int[] mayoromenor(int[] temp){
      pisosuelo(temp);
      
      int[] tempold = new int[temp.length];
      int[] retorno = new int[temp.length];
      for(int i=0;i<temp.length;i++){
          if (retorno[i]<=temp[i]){
              tempold = temp;
              int[]tempsmall = tempold;
              retorno = tempsmall;
              break;
          } else if(retorno[i]>temp[i]){
              tempold = temp; 
              int[]tempbig = tempold;
              retorno = tempbig;
              break;
          } 
          break;
      }  return retorno; 
  } 
    
}
