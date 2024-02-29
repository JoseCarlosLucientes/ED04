/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *   https://github.com/JoseCarlosLucientes/ED04.git
 */
package cuentas;

/**
 *
 * @author José
 */
public class CCuenta {

    /**
     * Nombre del titular de la cuenta.
     */
    private String nombre; 

    /**
     * Número de cuenta.
     */
    private String cuenta; 

    /**
     * Saldo actual de la cuenta.
     */
    private double saldo; 

    /**
     * Tipo de interés de la cuenta.
     */
    private double tipoInteres; 

    /**
     * Constructor por defecto de la clase CCuenta.
     */
    public CCuenta() { 
    }

    /**
     * Constructor que inicializa los atributos de la cuenta.
     * 
     * @param nom   Nombre del titular.
     * @param cue   Número de cuenta.
     * @param sal   Saldo inicial.
     * @param tipo  Tipo de interés.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) { 
        nombre = nom; 
        cuenta = cue; 
        saldo = sal; 
        tipoInteres = tipo; 
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     * 
     * @return El saldo actual de la cuenta.
     */
    public double getSaldo() { 
        return saldo;
    }

    /**
     * Establece un nuevo valor para el saldo de la cuenta.
     * 
     * @param saldo El nuevo saldo de la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el nombre del titular de la cuenta.
     * 
     * @return El nombre del titular de la cuenta.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece un nuevo valor para el nombre del titular de la cuenta.
     * 
     * @param nombre El nuevo nombre del titular de la cuenta.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de cuenta.
     * 
     * @return El número de cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece un nuevo valor para el número de cuenta.
     * 
     * @param cuenta El nuevo número de cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el tipo de interés de la cuenta.
     * 
     * @return El tipo de interés de la cuenta.
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Establece un nuevo valor para el tipo de interés de la cuenta.
     * 
     * @param tipoInteres El nuevo tipo de interés de la cuenta.
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    /**
     * Obtiene el estado actual de la cuenta (saldo).
     * 
     * @return El saldo actual de la cuenta.
     */
    public double estado() {
        return saldo;
    }

    /**
     * Realiza un ingreso en la cuenta.
     * 
     * @param cantidad La cantidad a ingresar.
     * @throws Exception Se lanza si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Realiza un retiro de la cuenta.
     * 
     * @param cantidad La cantidad a retirar.
     * @throws Exception Se lanza si la cantidad es negativa o si no hay suficiente saldo.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}