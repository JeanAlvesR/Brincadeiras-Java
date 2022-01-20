//NOME: JEAN ALVES ROCHA - RA: 2313057

public class Engenheiro extends Funcionario implements CalcSalarioBonus{

	//Atributos do Engenheiro -> Dois atributos especificos.
	
	private String crea;
	private String especializacao;

	//Repeti��o de m�todo = Polimorfismo por sobrecarga

	public Engenheiro(){
		crea = "";
		especializacao = "";
	}

	public Engenheiro(String crea, String especializacao){
		this.crea = crea;
		this.especializacao = especializacao;
	}
	//Clonar
	public Engenheiro(Engenheiro e){
		this.crea = e.getCrea();
		this.especializacao = e.getEspecializacao();
	}

	//Interface -> Bonus de 15% para engenheiros.

	public final float calcular(){
		return 1.15F*getSalario();
	};

	//M�todo getters: Final.

	public final String getCrea(){
		return crea;
	}
	public final String getEspecializacao(){
		return especializacao;
	}

	//m�todo setters: Final.

	public final void setCrea(String crea){
		this.crea = crea;
	}
	public final void setEspecializacao(String especializacao){
		this.especializacao = especializacao;
	}	

	//Polimorfismo por sobrescri��o obrigat�rio devido ao m�todo abstrato da classe abstrata m�e -> classe filha � concreta, portanto deve obrigat�riamente sobrescrever.
	
	public float verificaAumento(){
		return (calcular() - getSalario());
	}	
}