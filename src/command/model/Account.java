package command.model;

public class Account {
    private String name;

    public Account(String name) {
        this.name = name;
    }
    public void open(){
        System.out.println(name + " open");
    }
    public void close(){
        System.out.println(name + " close");
    }
}
