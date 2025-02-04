package lesson20250204;

public class ExceptionExamples {

    public static void main(String[] args) {
//        boolean isValid = validate("input");
        validate("input");
        System.out.println("Some code");
    }

    public static void validate(String data) {
        throw new RuntimeException();
    }

}
