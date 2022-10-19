package cl.duoc.gruas.dominio;

public interface Calculable {
    int CUOTAADM = 1000;
    int CUOTAOP = 15000;

    void obtenerRemuneracion();

    void remuneracionConSeguro();
}
