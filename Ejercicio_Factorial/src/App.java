/*
 * 13/01/23
 * Objetivo: Realiza un codigo que realice una operacion factorial
 * Equipo: Individual
 * Autor: Luis Alejandro Cruz Inzunza
 * Estado: Completado
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int numero = Entrada();
        int resultado = 0;

        resultado = Validacion(numero);

        System.out.println("EL factorial de "+numero+ " es "+resultado);
    }

    public static int Entrada(){
        System.out.println("Vamos a sacar el factorial! ");
        System.out.println("Ingrese el numero del 1 al 20 ");
        Scanner lectura = new Scanner (System.in);
        int num = Integer.valueOf(lectura.nextLine());
        return num;
    }

    public static int Validacion(int num){
        int resultado = 0;

        if(num > 1  && num < 20){
            resultado = factorial(num);
        }else{
            System.out.println(" Corre de nuevo el programa y utiliza otro numero");
        }
        return resultado;

    }

    public static int factorial( int num){
        if(num == 0){
            return 1;
        }
        else{
            return num * factorial(num-1);
        }

    }
}