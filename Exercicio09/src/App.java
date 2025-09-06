import java.util.Scanner;

/*
 * 🤖 Exemplo de execução
 * 
 * Digite a descrição do item: Morango
 * Digite a quantidade: 3
 * Digite o preço unitário do item: 5
 * 
 * O Morango totalizou R$ 15,00
*/

// Pedido Simples - Um item
public class App {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    Item item = new Item();

    System.out.print("Digite a descrição do item: ");
    item.setDescricao(entrada.nextLine());

    System.out.print("Digite a quantidade: ");
    item.setQuantidade(entrada.nextInt());

    System.out.print("Digite o preço unitário do item: ");
    item.setPrecoUnitario(entrada.nextDouble());

    double total = item.subTotal();

    System.out.printf("O %s totalizou R$ %.2f", item.getDescricao(), total);

    entrada.close();
  }
}
