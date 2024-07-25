package com.laura;

public class Paralelogramo extends FiguraGeometrica {
    public int base;
    public int altura;
    public int lateral;

    @Override
    public double CalcularArea() {
        return base * altura;
    }
    public double CalcularArea(int base, int altura){
        return base*altura;
    }
    public double CalcularPerimetro(){
        return 2*lateral+2*base;
    }
    public double CalcularPerimetro(int base, int lateral){
        return 2*lateral + 2*base;
    }
    public int getBase(){
        return base;
    }
    public int getAltura(){
        return altura;
    }
    public int getLateral(){
        return lateral;
    }
    public void setBase(int base){
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setLateral(int lateral) {
        this.lateral = lateral;
    }
}
