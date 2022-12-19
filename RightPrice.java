import java.util.Random;

public class RightPrice {
    static Random rand = new Random();

    public static int RandRange(int a, int b) {
        return (rand.nextInt(b - a) + a);
    }

    public static String party2(int n, int round) {
        System.out.println("Commencez par rentrer un chiffre :");
        String mess = "";
        int numRand = RandRange(0, n);
        String resConsole = String.valueOf(numRand);
        String joueur = "";
        int cp = 0;
        for (int i = 0; i < round; i++) {
            joueur = System.console().readLine();
            cp = Integer.valueOf(joueur);
            if (joueur.equals(resConsole)) {
                mess = "vous avez obtenue le bon numero !";
                return mess;
            } else if (!joueur.equals(resConsole) && i < round - 1) {
                if (cp < numRand) {
                    System.out.println("essayez encore ! indice: le chiffre est trop petit");
                } else if (cp > numRand && cp < n) {
                    System.out.println("essayez encore ! indice: le chiffre est trop grand");
                } else if (cp >= n) {
                    System.out.println("vous etes en dehors !");
                }
            } else {
                mess = "vous n'avez jamais obtenu le bon numero, vous avez donc perdu la partie.";
            }
        }
        return mess;
    }

    public static void main(String[] args) {
        System.out.println("combien de manche voulez-vous jouer ?");
        String st = System.console().readLine();
        int round = Integer.valueOf(st);
        System.out.println(party2(100, round));
    }
}