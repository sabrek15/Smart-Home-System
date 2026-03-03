import java.util.ArrayList;

public class SmartHome {
    private ArrayList<SmartDevice> devices;

    public SmartHome() {
        this.devices = new ArrayList<>();
    }

    public void addDevice(SmartDevice device) {
        this.devices.add(device);
        System.out.println("Connected: " + device.getDeviceName());
    }

    public void turnEverythingOff() {
        System.out.println("\n----- Shutting Down the House -----\n");

        for (SmartDevice device: this.devices) {
            device.turnOff();
        }
    }

    public void turnEverythingOn() {
        System.out.println("\n----- Waking up the House -----\n");

        for (SmartDevice device: this.devices) {
            device.turnOn();
        }
    }
}