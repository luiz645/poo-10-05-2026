package pasta5;

public class Main {
    public static void main(String[] args) {
        livro l1 = new livro("Clean Code", "978-0132350884");
livro l2 = new livro("Clean Code", "978-0132350884");
System.out.println(l1 == l2); // ?
System.out.println(l1.equals(l2)); // ?
    }
}
