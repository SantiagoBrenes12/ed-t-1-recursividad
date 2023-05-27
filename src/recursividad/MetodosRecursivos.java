package recursividad;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class MetodosRecursivos {

    public void imprimirStringR(String string, int i) {
        if (string.length() == i) {
            return;
        }

        print(string.charAt(i));
        imprimirStringR(string, i + 1);
    }

    public void llenarVectorYObtenerDatosR(int[] vector, int tamanoVector, int i,
            int valorMayor
    ) {
        if (vector.length == i) {
            String vectorString = Arrays.toString(vector);

            print(String.format(
                    "Vector: %s\nValor Mayor: %d",
                    vectorString, valorMayor)
            );

            return;
        }

        int numero = toNum(obtenerDato(String.format(
                "Ingrese el numero (%d/%d)",
                i,
                tamanoVector)
        )
        );

        vector[i] = numero;
        
        if (numero > valorMayor) {
            valorMayor = numero;
        }

        llenarVectorYObtenerDatosR(vector, tamanoVector, i + 1, valorMayor);
    }

    private String obtenerDato(String datoAPedir) {
        return JOptionPane.showInputDialog(null, datoAPedir);
    }

    private void print(String s) {
        System.out.println(s);
    }

    private void print(char c) {
        System.out.println(c);
    }

    private int toNum(String n) {
        return Integer.parseInt(n);
    }
}
