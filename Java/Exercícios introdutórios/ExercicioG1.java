//Nome: Jean Alves Rocha - RA:2313057

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExercicioG1 {
    public static void main(String[] args) {
        int a = 0, b = 0;
        a = entDados("a");
        b = entDados("b");
        System.out.println("MENU");
        System.out.println("1 – Somar (a+b) ");
        System.out.println("2 – multiplicar (a*b) ");
        System.out.println("3 - subtrair (a-b) ");
        System.out.println("4 - dividir (a/b)  ");
        System.out.println("Escolha a opção: ");

        switch (entDados("MENU")){

            case 1:
                System.out.println("A soma eh: "+(a+b));
                break;
            case 2:
                System.out.println("Multiplicao eh: "+(a*b));
                break;

            case 3:
                System.out.println("A subtracao eh: "+(a-b));
                break;

            case 4:
                System.out.println("A divisao eh: "+((float)a/b));
                break;

            default:
            System.out.println("Não eh Possivel!!!");
                break;

        }

    }

    public static int entDados(String imprimidora){
        System.out.printf("Entre com o valor de %s: ",imprimidora);
        InputStreamReader c = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(c);
        String s = "";
        try{
            s = cd.readLine();
        }
        catch(IOException e){
            System.out.println("Erro de entrada");
        }
        int w = Integer.parseInt(s);
        return w;
    }
}