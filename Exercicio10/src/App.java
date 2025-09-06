import java.util.Scanner;

/*
 * 🤖 Exemplo de execução
 * 
 * Digite a descrição do item: Tablet
 * Digite a quantidade: 2
 * Digite o preço unitário do item: 2500
 * Digite o percentual de imposto do item: 10
 * 
 * Subtotal: R$ 5000,00
 * Imposto: R$ 500,00
 * Total: R$ 5500,00
*/

// Pedido com Imposto Fixo - Um item
public class App {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    Item item = new Item();
    Pedido pedido = new Pedido();

    System.out.print("Digite a descrição do item: ");
    item.setDescricao(entrada.nextLine());

    System.out.print("Digite a quantidade: ");
    item.setQuantidade(entrada.nextInt());

    System.out.print("Digite o preço unitário do item: ");
    item.setPrecoUnitario(entrada.nextDouble());

    System.out.print("Digite o percentual de imposto do item: ");
    pedido.setImpostoPercentual(entrada.nextDouble());

    double subtotal = item.subTotal();
    double imposto = pedido.calcularImposto(item);
    double total = pedido.total(item);

    System.out.printf("\nSubtotal: R$ %.2f\n", subtotal);
    System.out.printf("Imposto: R$ %.2f\n", imposto);
    System.out.printf("Total: R$ %.2f\n", total);

    entrada.close();
  }
}
