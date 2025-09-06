public class Produto {
  private String nome;
  private double preco;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public double precoComDesconto(double percentual) {
    return preco - (preco * (percentual / 100));
  }

  @Override
  public String toString() {
    return "Produto: " + nome + ", Preço: R$ " + preco;
  }
}
