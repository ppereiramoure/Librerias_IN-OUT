package company;

import libreriasv12.FactoriaDeSalidas;
import libreriasv12.InterfaceMetodosComunes;

public class Main {

    public static void main(String[] args) {
        InterfaceMetodosComunes miSalida;
        InterfaceMetodosComunes salidaVentana;
        InterfaceMetodosComunes salidaImpresora;

        miSalida = FactoriaDeSalidas.getProducto(FactoriaDeSalidas.CONSOLA,"Hola desde la fabrica");
        miSalida.visualiza();

        salidaVentana = FactoriaDeSalidas.getProducto(FactoriaDeSalidas.VENTANA,"Hola desde la fabrica");
        salidaVentana.visualiza();

        salidaImpresora = FactoriaDeSalidas.getProducto (FactoriaDeSalidas.IMPRESORA,"Hola desde la fabrica");
        salidaImpresora.visualiza();
    }
}
