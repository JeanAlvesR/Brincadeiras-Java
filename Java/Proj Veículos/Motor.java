//Nome: Jean Alves Rocha - RA:2313057

public class Motor{
	//Atributos
	private int qtdPistoes;
	private int potencia;
	
	//Construtores
	//B�sico
	public Motor(){
		qtdPistoes = 0;
		potencia = 0;
	
	}
	//Incializando atrav�s de passagem de valor
	public Motor(int qtdPistoes, int potencia){
		this.qtdPistoes = qtdPistoes;
		this.potencia = potencia;
	
	}
		
	//M�todos getters

	public int getQtdPistoes (){
		return qtdPistoes;
	}
	public int getPotencia (){
		return potencia;
	}

	//M�todos setters -> N�o podem ser sobrescritos

	public final void setQtdPistoes (int qtdPistoes){
		this.qtdPistoes = qtdPistoes;
	}
	public final void setPotencia (int potencia){
		this.potencia = potencia;
	}	
}