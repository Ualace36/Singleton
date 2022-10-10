package Singleton2;

public class Main {
    public static void main(String[] args) {


    TabuleiroXadrez tabuleiroXadrezI = TabuleiroXadrez.getInstance();
    TabuleiroXadrez tabuleiroXadrezII = TabuleiroXadrez.getInstance();
        System.out.println(tabuleiroXadrezI);
        System.out.println(tabuleiroXadrezII);
    }
}
