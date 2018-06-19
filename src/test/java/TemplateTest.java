import org.junit.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import static org.junit.Assert.assertEquals;


public class TemplateTest {

    @Test
    public void TesteVerificaLogin() throws InterruptedException {
        String usuario="Marcos";
        String senha = "123";
        Validacao validacao = new Validacao(usuario, senha);
        validacao.valida();
        assertEquals(true, validacao.acess);
    }

    @Test
    public void TesteVerificaLoginFalso() throws InterruptedException {
        String usuario = "Joao";
        String senha = "456";
        Validacao validacao = new Validacao(usuario, senha);
        validacao.valida();
        assertEquals(false, validacao.acess);
    }
}
