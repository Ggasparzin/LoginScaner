import java.util.Scanner;

public class CNH {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
            int idade = scan.nextInt();

        System.out.print("Você possui CNH? ");
            String temCnh = scan.nextLine();


        System.out.print("Você tem permissão especial para dirigir? ");
        String permissao = scan.nextLine();

        if(idade >= 18 && temCnh == "sim"){
            System.out.println("Você pode dirigir!");
        }
        else if (idade < 18 && permissao == "sim" && temCnh == "sim"){
            System.out.println("Você pode dirigir com restrição");
        }
        else{
            System.out.println("Você não pode dirigir!");
        }
    }
}
