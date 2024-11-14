package lesson20241112.lamptask;

public class Switcher {

    private Switchable device;

    public Switcher(Switchable device) {
        this.device = device;
    }

    public void switchOn() {
        device.on(true);
    }

    public void switchOff() {
        device.on(false);
    }
}
