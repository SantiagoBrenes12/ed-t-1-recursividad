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

    public void llenarVectorYObtenerDatosR(
            int[] vector,
            int tamanoVector,
            int i,
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
                i+1,
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
            print(String.format("La suma es: %d", suma));
            return;
        }

        int numero = toNum(obtenerDato(String.format(
                "Ingrese el numero (%d/%d)",
                i+1,
                tamanoVector)
        ));
        
        vector[i] = numero;
                
        suma += numero;
        
        sumarNumerosR(vector, tamanoVector, i+1, suma);
    }
    
    public void mostrarTablaMultiplicacionR(int numero, int limite, int i){
        if(i>=limite){
            return;
        }
        
        print(String.format(
                "%d * %d : %d",
                numero,
                i,
                numero *i)
        );
        
        mostrarTablaMultiplicacionR(numero, limite, i+1);
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
