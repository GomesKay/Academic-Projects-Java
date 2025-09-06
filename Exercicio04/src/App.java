import java.util.Scanner;

/*
 * 🤖 Exemplo de execução
 * 
 * Digite a largura do retângulo: 30
 * Digite a altura do retângulo: 100
 * 
 * Área do Retângulo: 3000.0
 * Perímetro do Retângulo: 260.0
*/

// Retângulo - Medidas
public class App {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    Retangulo retangulo = new Retangulo();

    System.out.print("Digite a largura do retângulo: ");
    retangulo.setLargura(entrada.nextDouble());

    System.out.print("Digite a altura do retângulo: ");
    retangulo.setAltura(entrada.nextDouble());

    System.out.println("\nÁrea do Retângulo: " + retangulo.area());
    System.out.println("Perímetro do Retângulo: " + retangulo.perimetro());

    entrada.close();
  }
}