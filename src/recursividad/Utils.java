package recursividad;

import javax.swing.JOptionPane;

public class Utils {

    public String obtenerDato(String datoAPedir) {
        return JOptionPane.showInputDialog(null, datoAPedir);
    }

    public void print(String s) {
        System.out.println(s);
    }

    public void print(char c) {
        System.out.println(c);
    }

    public int toNum(String n) {
        return Integer.parseInt(n);
    }
    
    public String toStr(int n){
        return Integer.toString(n);
    }
}
