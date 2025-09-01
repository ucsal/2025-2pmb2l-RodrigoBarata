package br.com.mariojp.solid.lspaccounts;

public class BankService {
    public void processWithdrawal(Withdrawable acc, double amount){
        acc.withdraw(amount);
    }
}