import java.io.Reader;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
public class Ejercicio {
    public static double calcularPromedio(double[] notas){
            double resultado = 0;
            for(int i=0; i< notas.length; i++){
                resultado+= notas[i];
            }
            resultado= resultado/5.0;
            return resultado;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int cantNotas  =  5;
            double [] notas = new double[cantNotas];
            System.out.println("ingrese las notas de jk: ");
    
            for(int i= 0; i< cantNotas; i++){
    
                System.out.println("ingrese la nota #" +(i+1));
                
                double nota=sc.nextDouble();
                notas[i]= nota;
            }
            double promedio = calcularPromedio(notas);
        System.out.println("el promedio de jk fue: " +promedio);
    }
}