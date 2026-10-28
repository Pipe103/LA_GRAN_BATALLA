
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char opcionTipoUsuario = '0';
        char opcionTipoLogin = '0';

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
                                           DE USUARIO
                                =================================
                                1 - iniciar seccion
                                2 - crear cuenta
                                3 - volver
                                Seleccione una opción:
                                """);
                        opcionTipoLogin = scanner.next().charAt(0);
                        switch (opcionTipoUsuario) {
                            case '1':
                                break;
                            case '2':
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
                        switch (opcionTipoUsuario) {
                            case '1':
                                break;
                            case '2':
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
                        switch (opcionTipoUsuario) {
                            case '1':
                                break;
                            case '2':
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