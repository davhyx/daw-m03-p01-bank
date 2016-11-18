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

        String auth = "0";
        do {
            System.out.println("######################");
            System.out.println("#######  AUTH  #######");
            System.out.println("######################");
            System.out.println("Identificación:");
            System.out.println("DNI:");
            System.out.println("0 - Salir");
            auth = input.next();

            if(auth!="0"){
                nifCliente = auth;
            }

        }while (auth != "0");


        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        clientes.add(new Cliente ("David", "nifDavid"));
        clientes.add(new Cliente ("Juanjo", "nifJuanjo"));
        clientes.add(new Cliente ("Victor", "nifVictor"));


        ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();
        cuentas.add(new CuentaCorriente ("1", "nifDavid", 100));
        cuentas.add(new CuentaAhorro ("2", "nifJuanjo", 200));
        cuentas.add(new CuentaCorriente ("3", "nifVictor", 300));

        ArrayList<Sucursal> sucursales = new ArrayList<Sucursales>();
        sucursales.add(new Sucursal ("01"));
        sucursales.add(new Sucursal ("02"));



        int opcion0;

        //Menu
        do {
            System.out.println("######################");
            System.out.println("#######  MENU  #######");
            System.out.println("######################");
            System.out.println("Elija una opción:");
            System.out.println("1 - Ver saldo de una cuenta:");
            System.out.println("2 - Hacer un deposito:");
            System.out.println("3 - Hacer una extracción:");
            System.out.println("4 - Crear cuenta");
            System.out.println("5 - Eliminar cuenta:");
            /* System.out.println("6 - Ver sucursales:"); */
            System.out.println("0 - Salir");

            opcion0 = input.nextInt();

            switch (opcion0) {
                //1 - Ver saldo en cuenta:
                case 1:

                    int index1 = -1;
                    System.out.println("#######  VER SALDO  #######");
                    System.out.println("Introduzca el número de cuenta:");
                    numCuenta = input.next();

                    /*Llamamos al metodo verSaldo de Cuenta, mediante polimorfismo nos mostrará
                    el saldo del tipo de cuenta que sea CA/CC sin pasarlo explicitamente. */

                    for (int i = 0; i < cuentas.size(); i++) {

                        if (numCuenta.equals(cuentas.get(i).getNumCuenta())) {
                            index1 = i;
                            System.out.println("El saldo en la cuenta es: " + cuentas.get(index1).getSaldo());
                        }
                        //Mira todas las cuentas y si no es la correcta te muestra el system.out
                        /*
                        if(numCuenta != cuentas.get(i).getNumCuenta()){
                            System.out.println("No es la cuenta solicitada");
                            index1= i;
                        }
                        */
                    }
                    break;
                case 2:

                    int index2 = -1;
                    int deposito2 = 0;
                    System.out.println("#######  HACER DEPOSITO  #######");
                    System.out.println("Introduzca el número de cuenta:");
                    numCuenta = input.next();
                    for (int i = 0; i < cuentas.size(); i++) {
                        if (numCuenta.equals(cuentas.get(i).getNumCuenta())) {
                            index2 = i;
                        }
                    }
                    System.out.println("El saldo en la cuenta es: " + cuentas.get(index2).getSaldo());
                    System.out.println("Cantidad que quieres dipositar:");
                    deposito2 = Integer.parseInt(input.next());
                    cuentas.get(index2).setDeposito(deposito2);
                    System.out.println("El saldo en la cuenta es: " + cuentas.get(index2).getSaldo());

                    break;
                case 3:

                    int index3 = -1;
                    int extraccion = 0;
                    System.out.println("#######  HACER UNA EXTRACCIÓN  #######");
                    System.out.println("Introduzca el número de cuenta:");
                    numCuenta = input.next();
                    for (int i = 0; i < cuentas.size(); i++) {
                        if (numCuenta.equals(cuentas.get(i).getNumCuenta())) {
                            index3 = i;
                        }
                    }
                    System.out.println("El saldo en la cuenta es: " + cuentas.get(index3).getSaldo());
                    System.out.println("Cantidad que quieres extraer:");
                    extraccion = Integer.parseInt(input.next());
                    cuentas.get(index3).setExtraccion(extraccion);
                    System.out.println("El saldo en la cuenta es: " + cuentas.get(index3).getSaldo());

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

                case 6:

                  int index6 = -1;
                  System.out.println("#######  SUCURSALES  #######");
                  System.out.println("Introduzca el numero de sucursal:");
                  numSucursal = input.next();

                  for (int i = 0; i < sucursales.size(); i++) {
                      if (numSucursal.equals(sucursales.get(i).getNumSucursal())) {
                          index6 = i;
                      }
                  }

                  System.out.println(sucursales.get(index1).getNumCuenta());

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
