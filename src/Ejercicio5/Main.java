package Ejercicio5;
public class Main {
    public static void main(String[] args) {
        float suma = 0;
        float x = 20;
        suma = suma + x;
        float y = 40;
        x = (float) (x + Math.pow(y, 2));
        suma = suma + (x/y);
        System.out.println("El valor de la suma es: " + suma);
    }
}