package com.laura;
public class Triangulo extends FiguraGeometrica {
    public int base;
    public int altura;
    public int lado;
    @Override
    public double CalcularArea() {
        return base * altura / 2;
    }
    public double CarcularArea(int base, int altura) {
        return base * altura / 2;
    }
    @Override
    public double CalcularPerimetro() {
        return lado * 3;
    }
    public double CarcularPerimetro(int lado) {
        return lado * 3;
    }
    public int getBase(){
        return base;
    }
    public int getAltura(){
        return altura;
    }
    public int getLado(){
        return lado;
    }
    public void setAltura(int altura){
        this.altura = altura;
    }
    public void setBase(int base){
        this.base = base;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
}