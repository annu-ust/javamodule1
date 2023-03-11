package oopsday3.atm.menu;

import oopsday3.atm.exception.InsufficientFundsException;
import oopsday3.atm.exception.NegativeAmountException;

public interface BankingIface2 {
 public double withdraw(double amount, int acctno) throws InsufficientFundsException;
 public double deposite(double amount,int acctno) throws NegativeAmountException;
 public double balanceaEnquiry(int actno);
}
