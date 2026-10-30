
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char opcionTipoUsuario = '0';
        char opcionTipoLogin = '0';
        String correoElectronicoIngresado = " ";
        String contrasenaIngresada = " ";

        // aqui se guardan las cuentas creadas por clientes
        int capacidadCreacionCuentasCliente = 0;
        String[] correosElectronicosClientes = new String[capacidadCreacionCuentasCliente];
        String[] contrasenasCliente = new String[capacidadCreacionCuentasCliente];

        // aqui se guardan las cuentas de barberos
        int capacidadCreacionCuentasBarbero = 0;
        String[] correosElectronicosBarbero = new String[capacidadCreacionCuentasBarbero];
        String[] contrasenasBarbero = new String[capacidadCreacionCuentasBarbero];

        // aquii se guardan las cuentas creadas por administradores
        int capacidadCreacionCuentasAdmnistrador = 0;
        String[] correosElectronicosAdmnistrador = new String[capacidadCreacionCuentasAdmnistrador];
        String[] contrasenasAdmnistrador = new String[capacidadCreacionCuentasAdmnistrador];

        do {
            System.out.println("""
                    =========================
                       TIPO DE USUARIO
                    =========================
                    1 - Cliente
                    2 - Barbero
                    3 - Administrador
                    4 - Cerrar programa
                    
                    Seleccione una opción:
                    """);
            opcionTipoUsuario = scanner.next().charAt(0);
            switch (opcionTipoUsuario) {
                case '1':
                    do {
                        System.out.println("""
                                =================================
                                  INICIO O CREACION DE CUENTA
                                           DE CLIENTE
                                =================================
                                1 - iniciar seccion
                                2 - crear cuenta
                                3 - volver
                                Seleccione una opción:
                                """);
                        opcionTipoLogin = scanner.next().charAt(0);
                        scanner.nextLine();
                        switch (opcionTipoLogin) {
                            case '1':
                                break;
                            case '2':
                                do {
                                    System.out.println("ingresa tu correo electronico");
                                    correoElectronicoIngresado = scanner.nextLine();
                                    if (correoElectronicoIngresado.trim().isEmpty()) {
                                        System.out.println("Este campo no puede estar vacio");
                                    } else {
                                        do {
                                            System.out.println("ingresa la contraseña");
                                            contrasenaIngresada = scanner.nextLine();
                                            if (contrasenaIngresada.trim().isEmpty()) {
                                                System.out.println("este campo no puede estar vacio");
                                            } else {

                                                capacidadCreacionCuentasCliente++;
                                                correosElectronicosClientes = java.util.Arrays.copyOf(
                                                        correosElectronicosClientes, capacidadCreacionCuentasCliente);

                                                contrasenasCliente = java.util.Arrays.copyOf(
                                                        contrasenasCliente, capacidadCreacionCuentasCliente);

                                                correosElectronicosClientes[capacidadCreacionCuentasCliente - 1] = correoElectronicoIngresado;
                                                contrasenasCliente[capacidadCreacionCuentasCliente - 1] = contrasenaIngresada;

                                                System.out.println("su Nueva cuenta fue creada con Exito");
                                            }
                                        } while (contrasenaIngresada.trim().isEmpty());
                                    }

                                } while (correoElectronicoIngresado.trim().isEmpty());
                                break;
                            case '3':
                                break;
                            default:
                                System.out.println("opcion invalida");
                        }
                    } while (opcionTipoLogin != '3');
                    break;

                case '2':
                    do {
                        System.out.println("""
                                =================================
                                   INICIO O CREACION DE CUENTA
                                           DE BARBERO
                                =================================
                                1 - iniciar seccion
                                2 - crear cuenta
                                3 - volver
                                Seleccione una opción:
                                """);
                        opcionTipoLogin = scanner.next().charAt(0);
                        scanner.nextLine();
                        switch (opcionTipoLogin) {
                            case '1':
                                break;
                            case '2':
                                do {
                                    System.out.println("ingresa tu correo electronico");
                                    correoElectronicoIngresado = scanner.nextLine();
                                    if (correoElectronicoIngresado.trim().isEmpty()) {
                                        System.out.println("Este campo no puede estar vacio");
                                    } else {
                                        do {
                                            System.out.println("ingresa la contraseña");
                                            contrasenaIngresada = scanner.nextLine();
                                            if (contrasenaIngresada.trim().isEmpty()) {
                                                System.out.println("este campo no puede estar vacio");
                                            } else {

                                                capacidadCreacionCuentasBarbero++;

                                                correosElectronicosBarbero = java.util.Arrays.copyOf(
                                                        correosElectronicosBarbero, capacidadCreacionCuentasBarbero);

                                                contrasenasBarbero = java.util.Arrays.copyOf(
                                                        contrasenasBarbero, capacidadCreacionCuentasBarbero);

                                                correosElectronicosBarbero[capacidadCreacionCuentasBarbero - 1] = correoElectronicoIngresado;
                                                contrasenasBarbero[capacidadCreacionCuentasBarbero - 1] = contrasenaIngresada;

                                                System.out.println("su Nueva cuenta fue creada con Exito");
                                            }
                                        } while (contrasenaIngresada.trim().isEmpty());
                                    }

                                } while (correoElectronicoIngresado.trim().isEmpty());
                                break;
                            case '3':
                                break;
                            default:
                                System.out.println("opcion invalida");
                        }
                    } while (opcionTipoLogin != '3');
                    break;

                case '3':
                    do {
                        System.out.println("""
                                =================================
                                   INICIO O CREACION DE CUENTA
                                        DE ADMINISTRADOR
                                =================================
                                1 - iniciar seccion
                                2 - crear cuenta
                                3 - volver
                                Seleccione una opción:
                                """);
                        opcionTipoLogin = scanner.next().charAt(0);
                        scanner.nextLine();
                        switch (opcionTipoLogin) {
                            case '1':
                                break;
                            case '2':
                                do {
                                    System.out.println("ingresa tu correo electronico");
                                    correoElectronicoIngresado = scanner.nextLine();
                                    if (correoElectronicoIngresado.trim().isEmpty()) {
                                        System.out.println("Este campo no puede estar vacio");
                                    } else {
                                        do {
                                            System.out.println("ingresa la contraseña");
                                            contrasenaIngresada = scanner.nextLine();
                                            if (contrasenaIngresada.trim().isEmpty()) {
                                                System.out.println("este campo no puede estar vacio");
                                            } else {

                                                capacidadCreacionCuentasAdmnistrador++;

                                                correosElectronicosAdmnistrador = java.util.Arrays.copyOf(
                                                        correosElectronicosAdmnistrador, capacidadCreacionCuentasAdmnistrador);

                                                contrasenasAdmnistrador = java.util.Arrays.copyOf(
                                                        contrasenasAdmnistrador, capacidadCreacionCuentasAdmnistrador);

                                                correosElectronicosAdmnistrador[capacidadCreacionCuentasAdmnistrador - 1] = correoElectronicoIngresado;
                                                contrasenasAdmnistrador[capacidadCreacionCuentasAdmnistrador - 1] = contrasenaIngresada;

                                                System.out.println("su Nueva cuenta fue creada con Exito");
                                            }
                                        } while (contrasenaIngresada.trim().isEmpty());
                                    }
                                } while (correoElectronicoIngresado.trim().isEmpty());
                                break;
                            case '3':
                                break;
                            default:
                                System.out.println("opcion invalida");
                        }
                    } while (opcionTipoLogin != '3');
                    break;

                case '4':
                    System.out.println("Programa cerrado.");
                    break;

                default:
                    System.out.println("Opción invalida.");
            }
        } while (opcionTipoUsuario != '4');

        System.out.println("\n========== CUENTAS DE CLIENTES ==========");

        for (int i = 0; i < correosElectronicosClientes.length; i++) {
            System.out.println("Índice: " + i);
            System.out.println("Correo: " + correosElectronicosClientes[i]);
            System.out.println("Contraseña: " + contrasenasCliente[i]);
            System.out.println("--------------------------------");
        }


        System.out.println("\n========== CUENTAS DE BARBEROS ==========");

        for (int i = 0; i < correosElectronicosBarbero.length; i++) {
            System.out.println("Índice: " + i);
            System.out.println("Correo: " + correosElectronicosBarbero[i]);
            System.out.println("Contraseña: " + contrasenasBarbero[i]);
            System.out.println("--------------------------------");
        }


        System.out.println("\n========== CUENTAS DE ADMINISTRADORES ==========");

        for (int i = 0; i < correosElectronicosAdmnistrador.length; i++) {
            System.out.println("Índice: " + i);
            System.out.println("Correo: " + correosElectronicosAdmnistrador[i]);
            System.out.println("Contraseña: " + contrasenasAdmnistrador[i]);
            System.out.println("--------------------------------");
        }
    }
}