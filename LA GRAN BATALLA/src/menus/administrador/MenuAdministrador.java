package menus.administrador;

import login.Login;

import java.util.Scanner;

public class MenuAdministrador {

    public MenuAdministrador() {
        Scanner scanner = new Scanner(System.in);
        boolean salirMenuAdmin = true;
        char opcionMenuAdmin = '0';
        do {
            System.out.println("""
                    ---------- GESTIÓN ADMINISTRADOR ----------
                    1. Gestionar Barberos
                    2. Gestionar Clientes
                    3. Gestionar Servicios
                    4. Gestionar Turnos
                    5. Ver Reportes
                    6. Cerrar Sesión
                    """);

            opcionMenuAdmin = scanner.next().charAt(0);

            switch (opcionMenuAdmin) {
                case '1':
                    System.out.println("Gestión de Barberos");
                    break;

                case '2':
                    System.out.println("Gestión de Clientes");
                    break;

                case '3':
                    System.out.println("Gestión de Servicios");
                    break;

                case '4':
                    System.out.println("Gestión de Turnos");
                    break;

                case '5':
                    System.out.println("Ver Reportes");
                    break;

                case '6':
                    salirMenuAdmin = false;
                    System.out.println("Sesión cerrada...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (salirMenuAdmin != false);
    }
}
