package recursividad;

import javax.swing.JOptionPane;

public class Menu {

    private static Constantes constantes = new Constantes();
    int menuElegido;
    int opcionElegida;

    public Menu() {
    }

    public void mostrarMenu(String msgAMostrar) {
        Object[] botones = obtenerBotones();

        this.opcionElegida = Integer.parseInt(JOptionPane.showInputDialog(
                null,
                msgAMostrar)
        );
    }

    private Object[] obtenerBotones() {
        return new Object[]{
            "Invertir cifras",
            "Imprimir string",
            "LLenar vector",
            "Sumar numeros",
            "Tabla de multiplicar",
            "Sumar digitos de un numero",
            "Volver"
        };

    }
}
