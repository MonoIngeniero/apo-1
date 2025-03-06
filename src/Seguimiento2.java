import java.util.Scanner;

public class Seguimiento2{

    public static int registrarPuntajes(int jugadores, int cantidadRondas, int [] jugador, int[] puntaje){
        int contador = 0;
        for(int i = 0; i < jugadores; i++){
            jugador[i]=sc.nextInt();

            for(int j = 0; j < cantidadRondas; j++){
                System.out.print("Jugador " +i+ "- Puntaje en la ronda " +j+": ");
                puntaje[contador]=sc.nextInt();
                 
            }
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba la cantidad de jugadores: ");
        int jugadores = sc.nextInt();

        while (jugadores>10) {
            System.out.print("Se permiten maximo 10 jugadores, escriba la cantidad de nuevo:");
            jugadores= sc.nextInt();
        }

        System.out.print("Escriba la cantidad de rondas: ");
        int cantidadRondas = sc.nextInt();

        while (cantidadRondas>5) {
            System.out.print("Se permiten maximo 5 rondas, escriba la cantidad de nuevo:");
            jugadores= sc.nextInt();
        }

        int jugador[] = new int[jugadores];
        int puntaje [] = new int[cantidadRondas];

        System.out.println(registrarPuntajes(jugadores, cantidadRondas, jugador, puntaje));
    } 
}