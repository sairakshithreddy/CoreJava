package src.Switch;

public class Lab059 {

    public static void main(String[] args) {

        // JDK > 13
        // ->

        int itemCode = 004;
        switch (itemCode) {
            case 001 -> System.out.println("It's a laptop!");
            case 002 -> System.out.println("It's a desktop!");
            case 003,004 -> System.out.println("It's a mobile phone!");
            default -> System.out.println("Heloo!");
        }
    }
}
