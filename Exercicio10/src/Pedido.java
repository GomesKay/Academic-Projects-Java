public class Pedido {
  private double impostoPercentual;

  public double getImpostoPercentual() {
    return impostoPercentual;
  }

  public void setImpostoPercentual(double impostoPercentual) {
    this.impostoPercentual = impostoPercentual;
  }

  public double total(Item i) {
    double subtotal = i.subTotal();
    double imposto = subtotal * impostoPercentual / 100;
    
    return subtotal + imposto;
  }

  public double calcularImposto(Item i) {
    return i.subTotal() * impostoPercentual / 100;
  }
}
