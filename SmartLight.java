public class SmartLight implements SmartDevice {
    private String location;
    private boolean isOn = false;

    public SmartLight(String location) {
        this.location = location;
    }

    @Override
    public void turnOff() {
        this.isOn = false;
        System.out.println(LOG_PREFIX + location + "Light is now OFF");
    }

    @Override
    public void turnOn() {
        this.isOn = true;
        System.out.println(LOG_PREFIX + location + "Light is now ON");
    }

    @Override
    public String getDeviceName() {
        return location + "Light";
    }
}