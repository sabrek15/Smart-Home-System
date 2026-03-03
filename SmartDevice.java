public interface SmartDevice {
    String LOG_PREFIX = "[Smart Home System]: ";

    void turnOn();
    void turnOff();
    String getDeviceName();
}
