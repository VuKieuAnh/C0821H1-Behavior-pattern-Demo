package command.model;

public class OpenAccount implements Command {
    private Account account;

    @Override
    public void execute() {
        account.open();;
    }

    public OpenAccount(Account account) {
        this.account = account;
    }
}
