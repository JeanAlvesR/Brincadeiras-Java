//Nome: Jean Alves Rocha - RA:2313057

public class Passeio extends Veiculo implements Calc {
    	//Atributos
    	private int qtdePassageiro;

    	//Construtores
    	//Padr�o -> incializa��o dos atributos

    	public Passeio(){
        	qtdePassageiro = 0;
    	}

    	// Inicializa��o dos atributos por passagem de valor
    	public Passeio(String placa, String marca, String modelo, String cor, int qtdRodas, int velocMax, Motor motor, String dataCadastro, int qtdePassageiro) {
        	super(placa, marca, modelo, cor, qtdRodas, velocMax, motor, dataCadastro);
        	this.qtdePassageiro = qtdePassageiro;
    	}

	//Sobrescri��o do m�todo abstrato calcVel da classe m�e. Como � para efeitos de exibi��o, eu retorno a convers�o, mas n�o transformo o atributo para a unidade esperada.
	public final int calcVel(){
		//Km/h para m/h = 1000 * velocMax;
		return (1000*getVelocMax());
	}
	
	//Implementa��o da interface -> soma das quantidades de letras.
	public final int calcular(){
		return (getPlaca().length()+getMarca().length()+getModelo().length()+getCor().length()+getDataCadastro().length());
	}	

   	//M�todo getter
    	public final int getQtdePassageiro() {
        	return qtdePassageiro;
    	}
    	//M�todo setter
    	public final void setQtdePassageiro(int qtdePassageiro) {
        	this.qtdePassageiro = qtdePassageiro;
    	}
}