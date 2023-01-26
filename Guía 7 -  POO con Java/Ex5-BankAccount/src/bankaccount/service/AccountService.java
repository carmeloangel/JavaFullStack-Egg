package bankaccount.service;

import bankaccount.entity.Account;
import java.util.Scanner;

/**
 *
 * @author Angel Campos
 */
public class AccountService {

    private Scanner reader = new Scanner(System.in).useDelimiter("\n");

    public Account createAccount() {

        int accountNumber;
        long dni;
        double currentBalance;

        boolean flag = true;

        try {
            do {
                System.out.print("Ingresar el numero de cuenta: ");
                accountNumber = reader.nextInt();

                System.out.print("Ingresar el DNI: ");
                dni = reader.nextLong();

                System.out.print("Ingresar el saldo actual: ");
                currentBalance = reader.nextDouble();

                if (accountNumber > 0 && dni > 0 && currentBalance >= 0) {
                    flag = false;
                } else {
                    flag = true;
                    System.out.println("ERROR: Ingresar los valores correctamente.");
                }

            } while (flag);

            return new Account(accountNumber, dni, currentBalance);

        } catch (Exception e) {
            System.out.println("ERROR: Ingresar los valores correctamente.");
        }
        return null;
    }

    private void deposit(Account a, double deposit) {
        a.setCurrentBalance(a.getCurrentBalance() + deposit);
    }

    public void makeDeposit(Account a) {
        try {
            if (a != null) {
                System.out.print("Ingrese la cantidad de dinero a depositar: ");
                double deposit = reader.nextDouble();
                if (deposit > 0) {
                    deposit(a, deposit);
                } else {
                    System.out.println("ERROR: Debe ingresar un valor mayor que cero.");
                }
            }
        } catch (Exception e) {
            System.out.println("ERROR: Datos ingresados incorrectamente.");
        }
    }

    private void withdrawals(Account a, double drowOut) {
        if (a.getCurrentBalance() > drowOut) {
            a.setCurrentBalance(a.getCurrentBalance() - drowOut);
        } else {
            a.setCurrentBalance(0);
        }
    }

    public void makeWithdrawal(Account a) {
        try {
            if (a != null) {
                System.out.print("Ingrese la cantidad de dinero a extraer: ");
                double extraction = reader.nextDouble();
                if (extraction >= 0) {
                    withdrawals(a, extraction);
                } else {
                    System.out.println("ERROR: Debe ingresar un valor mayor o igual que cero.");
                }
            }
        } catch (Exception e) {
            System.out.println("ERROR: Datos ingresados incorrectamente.");
        }
    }

    public void fastWithdrawal(Account a) {
        try {
            if (a != null) {
                System.out.println("Extracción rapida. Solo puede extraer hasta un 20% de saldo actual. ");
                System.out.print("Ingrese la cantidad de dinero a extraer: ");
                double extraction = reader.nextDouble();
                if (extraction >= 0 && extraction <= (a.getCurrentBalance() * 0.2)) {
                    withdrawals(a, extraction);
                } else {
                    System.out.println("ERROR: Debe ingresar un valor mayor o igual "
                            + "que cero, y menor al 20% del saldo actual.");
                }
            }
        } catch (Exception e) {
            System.out.println("ERROR: Datos ingresados incorrectamente.");
        }
    }

    public void getCurrentBalance(Account a) {
        if (a != null) {
            System.out.println("El saldo disponible es: " + a.getCurrentBalance());
        }
    }
    
    public void getAccountData(Account a) {
        if (a != null) {
            System.out.println("Los datos de la cuenta son: ");
            System.out.println(a.toString());;
        }
    }

}
