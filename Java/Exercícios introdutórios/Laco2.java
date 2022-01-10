//Nome: Jean Alves Rocha - RA:2313057
public class Laco2 {
    public static void main(String[] args) {
        int a=0, b=15;
        while (a<=b){
            //Ele imprime 16, porque na rodada que ele está 15, ele entra no laço e incrementa antes de imprimir.
            a++;
            System.out.println("O Valor de A dentro do while eh: "+a);
        }
    }
}
