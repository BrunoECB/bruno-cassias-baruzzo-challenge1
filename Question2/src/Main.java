public class Main {
    public static void main(String[] args) {

        Adult paulo = new Adult("Paulo", 42); // Adult named Paulo
        // Paulo's children
        Child joao = new Child("Joao", 5, paulo);
        Child maria = new Child("Maria", 12, paulo);
        Gondola g1 = new Gondola(2, joao, paulo);
    }
}