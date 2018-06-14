import java.util.Scanner;

public class Menu {
    Scanner sc2 = new Scanner(System.in);
    public void menu() {
        boolean j = true;
        while (j) {
            System.out.println("Para desconectar digite 1");
            int opcao = sc2.nextInt();
            if (opcao == 1) {
                System.out.println("Obrigado por usar nossa plataforma! Volte Sempre");
                j = false;
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }
}
