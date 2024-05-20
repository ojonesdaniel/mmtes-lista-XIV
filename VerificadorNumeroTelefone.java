public class VerificadorNumeroTelefone {
    public static void verificarNumeroTelefone(String numeroTelefone) {
        if (numeroTelefone.length() != 9) {
            System.out.println("Erro: O número de telefone deve ter exatamente 9 caracteres.");
        } else {
            System.out.println("Número de telefone válido: " + numeroTelefone);
        }
    }
}