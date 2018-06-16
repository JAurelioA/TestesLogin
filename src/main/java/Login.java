
public abstract class Login {
    protected static String usuario;
    protected static String senha;

    public Login() {
    }

    abstract void logIn(String usuario, String senha);

    abstract void logOut(String usuario, String senha);

    public final void Executar() throws InterruptedException {
        logIn(usuario, senha);
        logOut(usuario, senha);


    }
}
