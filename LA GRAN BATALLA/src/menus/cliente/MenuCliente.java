package menus.cliente;

import java.util.Scanner;

public class MenuCliente {
    public MenuCliente() {
        Scanner scanner = new Scanner(System.in);
        boolean salirMenuCliente = false;
        char opcionMenuCliente;

        do {
            System.out.println("""
                    ---------- MENU CLIENTE ----------
                    1. Reservar turno
                    2. Ver mis turnos
                    3. Reprogramar turno
                    4. Cancelar turno
                    5. Ver mi perfil
                    6. Cerrar sesión
                    """);

            System.out.print("Seleccione una opción: ");
            opcionMenuCliente = scanner.next().charAt(0);

            switch (opcionMenuCliente) {
                case '1':
                    System.out.println("Reservando turno...");
                    break;

                case '2':
                    System.out.println("Mostrando mis turnos...");
                    break;

                case '3':
                    System.out.println("Reprogramando turno...");
                    break;

                case '4':
                    System.out.println("Cancelando turno...");
                    break;

                case '5':
                    System.out.println("Mostrando perfil...");
                    break;

                case '6':
                    salirMenuCliente = true;
                    System.out.println("Cerrando sesión...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (!salirMenuCliente);
    }
}
