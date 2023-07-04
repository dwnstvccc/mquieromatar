
/**
 * Write a description of class Cantidades here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Libros {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int numClientes;
        Libreria miLibreria = new Libreria("77554","Biblioteca Nacional de Colombia","Santa Fe");
        String id, nombre, tiempo;
        double libros1, libros2, libros3;
        double promedio = 0;
        
        System.out.println("Ingrese la cantidad de clientes: ");
        numClientes = scanner.nextInt();
        
        for(int i = 0; i < numClientes; i++){
            System.out.println("Ingrese el nombre del cliente: ");
            nombre = scanner.next();
            System.out.println("Ingrese la identificacion del cliente: ");
            id = scanner.next();
            System.out.println("Ingrese el tiempo de prestamo de libros hecho al cliente: ");
            tiempo = scanner.next();
            System.out.println("Ingrese la primera cantidad de libros prestados al cliente: ");
            libros1 = scanner.nextDouble();
            System.out.println("Ingrese la segunda cantidad de libros prestados al cliente: ");
            libros2 = scanner.nextDouble();            
            System.out.println("Ingrese la tercera cantidad de libros prestados al cliente: ");
            libros3 = scanner.nextDouble();
            miLibreria.adicionarCliente(id, nombre, tiempo, libros1, libros2, libros3);
        }
        
        promedio = miLibreria.calcularPromedioGeneral();        
        System.out.println("\n El Promedio de libros prestados en la biblioteca es: " + promedio); 
    }
}
