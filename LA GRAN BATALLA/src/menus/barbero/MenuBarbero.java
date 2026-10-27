package menus.barbero;

import java.util.Scanner;

public class MenuBarbero {
    public MenuBarbero() {
        Scanner scanner = new Scanner(System.in);
        boolean salirMenuBarbero = false;
        char opcionMenuBarbero = '0';

        do {
            System.out.println("""
                    ---------- MENU BARBERO ----------
                    1. Ver turnos del día
                    2. Ver clientes asignados
                    3. Actualizar estado de turno
                    4. Ver historial de citas
                    6. Cerrar sesión
                    """);

            System.out.print("Seleccione una opción: ");
            opcionMenuBarbero = scanner.next().charAt(0);

            switch (opcionMenuBarbero) {
                case '1':
                    System.out.println("Mostrando turnos del día...");
                    break;

                case '2':
                    System.out.println("Mostrando clientes asignados...");
                    break;

                case '3':
                    System.out.println("Actualizando estado del turno...");
                    break;

                case '4':
                    System.out.println("Mostrando historial de citas...");
                    break;

                case '6':
                    salirMenuBarbero = true;
                    System.out.println("Cerrando sesión...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (!salirMenuBarbero);
    }
}
