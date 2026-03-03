public class Main {
    public static void main(String[] args) {
        
        SmartHome myHome = new SmartHome();

        SmartLight livingRoom = new SmartLight("Living Room");
        SmartMusicPlayer speaker = new SmartMusicPlayer("Bedroom Speaker");
        SmartLight kitchen = new SmartLight("Kitchen");

        myHome.addDevice(livingRoom);
        myHome.addDevice(speaker);
        myHome.addDevice(kitchen);

        myHome.turnEverythingOn();

        myHome.turnEverythingOff();
    }
}