//NOME: JEAN ALVES ROCHA - RA: 2313057
// REFERÊNCIA: https://www.devmedia.com.br/wrappers-em-java-aprenda-como-utilizar/30275
// REFERÊNCIA: https://sistemasas12b3.files.wordpress.com/2011/03/aula-do-dia-09-03-2011-linguagem-de-programac3a7c3a3o.pdf
// REFERÊNCIA: http://www.linhadecodigo.com.br/artigo/3667/classes-wrappers-em-java.aspx
//Em que é utilizado está descrito em forma de comentários no código -> Resumindo: Através das classes Wrappers é possível utilizar métodos, por outro lado os primitivos, não.

public class LongH1 {
    public static void main(String arg[]) {
        //Instanciando
        Long num = 1000l;
        System.out.println(num);
        //.doubleValue: método para tranformar em primitivo double.
        System.out.println(num.doubleValue());
    }
}
