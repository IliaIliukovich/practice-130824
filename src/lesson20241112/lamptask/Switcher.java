package lesson20241112.lamptask;

public class Switcher {

    private TableLamp tableLamp;

    public Switcher(TableLamp tableLamp) {
        this.tableLamp = tableLamp;
    }

    public void switchOn() {
        tableLamp.on(true);
    }

    public void swithOff() {
        tableLamp.on(false);
    }
}
