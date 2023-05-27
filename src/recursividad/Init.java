package recursividad;

public class Init {

    public void mostrarMenuPrincipal() {
        Menu menuPrincipal = new Menu();
        menuPrincipal.mostrarMenu();

        int opcionElegida = menuPrincipal.getOpcionElegida();

        llamarAMetodoElegido(opcionElegida);
    }
    
    public void llamarAMetodoElegido(int opcion){
        Metodos metodos = new Metodos();
        metodos.llamarMetodo(opcion);
    }
    
}


