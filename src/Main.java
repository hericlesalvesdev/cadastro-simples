import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nome = "administrador";
        String senha = "senha";

        int chances = 3;   // o usuário terá 3 chances de acertar a senha e o nome.
        int i;

        System.out.println("Digite o nome do usuário: ");
        String inputUserName = sc.nextLine();

        System.out.println("Digite a senha: ");
        String inputPassword = sc.nextLine();

        chances = chances - 1;
        System.out.println("Chances: " + chances);

        // aqui é a parte da lógica que confere se o user e a senha são iguais as que estão predefinidas.

        if (inputUserName.equals(nome) && inputPassword.equals(senha)) {
            System.out.println("ACESSO AUTORIZADO");
        } else {
            System.out.println("ACESSO NEGADO");
        }

        /*enquanto o nome e a senha forem diferentes, entrará em loop até que as chances
        acabem ou o usuário acerte as credenciais*/

        while (!inputPassword.equals(senha) && !inputUserName.equals(nome)) {

            for (i = chances; i >= 0; chances--) {
                System.out.println("-----------------------------------------------");
                System.out.println("TENTE NOVAMENTE: ");
                System.out.println("Digite o usuário: ");
                inputUserName = sc.nextLine();
                System.out.println("------------------------------------------------");
                System.out.println("Digite a senha: ");
                inputPassword = sc.nextLine();

                System.out.println("Chances restantes: " + chances);


                if (inputPassword.equals(senha)) {
                    System.out.println("ACESSO AUTORIZADO");
                    break;
                } else if (chances == 0) {
                    System.out.println("ACESSO BLOQUEADO. NÚMERO DE CHANCES EXCEDIDAS!");
                    break;
                }
            }
            break;   // Outro break pq msm quando as chances acabavam o programa continuava em loop.
        }
    }
}