//Nome: Jean Alves Rocha - RA:2313057
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

/*
* Faça o mesmo procedimento do exercício anterior, porém desta vez estará
usando uma matriz bidimensional
*
* */

public class ExercicioM2 {
    public static void main(String[] args) {
        int l, c,i ,j;
        System.out.println("INVERTER COLUNAS E LINHAS");
        l = entDados("Inserir linhas: ");
        c = entDados("Inserir colunas: ");

        int matriz[][] = new int[l][c];

        for(i = 0; i<l; i++){
            for(j=0; j<c; j++){
                matriz[i][j] = entDados("Inserir linha " +(i+1)+" coluna "+(j+1)+": ");
            }
        }
        l-=1;
        c-=1;

        for(i = l; i>=0; i--){
            for(j=c; j>=0; j--){
                System.out.printf("%d\t ",matriz[i][j]);
            }
            System.out.println("");
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
