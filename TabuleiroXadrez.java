package Singleton1;

public class TabuleiroXadrez {
    private static TabuleiroXadrez instance = new TabuleiroXadrez();
    private  TabuleiroXadrez(){}
   static TabuleiroXadrez getInstance() {
        return instance;
    }

}
