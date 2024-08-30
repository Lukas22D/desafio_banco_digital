package interface_transaction;

public interface TransactionInterface {

    void deposit(double value);

    void withdraw(double value);
    
    void transfer(double value, int accountNumber, int agency);
}
