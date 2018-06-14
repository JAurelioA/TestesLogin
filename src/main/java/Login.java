import java.util.Scanner;

public abstract class Login {
    protected static String usuario;
    protected static String senha;

    public Login() {}

    abstract boolean logIn(String usuario, String senha);

    abstract boolean logOut();
}
