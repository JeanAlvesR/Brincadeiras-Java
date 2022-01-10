//Nome: Jean Alves Rocha - RA:2313057
public class Selec1F1 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        if (x == y) {
            System.out.println("O valor de X: " +x+" eh igual a Y: " + y);
        } else if (x > y) {
            System.out.println("O valor de X: " +x+" eh maior do que Y: " + y);
        } else {
            System.out.println("O valor de X: " +x+" eh menor do que Y: " + y);
        }
    }
}
