package lesson20241112.lamptask;

public class TableLamp {

    private boolean isOn;

    public void on(boolean on) {
        isOn = on;
    }

    public void checkState() {
        System.out.println("Table Lamp is" + (isOn ? " on" : " off"));
    }


}
