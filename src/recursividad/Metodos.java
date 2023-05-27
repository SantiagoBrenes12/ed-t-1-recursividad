package recursividad;

import javax.swing.JOptionPane;

public class Metodos {

    public MetodosRecursivos metodoRecursivo = new MetodosRecursivos();
    public static Utils utils = new Utils();

    
    
    public void llamarMetodo(int metodoALLamar) {
        switch (metodoALLamar) {
            case Constantes.MENU_INVERTIR_CIFRAS:
                invertirNumero();
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

    private void invertirNumero() {
        int numeroAInvertir = utils.toNum(utils.obtenerDato("Ingrese el numero a invertir"));
        metodoRecursivo.invertirNumeroR(numeroAInvertir,"");
    }

    private void imprimirString() {
        String stringAImprimir = utils.obtenerDato("Ingrese una palabra");
        metodoRecursivo.imprimirStringR(stringAImprimir, 0);
        utils.print("Palabra completa: " + stringAImprimir);
    }

    private void llenarVectorYObtenerDatos() {
        int tamanoVector = utils.toNum(utils.obtenerDato(
                "Ingrese el largo del vector a construir")
        );
        int[] vectorVacio = new int[tamanoVector];

        metodoRecursivo.llenarVectorYObtenerDatosR(
                vectorVacio,
                tamanoVector,
                0,
                0
        );
    }

    private void sumarNumeros() {
        int tamanoVector = utils.toNum(utils.obtenerDato(
                "Cuantos numeros quiere sumar?")
        );
        int[] vectorVacio = new int[tamanoVector];
        int suma = 0;

        metodoRecursivo.sumarNumerosR(vectorVacio, tamanoVector, 0, suma);
    }

    private void mostrarTablaMultiplicacion() {
        int numeroAMultiplicar = utils.toNum(utils.obtenerDato(
                "Ingrese el con el que desea construir la tabla de multiplicar")
        );

        metodoRecursivo.mostrarTablaMultiplicacionR(numeroAMultiplicar,10,0);
    }

    private void sumarDigitosDeNumero() {
         int numero = utils.toNum(utils.obtenerDato(
                "Ingrese el numero")
        );
        
       metodoRecursivo.sumarDigitosDeNumeroR(numero,0);
    }
}
