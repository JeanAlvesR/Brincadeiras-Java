//NOME: JEAN ALVES ROCHA - RA: 2313057
// REFER�NCIA: https://www.devmedia.com.br/wrappers-em-java-aprenda-como-utilizar/30275
// REFER�NCIA: https://sistemasas12b3.files.wordpress.com/2011/03/aula-do-dia-09-03-2011-linguagem-de-programac3a7c3a3o.pdf
// REFER�NCIA: http://www.linhadecodigo.com.br/artigo/3667/classes-wrappers-em-java.aspx
//Em que � utilizado est� descrito em forma de coment�rios no c�digo -> Resumindo: Atrav�s das classes Wrappers � poss�vel utilizar m�todos, por outro lado os primitivos, n�o.

public class IntegerA {
    public static void main(String arg[]) {
        int num1 = 10;
        //Transforma String em Int.
        int num2 = Integer.parseInt("120");
        //Impressao da soma entre inteiros ap�s a transforma��o
        System.out.println("Teste da classe Wrapper INTEGER: "+(num1+num2));

    }
}
