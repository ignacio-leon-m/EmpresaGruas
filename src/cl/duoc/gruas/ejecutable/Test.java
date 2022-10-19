package cl.duoc.gruas.ejecutable;

import cl.duoc.gruas.dominio.Administrativo;
import cl.duoc.gruas.dominio.Maquina;
import cl.duoc.gruas.dominio.Operario;

public class Test {

    public static void main(String[] args) {
        //Instantiation
        Operario operario = new Operario();
        Maquina maquina = new Maquina();
        Administrativo admin = new Administrativo();

        //setting values
        maquina.setAnio(2015);
        maquina.setNumero(1234);
        maquina.setTipoMaquina("retroescavadora");

        operario.setNombre("Jose Toro");
        operario.setRut("1-8");
        operario.setSueldo(1000000);
        operario.setMaquina(maquina);

        admin.setNombre("Julio Parra");
        admin.setRut("1-9");
        admin.setSueldo(7000000);
        admin.setDepartamento("Recursos Humanos");

        //mostrar remuneraciones
        operario.obtenerRemuneracion();
        admin.obtenerRemuneracion();

        //revision de maquina
        operario.revisarGrua();

        //iniciando reunion con lider
        admin.reunion("Luis");

        //mostrar remuneracion con seguro
        operario.remuneracionConSeguro();
        admin.remuneracionConSeguro();

    }
}
