public abstract class Login {
    protected String usuario;
    protected String senha;

    public Login() {
    }

    public boolean menssagem() {
        if (logIn(this.usuario, this.senha)) {

        }
        return false;
    }

    abstract boolean logIn(String usuario, String senha);

    abstract boolean logOut();
}
