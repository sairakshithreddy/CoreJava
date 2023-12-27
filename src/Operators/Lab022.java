package src.Operators;

public class Lab022 {
    public static void main(String[] args) {

        int a = 12;
        boolean c = a > 10 || a < 5;
        boolean b = !(a > 10 || a < 5);
        System.out.println(b);
        System.out.println(c);
System.out.println(" --------");
        int a1 = 67;
        boolean b1 = !(a1 > 20 && a1 < 78);
        System.out.println(b1);

System.out.println(" --------");

        int a2 = 90;
        int b2 = 90;
        boolean c2 = (a2 <= b2);
        System.out.println(c2);



    }
}