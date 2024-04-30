package models;

public class Triangulo {
  public static boolean formaTriangulo(int lado1, int lado2, int lado3) {
    return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
  }

}
