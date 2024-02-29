/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * https://github.com/JoseCarlosLucientes/ED04.git
 */
package cuentas;

/**
 *
 * @author José
 */
public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }

        // Llamamos al nuevo método operativa_cuenta con el parámetro cantidad
        operativa_cuenta(cuenta1, 150.5f);
    }

    // Nuevo método operativa_cuenta con el parámetro cantidad de tipo float
    private static void operativa_cuenta(CCuenta cuenta, float cantidad) {
        try {
            System.out.println("Ingreso en cuenta");
            cuenta.ingresar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }

        try {
            System.out.println("Retiro de cuenta");
            cuenta.retirar(50.5f);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
    }
}
