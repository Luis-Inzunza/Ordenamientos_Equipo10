/*
 * 16/01/23
 * Objetivo: Realiza un codigo que realice lo que defina el diagrama de clase
 * Equipo: Individual
 * Autor: Luis Alejandro Cruz Inzunza
 * Estado: Completado/ falta mejores practicas (7/10)
 */

import java.util.Scanner;

public class CuentaBancaria {
    private double saldo = 0;

    public CuentaBancaria() {
        System.out.println("Vamos a crear una cuenta, por favor ingresa el saldo inicial");
        Scanner sc = new Scanner(System.in);
        double monto = sc.nextDouble();

        saldo = monto;
    }

    public void deposito() {
        System.out.println("inserte la cantidad que desea depositar");
        Scanner sc = new Scanner(System.in);
        double monto = sc.nextDouble();
        saldo = saldo + monto;
    }

    public void retiro() {
        System.out.println("inserte la cantidad que desea retirar");
        Scanner sc = new Scanner(System.in);
        double monto = sc.nextDouble();

        if (saldo > monto)
            saldo = saldo - monto;
    }

    public double VerificarSaldo() {
        return saldo;
    }

    private void Menu() {
        System.out.println();
        System.out.println("Que procedimiento quieres hacer? indica el numero");
        System.out.println("1.- Deposito");
        System.out.println("2.- Retirar");
        System.out.println("3.- Verificar Saldo");
        System.out.println("4.- Salir");
    }

    public static void main(String[] args) throws Exception {
        CuentaBancaria cuenta1 = new CuentaBancaria();

        int opcion = 1;

        while (opcion != 4) {

            cuenta1.Menu();

            Scanner lectura = new Scanner(System.in);
            opcion = Integer.valueOf(lectura.nextLine());

            if (opcion == 1) {
                cuenta1.deposito();
                System.out.println("// Su saldo a sido actualizado //");
            }
            if (opcion == 2) {
                cuenta1.retiro();
                System.out.println("// Su saldo a sido actualizado y retirado....quien sabe donde xd //");
            }
            if (opcion == 3) {
                System.out.println(" // Su saldo es " + cuenta1.VerificarSaldo() + " //");
            }

        }
        System.out.println("Gracias por usar el sistema");

    }

}
