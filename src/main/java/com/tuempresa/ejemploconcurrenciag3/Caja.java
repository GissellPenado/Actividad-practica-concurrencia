package com.tuempresa.ejemploconcurrenciag3;

public class Caja {

    private int cantidadVentas = 0;
    private int totalRecaudado = 0;

    /**
     * synchronized premite que solamentw un Thread ejecute el método a la vez
     * Con esto evitamos el problema de race condition
     * @param vendedor es el número o nombre del vendedor (hilo)
     * @param monto es el monto asignado
     */

    public synchronized void registrarVentas(String vendedor, int monto){
        cantidadVentas++;
        totalRecaudado += monto;

        System.out.println(vendedor + "registró una venta de C$ " + monto + " | ventas acumuladas: "
                + cantidadVentas + " | total: C$ " + totalRecaudado);
    }

    public int getCantidadVentas() {
        return cantidadVentas;
    }

    public int getTotalRecaudado() {
        return totalRecaudado;
    }


}
