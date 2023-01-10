import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner reader = new Scanner(System.in);
        System.out.println("Escolha um limite para a pirâmide:");
        int limite = reader.nextInt();

        for (int i = 1; i <= limite ;i++) {
            String linha = "";
            for (int l = 1; l <= i; l++) {
                linha += i;
            }
            System.out.println(linha);
        }
    }
}
