package com.laura;

public class Principal {
    public static void main(String[]args){
        Triangulo triangulo = new Triangulo();
        Cuadrado cuadrado = new Cuadrado();
        Paralelogramo paralelogramo = new Paralelogramo();
        Circulo circulo = new Circulo();

        triangulo.setAltura(9);//datos triangulo
        triangulo.setBase(7);
        triangulo.setLado(5);

        cuadrado.setLado(4);//datos cuadrado

        paralelogramo.setAltura(4);//datos paralelogramo
        paralelogramo.setBase(6);
        paralelogramo.setLateral(5);

        circulo.setPi(3.14);//datos circulo
        circulo.setRadio(4);

        //respuesta mostrada en pantalla
        System.out.println("El Area del triangulo es: " + triangulo.CalcularArea());
        System.out.println("El Perimetro del triangulo es: " + triangulo.CalcularPerimetro());
        System.out.println();
        System.out.println("El Area del cuadrado es: "+ cuadrado.CalcularArea());
        System.out.println("El Perimetro del cuadrado es: "+ cuadrado.CalcularPerimetro());
        System.out.println();
        System.out.println("El Area del paralelogramo es: "+ paralelogramo.CalcularArea());
        System.out.println("El perimetro del paralelogramo es: "+ paralelogramo.CalcularPerimetro());
        System.out.println();
        System.out.println("El Area del circulo es: "+ circulo.CalcularArea());
        System.out.println("El perimetro del circulo es:"+ circulo.CalcularPerimetro());
    }


}
