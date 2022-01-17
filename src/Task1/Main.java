package Task1;

public class Main {
    public static void main(String[] args) {
        Device device = new Device("Samsung", 120,"AB1234567CD");
        Monitor monitor = new Monitor(1280, 1024 );
        System.out.println(device);
        System.out.println(monitor);
    }
}
