package com.laura;

public class Circulo extends FiguraGeometrica{
    public double pi;
    public int radio;

    @Override
    public double CalcularArea() {
        return pi*radio*3;
    }
    public double CalcularPerimetro(){
        return 2*pi*radio;
    }
    public double CalcularArea(int pi, int radio){
        return pi*radio*3;
    }
    public double CalcularPerimetro(int pi, int radio){
        return 2*pi*radio;
    }

    public double getPi(){
        return pi;
    }
    public int getRadio(){
        return radio;
    }
    public void setPi(double pi){
        this.pi = pi;
    }
    public void setRadio(int radio){
        this.radio = radio;
    }
}
