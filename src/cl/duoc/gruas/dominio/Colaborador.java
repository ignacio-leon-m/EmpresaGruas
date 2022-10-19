package cl.duoc.gruas.dominio;

public abstract class Colaborador implements Calculable{
    //ATRIBUTOS
    protected String nombre;
    protected String rut;
    protected int sueldo;

    //CONSTRUCTORES
    public Colaborador() {
    }

    public Colaborador(String nombre, String rut, int sueldo) {
        this.nombre = nombre;
        this.rut = rut;
        this.sueldo = sueldo;
    }

    //GETTERS & SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    //METODOS
    //marcarAsistencia()
    public abstract void marcarAsistencia();

    //mostrar()
    public abstract void mostrar();

}
