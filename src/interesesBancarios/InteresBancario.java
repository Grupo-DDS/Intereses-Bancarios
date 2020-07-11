package interesesBancarios;

public class InteresBancario extends Visitor{

	@Override
	public float visit(Cliente cliente) {
		float interesBancario = 0;
		interesBancario+=cliente.getTarjetaCredito().getIntereses();
		interesBancario+=cliente.getTarjetaCredito().getIntereses()*0.05;
		interesBancario-=cliente.getCajaAhorro().getMontoTotal()*0.01;
		interesBancario-=cliente.getCuentaCorriente().getMontoTotal()*0.01;
		return interesBancario;
	}

}
