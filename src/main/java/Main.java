import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Digite o nome de Usuario: ");
        String usuario = sc1.nextLine();
        System.out.print("Digite sua senha: ");
        String senha = sc1.nextLine();

        Validacao validacao = new Validacao(usuario, senha);
        validacao.valida();

        int opcao;
        while (validacao.acess) {
            System.out.println("Escolha sua Opção: \n " +
                    "1 NETFLIX\n" +
                    " 2 SPOTIFY\n" +
                    " 3 Sair");
            opcao = sc1.nextInt();

            if (opcao == 1) {
                Login login = new Netflix(usuario, senha);
                login.Executar();
            } else if (opcao == 2) {
                Login login = new Spotify(usuario, senha);
                login.Executar();
            } else if (opcao == 3) {
                System.out.println("Obrigado por usar nossa Plataforma!");
                validacao.acess = false;
            } else {
                System.out.println("Opção inválida, por favor selecione uma opção válida!" +
                        "");
            }


        }
    }
}