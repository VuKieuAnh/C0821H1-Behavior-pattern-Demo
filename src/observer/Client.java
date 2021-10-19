package observer;

public class Client {
    public static void main(String[] args) {
        Observer phone = new PhoneNotification();
        Observer app = new AppNotification();
        Account xuanAnh = new Account();
        xuanAnh.add(phone);

        xuanAnh.notification("Xuan Anh het tien");

        xuanAnh.delete(phone);
        xuanAnh.add(app);
        xuanAnh.notification("An chuyen cho 8m");
        xuanAnh.add(phone);
        xuanAnh.notification("Thai chuyen cho 7m");
    }
}
