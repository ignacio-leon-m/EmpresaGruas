package cl.duoc.gruas.ejecutable;

import cl.duoc.gruas.dominio.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //instanciando
        Scanner sc = new Scanner(System.in);
        Empresa colab = new Empresa();

        //inicializando variables
        int opc = 0;
        String tipoCol = "";
        String nombreAdm = "";
        String rutAdm = "";
        String depaAdm = "";
        int sueldoAdm = 0;
        //MENU
        while (true) {
            System.out.println("--Menu Empresa--");
            System.out.println("----------------------------------------");
            System.out.println("1. Agregar un colaborador");
            System.out.println("2. Eliminar un colaborador por rut");
            System.out.println("3. Buscar colaborador por nombre");
            System.out.println("4. Listar colaboradores");
            System.out.println("5. Salir");
            System.out.println("----------------------------------------");
            System.out.println("Ingrese una opcion: ");

            Administrativo admin1 = new Administrativo();
            Operario operario1 = new Operario();

            opc = sc.nextInt();

            if (opc == 1) {
                System.out.println("¿El colaborador es administrativo(A) u operario(B)?");
                tipoCol = sc.next();
                if (tipoCol.equalsIgnoreCase("A")) {
                    //pidiendo valores
                    System.out.println("Agregando a un administrativo: ");
                    System.out.println("Ingrese el nombre: ");
                    nombreAdm = sc.next();
                    System.out.println("Ingrese el rut: ");
                    rutAdm = sc.next();
                    System.out.println("Ingrese el departamento: ");
                    depaAdm = sc.next();
                    System.out.println("Ingrese el sueldo: ");
                    sueldoAdm = sc.nextInt();
                    //seteando
                    admin1.setNombre(nombreAdm);
                    admin1.setRut(rutAdm);
                    admin1.setDepartamento(depaAdm);
                    admin1.setSueldo(sueldoAdm);

                    colab.agregar(admin1);

                    System.out.println("Administrativo correctamente agregado");

                    admin1.mostrar();

                }
                if (tipoCol.equalsIgnoreCase("B")) {
                    Maquina maq1 = new Maquina();
                    //pidiendo valores y seteando a la vez
                    System.out.println("Agregando a un operario, \ndebe ingresar tambien los datos de la maquina a cargo");
                    System.out.println("Ingrese el nombre del operario");
                    operario1.setNombre(sc.next());
                    System.out.println("Ingrese el rut del operario");
                    operario1.setRut(sc.next());
                    System.out.println("Ingrese el sueldo del operario");
                    operario1.setSueldo(sc.nextInt());
                    System.out.println("--Datos de la maquina--");
                    System.out.println("Ingrese el tipo de e maquina: ");
                    maq1.setTipoMaquina(sc.next());
                    System.out.println("Ingrese el anio de la maquina: ");
                    maq1.setAnio(sc.nextInt());
                    System.out.println("Ingrese el numero de la maquina: ");
                    maq1.setNumero(sc.nextInt());
                    operario1.setMaquina(maq1); //seteo de la maquina

                    colab.agregar(operario1);
                    System.out.println("Operario correctamente agregado.");
                    operario1.mostrar();

                }
                if (!(tipoCol.equalsIgnoreCase("A") || tipoCol.equalsIgnoreCase("B"))) {
                    System.out.println("Ingreso un tipo de colaborador erroneo");
                }
            }

            if (opc == 2) {
                System.out.println("--Eliminar colaborador por rut--");
                colab.listarColaborador();
                for (Colaborador colTemp : colab.getColaboradores()) {
                    System.out.println("Rut disponibles para eliminar: " + colTemp.getRut());

                }
                System.out.println("Ingrese el rut del colaborador a eliminar");
                String eliminar = sc.next();
                colab.eliminarByRut(eliminar);
                /*for (Colaborador temp : colab.getColaboradores()) {
                    if(eliminar.equalsIgnoreCase(temp.getRut())){
                        colab.eliminarByRut(eliminar);
                        System.out.println("Colaborador eliminado");
                        break;
                    }
                }*/
            }

            if (opc == 3) {
                System.out.println("--Buscando colaborador por nombre\n: ");
                System.out.println("Ingrese el nombre del colaborador: ");
                String nombre = sc.next();
                colab.findByNombre(nombre);

            }

            if (opc == 4) {
                System.out.println("LISTANDO COLABORADORES");
                colab.listarColaborador();
            }

            if (opc == 5) {
                System.out.println("Gracias por utilizar el sistema");
                break;
            }

        }
    }
}
