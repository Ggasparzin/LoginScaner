import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner Entrar = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        //Scanner next line é uma forma de coletar e usar as informações que alguém digita
        //como se fosse string
        String nome = Entrar.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = Entrar.nextInt();
        int soma =  50 - idade;

        System.out.print("Digite sua altura: ");
        Double altura = Entrar.nextDouble();
        double alturaF = altura * 100;
        if(idade > 49){
            System.out.println("Bem vindo(a) " + nome + "!, você já possui 50 anos ou mais");
        }
        else{

        System.out.println("Bem vindo(a) " + nome + "!, em "+ soma + " anos, você terá 50 anos!" );
        }
                System.out.print("Sua altura é: " + alturaF + " centímetros" );
        Entrar.close();
    }
}