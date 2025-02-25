import java.io.Reader;
import java.util.Scanner;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
/**
 * Clase Ejercicio
 * permite ingresar notas y calcular su promedio
 * @author veronica flor - A00411667
 */
public class Ejercicio {

    /**
     * calcularPromedio
     * Esta subrutina calcula el promedio en un arreglo de 5 NOTAS
     * 
     * @param notas Arreglo se ingresa las 5 notas por medio del arreglo
     * @return promedio de las notas ingresadas como decimal
     */
    public static double calcularPromedio(double[] notas){
            double resultado = 0;
            for(int i=0; i< notas.length; i++){
                resultado+= notas[i];
            }
            resultado= resultado/5.0;
            return resultado;
        }
 /**
  * main
  * metodo PRINCIPAL
  * permite ingresar las notas del usuario y muestra el promedio calculado
  * @param args Argumentos de la línea de comandos (no utilizados)
  */
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int cantNotas  =  5;
            double [] notas = new double[cantNotas];
            System.out.println("ingrese las notas del estudiante: ");
    
            for(int i= 0; i< cantNotas; i++){
    
                System.out.println("ingrese la nota #" +(i+1));
                
                double nota=sc.nextDouble();
                notas[i]= nota;
            }
            double promedio = calcularPromedio(notas);
        System.out.println("el promedio del estudiante es: " +promedio);

        sc.close();
    }
}