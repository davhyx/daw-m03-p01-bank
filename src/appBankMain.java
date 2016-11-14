import java.util.ArrayList;
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
        String nifCliente;
        String tipoCuenta;

        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        clientes.add(new Cliente ("David", "nifDavid"));
        clientes.add(new Cliente ("Juanjo", "nifJuanjo"));
        clientes.add(new Cliente ("Victor", "nifVictor"));


        ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();
        cuentas.add(new CuentaCorriente ("1", "nifDavid", 100));
        cuentas.add(new CuentaAhorro ("2", "nifJuanjo", 200));
        cuentas.add(new CuentaCorriente ("3", "nifVictor", 300));


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

                    int index1 = -1;
                    System.out.println("#######  VER SALDO  #######");
                    System.out.println("Introduzca el numero de cuenta:");
                    numCuenta = input.next();

                    /*Llamamos al metodo verSaldo de Cuenta, mediante polimorfismo nos mostrará
                    el saldo del tipo de cuenta que sea CA/CC sin pasarlo explicitamente. */

                    for (int i = 0; i < cuentas.size(); i++) {
                        if (numCuenta.equals(cuentas.get(i).getNumCuenta())) {
                            index1 = i;
                        }
                    }

                    System.out.println(cuentas.get(index1).getSaldo());

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    //PARA CREAR UNA CUENTA
                    System.out.print("Introduzca el número de cuenta: ");
                    numCuenta = input.next();

                    System.out.print("DNI del titular: ");
                    nifCliente = input.next();

                    System.out.print("Tipo de cuenta: ");
                    tipoCuenta = input.next();

                    if(tipoCuenta == "CA"){
                        //ct1 = new CuentaAhorro(numCuenta, nifCliente);
                        System.out.println("CuentaAhorro creada num:" + numCuenta  + " titular: " + nifCliente);
                    } else {
                        //ct1 = new CuentaCorriente(numCuenta, nifCliente);
                        System.out.println("CuentaCorriente creada num:" + numCuenta  + " titular: " + nifCliente);
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