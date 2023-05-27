package recursividad;

import javax.swing.JOptionPane;

public class Metodos {

    public MetodosRecursivos metodoRecursivo = new MetodosRecursivos();

    public void llamarMetodo(int metodoALLamar) {
        switch (metodoALLamar) {
            case Constantes.MENU_INVERTIR_CIFRAS:
                invertirCifras();
                break;
            case Constantes.MENU_IMPRIMIR_STRING:
                imprimirString();
                break;
            case Constantes.MENU_LLENAR_VECTOR:
                llenarVectorYObtenerDatos();
                break;
            case Constantes.MENU_SUMAR_NUMEROS:
                sumarNumeros();
                break;
            case Constantes.MENU_TABLA_MULTIPLICAR:
                mostrarTablaMultiplicacion();
                break;
            case Constantes.MENU_SUMAR_DIGITOS:
                sumarDigitosDeNumero();
                break;
            default:
                throw new AssertionError();
        }
    }

    private void invertirCifras() {
    }

    private void imprimirString() {
        String stringAImprimir = obtenerDatos("Ingrese una palabra");

        metodoRecursivo.imprimirStringR(stringAImprimir, 0);
        System.out.println("Palabra completa: " + stringAImprimir);
    }

    private void llenarVectorYObtenerDatos() {
        int tamanoVector = Integer.parseInt(obtenerDatos("Ingrese el largo del vector a construir"));
        int[] vectorVacio = new int[tamanoVector];
        
        metodoRecursivo.llenarVectorYObtenerDatosR(vectorVacio,tamanoVector,0,0);
    }

    private void sumarNumeros() {
    }

    private void mostrarTablaMultiplicacion() {
    }

    private void sumarDigitosDeNumero() {
    }

    private String obtenerDatos(String datoAPedir) {
        return JOptionPane.showInputDialog(null, datoAPedir);
    }
}
