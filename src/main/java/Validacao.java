import java.util.ArrayList;
import java.util.List;

public class Validacao {
    String usuario;
    String senha;
    Boolean acess = false;

    public Validacao (String usuario, String senha){
        this.usuario = usuario;
        this.senha = senha;
    }

    public void valida(){
        List<String> BD = new ArrayList<String>();      BD.add("Marcos123");     BD.add("Aurelio1234");    BD.add("Romulo12345");
        String entrada = usuario.concat(senha);
        for(String valor : BD){
            if(valor.equals(entrada)){
                System.out.println("Usuário " + usuario + " Autorizado");
                System.out.println();
                acess = true;
            }
        }

        if(acess == false){

            System.out.println("Usuário inválido: Desligando..........");
        }

    }

}