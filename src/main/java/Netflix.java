import java.util.Scanner;

public class Netflix extends Login {
    Scanner sc2 = new Scanner(System.in);

    public Netflix(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    @Override
    boolean logIn(String usuario, String senha) {
        System.out.println("-----------------*-----------------");
        System.out.println("Usuario logado com sucesso!");
        System.out.println("Bem vindo à NETFLIX " + usuario + " Aproveite o nosso conteudo");
        System.out.println("-----------------*-----------------");

        boolean j=true;
        while(j) {
            System.out.println("Para desconectar do Netflix digite 1");
            int opcao = sc2.nextInt();
            if(opcao==1) {
                System.out.println("Obrigado por usar Netflix! Volte Sempre");
                logOut();
                j=false;
            } else {System.out.println("Opção inválida!");}
        }
        return true;
    }

    @Override
    boolean logOut() {
        System.out.println("O usuário: " + usuario + " deslogou do Netflix");
        System.out.println("\n");
        return false;
    }
}