
import java.util.Scanner;

/***
 *Generar una función que tenga 4 parámetros de tipo decimal y devuelva el promedio cualitativo de los parámetros. 
 * Si el promedio es: De 0 a 5 el promedio cualitativo es Regular De 5.1 a 8 el promedio es Bueno De 8.1 a 9 el promedio es Muy Bueno De 9.1 a 10 el promedio es Sobresaliente. 
 * A la función se la debe llamar desde un método principal. 
 * Los parámetros necesarios para llamar a la función, deben ser ingresados solicitados al usuario.
 * @author patito
 */
public class Problema3_PromedioCualitativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, num3, num4, promedio;
        System.out.print("Ingrese la primera calificacion: ");
        num1 = scanner.nextDouble();
        System.out.print("Ingrese la segunda calificacion: ");
        num2 = scanner.nextDouble();
        System.out.print("Ingrese la tercera calificacion: ");
        num3 = scanner.nextDouble();
        System.out.print("Ingrese la cuarta calificacion: ");
        num4 = scanner.nextDouble();
        promedio = (num1 + num2 + num3 + num4)/4;
        String promedioCualitativo = calcularPromedioCualitativo(num1, num2, num3, num4);
        System.out.println("El promedio obtenido es: " + promedio);
        System.out.println("El promedio cualitativo es: " + promedioCualitativo);
    }
    public static String calcularPromedioCualitativo(double a, double b, double c, double d) {
        double promedio = (a + b + c + d) / 4;

        if (promedio >= 0 && promedio <= 5) {
            return "Regular";
        } else if (promedio > 5 && promedio <= 8) {
            return "Bueno";
        } else if (promedio > 8 && promedio <= 9) {
            return "Muy Bueno";
        } else if (promedio > 9 && promedio <= 10) {
            return "Sobresaliente";
        } else {
            return "Promedio fuera de rango";
        }
    }
}
