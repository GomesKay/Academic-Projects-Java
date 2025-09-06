import java.util.Scanner;

/*
 * 🤖 Exemplo de Execução
 * 
 * Digite o nome do produto: Monitor LG Ultragear
 * Digite o preço do produto: 1000
 * Digite o percentual de desconto: 10
 * 
 * Produto: Monitor LG Ultragear, Preço: R$ 1000.0
 * Preço com desconto de 10.0%: R$ 900.0
*/

// Produto - Preço com desconto fixo
public class App {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    Produto produto = new Produto();

    System.out.print("Digite o nome do produto: ");
    produto.setNome(entrada.nextLine());

    System.out.print("Digite o preço do produto: ");
    produto.setPreco(entrada.nextDouble());

    System.out.print("Digite o percentual de desconto: ");
    double percentual = entrada.nextDouble();

    double precoFinal = produto.precoComDesconto(percentual);

    System.out.println("\n" + produto);
    System.out.println("Preço com desconto de " + percentual + "%: R$ " + precoFinal);

    entrada.close();
  }
}
