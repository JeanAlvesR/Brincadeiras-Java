//NOME: JEAN ALVES ROCHA - RA: 2313057

public class Projeto{

	//ATRIBUTOS DO PROJETO.

	private String nomeProjeto;
	private String codigoProjeto;
	private String cidadeProjeto;
	private Cliente cliente;
	private Engenheiro eng;
	private Pedreiro p1;
	private String dataInicio;
	private String dataFinal;
	
	//Polimorfismo por sobrecarga -> Repetição da mesma assinatura.
	
	public Projeto(){
		
		nomeProjeto = "";
		codigoProjeto = "";
		cidadeProjeto = "";
		cliente = new Cliente();
		eng = new Engenheiro();
		p1 = new Pedreiro();
		dataInicio = "";
		dataFinal = "";
	}

	public Projeto(String nomeProjeto, String codigoProjeto, String cidadeProjeto, Cliente cliente, Engenheiro eng, Pedreiro p1, String dataInicio, String dataFinal){
		
		this.nomeProjeto = nomeProjeto;
		this.codigoProjeto = codigoProjeto;
		this.cidadeProjeto = cidadeProjeto;
		this.cliente = cliente;
		this.eng = eng;
		this.p1 = p1;
		this.dataInicio = dataInicio;
		this.dataFinal = dataFinal;
	}

	//Clonar
	public Projeto(Projeto p){
		
		this.nomeProjeto = p.getNomeProjeto();
		this.codigoProjeto = p.getCodigoProjeto();
		this.cidadeProjeto = p.getCidadeProjeto();
		this.cliente = p.getCliente();
		this.eng = p.getEng();
		this.p1 = p.getP1();
		this.dataInicio = getDataInicio();
		this.dataFinal = getDataFinal();

	}

	// método getters: Final.
	
	public final String getNomeProjeto(){
		return nomeProjeto;
	}
	public final String getCodigoProjeto(){
		return codigoProjeto;
	}
	public final String getCidadeProjeto(){
		return cidadeProjeto;
	}
	public final Cliente getCliente(){
		return cliente;
	}
	public final Engenheiro getEng(){
		return eng;
	}
	public final Pedreiro getP1(){
		return p1;
	}
	public final String getDataInicio(){
		return dataInicio;
	}
	public final String getDataFinal(){
		return dataFinal;
	}

	//método setters: Final.

	public final void setNomeProjeto(String nomeProjeto){
		this.nomeProjeto = nomeProjeto;
	}
	public final void setCodigoProjeto(String codigoProjeto){
		this.codigoProjeto = codigoProjeto;
	}
	public final void setCidadeProjeto(String cidadeProjeto){
		this.cidadeProjeto = cidadeProjeto;
	}
	public final void setCliente(Cliente cliente){
		this.cliente = cliente;
	}	
	public final void setEng(Engenheiro eng){
		this.eng = eng;
	}
	public final void setP1(Pedreiro p1){
		this.p1 = p1;
	}
	public final void setDataInicio(String dataInicio){
		this.dataInicio = dataInicio;
	}
	public final void setDataFinal(String dataFinal){
		this.dataFinal = dataFinal;
	}
}