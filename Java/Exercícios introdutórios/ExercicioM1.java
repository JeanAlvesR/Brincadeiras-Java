//Nome: Jean Alves Rocha - RA:2313057
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class ExercicioM1 {

    public static void main(String[] args) {
        int d,i,j;
        d = entDados("Inserir tamanho do vetor: ");
        int vetor[] = new int[d];
        for(i=0; i<d; i++){
            vetor[i] = entDados("inserir número: " );
        }
        i-=1;
        System.out.println("");
        for(i = i; i>=0; i--){
            System.out.println(vetor[i]);
        }

    }
    public static int entDados(String x) {
        InputStreamReader c = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(c);
        String s = "";
        int w;
        System.out.println(x);
        try {
            s = cd.readLine();
        } catch (IOException e) {
            System.out.println("Erro de entrada");
        }
        w = Integer.parseInt(s);
        return (w);
    }

}
