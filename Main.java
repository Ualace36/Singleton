package Singleton1;

public class Main {
    public static void main(String[] args) {
        TabuleiroXadrez tabuleiroXadrez = TabuleiroXadrez.getInstance();
        System.out.println("Imprima o local na memória" + tabuleiroXadrez);
    }
}
