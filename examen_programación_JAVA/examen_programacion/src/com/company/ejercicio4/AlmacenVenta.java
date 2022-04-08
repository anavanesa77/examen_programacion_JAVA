package com.company.ejercicio4;

import java.util.LinkedList;

public class AlmacenVenta {
    LinkedList<Venta> ventas = new LinkedList<>();

    public float calcularMedia(){
        int suma = 0;
        //Por cada "objeto" de "tipo X" de la "colección" X haz esto
        for (Venta objeto: ventas) {
            suma+= objeto.getCargoVenta();
        }
        return suma / ventas.size();
    }

    public float maximoVenta(){
        float maximo = 0;
        for (Venta objeto: ventas) {
            if(maximo < objeto.getCargoVenta())
            {
                maximo = objeto.getCargoVenta();
            }
        }
        return maximo;
    }

    public float minimoVenta(){
        float minimo = ventas.get(0).getCargoVenta();
        for (Venta objeto:ventas) {
            if(minimo > objeto.getCargoVenta()){
                minimo = objeto.getCargoVenta();
            }
        }
        return  minimo;
    }
}
