package com.mycompany.automovil.clase;

public class Auto {

    //ATRIBUTOS
    public String marca;
    public int modelo;
    public float motor;
    public TipoCombustible tipoCombustible;
    public TipoAutomovil tipoAutomovil;
    public int numPuertas;
    public int cantAsientos;
    public float velocidadMax;
    public TipoColor color;
    public float velocidadActual;

    //METODOS
    //CONSTRUCTOR
    public Auto(String marca, int modelo, float motor, TipoCombustible tipoCombustible, TipoAutomovil tipoAutomovil, int numPuertas, int cantAsientos, float velocidadMax, TipoColor color, float velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numPuertas = numPuertas;
        this.cantAsientos = cantAsientos;
        this.velocidadMax = velocidadMax;
        this.color = color;
        this.velocidadActual = 0;
    }

    //GETTERS Y SETTERS
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public float getMotor() {
        return motor;
    }

    public void setMotor(float motor) {
        this.motor = motor;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public TipoAutomovil getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(TipoAutomovil tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getCantAsientos() {
        return cantAsientos;
    }

    public void setCantAsientos(int cantAsientos) {
        this.cantAsientos = cantAsientos;
    }

    public float getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(float velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public TipoColor getColor() {
        return color;
    }

    public void setColor(TipoColor color) {
        this.color = color;
    }

    public float getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(float velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    //OTROS METODOS
    public void acelerar(float velocidad) {
        if (velocidadActual + velocidad > velocidadMax) {
            System.out.println("No es permitido acelerar mas alla de la velocidad permitida.");
        } else {
            velocidadActual += velocidad;
        }
    }
    
    public void desacelerar(float velocidad) {
        if (velocidadActual - velocidad < 0) {
            System.out.println("No es posible desacelerar una velocidad negativa");
        } else {
            velocidadActual -= velocidad;
        }
    }

    public void frenar() {
        velocidadActual = 0;
    }

    public float calcularTiempoLLegada(float distancia) {
        if (velocidadActual == 0) {
            System.out.println("El automovil esta en reposo.");
        }
        return distancia / velocidadActual;
    }

    public void mostrarValores() {
        System.out.println("MARCA: " + marca);
        System.out.println("MODELO: " + modelo);
        System.out.println("MOTOR: " + motor + " litros");
        System.out.println("TIPO DE COMBUSTIBLE: " + tipoCombustible);
        System.out.println("TIPO DE AUTOMOVIL: " + tipoAutomovil);
        System.out.println("NUMERO DE PUERTAS: " + numPuertas);
        System.out.println("CANTIDAD DE ASIENTOS: " + cantAsientos);
        System.out.println("VELOCIDAD MAXIMA: " + velocidadMax + "km/h");
        System.out.println("COLOR: " + color);
        System.out.println("VELOCIDAD ACTUAL: " + velocidadActual + "km/h");
    }
}