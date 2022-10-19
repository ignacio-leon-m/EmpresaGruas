package cl.duoc.gruas.dominio;

public class Administrativo extends Colaborador{
    //ATRIBUTOS
    public String departamento;

    //CONSTRUCTORES
    public Administrativo() {
    }

    public Administrativo(String departamento, String nombre, String rut, int sueldo) {
        super(nombre, rut, sueldo);
        this.departamento = departamento;
    }

    //GETTERS & SETTERS
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    //METODOS

    @Override
    public void marcarAsistencia() {
        System.out.println("Marcando asistencia: ADMINISTRATIVO");
    }

    //reunion();
    public void reunion() {
        System.out.println("Iniciando reunión");
    }

    //reunion(String lider)
    public void reunion(String lider) { //sobrecarga
        System.out.println("Reunion iniciada con el lider " + lider);
    }

    //mostrar() sobreescribir desde Colaborador
    @Override
    public void mostrar() {
        System.out.println("--------------------------");
        System.out.printf("Datos del administrativo %s",super.getNombre());
        System.out.println("\nRut: "+super.getRut());
        System.out.println("Sueldo: "+super.getSueldo());
        System.out.println("Departamento: "+this.departamento);
        System.out.println("--------------------------");
    }

    //obtenerRemuneracion() sobreescribir desde interfaz Calculable
    @Override
    public void obtenerRemuneracion() {
        System.out.printf("La remuneracion de %s es: %d \n",super.getNombre(), this.sueldo);
    }

    //remuneracionConSeguro() sobreescribir desde interfaz Calculable
    @Override
    public void remuneracionConSeguro() {
        int remSeguro = this.sueldo - CUOTAADM;
        System.out.printf("La remuneracion con seguro de %s es: %d \n",super.getNombre(), remSeguro);
    }
}
