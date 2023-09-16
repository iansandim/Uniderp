
import java.util.Scanner;


public abstract class BaseDesafio {
    protected Scanner sc;

    public BaseDesafio()
    {
        this.sc = new Scanner(System.in);
    }

    public abstract void Executar();
}