public class Spotify extends Login {

    public Spotify(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    @Override
    boolean logIn(String usuario, String senha) {
        System.out.println("-----------------*-----------------");
        System.out.println("Usuario logado com sucesso!");
        System.out.println("Bem vindo à Spotify " + usuario + " Aproveite o nosso conteudo");
        System.out.println("-----------------*-----------------");
        Menu menu = new Menu();
        menu.menu();
        logOut();
        return true;
    }

    @Override
    boolean logOut() {
        System.out.println("O usuário: " + usuario + " deslogou do Spotify");
        System.out.println("\n");
        return false;
    }
}