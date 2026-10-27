package login;

import java.util.Scanner;

public class Login {
    public Login() {
        Scanner scanner = new Scanner(System.in);
        String usuario = "", contraseña = "";
        boolean menuLogin = true;
        char opcionLogin = '0';
        do {
            System.out.println("""
                    1. iniciar seccion
                    2. crear cuenta
                    3. volver
                    """);
            opcionLogin = scanner.next().charAt(0);

            switch (opcionLogin){
                case '1':
                    System.out.println("iniciando seccion");
                    break;
                case '2':
                    System.out.println("creando cuenta");
                    break;
                case '3':
                    menuLogin = false;
                    System.out.println("volviendo");
                    break;
                default:
                    System.out.println("opcion invalida");
            }
        }while (menuLogin != false);
    }
}
