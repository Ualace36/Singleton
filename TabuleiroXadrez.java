package Singleton2;

public class TabuleiroXadrez {
    //Nesse método o sistema não instancia de imediato
    private static TabuleiroXadrez instance = null;
    private TabuleiroXadrez(){}
    static TabuleiroXadrez getInstance() {
        if (instance == null)
            instance = new TabuleiroXadrez();
        return instance;
    }

}
