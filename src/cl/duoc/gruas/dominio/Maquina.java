package cl.duoc.gruas.dominio;

public class Maquina {
    //ATRIBUTOS
    private String tipoMaquina;
    private int numero;
    private int anio;

    //CONSTRUCTORES
    public Maquina() {
    }

    public Maquina(String tipoMaquina, int numero, int anio) {
        this.tipoMaquina = tipoMaquina;
        this.numero = numero;
        this.anio = anio;
    }

    //GETTERS & SETTERS
    public String getTipoMaquina() {
        return tipoMaquina;
    }

    public void setTipoMaquina(String tipoMaquina) {
        this.tipoMaquina = tipoMaquina;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
