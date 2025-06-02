package com.mycompany.automovil;

import com.mycompany.automovil.clase.Auto;
import com.mycompany.automovil.clase.TipoCombustible;
import com.mycompany.automovil.clase.TipoAutomovil;
import com.mycompany.automovil.clase.TipoColor;

public class Automovil {

    public static void main(String[] args) {
        Auto coche = new Auto ("Toyota", 2023, 1.8f, TipoCombustible.DIESEL, TipoAutomovil.COMPACTO, 4, 5, 195, TipoColor.BLANCO, 0);
        
        System.out.println("========== DATOS DEL AUTOMOVIL ==========");
        coche.mostrarValores();
        coche.setVelocidadActual(100);
        coche.acelerar(20);
        coche.desacelerar(50);
        
        System.out.println("");
        System.out.println("Tiempo para recorrer 100 km: " + coche.calcularTiempoLLegada(100) + " horas.");
        System.out.println("");
        
        System.out.println("===== DATOS ACTUALIZADOS DEL AUTOMOVIL =====");
        coche.mostrarValores();
    }
}
