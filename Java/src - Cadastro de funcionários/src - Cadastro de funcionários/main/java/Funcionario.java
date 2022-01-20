//NOME: JEAN ALVES ROCHA - RA: 2313057

public abstract class Funcionario{

	//Atributos
	private String nomeDoFuncionario;
	private String endNomeRua;
	private String endNum;
	private String telefone;
	private float salario;
	
	//Polimorfismo por sobrecarga -> repeti��o da mesma assinatura.
	public Funcionario(){
		nomeDoFuncionario = "";
		endNomeRua = "";
		endNum = "";
		telefone = "";
		salario = 0;
		
	}

	public Funcionario(String nomeDoFuncionario, String endNomeRua, String endNum, String telefone, float salario){
		this.nomeDoFuncionario = nomeDoFuncionario;
		this.endNomeRua = endNomeRua;
		this.endNum = endNum;
		this.telefone = telefone;
		this.salario = salario;
		
	}
	//Clonar
	public Funcionario(Funcionario f){
		this.nomeDoFuncionario = f.getNomeDoFuncionario();
		this.endNomeRua = f.getEndNomeRua();
		this.endNum = f.getEndNum();
		this.telefone = getTelefone();
		this.salario = f.getSalario();
		
	}

	
	//M�todo getters -> Final -> N�o podem ser sobrescritos

	public final String getNomeDoFuncionario(){
		return nomeDoFuncionario;
	}

	public final String getEndNomeRua(){
		return endNomeRua;
	}

	public final String getEndNum(){
		return endNum;
	}

	public final String getTelefone(){
		return telefone;
	}

	public final float getSalario(){
		return salario;
	}
	

	//M�todo setters -> Final -> n�o podem ser sobrescritos

	public final void setNomeDoFuncionario(String nomeDoFuncionario){
		this.nomeDoFuncionario = nomeDoFuncionario;
	}

	public final void setEndNomeRua(String endNomeRua){
		this.endNomeRua = endNomeRua;
	}

	public final void setEndNum(String endNum){
		this.endNum = endNum;
	}

	public final void setTelefone(String telefone){
		this.telefone = telefone;
	}
	// Exce��o pode disparar para:  salario>10000 ou salario<1100. "CATASANTA".
	public final void setSalario(float salario) throws SalGrdPeqException {

		if(salario>10000 || salario <1100){
			throw new SalGrdPeqException();
		}
		else{
			this.salario = salario;
		}
				
	}

	//M�todo abstrato
	
	public abstract float verificaAumento();	
}