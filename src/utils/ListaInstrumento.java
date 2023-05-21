package utils;

import domain.Instrumentos;

public class ListaInstrumento {

    private Instrumentos[] instrumentos;

    private int cantActual;

    private int cantMax;

    public ListaInstrumento(){
        this.cantMax = 50;
        this.instrumentos = new Instrumentos[100];
        this.cantActual = 0;
    }

    public boolean agregarInstrumentos (Instrumentos newInstrumentos){
        if (this.cantActual < this.cantMax){
            this.instrumentos[this.cantActual] = newInstrumentos;
            return true;
        }
        return false;
    }

    public Instrumentos obtenerInstrumentos (int codigo){ return this.instrumentos[codigo];}

    public boolean venderInstrumentos (int codigo){return false;}

    public int getCantActual(){return cantActual;}



}
