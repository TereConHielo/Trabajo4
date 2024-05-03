
package cars;

import java.util.Scanner;
import java.util.ArrayList;

public class RegistrosAutos {
    public static void main(String[] args) {
        ArrayList<Registro> registered = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        int buscar = 0;
        boolean encontrado = false;
        do {
            try{
            System.out.print("Ingrese una opción: ");
            System.out.println("\n1- Crear Registro");
            System.out.println("2- Buscar Registro");
            System.out.println("3- Editar Registro");
            System.out.println("4- Salir");
            opcion = teclado.nextInt();
            } catch(Exception e){
                System.out.println("Error: Datos incorrectos.");
                teclado.nextLine();               
            }
            switch(opcion) {
                case 1:
                    System.out.println("Ingrese datos del Vehiculo:");
                    try {
                        System.out.println("Ingrese el ID: ");
                        int ID = teclado.nextInt();
                        teclado.nextLine();

                        System.out.println("Ingrese la Marca del vehiculo: ");
                        String marca = teclado.nextLine();

                        System.out.println("Ingrese el Modelo del vehiculo: ");
                        String modelo = teclado.nextLine();

                        System.out.println("Ingrese el Año del vehiculo: ");
                        int anio = teclado.nextInt();
                        teclado.nextLine();

                        System.out.println("Ingrese el Tipo de vehiculo: ");
                        String tipo = teclado.nextLine();

                        System.out.println("Ingrese el Chasis del vehiculo: ");
                        int chasis = teclado.nextInt();
                        teclado.nextLine();

                        System.out.println("Ingrese el Color de su vehiculo: ");
                        String color = teclado.nextLine();

                        registered.add(new Registro(ID, marca, modelo, anio, tipo, chasis, color));
                    } catch (Exception e) {
                        System.out.println("Error: Datos incorrectos.");
                        teclado.nextLine();
                    }
                    break;

                case 2:
                    System.out.println("Ingrese el ID del vehiculo que desea buscar:");
                    try{
                    buscar = teclado.nextInt();

                    for (Registro registration : registered) {
                        if (buscar == registration.getID()) {
                            System.out.println("Este es su vehiculo: ");
                            encontrado = true;
                            registration.info();
                        }
                    }

                    if (!encontrado) {
                        System.out.println("No fse encontraron coincidencias...");
                    }} catch(Exception e){
                        System.out.println("Error: Datos incorrectos..");
                        teclado.nextLine();                        
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el ID del vehiculo para cambiar los datos:");
                    try{
                    buscar = teclado.nextInt();
                    } catch(Exception e){
                        System.out.println("Error: Datos incorrectos.");
                        teclado.nextLine(); 
                    }
                    for (Registro Registro : registered) {
                        if (buscar == Registro.getID()) {
                            try {
                                System.out.println("Nueva Marca ");
                                String nuevaMarca = teclado.nextLine();
                                teclado.nextLine(); 
                                Registro.setMarca(nuevaMarca);

                                System.out.println("Nuevo Modelo ");
                                String nuevoModelo = teclado.nextLine();
                                Registro.setModelo(nuevoModelo);

                                System.out.println("Nuevo Anio ");
                                int nuevoAnho = teclado.nextInt();
                                teclado.nextLine();
                                Registro.setAnio(nuevoAnho);

                                System.out.println("Nuevo Tipo ");
                                String nuevoTipo = teclado.nextLine();
                                Registro.setTipo(nuevoTipo);

                                System.out.println("Nuevo Chasis ");
                                int nuevoChasis = teclado.nextInt();
                                teclado.nextLine();
                                Registro.setChasis(nuevoChasis);

                                System.out.println("Nuevo Color ");
                                String nuevoColor = teclado.nextLine();
                                Registro.setColor(nuevoColor);

                                encontrado = true;
                            } catch (Exception e) {
                                System.out.println("Error: Datos incorrectos.");
                                teclado.nextLine();
                            }
                        }
                    }
                    if (!encontrado) {
                        System.out.println("No se encuentran coincidencias...");
                    }
                    break;

                case 4:
                    opcion = 4;
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
        } while (opcion != 4);
        teclado.close();
    }
}