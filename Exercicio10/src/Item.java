public class Item {
  private String descricao;
  private int quantidade;
  private double precoUnitario;

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

  public double getPrecoUnitario() {
    return precoUnitario;
  }

  public void setPrecoUnitario(double precoUnitario) {
    this.precoUnitario = precoUnitario;
  }

  public double subTotal() {
    return quantidade * precoUnitario;
  }
}
