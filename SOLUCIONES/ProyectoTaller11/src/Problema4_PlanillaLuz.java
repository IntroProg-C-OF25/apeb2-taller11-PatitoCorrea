
import java.util.Scanner;

/***
 *Generar un procedimiento para calcular el valor de la planilla de luz y otro procedimiento para calcular el valor del predio de un bien inmueble. 
 * Cada procedimiento debe tener 2 parámetros (tipo cadena para nombre del cliente, cédula del cliente).
 * En el procedimiento de planilla de luz se debe pedir los siguiente datos valor del kilowatio y el número de kilowatios del mes. 
 * Y se genera en pantalla el siguiente reporte: Cliente Ana Contreras con cédula 1100112233 debe cancelar el valor de $10
 * En el procedimiento del predio se debe pedir el valor de inmueble y el para obtener el valor del predio se saca el 2% del valor del inmueble. 
 * Y se genera el siguiente reporte:
 * Cliente Ana Contreras con cédula 1100112233 tiene un bien inmueble valorado en $30000 y tiene que pagar de predio $ 600.
 * En el método principal; si el usuario ingresa 1 se llama al procedimiento calcularValorLuz; 2 se llama al procedimiento calcularPredio. 
 * Los datos que se necesita en cada procedimiento se los debe ingresar por teclado.
 * @author patito
 */
public class Problema4_PlanillaLuz {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int opcion;
        String Nombre, Cedula;
        System.out.println("Seleccione una opción:");
        System.out.println("1. Calcular el valor de la planilla de luz");
        System.out.println("2. Calcular el valor del predio");
        System.out.print("Opción: ");
        opcion = tcl.nextInt();
        tcl.nextLine();
        
        System.out.print("Ingrese su Nombre: ");
        Nombre = tcl.nextLine();
        System.out.print("Ingrese su Cédula: ");
        Cedula = tcl.nextLine();
        if (opcion == 1) {
            calcularValorPlanilla(tcl, Nombre, Cedula);
        } else if (opcion == 2) {
            calcularPredio(tcl, Nombre, Cedula);
        } else {
            System.out.println("La opción es incorrecta. Inténtelo de nuevo, por favor :)");
        }
    }
    public static void calcularValorPlanilla(Scanner tcl, String Nombre, String Cedula) {
        System.out.print("Ingrese el valor del kilovatio: ");
        double kilovatio = tcl.nextDouble();
        System.out.print("Ingrese la cantidad de kilovatios consumidos durante este mes: ");
        double kmes = tcl.nextDouble();
        double totalP = kilovatio * kmes;
        System.out.printf("Cliente %s con cédula %s debe cancelar el valor de $%.2f%n", 
                Nombre, Cedula, totalP);
    }
    public static void calcularPredio(Scanner tcl, String Nombre, String Cedula) {
        System.out.print("Ingrese el valor del bien inmueble: ");
        double valorI = tcl.nextDouble();
        double valorP = valorI * 0.02;
        System.out.printf("Cliente %s con cédula %s tiene un bien inmueble valorado en $%.2f y tiene que pagar de predio $%.2f%n", 
                Nombre, Cedula, valorI, valorP);
    }
}
