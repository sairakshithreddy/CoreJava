package src.Switch;

public class Lab062 {

    public static void main(String[] args) {

        char code = 'C';
        int val = switch (code) {
            case 'A' :
                yield 65;
            case 'B' :
                yield 66;
            default:
                throw new IllegalStateException("Unexpected value: " + code);
        };

        System.out.println(val);


    }
}
