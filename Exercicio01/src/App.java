import java.util.Scanner;

/*
 * 🤖 Exemplo de execução
 * 
 * Digite seu nome: Daniel
 * Digite sua idade: 25
 * 
 * Nome: Daniel, Idade: 25
*/

// Pessoa - Cadastro básico
public class App {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    Pessoa pessoa = new Pessoa();

    System.out.print("Digite seu nome: ");
    pessoa.setNome(entrada.nextLine());

    System.out.print("Digite sua idade: ");
    pessoa.setIdade(entrada.nextInt());

    System.out.println("\nDados cadastrados:");
    System.out.println(pessoa);

    entrada.close();
  }
}
