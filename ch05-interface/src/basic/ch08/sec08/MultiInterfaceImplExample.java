package basic.ch08.sec08;

public class MultiInterfaceImplExample {
    public static void main(String[] args) {
        // RemoteControl 인터페이스로 참조
        RemoteControl rc = new SmartTelevision();
        rc.turnOn();
        rc.turnOff();

        // Searchable 인터페이스로 참조
        Searchable searchable = new SmartTelevision();
        searchable.search("https://www.youtube.com");
    }
}
