import org.junit.Test;
import static org.junit.Assert;

public class TelefoneTestar {

    @Test
    public void testVerificarNumeroTelefone_TamanhoCorreto() {
        String numeroCorreto = "123456789";
        String mensagemEsperada = "Número de telefone válido: " + numeroCorreto;

        // Chama o método e verifica se a mensagem de retorno é a esperada
        assertEquals(mensagemEsperada, VerificadorNumeroTelefone.verificarNumeroTelefone(numeroCorreto));
    }

    @Test
    public void testVerificarNumeroTelefone_TamanhoIncorreto() {
        String numeroIncorreto = "12345678";
        String mensagemEsperada = "Erro: O número de telefone deve ter exatamente 9 caracteres.";

        // Chama o método e verifica se a mensagem de retorno é a esperada
        assertEquals(mensagemEsperada, VerificadorNumeroTelefone.verificarNumeroTelefone(numeroIncorreto));
    }
}