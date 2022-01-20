//Nome: Jean Alves Rocha - RA:2313057

public abstract class Veiculo{

    	//Atributos
	private String placa;
	private String marca;
	private String modelo;
	private String cor;
    	private int qtdRodas;
    	private int velocMax;
    	private Motor motor;
	private String dataCadastro;
	
	//M�todo abstrato -> S� a assinatura
	
	public abstract int calcVel();

    	//Construtores
    	//Padr�o -> incializa��o dos atributos

	public Veiculo (){
        	placa = "";
        	marca = "";
        	modelo = "";
        	cor = "";
        	qtdRodas = 0;
        	velocMax = 0;
        	motor = new Motor();
        	dataCadastro = "";
    	}
    	// Inicializa��o dos atributos por passagem de valor
    	public Veiculo(String placa, String marca, String modelo, String cor, int qtdRodas, int velocMax, Motor motor, String dataCadastro) {
        	this.placa = placa;
        	this.marca = marca;
        	this.modelo = modelo;
        	this.cor = cor;
        	this.qtdRodas = qtdRodas;
		
		if(velocMax<10 || velocMax>250){
            		System.out.println("A velocidade est� fora dos limites brasileiros");
            		this.velocMax = 100;
        	}
        	else{this.velocMax = velocMax;}
        	
		this.motor = motor;
        	this.dataCadastro = dataCadastro;
    		}

	//M�todos getters
    	public String getPlaca() {
        	return placa;
    	}

    	public String getMarca() {
        	return marca;
    	}

    	public String getModelo() {
        	return modelo;
    	}

    	public String getCor() {
        	return cor;
    	}

	public int getQtdRodas() {
        	return qtdRodas;
    	}

    	public int getVelocMax() {
        	return velocMax;
    	}

    	public Motor getMotor() {
        	return motor;
    	}

    	public String getDataCadastro() {
        	return dataCadastro;
    	}
    
	//M�todos setters -> N�o pode sobrescri��o


    	public final void setPlaca(String placa) {
        	this.placa = placa;
    	}

    	public final void setMarca(String marca) {
        	this.marca = marca;
    	}

    	public final void setModelo(String modelo) {
        	this.modelo = modelo;
    	}

    	public final void setCor(String cor) {
        	this.cor = cor;
    	}

    	public final void setQtdRodas(int qtdRodas) {
        	this.qtdRodas = qtdRodas;
    	}

	public final void setVelocMax(int velocMax) {
        	if(velocMax<10 || velocMax>250){
            		System.out.println("A velocidade est� fora dos limites brasileiros");
            		this.velocMax = 100;
        	}
        	else{this.velocMax = velocMax;}
    	}

    	public final void setMotor(Motor motor) {
        	this.motor = motor;
    	}

    	public final void setDataCadastro(String dataCadastro) {
        	this.dataCadastro = dataCadastro;
    	}
}