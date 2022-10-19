package cl.duoc.gruas.dominio;

import java.util.ArrayList;

public class Empresa {
    //ATRIBUTOS
    public String nombre;
    public ArrayList<Colaborador> colaboradores;

    //CONSTRUCTORES
    public Empresa() {
        colaboradores = new ArrayList<Colaborador>(); //Colaboración
    }

    public Empresa(String nombre, ArrayList<Colaborador> colaboradores) {
        this.nombre = nombre;
        this.colaboradores = colaboradores;
    }

    //GETTERS & SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Colaborador> getColaboradores() {
        return colaboradores;
    }

    public void setColaboradores(ArrayList<Colaborador> colaboradores) {
        this.colaboradores = colaboradores;
    }

    //METODOS
    //agregar()
    public boolean agregar(Colaborador colaborador) {
        boolean agregado;
        agregado = this.colaboradores.add(colaborador);
        if(agregado){
            System.out.println("\nColaborador agregado\n");
        }
        if(!agregado){
            System.out.println("\nColaborador no fue agregado\n");
        }
        return agregado;
    }

    //eliminar()
    public boolean eliminarByRut(String rut) {
        boolean eliminado = false;
        for (Colaborador colTemp : this.colaboradores) {
            if (colTemp.getRut().equalsIgnoreCase(rut)) {
                this.colaboradores.remove(colTemp);
                System.out.println("Colaborador eliminado correctamente");
                eliminado = true;
                break;
            }
        }
        if(!eliminado){
            System.out.println("Colaborador no fue eliminado");
        }
        return eliminado;
    }

    //buscar()
    public boolean findByNombre(String nombre) {
        boolean encontrado = false;
        for (Colaborador colTemp : this.colaboradores) {
            if (colTemp.getNombre().equalsIgnoreCase(nombre)) {
                System.out.printf("Colaborador %s fue encontrado y es parte de la empresa.\n", nombre);
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            System.out.printf("Colaborador %s no es parte de nuestro sistema.\n",nombre);
        }
        return encontrado;
    }

    //listar()
    public void listarColaborador() {
        if (!this.colaboradores.isEmpty()) {
            for (Colaborador colTemp : this.colaboradores) {
                colTemp.mostrar();
            }
        }else{
            System.out.println("No existen colaboradores para mostar.");
        }

    }
}
