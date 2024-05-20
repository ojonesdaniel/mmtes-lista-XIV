import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, insira o número de telefone: ");
        String numeroTelefone = scanner.nextLine();

        VerificadorNumeroTelefone.verificarNumeroTelefone(numeroTelefone);

        scanner.close();
    }
}