
/**
 * Write a description of class Libros here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Libros {
public static void main(String [] args) throws Exception{
        Scanner scanner = new Scanner(System.in);        
        Libreria miLibreria = new Libreria("16589633","Biblioteca Nacional","Santa Fe");
        String id, nombre, tiempo;
        double libros1, libros2, libros3, libros4;
        double promedio = 0;
        int opcionMenu = 0;
        
        do{
            System.out.println("\nMenu de Opciones");
            System.out.println("1). Adicionar Estudiante de primaria ");
            System.out.println("2). Adicionar Estudiante de bachiller ");
            System.out.println("3). Adicionar Estudiante de universitario ");
            System.out.println("4). Calcular Promedio ");
            System.out.println("5). Salir \n");
            System.out.println("Elija una Opcion: ");
            opcionMenu = scanner.nextInt();
            switch(opcionMenu){
                case 1:
                        scanner.nextLine();
                        System.out.println("Ingrese la Identificacion del cliente: ");
                        id = scanner.next();
                        System.out.println("Ingrese el nombre del cliente: ");
                        nombre = scanner.next();
                        System.out.println("Ingrese el tiempo de prestamo hecho al cliente: ");
                        tiempo = scanner.next();
                        System.out.println("Ingrese la primera cantidad de libros prestados al cliente: ");
                        libros1 = scanner.nextDouble();
                        System.out.println("Ingrese la segunda cantidad de libros prestados al cliente: ");
                        libros2 = scanner.nextDouble();
                        try{
                            miLibreria.adicionarCliente(id, nombre, tiempo, libros1, libros2);
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                        System.out.println("********************");
                        break;
                case 2:
                        scanner.nextLine();
                        System.out.println("Ingrese la Identificacion del cliente: ");
                        id = scanner.next();
                        System.out.println("Ingrese el nombre del cliente: ");
                        nombre = scanner.next();
                        System.out.println("Ingrese el tiempo de prestamo hecho al cliente: ");
                        tiempo = scanner.next();
                        System.out.println("Ingrese la primera cantidad de libros prestados al cliente: ");
                        libros1 = scanner.nextDouble();
                        System.out.println("Ingrese la segunda cantidad de libros prestados al cliente: ");
                        libros2 = scanner.nextDouble();
                        System.out.println("Ingrese la tercera cantidad de libros prestados al cliente: ");
                        libros3 = scanner.nextDouble();
                        try{
                            miLibreria.adicionarCliente(id, nombre, tiempo, libros1, libros2, libros3);
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                        System.out.println("********************");
                        break;
                case 3:
                        scanner.nextLine();
                        System.out.println("Ingrese la Identificacion del cliente: ");
                        id = scanner.next();
                        System.out.println("Ingrese el nombre del cliente: ");
                        nombre = scanner.next();
                        System.out.println("Ingrese el tiempo de prestamo hecho al cliente: ");
                        tiempo = scanner.next();
                        System.out.println("Ingrese la primera cantidad de libros prestados al cliente: ");
                        libros1 = scanner.nextDouble();
                        System.out.println("Ingrese la segunda cantidad de libros prestados al cliente: ");
                        libros2 = scanner.nextDouble();
                        System.out.println("Ingrese la tercera cantidad de libros prestados al cliente: ");
                        libros3 = scanner.nextDouble();
                        System.out.println("Ingrese la cuarta cantidad de libros prestados al cliente: ");
                        libros4 = scanner.nextDouble();
                        try{
                            miLibreria.adicionarCliente(id, nombre, tiempo, libros1, libros2, libros3, libros4);
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                        System.out.println("********************");
                        break;
                case 4:
                        scanner.nextLine();
                        promedio = miLibreria.calcularPromedioGeneral();
                        System.out.println("\n El promedio de libros prestados es: " + promedio); 
                        break;
                default:
                        System.out.println("Ha Seleccionado Salir");
                        
            }
        }while(opcionMenu != 5);
    }
}
