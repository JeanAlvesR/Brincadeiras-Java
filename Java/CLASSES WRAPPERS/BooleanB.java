//NOME: JEAN ALVES ROCHA - RA: 2313057
// REFER�NCIA: https://www.devmedia.com.br/wrappers-em-java-aprenda-como-utilizar/30275
// REFER�NCIA: https://sistemasas12b3.files.wordpress.com/2011/03/aula-do-dia-09-03-2011-linguagem-de-programac3a7c3a3o.pdf
// REFER�NCIA: http://www.linhadecodigo.com.br/artigo/3667/classes-wrappers-em-java.aspx
//Em que � utilizado est� descrito em forma de coment�rios no c�digo -> Resumindo: Atrav�s das classes Wrappers � poss�vel utilizar m�todos, por outro lado os primitivos, n�o.

public class BooleanB {
    public static void main(String arg[]) {

        boolean b1 = true;
        boolean b2 = false;

        //toString = m�todo tranforma Boolean em String
        String s1 = Boolean.toString(b1);
        //Demonstrando que de fato se tornou uma string
        System.out.println(s1.charAt(0));
        //toString = m�todo tranforma Boolean em String
        String s2 = Boolean.toString(b2);
        //Demonstrando que de fato se tornou uma string
        System.out.println(s2.charAt(0));

    }
}