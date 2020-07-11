package interesesBancarios;


public class Cliente extends Visitable {
	private CajaDeAhorro cajaAhorro;
	private CuentaCorriente cuentaCorriente;
	private TarjetaDeCredito tarjetaCredito;
	
	public CajaDeAhorro getCajaAhorro() {
		return cajaAhorro;
	}
	public void setCajaAhorro(CajaDeAhorro cajaAhorro) {
		this.cajaAhorro = cajaAhorro;
	}
	
	public CuentaCorriente getCuentaCorriente() {
		return cuentaCorriente;
	}
	public void setCuentaCorriente(CuentaCorriente cuentaCorriente) {
		this.cuentaCorriente = cuentaCorriente;
	}
	
	public TarjetaDeCredito getTarjetaCredito() {
		return tarjetaCredito;
	}
	public void setTarjetaCredito(TarjetaDeCredito tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}
	@Override
	public float accept(interesesBancarios.Visitor _visitor) {
		return _visitor.visit(this);
	}
	

}
