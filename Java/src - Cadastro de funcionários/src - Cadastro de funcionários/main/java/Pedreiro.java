//NOME: JEAN ALVES ROCHA - RA: 2313057

public class Pedreiro extends Funcionario implements CalcSalarioBonus{

	//Atributos do pedreiro -> Dois atributos especificos.
	
	private String codigo;
	private String funcaoNoProjeto;

	//Repeti��o de m�todo = Polimorfismo por sobrecarga

	public Pedreiro(){
		codigo = "";
		funcaoNoProjeto = "";
	}

	public Pedreiro(String codigo, String funcaoNoProjeto){
		this.codigo = codigo;
		this.funcaoNoProjeto = funcaoNoProjeto;
	}
	
	//Clonar
	public Pedreiro(Pedreiro p){
		this.codigo = p.getCodigo();
		this.funcaoNoProjeto = p.getFuncaoNoProjeto();
	}

	//Interface -> Bonus de 10%

	public final float calcular(){
		return 1.1F*getSalario();
	};

	//M�todo getters: Final.

	public final String getCodigo(){
		return codigo;
	}
	public final String getFuncaoNoProjeto(){
		return funcaoNoProjeto;
	}

	//m�todo setters: Final.

	public final void setCodigo(String codigo){
		this.codigo = codigo;
	}
	public final void setFuncaoNoProjeto(String funcaoNoProjeto){
		this.funcaoNoProjeto = funcaoNoProjeto;
	}

	//Polimorfismo por sobrescri��o obrigat�rio devido ao m�todo abstrato da classe abstrata m�e -> classe filha � concreta, portanto deve obrigat�riamente sobrescrever.
	//Exemplo b�sico
	public float verificaAumento(){
		return (calcular() - getSalario());
	}	

}