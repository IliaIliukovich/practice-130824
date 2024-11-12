package lesson20241112.lamptask;

public class UseSwitcher {

    public static void main(String[] args) {
        TableLamp tableLamp = new TableLamp();
        Switcher switcher = new Switcher(tableLamp);

        switcher.switchOn();
        tableLamp.checkState();

        switcher.swithOff();
        tableLamp.checkState();

        LightBulb lightBulb = new LightBulb();
//        Switcher switcher2 = new Switcher(lightBulb); // TODO
    }


}
