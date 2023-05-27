package recursividad;

import java.util.Arrays;

public class MetodosRecursivos {

    public static Utils utils = new Utils();

    public void invertirNumeroR(int numero, String numeroInvertido) {
        numeroInvertido += utils.toStr(numero % 10);

        if (numero / 10 == 0) {
            utils.print(numeroInvertido);
            return;
        }

        invertirNumeroR(numero / 10, numeroInvertido);
    }

    public void imprimirStringR(String string, int i) {
        if (string.length() == i) {
            return;
        }

        utils.print(string.charAt(i));
        imprimirStringR(string, i + 1);
    }

    public void llenarVectorYObtenerDatosR(
            int[] vector,
            int tamanoVector,
            int i,
            int valorMayor
    ) {
        if (vector.length == i) {
            String vectorString = Arrays.toString(vector);

            utils.print(String.format(
                    "Vector: %s\nValor Mayor: %d",
                    vectorString, valorMayor)
            );
            return;
        }

        int numero = utils.toNum(utils.obtenerDato(String.format(
                "Ingrese el numero (%d/%d)",
                i + 1,
                tamanoVector)
        ));

        vector[i] = numero;

        if (numero > valorMayor) {
            valorMayor = numero;
        }

        llenarVectorYObtenerDatosR(vector, tamanoVector, i + 1, valorMayor);
    }

    public void sumarNumerosR(
            int[] vector,
            int tamanoVector,
            int i,
            int suma
    ) {
        if (vector.length == i) {
            utils.print(String.format("La suma es: %d", suma));
            return;
        }

        int numero = utils.toNum(utils.obtenerDato(String.format(
                "Ingrese el numero (%d/%d)",
                i + 1,
                tamanoVector)
        ));

        vector[i] = numero;

        suma += numero;
        sumarNumerosR(vector, tamanoVector, i + 1, suma);
    }

    public void mostrarTablaMultiplicacionR(int numero, int limite, int i) {
        if (i >= limite) {
            return;
        }
        
        utils.print(String.format(
                "%d * %d : %d",
                numero,
                i,
                numero * i
        ));

        mostrarTablaMultiplicacionR(numero, limite, i + 1);
    }

    public void sumarDigitosDeNumeroR(int numero, int suma) {
        suma += numero % 10;
        
        if (numero/10 == 0) {
            utils.print(utils.toStr(suma));
            return;
        }
        
        sumarDigitosDeNumeroR(numero / 10, suma);
    }
}
