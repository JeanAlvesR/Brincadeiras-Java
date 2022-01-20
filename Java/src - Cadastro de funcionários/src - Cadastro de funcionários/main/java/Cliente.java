//NOME: JEAN ALVES ROCHA - RA: 2313057
public final class Cliente{
	
	//Atributos
	private String nomeCliente;
	private String cpfOrCnpj;
	private String cidadeCliente;
	private String cep;
	private String endRuaCliente;
	private String endNumCliente;
	private String telefoneCliente;
	
	//Polimorfimo por sobrecarga -> Repetição da mesma assinatura.
	public Cliente(){
		
		nomeCliente = "";
		cpfOrCnpj = "";
		cidadeCliente = "";
		cep = "";
		endRuaCliente = "";
		endNumCliente = "";
		telefoneCliente = "";

	}
	
	public Cliente(String nomeCliente, String cpfOrCnpj, String cidadeCliente, String cep, String endRuaCliente, String endNumCliente, String telefoneCliente){
		
		this.nomeCliente = nomeCliente;
		this.cpfOrCnpj = cpfOrCnpj;
		this.cidadeCliente = cidadeCliente;
		this.cep = cep;
		this.endRuaCliente = endRuaCliente;
		this.endNumCliente = endNumCliente;
		this.telefoneCliente = telefoneCliente;

	}
	
	
	//Clonar
	public Cliente (Cliente c){
	
		this.nomeCliente = c.getNomeCliente();
		this.cpfOrCnpj = c.getCpfOrCnpj();
		this.cidadeCliente = c.getCidadeCliente();
		this.cep = c.getCep();
		this.endRuaCliente = c.getEndRuaCliente();
		this.endNumCliente = c.getEndNumCliente();
		this.telefoneCliente = c.getTelefoneCliente();
	}


	//Métodos getters: final.

	public final String getNomeCliente(){
		return nomeCliente;
	}
	public final String getCpfOrCnpj(){
		return cpfOrCnpj;
	}
	public final String getCidadeCliente(){
		return cidadeCliente;
	}
	public final String getCep(){
		return cep;
	}
	public final String getEndRuaCliente(){
		return endRuaCliente;
	}
	public final String getEndNumCliente(){
		return endNumCliente;
	}
	public final String getTelefoneCliente(){
		return telefoneCliente;
	}

	//Métodos setters: final.

	public final void setNomeCliente(String nomeCliente){
		this.nomeCliente = nomeCliente;
	}
	public final void setCpfOrCnpj(String cpfOrCnpj){
		this.cpfOrCnpj = cpfOrCnpj;
	}
	public final void setCidadeCliente(String cidadeCliente){
		this.cidadeCliente = cidadeCliente;
	}
	public final void setCep(String cep){
		this.cep = cep;
	}
	public final void setEndRuaCliente(String endRuaCliente){
		this.endRuaCliente = endRuaCliente;
	}
	public final void setEndNumCliente(String endNumCliente){
		this.endNumCliente = endNumCliente;
	}
	public final void setTelefoneCliente(String telefoneCliente){
		this.telefoneCliente = telefoneCliente;
	}
	
}