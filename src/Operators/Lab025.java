package src.Operators;

public class Lab025 {
    public static void main(String[] args) {
        String s1 = "Pramod";
        // String Constant Pool - SCP / String Pool

        // new Operator - Object
        String s2 = new String("Pramod");
        //new operator is used to create the new object for class.
        // It returns of the address of newly created object.
        System.out.println(s2);
        System.out.println(new String("Pramod"));
    }
}
