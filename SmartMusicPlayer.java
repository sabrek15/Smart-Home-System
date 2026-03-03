public class SmartMusicPlayer implements SmartDevice {
    private String name;
    private boolean isOn = false;

    public SmartMusicPlayer(String name) {
        this.name = name;
    }

    @Override
    public void turnOff() {
        this.isOn = false;
        System.out.println(LOG_PREFIX + "Music paused");
    }

    @Override
    public void turnOn() {
        this.isOn = true;
        System.out.println(LOG_PREFIX + "Loading Playlist... Music is playing");
    }

    @Override
    public String getDeviceName() {
        return this.name + "Music Player";
    }
}