
import java.util.Scanner;

/***
 *Generar una solución que implemente 3 procedimientos. Que permitan calcular el área de un cuadrado, área de un triángulo y área de un rectángulo. 
 * Cada procedimiento/función debe recibir los datos necesarios y generar el valor correspondiente. 
 * Se debe invocar a los procedimientos desde un método principal; 
 * Si el usuario ingresa 1 se llama al procedimiento obtenerAreaCuadrado; 2 se llama al procedimiento obtenerAreaTriangulo; 3 se llama al procedimiento obtenerAreaCuadrado.
El área del cuadrado es igual a lado x lado x lado x lado
El área del triángulo es igual a (base x altura)/2
El área del rectángulo es igual a base x altura
 * @author patito
 */
public class Problema2_CalcularArea {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int lado, areac = 0, b, h, areat = 0, B, H, arear = 0;
        System.out.print("INGRESE EL VALOR DEL LADO DEL CUADRADO: ");
        lado = tcl.nextInt();
        System.out.print("INGRESE LA BASE Y LA ALTURA DEL TRIANGULO: ");
        b = tcl.nextInt(); 
        h = tcl.nextInt();
        System.out.print("INGRESE LA BASE Y LA ALTURA DEL RECTANGULO: ");
        B = tcl.nextInt();
        H = tcl.nextInt();
        System.out.println("EL AREA DEL RECTANGULO ES: ");
        System.out.println(AreaCuadrado(lado));
        System.out.println("EL AREA DEL TRIANGULO ES: ");
        System.out.println(AreaTriangulo(b, h));
        System.out.println("EL AREA DEL RECTANGULO ES: ");
        System.out.println(AreaRectangulo(B, H));
    }
    public static int AreaCuadrado(int lado) {
        return lado + lado + lado;
    }
    public static int AreaTriangulo(int b, int h) {
        return ((b*h)/2);
    }
    public static int AreaRectangulo(int B, int H) {
        return B * H;
    }
}
