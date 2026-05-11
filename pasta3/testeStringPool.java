package pasta3;

public class testeStringPool {
    public static void main(String[] args) {
        String a = "Java";
String b = "Java";
String d = "Java";
String c = new String("Java");
System.out.println(a == b); // ?
System.out.println(a == c);
System.out.println(a == d); // ?
System.out.println(a.equals(c)); // ?
    }
}
