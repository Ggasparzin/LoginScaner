import java.util.Scanner;

public class teste {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
            int idade = scan.nextInt();
                scan.nextLine();

        System.out.print("Você possui CNH? ");
            String CNH = scan.nextLine();

        if(CNH.contains("sim") && idade >= 18){
            System.out.println("Você pode dirigir!");
        }
        else if {
            System.out.print("Você possui permissão? ");
                String temPermissao = scan.nextLine();
        }
        else if(temPermissao.equals)

        System.out.println("Você não pode dirigir! ");
            scan.close();
        }
    }
}
