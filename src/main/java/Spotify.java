import java.util.Scanner;

public class Spotify extends Login {
    Scanner sc2 = new Scanner(System.in);
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

        boolean j=true;
        while(j) {
            System.out.println("Para desconectar do Spotify digite 1");
            int opcao = sc2.nextInt();
            if(opcao==1) {
                System.out.println("Obrigado por usar Spotify! Volte Sempre");
                logOut();
                j=false;
            } else {System.out.println("Opção inválida!");}
        }
        return true;
    }

    @Override
    boolean logOut() {
        System.out.println("O usuário: " + usuario + " deslogou do Spotify");
        return false;
    }
}