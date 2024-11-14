package lesson20241112.lamptask;

public interface Switchable {

    void on(boolean on);

    void checkState();

    default void defaultMethod() {
        System.out.println("default method logic");
    }

}
