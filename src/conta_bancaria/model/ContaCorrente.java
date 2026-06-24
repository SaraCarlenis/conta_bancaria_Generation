package conta_bancaria.model;

public class ContaCorrente extends Conta{
	
	private float limite;
	
	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		super(numero, agencia, tipo, titular, saldo);
		this.limite = limite;
		}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	//Sobrescrevendo Métodos
	@Override 
	public boolean sacar(float valor) {
		if ((this.getSaldo() + this.limite) < valor) //Verificamos se saldo + limite é menos que valor
			return false;
			
		this.setSaldo(this.getSaldo() - valor);  //
		return true;
		
	}
	
	//Sobrescrevendo um método
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.printf("Limite da Conta: %.2f%n", this.limite);
	}

}
