//NOME: JEAN ALVES ROCHA - RA: 2313057
// REFER�NCIA: https://www.devmedia.com.br/wrappers-em-java-aprenda-como-utilizar/30275
// REFER�NCIA: https://sistemasas12b3.files.wordpress.com/2011/03/aula-do-dia-09-03-2011-linguagem-de-programac3a7c3a3o.pdf
// REFER�NCIA: http://www.linhadecodigo.com.br/artigo/3667/classes-wrappers-em-java.aspx
//Em que � utilizado est� descrito em forma de coment�rios no c�digo -> Resumindo: Atrav�s das classes Wrappers � poss�vel utilizar m�todos, por outro lado os primitivos, n�o.

public class CharacterC {
    public static void main(String arg[]) {
        ///Dado Primitivo
        char c = 'c';
        // transformando atrav�s do m�todo um char minusculo em maiusculo
        System.out.println(Character.toUpperCase(c));
    }
}
