package command.view;

import command.controller.BankApp;
import command.model.Account;
import command.model.CloseAccount;
import command.model.Command;
import command.model.OpenAccount;

public class ATM {
    public static void main(String[] args) {
        Account account = new Account("C08");
        Command open = new OpenAccount(account);
        Command close = new CloseAccount(account);
        BankApp app = new BankApp(open, close);
        app.clickClose();
    }
}
