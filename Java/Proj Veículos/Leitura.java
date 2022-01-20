//Nome: Jean Alves Rocha - RA:2313057

//Bibliotecas para entrada de dados
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Leitura{
	//M�todo entDados que espera receber par�metros
	public String entDados(String rotulo){

		//Imprime o par�metro
		System.out.printf("%s",rotulo);
		
		
		InputStreamReader teclado = new InputStreamReader(System.in);
		
		BufferedReader buff = new BufferedReader(teclado);

		String ret = "";

		try{
			ret = buff.readLine();
		}
		catch(IOException ioe){
			System.out.println("\nERRO de Sistema: RAM - TECLADO");
		}

		return ret;

	}

}