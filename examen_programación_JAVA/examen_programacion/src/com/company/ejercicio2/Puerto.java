package com.company.ejercicio2;

import java.util.ArrayList;

public class Puerto {
    private ArrayList<Barco> barcos = new ArrayList<>();

    public float calcularMillas(){
        float suma = 0;

        for (Barco barco : barcos) {
            suma+= barco.getMillasNauticas();
        }

        return suma/barcos.size();
    }
}
