
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
        String numeroIdentificadorIngresado = " ";
        char opcionActualizar = '0';
        String nombreIngresado = "";

        // aqui se guardan las cuentas creadas por clientes

        int capacidadCreacionCuentasCliente = 0;
        String numeroCedulaIngresado = "";
        String[] nombresClientes = new String[capacidadCreacionCuentasCliente];
        String[] numerosCedulaClientes = new String[capacidadCreacionCuentasCliente];
        String[] correosElectronicosClientes = new String[capacidadCreacionCuentasCliente];
        String[] contrasenasCliente = new String[capacidadCreacionCuentasCliente];

        // aqui se guardan las cuentas de barberos

        int capacidadCreacionCuentasBarbero = 0;
        String[] correosElectronicosBarbero = new String[capacidadCreacionCuentasBarbero];
        String[] contrasenasBarbero = new String[capacidadCreacionCuentasBarbero];
        String[] numerosIdentificadoresBarberos = new String[capacidadCreacionCuentasBarbero];
        String[] nombresBarberos = new String[capacidadCreacionCuentasBarbero];

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
                                    System.out.println("Ingresa el nombre ");
                                    nombreIngresado = scanner.nextLine();

                                    if (nombreIngresado.trim().isEmpty()) {
                                        System.out.println("Este campo no puede estar vacio");
                                    }
                                } while (nombreIngresado.trim().isEmpty());

                                do {
                                    System.out.println("Ingresa el numero de cedula");
                                    numeroCedulaIngresado = scanner.nextLine();

                                    if (numeroCedulaIngresado.trim().isEmpty()) {
                                        System.out.println("Este campo no puede estar vacio");
                                    } else {
                                        boolean cedulaExiste = false;

                                        for (int i = 0; i < numerosCedulaClientes.length; i++) {
                                            if (numerosCedulaClientes[i].equals(numeroCedulaIngresado)) {
                                                cedulaExiste = true;
                                                System.out.println("Esta cedula ya se encuentra registrada");
                                                break;
                                            }
                                        }

                                        if (cedulaExiste == true) {
                                            numeroCedulaIngresado = "";
                                        }
                                    }
                                } while (numeroCedulaIngresado.trim().isEmpty());

                                do {
                                    System.out.println("Ingresa el correo electronico");
                                    correoElectronicoIngresado = scanner.nextLine();

                                    if (correoElectronicoIngresado.trim().isEmpty()) {
                                        System.out.println("Este campo no puede estar vacio");
                                    }
                                } while (correoElectronicoIngresado.trim().isEmpty());

                                do {
                                    System.out.println("Ingresa la contraseña ");
                                    contrasenaIngresada = scanner.nextLine();

                                    if (contrasenaIngresada.trim().isEmpty()) {
                                        System.out.println("Este campo no puede estar vacio");
                                    }
                                } while (contrasenaIngresada.trim().isEmpty());

                                capacidadCreacionCuentasCliente++;

                                nombresClientes = java.util.Arrays.copyOf(nombresClientes, capacidadCreacionCuentasCliente);
                                numerosCedulaClientes = java.util.Arrays.copyOf(numerosCedulaClientes, capacidadCreacionCuentasCliente);
                                correosElectronicosClientes = java.util.Arrays.copyOf(correosElectronicosClientes, capacidadCreacionCuentasCliente);
                                contrasenasCliente = java.util.Arrays.copyOf(contrasenasCliente, capacidadCreacionCuentasCliente);

                                nombresClientes[capacidadCreacionCuentasCliente - 1] = nombreIngresado;
                                numerosCedulaClientes[capacidadCreacionCuentasCliente - 1] = numeroCedulaIngresado;
                                correosElectronicosClientes[capacidadCreacionCuentasCliente - 1] = correoElectronicoIngresado;
                                contrasenasCliente[capacidadCreacionCuentasCliente - 1] = contrasenaIngresada;

                                System.out.println("Cliente registrado correctamente");
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
                                    System.out.println("Ingresa el correo electronico");
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
                                    System.out.println("Ingresa el nombre del barbero");
                                    nombreIngresado = scanner.nextLine();

                                    if (nombreIngresado.trim().isEmpty()) {
                                        System.out.println("Este campo no puede estar vacio");
                                    } else {

                                        do {
                                            System.out.println("Ingresa tu correo electronico");
                                            correoElectronicoIngresado = scanner.nextLine();

                                            if (correoElectronicoIngresado.trim().isEmpty()) {
                                                System.out.println("Este campo no puede estar vacio");
                                            } else {

                                                do {
                                                    System.out.println("Ingresa el numero identificador del barbero");
                                                    numeroIdentificadorIngresado = scanner.nextLine();

                                                    if (numeroIdentificadorIngresado.trim().isEmpty()) {
                                                        System.out.println("Este campo no puede estar vacio");
                                                    } else {

                                                        boolean identificadorExiste = false;

                                                        for (int i = 0; i < capacidadCreacionCuentasBarbero; i++) {

                                                            if (numerosIdentificadoresBarberos[i].equalsIgnoreCase(numeroIdentificadorIngresado)) {
                                                                identificadorExiste = true;
                                                                System.out.println("Este numero identificador ya se encuentra registrado");
                                                                break;
                                                            }
                                                        }

                                                        if (identificadorExiste) {
                                                            numeroIdentificadorIngresado = "";
                                                        }
                                                    }

                                                } while (numeroIdentificadorIngresado.trim().isEmpty());

                                                do {
                                                    System.out.println("Ingresa la contraseña");
                                                    contrasenaIngresada = scanner.nextLine();

                                                    if (contrasenaIngresada.trim().isEmpty()) {
                                                        System.out.println("Este campo no puede estar vacio");
                                                    } else {

                                                        capacidadCreacionCuentasBarbero++;

                                                        nombresBarberos = java.util.Arrays.copyOf(
                                                                nombresBarberos, capacidadCreacionCuentasBarbero);

                                                        correosElectronicosBarbero = java.util.Arrays.copyOf(
                                                                correosElectronicosBarbero, capacidadCreacionCuentasBarbero);

                                                        contrasenasBarbero = java.util.Arrays.copyOf(
                                                                contrasenasBarbero, capacidadCreacionCuentasBarbero);

                                                        numerosIdentificadoresBarberos = java.util.Arrays.copyOf(
                                                                numerosIdentificadoresBarberos, capacidadCreacionCuentasBarbero);

                                                        nombresBarberos[capacidadCreacionCuentasBarbero - 1] = nombreIngresado;

                                                        correosElectronicosBarbero[capacidadCreacionCuentasBarbero - 1] = correoElectronicoIngresado;

                                                        contrasenasBarbero[capacidadCreacionCuentasBarbero - 1] = contrasenaIngresada;

                                                        numerosIdentificadoresBarberos[capacidadCreacionCuentasBarbero - 1] = numeroIdentificadorIngresado;

                                                        System.out.println("Su nueva cuenta fue creada con exito");
                                                    }

                                                } while (contrasenaIngresada.trim().isEmpty());
                                            }

                                        } while (correoElectronicoIngresado.trim().isEmpty());
                                    }

                                } while (nombreIngresado.trim().isEmpty());

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
                                                scanner.nextLine();
                                                switch (opcionDeGetionBarbero) {
                                                    case '1':
                                                        do {
                                                            System.out.println("Ingresa el nombre del barbero");
                                                            nombreIngresado = scanner.nextLine();

                                                            if (nombreIngresado.trim().isEmpty()) {
                                                                System.out.println("Este campo no puede estar vacio");
                                                            } else {

                                                                do {
                                                                    System.out.println("Ingresa tu correo electronico");
                                                                    correoElectronicoIngresado = scanner.nextLine();

                                                                    if (correoElectronicoIngresado.trim().isEmpty()) {
                                                                        System.out.println("Este campo no puede estar vacio");
                                                                    } else {

                                                                        do {
                                                                            System.out.println("Ingresa el numero identificador del barbero");
                                                                            numeroIdentificadorIngresado = scanner.nextLine();

                                                                            if (numeroIdentificadorIngresado.trim().isEmpty()) {
                                                                                System.out.println("Este campo no puede estar vacio");
                                                                            } else {

                                                                                boolean identificadorExiste = false;

                                                                                for (int i = 0; i < numerosIdentificadoresBarberos.length; i++) {

                                                                                    if (numeroIdentificadorIngresado.equals(
                                                                                            numerosIdentificadoresBarberos[i])) {

                                                                                        identificadorExiste = true;
                                                                                        System.out.println("Este numero identificador ya se encuentra registrado");

                                                                                        break;
                                                                                    }
                                                                                }

                                                                                if (identificadorExiste) {
                                                                                    numeroIdentificadorIngresado = "";
                                                                                }
                                                                            }

                                                                        } while (numeroIdentificadorIngresado.trim().isEmpty());

                                                                        do {
                                                                            System.out.println("Ingresa la contraseña");
                                                                            contrasenaIngresada = scanner.nextLine();

                                                                            if (contrasenaIngresada.trim().isEmpty()) {
                                                                                System.out.println("Este campo no puede estar vacio");
                                                                            } else {

                                                                                capacidadCreacionCuentasBarbero++;

                                                                                nombresBarberos = java.util.Arrays.copyOf(
                                                                                        nombresBarberos, capacidadCreacionCuentasBarbero);

                                                                                correosElectronicosBarbero = java.util.Arrays.copyOf(
                                                                                        correosElectronicosBarbero, capacidadCreacionCuentasBarbero);

                                                                                contrasenasBarbero = java.util.Arrays.copyOf(
                                                                                        contrasenasBarbero, capacidadCreacionCuentasBarbero);

                                                                                numerosIdentificadoresBarberos = java.util.Arrays.copyOf(
                                                                                        numerosIdentificadoresBarberos, capacidadCreacionCuentasBarbero);

                                                                                nombresBarberos[capacidadCreacionCuentasBarbero - 1] = nombreIngresado;

                                                                                correosElectronicosBarbero[capacidadCreacionCuentasBarbero - 1] = correoElectronicoIngresado;

                                                                                contrasenasBarbero[capacidadCreacionCuentasBarbero - 1] = contrasenaIngresada;

                                                                                numerosIdentificadoresBarberos[capacidadCreacionCuentasBarbero - 1] = numeroIdentificadorIngresado;

                                                                                System.out.println("La cuenta del barbero fue creada con exito");
                                                                            }

                                                                        } while (contrasenaIngresada.trim().isEmpty());
                                                                    }

                                                                } while (correoElectronicoIngresado.trim().isEmpty());
                                                            }

                                                        } while (nombreIngresado.trim().isEmpty());

                                                        break;
                                                    case '2':
                                                        System.out.println("===== BARBEROS REGISTRADOS =====");

                                                        for (int i = 0; i < correosElectronicosBarbero.length; i++) {

                                                            System.out.println("\nBarbero #" + (i + 1));
                                                            System.out.println("Nombre: " + nombresBarberos[i]);
                                                            System.out.println("Correo electronico: " + correosElectronicosBarbero[i]);
                                                            System.out.println("Numero identificador: " + numerosIdentificadoresBarberos[i]);
                                                            System.out.println("Contraseña: " + contrasenasBarbero[i]);
                                                        }
                                                        break;
                                                    case '3':
                                                        do {
                                                            System.out.println("Ingresa el numero identificador del barbero");
                                                            numeroIdentificadorIngresado = scanner.nextLine();

                                                            if (numeroIdentificadorIngresado.trim().isEmpty()) {
                                                                System.out.println("Este campo no puede estar vacio");
                                                            } else {
                                                                boolean barberoEncontrado = false;

                                                                for (int i = 0; i < numerosIdentificadoresBarberos.length; i++) {
                                                                    if (numerosIdentificadoresBarberos[i].equals(numeroIdentificadorIngresado)) {

                                                                        System.out.println("\n===== INFORMACION DEL BARBERO =====");
                                                                        System.out.println("Nombre: " + nombresBarberos[i]);
                                                                        System.out.println("Correo electronico: " + correosElectronicosBarbero[i]);
                                                                        System.out.println("Numero identificador: " + numerosIdentificadoresBarberos[i]);

                                                                        barberoEncontrado = true;
                                                                        break;
                                                                    }
                                                                }
                                                                if (barberoEncontrado != true) {
                                                                    System.out.println("No se encontro ningun barbero con ese numero identificador");
                                                                }
                                                            }
                                                        } while (numeroIdentificadorIngresado.trim().isEmpty());
                                                        break;
                                                    case '4':
                                                        System.out.println("===== ACTUALIZAR INFORMACION DEL BARBERO =====");

                                                        do {
                                                            System.out.println("Ingresa el numero identificador del barbero que deseas actualizar");
                                                            numeroIdentificadorIngresado = scanner.nextLine();

                                                            if (numeroIdentificadorIngresado.trim().isEmpty()) {
                                                                System.out.println("Este campo no puede estar vacio");
                                                            } else {

                                                                boolean barberoEncontrado = false;

                                                                for (int i = 0; i < numerosIdentificadoresBarberos.length; i++) {

                                                                    if (numerosIdentificadoresBarberos[i].equals(numeroIdentificadorIngresado)) {

                                                                        barberoEncontrado = true;

                                                                        System.out.println("\n===== INFORMACION DEL BARBERO =====");
                                                                        System.out.println("Nombre: " + nombresBarberos[i]);
                                                                        System.out.println("Correo electronico: " + correosElectronicosBarbero[i]);
                                                                        System.out.println("Numero identificador: " + numerosIdentificadoresBarberos[i]);

                                                                        boolean salirActualizar = true;

                                                                        do {
                                                                            System.out.println("\n===== ACTUALIZAR INFORMACION =====");
                                                                            System.out.println("1. Actualizar nombre");
                                                                            System.out.println("2. Actualizar correo electronico");
                                                                            System.out.println("3. Actualizar contraseña");
                                                                            System.out.println("4. Actualizar todos los datos");
                                                                            System.out.println("5. Volver");
                                                                            opcionActualizar = scanner.nextLine().charAt(0);

                                                                            switch (opcionActualizar) {

                                                                                case '1':
                                                                                    do {
                                                                                        System.out.println("Ingresa el nuevo nombre del barbero");
                                                                                        nombreIngresado = scanner.nextLine();

                                                                                        if (nombreIngresado.trim().isEmpty()) {
                                                                                            System.out.println("Este campo no puede estar vacio");
                                                                                        }
                                                                                    } while (nombreIngresado.trim().isEmpty());

                                                                                    nombresBarberos[i] = nombreIngresado;

                                                                                    System.out.println("Nombre actualizado correctamente");
                                                                                    break;

                                                                                case '2':
                                                                                    do {
                                                                                        System.out.println("Ingresa el nuevo correo electronico");
                                                                                        correoElectronicoIngresado = scanner.nextLine();

                                                                                        if (correoElectronicoIngresado.trim().isEmpty()) {
                                                                                            System.out.println("Este campo no puede estar vacio");
                                                                                        }
                                                                                    } while (correoElectronicoIngresado.trim().isEmpty());

                                                                                    correosElectronicosBarbero[i] = correoElectronicoIngresado;

                                                                                    System.out.println("Correo electronico actualizado correctamente");
                                                                                    break;

                                                                                case '3':
                                                                                    do {
                                                                                        System.out.println("Ingresa la nueva contraseña");
                                                                                        contrasenaIngresada = scanner.nextLine();

                                                                                        if (contrasenaIngresada.trim().isEmpty()) {
                                                                                            System.out.println("Este campo no puede estar vacio");
                                                                                        }
                                                                                    } while (contrasenaIngresada.trim().isEmpty());

                                                                                    contrasenasBarbero[i] = contrasenaIngresada;

                                                                                    System.out.println("Contraseña actualizada correctamente");
                                                                                    break;

                                                                                case '4':

                                                                                    do {
                                                                                        System.out.println("Ingresa el nuevo nombre del barbero");
                                                                                        nombreIngresado = scanner.nextLine();

                                                                                        if (nombreIngresado.trim().isEmpty()) {
                                                                                            System.out.println("Este campo no puede estar vacio");
                                                                                        }
                                                                                    } while (nombreIngresado.trim().isEmpty());

                                                                                    do {
                                                                                        System.out.println("Ingresa el nuevo correo electronico");
                                                                                        correoElectronicoIngresado = scanner.nextLine();

                                                                                        if (correoElectronicoIngresado.trim().isEmpty()) {
                                                                                            System.out.println("Este campo no puede estar vacio");
                                                                                        }
                                                                                    } while (correoElectronicoIngresado.trim().isEmpty());

                                                                                    do {
                                                                                        System.out.println("Ingresa la nueva contraseña");
                                                                                        contrasenaIngresada = scanner.nextLine();

                                                                                        if (contrasenaIngresada.trim().isEmpty()) {
                                                                                            System.out.println("Este campo no puede estar vacio");
                                                                                        }
                                                                                    } while (contrasenaIngresada.trim().isEmpty());

                                                                                    nombresBarberos[i] = nombreIngresado;
                                                                                    correosElectronicosBarbero[i] = correoElectronicoIngresado;
                                                                                    contrasenasBarbero[i] = contrasenaIngresada;

                                                                                    System.out.println("Todos los datos se actualizaron correctamente");
                                                                                    break;

                                                                                case '5':
                                                                                    salirActualizar = false;
                                                                                    System.out.println("Volviendo al menu de gestion de barberos");
                                                                                    break;

                                                                                default:
                                                                                    System.out.println("Opcion no valida");
                                                                                    break;
                                                                            }

                                                                        } while (salirActualizar != false);

                                                                        break;
                                                                    }
                                                                }

                                                                if (barberoEncontrado != true) {
                                                                    System.out.println("No se encontro ningun barbero con ese numero identificador");
                                                                }
                                                            }

                                                        } while (numeroIdentificadorIngresado.trim().isEmpty());
                                                        break;
                                                    case '5':
                                                        System.out.println("===== ELIMINAR BARBERO =====");

                                                        do {
                                                            System.out.println("Ingresa el numero identificador del barbero que deseas eliminar");
                                                            numeroIdentificadorIngresado = scanner.nextLine();

                                                            if (numeroIdentificadorIngresado.trim().isEmpty()) {
                                                                System.out.println("Este campo no puede estar vacio");
                                                            } else {

                                                                boolean barberoEncontrado = false;

                                                                for (int i = 0; i < numerosIdentificadoresBarberos.length; i++) {

                                                                    if (numerosIdentificadoresBarberos[i].equals(numeroIdentificadorIngresado)) {

                                                                        barberoEncontrado = true;

                                                                        System.out.println("\n===== BARBERO ENCONTRADO =====");
                                                                        System.out.println("Nombre: " + nombresBarberos[i]);
                                                                        System.out.println("Correo electronico: " + correosElectronicosBarbero[i]);
                                                                        System.out.println("Numero identificador: " + numerosIdentificadoresBarberos[i]);

                                                                        System.out.println("\n¿Estas seguro de que deseas eliminar este barbero?");
                                                                        System.out.println("1. Si");
                                                                        System.out.println("2. No");

                                                                        char opcionEliminar = scanner.nextLine().charAt(0);

                                                                        if (opcionEliminar == '1') {

                                                                            for (int j = i; j < numerosIdentificadoresBarberos.length - 1; j++) {

                                                                                nombresBarberos[j] = nombresBarberos[j + 1];
                                                                                correosElectronicosBarbero[j] = correosElectronicosBarbero[j + 1];
                                                                                contrasenasBarbero[j] = contrasenasBarbero[j + 1];
                                                                                numerosIdentificadoresBarberos[j] = numerosIdentificadoresBarberos[j + 1];

                                                                            }

                                                                            capacidadCreacionCuentasBarbero--;

                                                                            nombresBarberos = java.util.Arrays.copyOf(nombresBarberos, capacidadCreacionCuentasBarbero);
                                                                            correosElectronicosBarbero = java.util.Arrays.copyOf(correosElectronicosBarbero, capacidadCreacionCuentasBarbero);
                                                                            contrasenasBarbero = java.util.Arrays.copyOf(contrasenasBarbero, capacidadCreacionCuentasBarbero);
                                                                            numerosIdentificadoresBarberos = java.util.Arrays.copyOf(numerosIdentificadoresBarberos, capacidadCreacionCuentasBarbero);

                                                                            System.out.println("Barbero eliminado correctamente");

                                                                        } else if (opcionEliminar == '2') {
                                                                            System.out.println("Eliminacion cancelada");
                                                                        } else {
                                                                            System.out.println("Opcion no valida. No se elimino el barbero");
                                                                        }
                                                                        break;
                                                                    }
                                                                }

                                                                if (barberoEncontrado != true) {
                                                                    System.out.println("No se encontro ningun barbero con ese numero identificador");
                                                                }
                                                            }

                                                        } while (numeroIdentificadorIngresado.trim().isEmpty());
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
                                                scanner.nextLine();
                                                switch (opcionDeGetionCliente) {
                                                    case '1':
                                                        do {
                                                            System.out.println("Ingresa el nombre del cliente");
                                                            nombreIngresado = scanner.nextLine();

                                                            if (nombreIngresado.trim().isEmpty()) {
                                                                System.out.println("Este campo no puede estar vacio");
                                                            }
                                                        } while (nombreIngresado.trim().isEmpty());

                                                        do {
                                                            System.out.println("Ingresa el numero de cedula del cliente");
                                                            numeroCedulaIngresado = scanner.nextLine();

                                                            if (numeroCedulaIngresado.trim().isEmpty()) {
                                                                System.out.println("Este campo no puede estar vacio");
                                                            } else {
                                                                boolean cedulaExiste = false;

                                                                for (int i = 0; i < numerosCedulaClientes.length; i++) {
                                                                    if (numerosCedulaClientes[i].equals(numeroCedulaIngresado)) {
                                                                        cedulaExiste = true;
                                                                        System.out.println("Esta cedula ya se encuentra registrada");
                                                                        break;
                                                                    }
                                                                }

                                                                if (cedulaExiste == true) {
                                                                    numeroCedulaIngresado = "";
                                                                }
                                                            }
                                                        } while (numeroCedulaIngresado.trim().isEmpty());

                                                        do {
                                                            System.out.println("Ingresa el correo electronico del cliente");
                                                            correoElectronicoIngresado = scanner.nextLine();

                                                            if (correoElectronicoIngresado.trim().isEmpty()) {
                                                                System.out.println("Este campo no puede estar vacio");
                                                            }
                                                        } while (correoElectronicoIngresado.trim().isEmpty());

                                                        do {
                                                            System.out.println("Ingresa la contraseña del cliente");
                                                            contrasenaIngresada = scanner.nextLine();

                                                            if (contrasenaIngresada.trim().isEmpty()) {
                                                                System.out.println("Este campo no puede estar vacio");
                                                            }
                                                        } while (contrasenaIngresada.trim().isEmpty());

                                                        capacidadCreacionCuentasCliente++;

                                                        nombresClientes = java.util.Arrays.copyOf(nombresClientes, capacidadCreacionCuentasCliente);
                                                        numerosCedulaClientes = java.util.Arrays.copyOf(numerosCedulaClientes, capacidadCreacionCuentasCliente);
                                                        correosElectronicosClientes = java.util.Arrays.copyOf(correosElectronicosClientes, capacidadCreacionCuentasCliente);
                                                        contrasenasCliente = java.util.Arrays.copyOf(contrasenasCliente, capacidadCreacionCuentasCliente);

                                                        nombresClientes[capacidadCreacionCuentasCliente - 1] = nombreIngresado;
                                                        numerosCedulaClientes[capacidadCreacionCuentasCliente - 1] = numeroCedulaIngresado;
                                                        correosElectronicosClientes[capacidadCreacionCuentasCliente - 1] = correoElectronicoIngresado;
                                                        contrasenasCliente[capacidadCreacionCuentasCliente - 1] = contrasenaIngresada;

                                                        System.out.println("Cliente registrado correctamente");
                                                        break;
                                                    case '2':
                                                        System.out.println("===== CLIENTES REGISTRADOS =====");

                                                        for (int i = 0; i < numerosCedulaClientes.length; i++) {

                                                            System.out.println("\nCliente " + (i + 1));
                                                            System.out.println("Nombre: " + nombresClientes[i]);
                                                            System.out.println("Numero de cedula: " + numerosCedulaClientes[i]);
                                                            System.out.println("Correo electronico: " + correosElectronicosClientes[i]);

                                                            System.out.println("-----------------------------------");
                                                        }
                                                        break;
                                                    case '3':
                                                        System.out.println("===== BUSCAR CLIENTE =====");
                                                        do {
                                                            System.out.println("Ingresa el numero de cedula del cliente");
                                                            numeroIdentificadorIngresado = scanner.nextLine();

                                                            if (numeroIdentificadorIngresado.trim().isEmpty()) {
                                                                System.out.println("Este campo no puede estar vacio");
                                                            } else {

                                                                boolean clienteEncontrado = false;

                                                                for (int i = 0; i < numerosCedulaClientes.length; i++) {

                                                                    if (numerosCedulaClientes[i].equals(numeroIdentificadorIngresado)) {

                                                                        clienteEncontrado = true;

                                                                        System.out.println("\n===== INFORMACION DEL CLIENTE =====");
                                                                        System.out.println("Nombre: " + nombresClientes[i]);
                                                                        System.out.println("Numero de cedula: " + numerosCedulaClientes[i]);
                                                                        System.out.println("Correo electronico: " + correosElectronicosClientes[i]);

                                                                        break;
                                                                    }
                                                                }

                                                                if (clienteEncontrado != true) {
                                                                    System.out.println("No se encontro ningun cliente con ese numero de cedula");
                                                                }
                                                            }

                                                        } while (numeroIdentificadorIngresado.trim().isEmpty());
                                                        break;
                                                    case '4':
                                                        System.out.println("===== ACTUALIZAR INFORMACION DEL CLIENTE =====");

                                                        do {
                                                            System.out.println("Ingresa el numero de cedula del cliente que deseas actualizar");
                                                            numeroCedulaIngresado = scanner.nextLine();

                                                            if (numeroCedulaIngresado.trim().isEmpty()) {
                                                                System.out.println("Este campo no puede estar vacio");
                                                            } else {

                                                                boolean clienteEncontrado = false;

                                                                for (int i = 0; i < numerosCedulaClientes.length; i++) {

                                                                    if (numerosCedulaClientes[i].equals(numeroCedulaIngresado)) {

                                                                        clienteEncontrado = true;

                                                                        System.out.println("\n===== INFORMACION DEL CLIENTE =====");
                                                                        System.out.println("Nombre: " + nombresClientes[i]);
                                                                        System.out.println("Numero de cedula: " + numerosCedulaClientes[i]);
                                                                        System.out.println("Correo electronico: " + correosElectronicosClientes[i]);

                                                                        boolean salirActualizar = true;

                                                                        do {
                                                                            System.out.println("\n===== ACTUALIZAR INFORMACION =====");
                                                                            System.out.println("1. Actualizar nombre");
                                                                            System.out.println("2. Actualizar correo electronico");
                                                                            System.out.println("3. Actualizar contraseña");
                                                                            System.out.println("4. Actualizar todos los datos");
                                                                            System.out.println("5. Volver");

                                                                            opcionActualizar = scanner.nextLine().charAt(0);

                                                                            switch (opcionActualizar) {

                                                                                case '1':
                                                                                    do {
                                                                                        System.out.println("Ingresa el nuevo nombre del cliente");
                                                                                        nombreIngresado = scanner.nextLine();

                                                                                        if (nombreIngresado.trim().isEmpty()) {
                                                                                            System.out.println("Este campo no puede estar vacio");
                                                                                        }
                                                                                    } while (nombreIngresado.trim().isEmpty());

                                                                                    nombresClientes[i] = nombreIngresado;

                                                                                    System.out.println("Nombre actualizado correctamente");
                                                                                    break;

                                                                                case '2':
                                                                                    do {
                                                                                        System.out.println("Ingresa el nuevo correo electronico");
                                                                                        correoElectronicoIngresado = scanner.nextLine();

                                                                                        if (correoElectronicoIngresado.trim().isEmpty()) {
                                                                                            System.out.println("Este campo no puede estar vacio");
                                                                                        }
                                                                                    } while (correoElectronicoIngresado.trim().isEmpty());

                                                                                    correosElectronicosClientes[i] = correoElectronicoIngresado;

                                                                                    System.out.println("Correo electronico actualizado correctamente");
                                                                                    break;

                                                                                case '3':
                                                                                    do {
                                                                                        System.out.println("Ingresa la nueva contraseña");
                                                                                        contrasenaIngresada = scanner.nextLine();

                                                                                        if (contrasenaIngresada.trim().isEmpty()) {
                                                                                            System.out.println("Este campo no puede estar vacio");
                                                                                        }
                                                                                    } while (contrasenaIngresada.trim().isEmpty());

                                                                                    contrasenasCliente[i] = contrasenaIngresada;

                                                                                    System.out.println("Contraseña actualizada correctamente");
                                                                                    break;

                                                                                case '4':
                                                                                    do {
                                                                                        System.out.println("Ingresa el nuevo nombre del cliente");
                                                                                        nombreIngresado = scanner.nextLine();

                                                                                        if (nombreIngresado.trim().isEmpty()) {
                                                                                            System.out.println("Este campo no puede estar vacio");
                                                                                        }
                                                                                    } while (nombreIngresado.trim().isEmpty());

                                                                                    do {
                                                                                        System.out.println("Ingresa el nuevo correo electronico");
                                                                                        correoElectronicoIngresado = scanner.nextLine();

                                                                                        if (correoElectronicoIngresado.trim().isEmpty()) {
                                                                                            System.out.println("Este campo no puede estar vacio");
                                                                                        }
                                                                                    } while (correoElectronicoIngresado.trim().isEmpty());

                                                                                    do {
                                                                                        System.out.println("Ingresa la nueva contraseña");
                                                                                        contrasenaIngresada = scanner.nextLine();

                                                                                        if (contrasenaIngresada.trim().isEmpty()) {
                                                                                            System.out.println("Este campo no puede estar vacio");
                                                                                        }
                                                                                    } while (contrasenaIngresada.trim().isEmpty());

                                                                                    nombresClientes[i] = nombreIngresado;
                                                                                    correosElectronicosClientes[i] = correoElectronicoIngresado;
                                                                                    contrasenasCliente[i] = contrasenaIngresada;

                                                                                    System.out.println("Todos los datos se actualizaron correctamente");
                                                                                    break;

                                                                                case '5':
                                                                                    salirActualizar = false;
                                                                                    System.out.println("Volviendo al menu de gestion de clientes");
                                                                                    break;

                                                                                default:
                                                                                    System.out.println("Opcion no valida");
                                                                                    break;
                                                                            }

                                                                        } while (salirActualizar != false);

                                                                        break;
                                                                    }
                                                                }

                                                                if (clienteEncontrado != true) {
                                                                    System.out.println("No se encontro ningun cliente con ese numero de cedula");
                                                                }
                                                            }

                                                        } while (numeroCedulaIngresado.trim().isEmpty());
                                                        break;
                                                    case '5':
                                                        System.out.println("===== ELIMINAR CLIENTE =====");

                                                        do {
                                                            System.out.println("Ingresa el numero de cedula del cliente que deseas eliminar");
                                                            numeroCedulaIngresado = scanner.nextLine();

                                                            if (numeroCedulaIngresado.trim().isEmpty()) {
                                                                System.out.println("Este campo no puede estar vacio");
                                                            } else {

                                                                boolean clienteEncontrado = false;

                                                                for (int i = 0; i < numerosCedulaClientes.length; i++) {

                                                                    if (numerosCedulaClientes[i].equals(numeroCedulaIngresado)) {

                                                                        clienteEncontrado = true;

                                                                        System.out.println("\n===== CLIENTE ENCONTRADO =====");
                                                                        System.out.println("Nombre: " + nombresClientes[i]);
                                                                        System.out.println("Numero de cedula: " + numerosCedulaClientes[i]);
                                                                        System.out.println("Correo electronico: " + correosElectronicosClientes[i]);

                                                                        System.out.println("\n¿Estas seguro de que deseas eliminar este cliente?");
                                                                        System.out.println("1. Si");
                                                                        System.out.println("2. No");

                                                                        char opcionEliminar = scanner.nextLine().charAt(0);

                                                                        if (opcionEliminar == '1') {

                                                                            for (int j = i; j < numerosCedulaClientes.length - 1; j++) {

                                                                                nombresClientes[j] = nombresClientes[j + 1];
                                                                                numerosCedulaClientes[j] = numerosCedulaClientes[j + 1];
                                                                                correosElectronicosClientes[j] = correosElectronicosClientes[j + 1];
                                                                                contrasenasCliente[j] = contrasenasCliente[j + 1];

                                                                            }

                                                                            capacidadCreacionCuentasCliente--;

                                                                            nombresClientes = java.util.Arrays.copyOf(nombresClientes, capacidadCreacionCuentasCliente);
                                                                            numerosCedulaClientes = java.util.Arrays.copyOf(numerosCedulaClientes, capacidadCreacionCuentasCliente);
                                                                            correosElectronicosClientes = java.util.Arrays.copyOf(correosElectronicosClientes, capacidadCreacionCuentasCliente);
                                                                            contrasenasCliente = java.util.Arrays.copyOf(contrasenasCliente, capacidadCreacionCuentasCliente);

                                                                            System.out.println("Cliente eliminado correctamente");

                                                                        } else if (opcionEliminar == '2') {
                                                                            System.out.println("Eliminacion cancelada");
                                                                        } else {
                                                                            System.out.println("Opcion no valida. No se elimino el cliente");
                                                                        }
                                                                        break;
                                                                    }
                                                                }
                                                                if (clienteEncontrado != true) {
                                                                    System.out.println("No se encontro ningun cliente con ese numero de cedula");
                                                                }
                                                            }

                                                        } while (numeroCedulaIngresado.trim().isEmpty());
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
