package com.laura;

public class Cuadrado extends FiguraGeometrica {
    public int lado;

    @Override
    public double CalcularArea() {

        return lado*2;
    }

    @Override
    public double CalcularPerimetro() {
        return lado*4;
    }
    public int getLado(){
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
}
