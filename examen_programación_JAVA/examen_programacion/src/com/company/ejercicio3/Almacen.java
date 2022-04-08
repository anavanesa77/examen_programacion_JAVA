package com.company.ejercicio3;

import java.util.Iterator;
import java.util.TreeSet;

public class Almacen {
    private TreeSet<Aereo> aereos = new TreeSet<>();

    public float calcularMediaAvion(){
        float suma = 0;
        int numeroAviones = 0;

        for (Aereo aereo : aereos) {
            if (aereo.getClass() == Avion.class){
                Avion avion = (Avion)aereo;
                suma+=avion.getNumeroKilometros();
                numeroAviones++;
            }
        }
        return suma/numeroAviones;
    }

    public float calcularMediaHelicoptero(){

        float sumaKilometros = 0;
        int numeroHelicopteros = 0;

        for (Aereo aereo: aereos) {
            if (aereo.getClass() == Helicoptero.class){
                Helicoptero helicoptero = (Helicoptero) aereo;
                sumaKilometros += helicoptero.getNumeroKilometros();
                numeroHelicopteros++;
            }
        }

        Iterator<Aereo> iterator = aereos.iterator();

        while (iterator.hasNext())
        {
            Aereo aereo = iterator.next();

            if (aereo.getClass() == Helicoptero.class){
                Helicoptero helicoptero = (Helicoptero) aereo;
                sumaKilometros += helicoptero.getNumeroKilometros();
                numeroHelicopteros++;
            }
        }

        return sumaKilometros/numeroHelicopteros;
    }
}
