
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
        boolean inicioDeSeccion = true;
        char opcionDeGetion = '0';
        char opcionDeGetionBarbero = '0';
        char opcionDeGetionCliente = '0';

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
                                do {
                                    System.out.println("ingresa tu usuario");
                                    correoElectronicoIngresado = scanner.nextLine();

                                    if (correoElectronicoIngresado.trim().isEmpty()) {
                                        System.out.println("este campo no puede estar vacio");
                                    } else {
                                        do {
                                            System.out.println("ingresa tu contraseña");
                                            contrasenaIngresada = scanner.nextLine();

                                            if (contrasenaIngresada.trim().isEmpty()) {
                                                System.out.println("este campo no puede estar vacio");
                                            } else {
                                                for (int i = 0; i < correosElectronicosClientes.length; i++) {
                                                    if (correosElectronicosClientes[i].equals(correoElectronicoIngresado) && contrasenasCliente[i].equals(contrasenaIngresada)) {
                                                        inicioDeSeccion = false;
                                                        break;
                                                    }
                                                }
                                                if (inicioDeSeccion == false) {
                                                    System.out.println("inicio de seccion exitoso");
                                                } else {
                                                    System.out.println("correo o contraseña incorrecta");
                                                }
                                            }
                                        } while (contrasenaIngresada.trim().isEmpty());

                                    }
                                } while (inicioDeSeccion != false);

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

                                do {
                                    System.out.println("Ingresa tu usuario");
                                    correoElectronicoIngresado = scanner.nextLine();

                                    if (correoElectronicoIngresado.trim().isEmpty()) {
                                        System.out.println("Este campo no puede estar vacio");
                                    } else {
                                        do {
                                            System.out.println("Ingresa tu contraseña");
                                            contrasenaIngresada = scanner.nextLine();

                                            if (contrasenaIngresada.trim().isEmpty()) {
                                                System.out.println("Este campo no puede estar vacio");
                                            } else {
                                                for (int i = 0; i < correosElectronicosBarbero.length; i++) {
                                                    if (correosElectronicosBarbero[i].equals(correoElectronicoIngresado)
                                                            && contrasenasBarbero[i].equals(contrasenaIngresada)) {
                                                        inicioDeSeccion = false;
                                                        break;
                                                    }
                                                }

                                                if (inicioDeSeccion == false) {
                                                    System.out.println("Inicio de sesion exitoso");
                                                } else {
                                                    System.out.println("Correo o contraseña incorrectos");
                                                }
                                            }
                                        } while (contrasenaIngresada.trim().isEmpty());
                                    }
                                } while (inicioDeSeccion != false);

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

                                do {
                                    System.out.println("Ingresa tu usuario");
                                    correoElectronicoIngresado = scanner.nextLine();

                                    if (correoElectronicoIngresado.trim().isEmpty()) {
                                        System.out.println("Este campo no puede estar vacio");
                                    } else {
                                        do {
                                            System.out.println("Ingresa tu contraseña");
                                            contrasenaIngresada = scanner.nextLine();

                                            if (contrasenaIngresada.trim().isEmpty()) {
                                                System.out.println("Este campo no puede estar vacio");
                                            } else {
                                                for (int i = 0; i < correosElectronicosAdmnistrador.length; i++) {
                                                    if (correosElectronicosAdmnistrador[i].equals(correoElectronicoIngresado)
                                                            && contrasenasAdmnistrador[i].equals(contrasenaIngresada)) {

                                                        inicioDeSeccion = false;
                                                        break;
                                                    }
                                                }

                                                if (inicioDeSeccion == false) {
                                                    System.out.println("Inicio de sesion exitoso");
                                                } else {
                                                    System.out.println("Correo o contraseña incorrectos");
                                                }
                                            }
                                        } while (contrasenaIngresada.trim().isEmpty());
                                    }
                                } while (inicioDeSeccion != false);

                                do {
                                    System.out.println("""
                                            ===== MENÚ ADMINISTRADOR =====
                                            1. Gestionar barberos
                                            2. Gestionar clientes
                                            3. Volver al menú anterior
                                            """);
                                    opcionDeGetion = scanner.next().charAt(0);
                                    switch (opcionDeGetion) {
                                        case '1':
                                            do {
                                                System.out.println("""
                                                        ===== GESTIÓN DE BARBEROS =====
                                                        1. Registrar barbero
                                                        2. Mostrar barberos registrados
                                                        3. Buscar barbero
                                                        4. Actualizar información del barbero
                                                        5. Eliminar barbero
                                                        6. Volver al menú administrador
                                                        """);
                                                opcionDeGetionBarbero = scanner.next().charAt(0);
                                                switch (opcionDeGetionBarbero) {
                                                    case '1':
                                                        System.out.println("Registrar barbero");
                                                        break;
                                                    case '2':
                                                        System.out.println("Mostrar barberos registrados");
                                                        break;
                                                    case '3':
                                                        System.out.println("Buscar barbero");
                                                        break;
                                                    case '4':
                                                        System.out.println("Actualizar información del barbero");
                                                        break;
                                                    case '5':
                                                        System.out.println("Eliminar barbero");
                                                        break;
                                                    case '6':
                                                        System.out.println("Volver al menú administrador");
                                                        break;
                                                    default:
                                                        System.out.println("Opción no válida");
                                                }

                                            } while (opcionDeGetionBarbero != '6');
                                            break;
                                        case '2':
                                            do {
                                                System.out.println("""
                                                        ===== GESTIÓN DE CLIENTES =====
                                                        1. Registrar cliente
                                                        2. Mostrar clientes registrados
                                                        3. Buscar cliente
                                                        4. Actualizar información del cliente
                                                        5. Eliminar cliente
                                                        6. Volver al menú administrador
                                                        """);
                                                opcionDeGetionCliente = scanner.next().charAt(0);
                                                switch (opcionDeGetionCliente) {
                                                    case '1':
                                                        System.out.println("Registrar cliente");
                                                        break;
                                                    case '2':
                                                        System.out.println("Mostrar clientes registrados");
                                                        break;
                                                    case '3':
                                                        System.out.println("Buscar cliente");
                                                        break;
                                                    case '4':
                                                        System.out.println("Actualizar información del cliente");
                                                        break;
                                                    case '5':
                                                        System.out.println("Eliminar cliente");
                                                        break;
                                                    case '6':
                                                        System.out.println("Volver al menú administrador");
                                                        break;
                                                    default:
                                                        System.out.println("Opción no válida");
                                                }
                                            } while (opcionDeGetionCliente != '6');
                                            break;
                                        case '3':
                                            break;
                                        default:
                                            System.out.println("opcion invalida");
                                            break;
                                    }
                                } while (opcionDeGetion != '3');
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
    }
}
