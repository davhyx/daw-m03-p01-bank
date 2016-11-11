import java.util.Scanner;

/**
 * @brief Classe appBankMain 
 * @description Programa Gestión de una entidad bancaria
 * @autor Victor Marchante, Juanjo Castillo y David Castro
 */

public class appBankMain {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        String numCuenta;
        String nombreCliente;
        String tipoCuenta;
        float valor;

        int opcion0;
        
        //Menu
        do {
            System.out.println("#######  MENU  #######");
            System.out.println("Elija una opción:");
            System.out.println("1 - Ver saldo de una cuenta:");
            System.out.println("2 - Hacer un deposito:");
            System.out.println("3 - Hacer una extracción:");
            System.out.println("4 - Crear cuenta");
            System.out.println("5 - Eliminar cuenta:");
            System.out.println("6 - Ver sucursales:");
            System.out.println("0 - Salir");

            opcion0 = input.nextInt();

            switch (opcion0) {
                //1 - Ver saldo en cuenta:
                case 1:

                    System.out.println("#######  VER SALDO  #######");
                    System.out.println("Introduzca el numero de cuenta:");
                    numCuenta = input.nextInt();

                    /*Llamamos al metodo verSaldo de Cuenta, mediante polimorfismo nos mostrará
                    el saldo del tipo de cuenta que sea CA/CC sin pasarlo explicitamente. */
                    //numCuenta.verSaldo();

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    //PARA CREAR UNA CUENTA
                    System.out.print("Introduzca el número de cuenta: ");
                    numCuenta = input.next();

                    System.out.print("Nombre del titular: ");
                    nombreCliente = input.next();

                    System.out.print("Tipo de cuenta: ");
                    tipoCuenta = input.next();

                    if(tipoCuenta == "CA"){
                        ct1 = new CuentaAhorro(numCuenta, nombreCliente);
                    } else {
                        ct1 = new CuentaCorriente(numCuenta, nombreCliente);
                    }

                    break;
                case 5:

                    break;
                case 0:
                    //10 - Salir
                    System.out.println("Log off");
                    break;
                default:
                    //Caso de opcion incorrecta
                    System.out.println("Opción no válida");
                    break;
            }

        } while (opcion0 != 0);

    }
}