
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
        boolean salirGestionPerfil = true;
        boolean correoExiste = false;
        int posicionCitaCancelar = -1;


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

        //aqui se guardan la informaciiion sobre las citas
        boolean horarioOcupadoActualizar = false;
        int posicionCitaActualizar = -1;
        int capacidadCreacionCitas = 0;
        String[] identificadoresCitas = new String[capacidadCreacionCitas];
        String[] numerosCedulaClientesCitas = new String[capacidadCreacionCitas];
        String[] numerosIdentificadoresBarberosCitas = new String[capacidadCreacionCitas];
        String[] serviciosCitas = new String[capacidadCreacionCitas];
        String[] fechasCitas = new String[capacidadCreacionCitas];
        String[] horasCitas = new String[capacidadCreacionCitas];
        String[] estadosCitas = new String[capacidadCreacionCitas];
        char opcionMenuCliente = '0';
        char opcionMiPerfil = '0';
        char opcionGestionCitas = '0';
        char opcionServicio = '0';
        String opcionMenuClienteIngresada = "";
        String opcionMiPerfilIngresada = "";
        String opcionGestionCitasIngresada = "";
        String opcionServicioIngresada = "";
        String servicioIngresado = "";
        String fechaCitaIngresada = "";
        String horaCitaIngresada = "";
        String identificadorCitaIngresado = "";
        int posicionClienteSesion = -1;
        int opcionBarbero = 0;
        int posicionBarberoSeleccionado = -1;
        String numeroIdentificadorBarberoSeleccionado = "";

        boolean salirMenuCliente = true;
        boolean salirMiPerfil = true;
        boolean salirGestionCitas = true;

        // aqui almacenamos los servicios
        int capacidadServicios = 3;
        boolean horarioOcupado = false;
        String[] nombresServicios = {
                "Corte de cabello",
                "Arreglo de barba",
                "Corte y barba"
        };
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
                                                        posicionClienteSesion = i;
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

                                do {
                                    System.out.println("\n===== MENU PRINCIPAL CLIENTE =====");
                                    System.out.println("1. Gestion de perfil");
                                    System.out.println("2. Gestion de citas");
                                    System.out.println("3. Cerrar sesion");
                                    opcionMenuCliente = scanner.next().charAt(0);

                                    switch (opcionMenuCliente) {
                                        case '1':
                                            do {

                                                System.out.println("\n===== GESTION DE PERFIL =====");
                                                System.out.println("1. Ver informacion del perfil");
                                                System.out.println("2. Cambiar nombre");
                                                System.out.println("3. Cambiar correo electronico");
                                                System.out.println("4. Cambiar contraseña");
                                                System.out.println("5. Volver al menu principal");
                                                opcionMiPerfil = scanner.next().charAt(0);
                                                scanner.nextLine();
                                                switch (opcionMiPerfil) {

                                                    case '1':
                                                        System.out.println("\n===== INFORMACION DE MI PERFIL =====");
                                                        System.out.println("Nombre: " + nombresClientes[posicionClienteSesion]);
                                                        System.out.println("Cedula: " + numerosCedulaClientes[posicionClienteSesion]);
                                                        System.out.println("Correo electronico: " + correosElectronicosClientes[posicionClienteSesion]);
                                                        break;

                                                    case '2':
                                                        do {
                                                            System.out.println("\n===== CAMBIAR NOMBRE =====");
                                                            System.out.println("Ingresa tu nuevo nombre:");
                                                            nombreIngresado = scanner.nextLine();

                                                            if (nombreIngresado.trim().isEmpty()) {

                                                                System.out.println("El nombre no puede estar vacio");

                                                            } else {

                                                                nombresClientes[posicionClienteSesion] = nombreIngresado;

                                                                System.out.println("Nombre actualizado exitosamente");

                                                            }

                                                        } while (nombreIngresado.trim().isEmpty());
                                                        break;

                                                    case '3':
                                                        do {

                                                            System.out.println("\n===== CAMBIAR CORREO ELECTRONICO =====");
                                                            System.out.println("Ingresa tu nuevo correo electronico:");
                                                            correoElectronicoIngresado = scanner.nextLine();

                                                            if (correoElectronicoIngresado.trim().isEmpty()) {

                                                                System.out.println("El correo electronico no puede estar vacio");

                                                            } else {


                                                                for (int i = 0; i < correosElectronicosClientes.length; i++) {

                                                                    if (i != posicionClienteSesion
                                                                            && correosElectronicosClientes[i].equals(correoElectronicoIngresado)) {

                                                                        correoExiste = true;
                                                                        break;
                                                                    }
                                                                }

                                                                if (correoExiste == true) {

                                                                    System.out.println("Este correo electronico ya se encuentra registrado");

                                                                } else {

                                                                    correosElectronicosClientes[posicionClienteSesion] = correoElectronicoIngresado;

                                                                    System.out.println("Correo electronico actualizado exitosamente");
                                                                }
                                                            }

                                                        } while (correoElectronicoIngresado.trim().isEmpty()
                                                                || correoExiste == true);
                                                        break;
                                                    case '4':
                                                        do {
                                                            System.out.println("\n===== CAMBIAR CONTRASEÑA =====");
                                                            System.out.println("Ingresa tu nueva contraseña:");
                                                            contrasenaIngresada = scanner.nextLine();

                                                            if (contrasenaIngresada.trim().isEmpty()) {
                                                                System.out.println("La contraseña no puede estar vacia");
                                                            } else if (contrasenaIngresada.equals(
                                                                    contrasenasCliente[posicionClienteSesion])) {
                                                                System.out.println("La nueva contraseña no puede ser igual a la anterior");
                                                            } else {
                                                                contrasenasCliente[posicionClienteSesion] = contrasenaIngresada;
                                                                System.out.println("Contraseña actualizada exitosamente");
                                                            }

                                                        } while (contrasenaIngresada.trim().isEmpty()
                                                                || contrasenaIngresada.equals(contrasenasCliente[posicionClienteSesion]));
                                                        break;
                                                    case '5':
                                                        break;
                                                    default:
                                                        System.out.println("Opcion no valida");
                                                        break;
                                                }
                                            } while (opcionMiPerfil != '5');
                                            break;
                                        case '2':
                                            do {
                                                System.out.println("\n===== GESTION DE CITAS =====");
                                                System.out.println("1. Registrar cita");
                                                System.out.println("2. Mostrar mis citas");
                                                System.out.println("3. Actualizar cita");
                                                System.out.println("4. Cancelar cita");
                                                System.out.println("5. Volver al menu principal");

                                                System.out.println("Selecciona una opcion:");
                                                opcionGestionCitas = scanner.next().charAt(0);
                                                scanner.nextLine();

                                                switch (opcionGestionCitas) {

                                                    case '1':
                                                        do {
                                                            System.out.println("\n===== SELECCIONAR SERVICIO =====");
                                                            for (int i = 0; i < nombresServicios.length; i++) {
                                                                System.out.println((i + 1) + ". " + nombresServicios[i]);
                                                            }
                                                            opcionServicio = scanner.next().charAt(0);

                                                            switch (opcionServicio) {
                                                                case '1':
                                                                    servicioIngresado = nombresServicios[0];
                                                                    break;

                                                                case '2':
                                                                    servicioIngresado = nombresServicios[1];
                                                                    break;

                                                                case '3':
                                                                    servicioIngresado = nombresServicios[2];
                                                                    break;

                                                                default:
                                                                    System.out.println("Opcion no valida");
                                                                    break;
                                                            }

                                                        } while (opcionServicio != '1'
                                                                && opcionServicio != '2'
                                                                && opcionServicio != '3');

                                                        if (capacidadCreacionCuentasBarbero == 0) {

                                                            System.out.println("No hay barberos registrados. No es posible registrar una cita.");

                                                        } else {

                                                            do {

                                                                System.out.println("\n===== SELECCIONAR BARBERO =====");

                                                                for (int i = 0; i < capacidadCreacionCuentasBarbero; i++) {

                                                                    System.out.println((i + 1) + ". " + nombresBarberos[i]
                                                                            + " - ID: " + numerosIdentificadoresBarberos[i]);

                                                                }

                                                                System.out.println("Selecciona un barbero:");

                                                                opcionBarbero = scanner.nextInt();
                                                                scanner.nextLine();

                                                                if (opcionBarbero < 1 || opcionBarbero > capacidadCreacionCuentasBarbero) {

                                                                    System.out.println("Opcion no valida");

                                                                } else {

                                                                    posicionBarberoSeleccionado = opcionBarbero - 1;

                                                                    numeroIdentificadorBarberoSeleccionado =
                                                                            numerosIdentificadoresBarberos[posicionBarberoSeleccionado];

                                                                    System.out.println("Barbero seleccionado: "
                                                                            + nombresBarberos[posicionBarberoSeleccionado]);
                                                                }

                                                            } while (opcionBarbero < 1 || opcionBarbero > capacidadCreacionCuentasBarbero);

                                                            do {

                                                                System.out.println("\n===== FECHA DE LA CITA =====");
                                                                System.out.println("Ingresa la fecha de la cita (DD/MM/AAAA):");

                                                                fechaCitaIngresada = scanner.nextLine();

                                                                if (fechaCitaIngresada.trim().isEmpty()) {
                                                                    System.out.println("La fecha no puede estar vacia");
                                                                }

                                                            } while (fechaCitaIngresada.trim().isEmpty());
                                                            do {

                                                                System.out.println("\n===== HORA DE LA CITA =====");
                                                                System.out.println("Ingresa la hora de la cita (HH:MM):");

                                                                horaCitaIngresada = scanner.nextLine();

                                                                if (horaCitaIngresada.trim().isEmpty()) {

                                                                    System.out.println("La hora no puede estar vacia");

                                                                }

                                                            } while (horaCitaIngresada.trim().isEmpty());

                                                            for (int i = 0; i < capacidadCreacionCitas; i++) {

                                                                if (numerosIdentificadoresBarberosCitas[i].equals(numeroIdentificadorBarberoSeleccionado)
                                                                        && fechasCitas[i].equals(fechaCitaIngresada)
                                                                        && horasCitas[i].equals(horaCitaIngresada)
                                                                        && !estadosCitas[i].equals("Cancelada")) {

                                                                    horarioOcupado = true;
                                                                    break;
                                                                }
                                                            }

                                                            if (horarioOcupado == true) {

                                                                System.out.println("El barbero ya tiene una cita en esa fecha y hora.");

                                                            } else {
                                                                capacidadCreacionCitas++;
                                                                int posicionCita = capacidadCreacionCitas - 1;
                                                                identificadoresCitas = java.util.Arrays.copyOf(
                                                                        identificadoresCitas, capacidadCreacionCitas);

                                                                numerosCedulaClientesCitas = java.util.Arrays.copyOf(
                                                                        numerosCedulaClientesCitas, capacidadCreacionCitas);

                                                                numerosIdentificadoresBarberosCitas = java.util.Arrays.copyOf(
                                                                        numerosIdentificadoresBarberosCitas, capacidadCreacionCitas);

                                                                serviciosCitas = java.util.Arrays.copyOf(
                                                                        serviciosCitas, capacidadCreacionCitas);

                                                                fechasCitas = java.util.Arrays.copyOf(
                                                                        fechasCitas, capacidadCreacionCitas);

                                                                horasCitas = java.util.Arrays.copyOf(
                                                                        horasCitas, capacidadCreacionCitas);

                                                                estadosCitas = java.util.Arrays.copyOf(
                                                                        estadosCitas, capacidadCreacionCitas);


                                                                ///////////////////////////////
                                                                identificadoresCitas[posicionCita] = "CITA-" + capacidadCreacionCitas;

                                                                numerosCedulaClientesCitas[posicionCita] =
                                                                        numerosCedulaClientes[posicionClienteSesion];

                                                                numerosIdentificadoresBarberosCitas[posicionCita] =
                                                                        numeroIdentificadorBarberoSeleccionado;

                                                                serviciosCitas[posicionCita] = servicioIngresado;

                                                                fechasCitas[posicionCita] = fechaCitaIngresada;

                                                                horasCitas[posicionCita] = horaCitaIngresada;

                                                                estadosCitas[posicionCita] = "Activa";

                                                                System.out.println("¡Cita registrada exitosamente!");

                                                                System.out.println("Identificador de tu cita: "
                                                                        + identificadoresCitas[posicionCita]);
                                                            }
                                                        }
                                                        break;
                                                    case '2':

                                                        System.out.println("\n===== MIS CITAS =====");

                                                        boolean tieneCitas = false;

                                                        for (int i = 0; i < identificadoresCitas.length; i++) {

                                                            if (numerosCedulaClientesCitas[i].equals(
                                                                    numerosCedulaClientes[posicionClienteSesion])) {

                                                                tieneCitas = true;

                                                                System.out.println("\nIdentificador: " + identificadoresCitas[i]);
                                                                System.out.println("Servicio: " + serviciosCitas[i]);
                                                                System.out.println("Barbero: " + numerosIdentificadoresBarberosCitas[i]);
                                                                System.out.println("Fecha: " + fechasCitas[i]);
                                                                System.out.println("Hora: " + horasCitas[i]);
                                                                System.out.println("Estado: " + estadosCitas[i]);

                                                            }
                                                        }

                                                        if (tieneCitas == false) {
                                                            System.out.println("No tienes citas registradas.");
                                                        }

                                                        break;

                                                    case '3':

                                                        do {
                                                            System.out.println("\n===== ACTUALIZAR CITA =====");
                                                            System.out.println("Ingresa el identificador de la cita (0 para volver):");
                                                            identificadorCitaIngresado = scanner.nextLine();

                                                            if (identificadorCitaIngresado.equals("0")) {
                                                                System.out.println("Volviendo al menu de gestion de citas.");
                                                                break;
                                                            }

                                                            posicionCitaActualizar = -1;


                                                            for (int i = 0; i < identificadoresCitas.length; i++) {

                                                                if (identificadoresCitas[i].equals(identificadorCitaIngresado)
                                                                        && numerosCedulaClientesCitas[i].equals(
                                                                        numerosCedulaClientes[posicionClienteSesion])
                                                                        && estadosCitas[i].equals("Activa")) {

                                                                    posicionCitaActualizar = i;
                                                                    break;
                                                                }
                                                            }

                                                            if (posicionCitaActualizar == -1) {
                                                                System.out.println("No se encontro una cita activa con ese identificador.");
                                                            }

                                                        } while (posicionCitaActualizar == -1
                                                                && !identificadorCitaIngresado.equals("0"));

                                                        if (posicionCitaActualizar != -1) {

                                                            do {

                                                                String nuevaFechaCita = fechasCitas[posicionCitaActualizar];
                                                                String nuevaHoraCita = horasCitas[posicionCitaActualizar];

                                                                System.out.println("\n===== ACTUALIZAR CITA =====");
                                                                System.out.println("1. Cambiar fecha");
                                                                System.out.println("2. Cambiar hora");
                                                                System.out.println("3. Cambiar fecha y hora");
                                                                System.out.println("4. Volver");
                                                                System.out.println("Selecciona una opcion:");

                                                                opcionActualizar = scanner.nextLine().charAt(0);

                                                                switch (opcionActualizar) {

                                                                    case '1':

                                                                        do {
                                                                            System.out.println("Ingresa la nueva fecha (DD/MM/AAAA):");
                                                                            nuevaFechaCita = scanner.nextLine();

                                                                            if (nuevaFechaCita.trim().isEmpty()) {
                                                                                System.out.println("La fecha no puede estar vacia");
                                                                            }

                                                                        } while (nuevaFechaCita.trim().isEmpty());

                                                                        break;

                                                                    case '2':

                                                                        do {
                                                                            System.out.println("Ingresa la nueva hora (HH:MM):");
                                                                            nuevaHoraCita = scanner.nextLine();

                                                                            if (nuevaHoraCita.trim().isEmpty()) {
                                                                                System.out.println("La hora no puede estar vacia");
                                                                            }

                                                                        } while (nuevaHoraCita.trim().isEmpty());

                                                                        break;

                                                                    case '3':

                                                                        do {
                                                                            System.out.println("Ingresa la nueva fecha (DD/MM/AAAA):");
                                                                            nuevaFechaCita = scanner.nextLine();

                                                                            if (nuevaFechaCita.trim().isEmpty()) {
                                                                                System.out.println("La fecha no puede estar vacia");
                                                                            }

                                                                        } while (nuevaFechaCita.trim().isEmpty());

                                                                        do {
                                                                            System.out.println("Ingresa la nueva hora (HH:MM):");
                                                                            nuevaHoraCita = scanner.nextLine();

                                                                            if (nuevaHoraCita.trim().isEmpty()) {
                                                                                System.out.println("La hora no puede estar vacia");
                                                                            }

                                                                        } while (nuevaHoraCita.trim().isEmpty());

                                                                        break;

                                                                    case '4':
                                                                        System.out.println("Volviendo al menu de gestion de citas.");
                                                                        break;

                                                                    default:
                                                                        System.out.println("Opcion no valida");
                                                                        break;
                                                                }

                                                                if (opcionActualizar == '1'
                                                                        || opcionActualizar == '2'
                                                                        || opcionActualizar == '3') {


                                                                    horarioOcupadoActualizar = false;
                                                                    for (int i = 0; i < identificadoresCitas.length; i++) {

                                                                        if (i != posicionCitaActualizar
                                                                                && numerosIdentificadoresBarberosCitas[i].equals(
                                                                                numerosIdentificadoresBarberosCitas[posicionCitaActualizar])
                                                                                && fechasCitas[i].equals(nuevaFechaCita)
                                                                                && horasCitas[i].equals(nuevaHoraCita)
                                                                                && estadosCitas[i].equals("Activa")) {

                                                                            horarioOcupadoActualizar = true;
                                                                            break;
                                                                        }
                                                                    }

                                                                    if (horarioOcupadoActualizar == true) {

                                                                        System.out.println("El barbero ya tiene una cita en esa fecha y hora.");
                                                                        System.out.println("No se realizaron los cambios.");

                                                                    } else {

                                                                        fechasCitas[posicionCitaActualizar] = nuevaFechaCita;
                                                                        horasCitas[posicionCitaActualizar] = nuevaHoraCita;

                                                                        System.out.println("Cita actualizada exitosamente.");
                                                                    }
                                                                }

                                                            } while (opcionActualizar != '4');
                                                        }
                                                        break;

                                                    case '4':
                                                        do {
                                                            System.out.println("\n===== CANCELAR CITA =====");
                                                            System.out.println("Ingresa el identificador de la cita (0 para volver):");

                                                            identificadorCitaIngresado = scanner.nextLine();

                                                            if (identificadorCitaIngresado.equals("0")) {
                                                                System.out.println("Volviendo al menu de gestion de citas.");
                                                                break;
                                                            }

                                                            posicionCitaCancelar = -1;

                                                            for (int i = 0; i < identificadoresCitas.length; i++) {

                                                                if (identificadoresCitas[i].equals(identificadorCitaIngresado)
                                                                        && numerosCedulaClientesCitas[i].equals(
                                                                        numerosCedulaClientes[posicionClienteSesion])
                                                                        && estadosCitas[i].equals("Activa")) {

                                                                    posicionCitaCancelar = i;
                                                                    break;
                                                                }
                                                            }

                                                            if (posicionCitaCancelar == -1) {
                                                                System.out.println("No se encontro una cita activa con ese identificador.");
                                                            }

                                                        } while (posicionCitaCancelar == -1
                                                                && !identificadorCitaIngresado.equals("0"));

                                                        if (posicionCitaCancelar != -1) {

                                                            for (int i = posicionCitaCancelar; i < capacidadCreacionCitas - 1; i++) {

                                                                identificadoresCitas[i] = identificadoresCitas[i + 1];

                                                                numerosCedulaClientesCitas[i] = numerosCedulaClientesCitas[i + 1];

                                                                numerosIdentificadoresBarberosCitas[i] =
                                                                        numerosIdentificadoresBarberosCitas[i + 1];

                                                                serviciosCitas[i] = serviciosCitas[i + 1];

                                                                fechasCitas[i] = fechasCitas[i + 1];

                                                                horasCitas[i] = horasCitas[i + 1];

                                                                estadosCitas[i] = estadosCitas[i + 1];

                                                            }


                                                            capacidadCreacionCitas--;
                                                            identificadoresCitas = java.util.Arrays.copyOf(
                                                                    identificadoresCitas, capacidadCreacionCitas);

                                                            numerosCedulaClientesCitas = java.util.Arrays.copyOf(
                                                                    numerosCedulaClientesCitas, capacidadCreacionCitas);

                                                            numerosIdentificadoresBarberosCitas = java.util.Arrays.copyOf(
                                                                    numerosIdentificadoresBarberosCitas, capacidadCreacionCitas);

                                                            serviciosCitas = java.util.Arrays.copyOf(
                                                                    serviciosCitas, capacidadCreacionCitas);

                                                            fechasCitas = java.util.Arrays.copyOf(
                                                                    fechasCitas, capacidadCreacionCitas);

                                                            horasCitas = java.util.Arrays.copyOf(
                                                                    horasCitas, capacidadCreacionCitas);

                                                            estadosCitas = java.util.Arrays.copyOf(
                                                                    estadosCitas, capacidadCreacionCitas);

                                                            System.out.println("¡Cita cancelada exitosamente!");
                                                        }
                                                        break;

                                                    case '5':

                                                        break;

                                                    default:

                                                        System.out.println("Opcion invalida");

                                                        break;
                                                }

                                            } while (opcionGestionCitas != '5');
                                            break;

                                        case '3':

                                            System.out.println("Cerrando sesion...");
                                            break;

                                        default:
                                            System.out.println("Opcion no valida");
                                            break;
                                    }

                                } while (opcionMenuCliente != '3');
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
                                                        posicionClienteSesion = i;
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
