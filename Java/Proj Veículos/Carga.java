//Nome: Jean Alves Rocha - RA:2313057

public class Carga extends Veiculo implements Calc {
    	//Atributos
    	private int tara;
    	private int cargaMax;

    	//Construtores

    	//Padr�o -> incializa��o dos atributos
    	public Carga(){
        	tara = 0;
        	cargaMax = 0;
    	}

    	// Inicializa��o dos atributos por passagem de valor
    	public Carga(String placa, String marca, String modelo, String cor, int qtdRodas, int velocMax, Motor motor, String dataCadastro, int tara, int cargaMax) {
        	
		//� melhor usar o super aqui do que usar this para todos os atributos herdados da classe m�e. -> o c�digo fica mais claro.
		super(placa, marca, modelo, cor, qtdRodas, velocMax, motor, dataCadastro);
        	this.tara = tara;
        	this.cargaMax = cargaMax;
    	}

	
	
	//Sobrescri��o do m�todo abstrato calcVel da classe m�e. Como � para efeitos de exibi��o, eu retorno a convers�o, mas n�o transformo o atributo para a unidade esperada.
	public final int calcVel(){
		//Km/h para cm/h = 100.000 * getVelocMax -> (acesso privado, portanto � necess�rio o uso do m�todo getter);
		return (100000*getVelocMax());
	}

	//Implementa��o da inteface Calc -> soma dos inteiros
	public final int calcular(){
		return (getQtdRodas()+getVelocMax()+getMotor().getQtdPistoes()+getMotor().getPotencia()+getTara()+getCargaMax());
	}
	
    	//M�todo getter
    	public final int getTara() {
        	return tara;
    	}
    	public final int getCargaMax() {
        	return cargaMax;
    	}

    	//M�todo setter
    	public final void setTara(int tara) {
        	this.tara = tara;
    	}
    	public final void setCargaMax(int cargaMax) {
        	this.cargaMax = cargaMax;
    	}
}