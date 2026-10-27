import menus.administrador.MenuAdministrador;
import menus.barbero.MenuBarbero;
import menus.cliente.MenuCliente;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        CRUD del proyecto ingrador por medio de menus
         */

        Scanner scanner = new Scanner(System.in);
        char menuTipoUsuario = '0';
        boolean salirTipoUsuario = true;

        do {


        System.out.println("""
        ---SELECIONA EL TIPO DE USUARIO---
                1. cliente
                2. barbero
                3. admin
                4. salir
                """);
        menuTipoUsuario = scanner.next().charAt(0);

        switch (menuTipoUsuario){
            case '1':
                MenuCliente menuCliente = new MenuCliente();
                break;
            case '2':
                MenuBarbero menuBarbero = new MenuBarbero();
                break;
            case '3':
                MenuAdministrador menuAdministrador = new MenuAdministrador();
                break;
            case '4':
                salirTipoUsuario = false;
                System.out.println("saliendo del sistema");
                break;
            default:
                System.out.println("opcion invalida");
                break;
        }
        }while(salirTipoUsuario != false);

    }
}