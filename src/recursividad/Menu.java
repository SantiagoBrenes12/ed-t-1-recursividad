package recursividad;

import javax.swing.JOptionPane;

public class Menu {
    int opcionElegida;

    public Menu() {}

    public void mostrarMenu() {
        this.opcionElegida = Integer.parseInt(JOptionPane.showInputDialog(
                null,
                "Introduzca una opcion\n"
                        + "1. Invertir cifras de un numero\n"
                        + "2. Imprimir string letra por letra\n"
                        + "3. LLenar vector, mostrar su contenido y obtener valor mayor\n"
                        + "4. Sumar numeros\n"
                        + "5. Construir tabla de multiplicar\n"
                        + "6. Sumar digitos de un numero\n\n"
                        + "7. Salir\n\n")
        );
    }

    public int getOpcionElegida() {
        return this.opcionElegida;
    }
}
