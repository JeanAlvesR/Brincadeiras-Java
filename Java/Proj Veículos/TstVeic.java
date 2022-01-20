//Nome: Jean Alves Rocha - RA:2313057

public class TstVeic{

	public static void main(String arg[]){
		
		Leitura l = new Leitura();
		
		System.out.println("CADASTRO DE VEICULO DE PASSEIO E DE CARGA");
		
		l.entDados("\n..................Press <enter> para inicializar......................\n\n");
		
		//Inicialização do Veículo de Carga
		//Poderia ter inicializado por passagem de valor, mas preferi utilizando os métodos getters e setters
		Carga carga = new Carga();
		System.out.println("VEICULO DE CARGA");
		carga.setPlaca(l.entDados("Inserir Placa do Veiculo: "));
		carga.setMarca(l.entDados("Inserir Marca do Veiculo: "));
		carga.setModelo(l.entDados("Inserir Modelo do Veiculo: "));
		carga.setCor(l.entDados("Inserir Cor do Veiculo: "));
		carga.setQtdRodas(Integer.parseInt(l.entDados("Inserir Qtd de Rodas do Veiculo: ")));
		carga.setVelocMax(Integer.parseInt(l.entDados("Inserir Velocidade Max do Veiculo: ")));
		System.out.println("MOTOR");
		carga.getMotor().setQtdPistoes(Integer.parseInt(l.entDados("Inserir Qtd de Pistoes do Motor do Veiculo: ")));
		carga.getMotor().setPotencia(Integer.parseInt(l.entDados("Inserir Potencia do Motor do Veiculo: ")));
		carga.setDataCadastro(l.entDados("Inserir de Data do Cadastro do Veiculo: "));
		carga.setTara(Integer.parseInt(l.entDados("Inserir Tara do Veiculo: ")));
		carga.setCargaMax(Integer.parseInt(l.entDados("Inserir Carga Max do Veiculo: ")));

		l.entDados("\n..................Press <enter> para inicializar veiculo de passeio......................\n\n");
		//Inicializacao do Veículo de passeio
		Passeio passeio = new Passeio();
	
		System.out.println("VEICULO DE PASSEIO");
		passeio.setPlaca(l.entDados("Inserir Placa do Veiculo: "));
		passeio.setMarca(l.entDados("Inserir Marca do Veiculo: "));
		passeio.setModelo(l.entDados("Inserir Modelo do Veiculo: "));
		passeio.setCor(l.entDados("Inserir Cor do Veiculo: "));
		passeio.setQtdRodas(Integer.parseInt(l.entDados("Inserir Qtd de Rodas do Veiculo: ")));
		passeio.setVelocMax(Integer.parseInt(l.entDados("Inserir Velocidade Max do Veiculo: ")));
		System.out.println("MOTOR");
		passeio.getMotor().setQtdPistoes(Integer.parseInt(l.entDados("Inserir Qtd de Pistoes do Motor do Veiculo: ")));
		passeio.getMotor().setPotencia(Integer.parseInt(l.entDados("Inserir Potencia do Motor do Veiculo: ")));
		passeio.setDataCadastro(l.entDados("Inserir Data de Cadastro do Veiculo: "));
		passeio.setQtdePassageiro(Integer.parseInt(l.entDados("Inserir Qtd de Passageiros Veiculo: ")));

		//Impressão dos dados dos veículos <Velocidade com base no método> e método da interface e da class Abstrata

		l.entDados("\n\n..................Press <enter> para visualizar dados......................\n\n");

		System.out.println("VEICULO DE CARGA");
		System.out.println("PLACA: "+carga.getPlaca()+"\nMarca: "+carga.getMarca()+"\nModelo: "+carga.getModelo()+"\nCor: "+carga.getCor());
		System.out.println("Quantidade de Rodas: "+carga.getQtdRodas());
		System.out.println("Velocidade em Cm/h: "+carga.calcVel());
		System.out.println("MOTOR");
		System.out.println("Quantidade de Pistoes: "+carga.getMotor().getQtdPistoes()+"\nPotencia: "+carga.getMotor().getPotencia());	
		System.out.println("Tara: "+carga.getTara()+"\nCarga Max: "+carga.getCargaMax());
		System.out.println("Quantidade de Inteiros: "+carga.calcular());
		System.out.println("Data de Cadastro: "+carga.getDataCadastro());
		
		System.out.println("\n\nVEICULO DE PASSEIO");
		System.out.println("PLACA: "+passeio.getPlaca()+"\nMarca: "+passeio.getMarca()+"\nModelo: "+passeio.getModelo()+"\nCor: "+passeio.getCor());
		System.out.println("Quantidade de Rodas: "+passeio.getQtdRodas());
		System.out.println("Velocidade em M/h: "+passeio.calcVel());
		System.out.println("MOTOR");
		System.out.println("Quantidade de Pistoes: "+passeio.getMotor().getQtdPistoes()+"\nPotencia: "+passeio.getMotor().getPotencia());	
		System.out.println("Quantidade de Letras das Strings: "+passeio.calcular());
		System.out.println("Qtd de Passageiros: "+passeio.getQtdePassageiro());
		System.out.println("Data de Cadastro: "+passeio.getDataCadastro());
		
		
	}
}