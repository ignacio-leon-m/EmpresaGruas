package cl.duoc.gruas.dominio;

public class Operario extends Colaborador{
    //ATRIBUTOS
    private Maquina maquina;

    //CONSTRUCTORES
    public Operario() {
        maquina = new Maquina(); //colaboración
    }

    public Operario(Maquina maquina, String nombre, String rut, int sueldo) {
        super(nombre, rut, sueldo);
        this.maquina = maquina;
    }


    //GETTERS & SETTERS

    public Maquina getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }

    //MÉTODOS

    @Override
    //marcarAsistencia() sobreescribir desde Colaborador (herencia)
    public void marcarAsistencia() {
        System.out.println("Marcando asistencia: OPERARIO");
    }

    //mostrar() sobreescribir desde Colaborador
    @Override
    public void mostrar() {
        System.out.println("--------------------------");
        System.out.printf("Datos del operario %s", super.nombre);
        System.out.println("\nrut: "+super.rut);
        System.out.println("Datos de maquina a cargo: ");
        System.out.println("Tipo de maquina: "+this.maquina.getTipoMaquina());
        System.out.println("Numero de maquina: "+this.maquina.getNumero());
        System.out.println("Anio de maquina: "+this.maquina.getAnio());
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
        int remSeguro = this.sueldo - CUOTAOP;
        System.out.printf("La remuneracion con seguro de %s es: %d \n",super.getNombre(), remSeguro);
    }



    //revisarGrua()
    public void revisarGrua(){
        if(maquina.getAnio() < 2000){
            System.out.println("Realizar revision completa");
        }
        if(maquina.getAnio() >= 2000){
            System.out.println("Realizar revision basica");
        }
    }
}
