package bankaccount.entity;

/**
 *
 * @author Angel Campos
 */
public class Account {

    private int accountNumber;
    private long dni;
    private double currentBalance;

    public Account() {
        this.accountNumber = 0;
        this.dni = 0;
        this.currentBalance = 0;
    }

    public Account(int accountNumber, long dni, double currentBalance) {
        this.accountNumber = accountNumber;
        this.dni = dni;
        this.currentBalance = currentBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    @Override
    public String toString() {
        try {
            return "Account{" + "accountNumber=" + accountNumber + ", dni=" + dni + ", currentBalance=" + currentBalance + '}';
        } catch (Exception e) {
            return "ERROR: Debe ingresar los datos correctamente.";
        }
//        if (this == null) {
//            return "ERROR: Debe ingresar los datos correctamente.";
//        } else {
//            return "Account{" + "accountNumber=" + accountNumber + ", dni=" + dni + ", currentBalance=" + currentBalance + '}';
//        }

    }

}
