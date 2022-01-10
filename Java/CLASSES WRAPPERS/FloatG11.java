//NOME: JEAN ALVES ROCHA - RA: 2313057
// REFERÊNCIA: https://www.devmedia.com.br/wrappers-em-java-aprenda-como-utilizar/30275
// REFERÊNCIA: https://sistemasas12b3.files.wordpress.com/2011/03/aula-do-dia-09-03-2011-linguagem-de-programac3a7c3a3o.pdf
// REFERÊNCIA: http://www.linhadecodigo.com.br/artigo/3667/classes-wrappers-em-java.aspx
//Em que é utilizado está descrito em forma de comentários no código -> Resumindo: Através das classes Wrappers é possível utilizar métodos, por outro lado os primitivos, não.

public class FloatG11 {
    public static void main(String arg[]) {
        float num = 3.5f;
        float num1 = 4.5f;
        //Pega através do metodo max do Float o maior número: FACILITA MUITO.
        System.out.println(Float.max(num,num1));
    }
}
