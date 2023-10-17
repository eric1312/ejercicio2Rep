/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2rep;

public abstract class Estacionamiento {
    private String nombre;
    private String dirección;
    private String horaApertura;
    private String horaCierre;
   private piso [] pisos;

    public Estacionamiento(String nombre, String dirección) {
        this.nombre = nombre;
        this.dirección = dirección;
        this.horaApertura = "8:00";
        this.horaCierre = "21:00";
        
        inicializarEstacionamiento(5, 10); // Inicializar con 5 pisos y 10 plazas por piso
    }

    public Estacionamiento(String nombre, String dirección, String horaApertura, String horaCierre, int numPisos, int numPlazas) {
        this.nombre = nombre;
        this.dirección = dirección;
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
       
        inicializarEstacionamiento(numPisos, numPlazas);
    }

    private void inicializarEstacionamiento(int numPisos, int numPlazas) {
        for (int piso = 1; piso <= numPisos; piso++) {
            pisos.getPisos(piso, new );
            for (int plaza = 1; plaza <= numPlazas; plaza++) {
                pisosPlazas.get(piso).put(plaza, null);
            }
        }
    }

    public boolean estacionarAuto(int piso, int plaza, Auto auto) {
        if (pisosPlazas.containsKey(piso) && pisosPlazas.get(piso).containsKey(plaza)) {
            if (pisosPlazas.get(piso).get(plaza) == null) {
                pisosPlazas.get(piso).put(plaza, auto);
                return true;
            }
        }
        return false;
    }

    public Auto desocuparPlaza(int piso, int plaza) {
        if (pisosPlazas.containsKey(piso) && pisosPlazas.get(piso).containsKey(plaza)) {
            Auto auto = pisosPlazas.get(piso).get(plaza);
            if (auto != null) {
                pisosPlazas.get(piso).put(plaza, null);
                return auto;
            }
        }
        return null;
    }

    // Getters y setters para los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getHoraApertura() {
        return horaApertura;
    }

    public void setHoraApertura(String horaApertura) {
        this.horaApertura = horaApertura;
    }

    public String getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(String horaCierre) {
        this.horaCierre = horaCierre;
    }
}


