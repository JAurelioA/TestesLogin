import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Login login = null;
        System.out.print("Digite o nome de Usuario: ");
        String usuario = sc1.next();
        System.out.print("Digite sua senha: ");
        String senha = sc1.next();

        boolean loop = true;
        while (loop) {
            System.out.println("Escolha sua Opção: \n " +
                    "1 NETFLIX\n" +
                    " 2 SPOTIFY\n" +
                    " 3 Sair");
            int opcao = sc1.nextInt();
            if (opcao == 1) {
                login = new Netflix(usuario, senha);
                login.logIn(usuario, senha);
            } else if (opcao == 2) {
                login = new Spotify(usuario, senha);
                login.logIn(usuario, senha);
            } else if (opcao == 3) {
                System.out.println("Obrigado por usar nossa Plataforma!");
                loop = false;
            } else {
                System.out.println("Opção inválida, por favor selecione uma opção válida!" +
                        "");
            }


        }
    }
}