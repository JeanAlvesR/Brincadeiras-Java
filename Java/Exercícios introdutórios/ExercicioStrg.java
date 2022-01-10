//Nome: Jean Alves Rocha - RA:2313057
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

/*
* 1)_ Construa um programa que permita ao usuário entrar com determinada
frase, depois permita “escolher” uma letra qualquer e: caso a letra escolhida
esteja na frase (seja maiúscula ou minúscula) diga quantas vezes ela
apareceu e em que posição da frase. Senão, apareça uma frase informando
que esta letra não existe na frase.
*
* */


public class ExercicioStrg {
    public static void main(String[] args) {
        String s = entDados("Entre com uma frase: ");
        String parametro = entDados("Entre com a letra que vc quer: ");
        int i, count = 0;
        for (i = 0; i < s.length(); i++)
            if (s.charAt(i) == parametro.charAt(0)) {
                count += 1;
            }
        if (count == 0)
            System.out.println("A letra "+parametro.charAt(0)+ " não existe na frase.");

        else
            System.out.println("A quantidade de letras iguais eh: " + count);
    }
    public static String entDados(String x) {
        InputStreamReader c = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(c);
        String s = "";
        System.out.println(x);
        try {
            s = cd.readLine();
        } catch (IOException e) {
            System.out.println("Erro de entrada");
        }

        return s;
    }
}