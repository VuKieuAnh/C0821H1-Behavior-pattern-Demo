package command.controller;

import command.model.Command;

public class BankApp {
    private Command open;
    private Command close;

    public BankApp(Command open, Command close) {
        this.open = open;
        this.close = close;
    }

    public void clickOpen(){
        System.out.println("command.controller.BankApp open account");
        open.execute();
    }
    public void clickClose(){
        System.out.println("command.controller.BankApp close account");
        close.execute();
    }
}
