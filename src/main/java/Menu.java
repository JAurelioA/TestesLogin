import java.util.Scanner;

public class Menu {
    Scanner sc2 = new Scanner(System.in);
    public void menu() {
        int opcao=0;
        while (opcao != 1) {
            System.out.println("Para desconectar digite 1");
            opcao = sc2.nextInt();
            if (opcao == 1) {
                System.out.println("Obrigado por usar nossa plataforma! Volte Sempre");
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }
}
