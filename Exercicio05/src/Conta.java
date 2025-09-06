public class Conta {
  private double consumoKWh;
  private double tarifa;

  public double getConsumoKWh() {
    return consumoKWh;
  }

  public void setConsumoKWh(double consumoKWh) {
    this.consumoKWh = consumoKWh;
  }

  public double getTarifa() {
    return tarifa;
  }

  public void setTarifa(double tarifa) {
    this.tarifa = tarifa;
  }

  public double valorTotal() {
    return consumoKWh * tarifa;
  }
}
