
/**
 * Write a description of class libros here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Libros{
    public static void main(String [] args) throws Exception{
        Scanner scanner = new Scanner(System.in);        
        Libreria miLibreria  = new Libreria("73488383","Biblioteca Nacional de Colombia","Santa Fe");
        String id, nombre, tiempo;
        
        double promedio = 0;
        
        System.out.println("Ingrese el numero de Estudiantes de primaria: ");
        int numEstudiantesp = scanner.nextInt();
        for(int i = 0; i < numEstudiantesp; i++){
            double libros1, libros2;
            System.out.println("Ingrese la Identificacion del Estudiante de primaria: ");
            id = scanner.next();
            System.out.println("Ingrese el nombre del Estudiante: ");
            nombre = scanner.next();
            System.out.println("Ingrese el tiempo de prestamo de libros hechos al estudiante de primaria: ");
            tiempo = scanner.next();
            System.out.println("Ingrese la primera cantidad de libros prestados al estudiante de primaria: ");
            libros1 = scanner.nextDouble();
            System.out.println("Ingrese la segunda cantidad de libros prestados al estudiante de primaria: ");
            libros2 = scanner.nextDouble();    
            miLibreria .adicionarEstudiantePrimaria(id, nombre, tiempo, libros1, libros2);
        }
                
        System.out.println("Ingrese el numero de Estudiantes de Bachiller: ");
        int numEstudiantesb = scanner.nextInt();
        for(int i = 0; i < numEstudiantesb; i++){
            double libros1, libros2, libros3;
            System.out.println("Ingrese la identificacion de Estudiantes de Bachiller: ");
            id = scanner.next();
            System.out.println("Ingrese el nombre de Estudiantes de Bachiller: ");
            nombre = scanner.next();
            System.out.println("Ingrese el tiempo de prestamo de libros hechos al Estudiantes de Bachiller: ");
            tiempo = scanner.next();
            System.out.println("Ingrese la primera cantidad de libros prestados al Estudiantes de Bachiller: ");
            libros1 = scanner.nextDouble();
            System.out.println("Ingrese la segunda cantidad de libros prestados al Estudiantes de Bachiller: ");
            libros2 = scanner.nextDouble();            
            System.out.println("Ingrese la tercera cantidad de libros prestados al Estudiantes de Bachiller: ");
            libros3 = scanner.nextDouble();
            miLibreria .adicionarEstudianteBachiller(id, nombre, tiempo, libros1, libros2, libros3);
        }
        
        System.out.println("Ingrese el numero de Estudiantes Universitarios: ");
        int numEstudiantesu = scanner.nextInt();
        for(int i = 0; i < numEstudiantesu; i++){
            double libros1, libros2, libros3, libros4;
            System.out.println("Ingrese la identificacion del Estudiantes Universitario: ");
            id = scanner.next();
            System.out.println("Ingrese el nombre del Estudiante Universitario: ");
            nombre = scanner.next();
            System.out.println("Ingrese el tiempo de prestamo de libros hechos al Estudiante Universitario: ");
            tiempo = scanner.next();
            System.out.println("Ingrese la primera cantidad de libros prestados al Estudiante Universitario: ");
            libros1 = scanner.nextDouble();
            System.out.println("Ingrese la segunda cantidad de libros prestados al Estudiante Universitario: ");
            libros2 = scanner.nextDouble();            
            System.out.println("Ingrese la tercera cantidad de libros prestados al Estudiante Universitario: ");
            libros3 = scanner.nextDouble();
            System.out.println("Ingrese la cuarta cantidad de libros prestados al Estudiante Universitario: ");
            libros4 = scanner.nextDouble();
            miLibreria .adicionarEstudianteUniversitario(id, nombre, tiempo, libros1, libros2, libros3, libros4);
        }
        
        promedio = miLibreria.calcularPromedioGeneral();
        System.out.println("\n El Promedio de libros prestados en la biblioteca es: " + promedio); 
    }
}
