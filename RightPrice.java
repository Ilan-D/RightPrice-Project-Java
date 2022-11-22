import java.util.Random;

public class RightPrice{
    static Random rand = new Random();

    public static int RandRange(int a, int b){
        return (rand.nextInt(b-a)+a);
    }

    public static String party2(int n, int round){
        String mess = "";
        int numRand = RandRange(0, n);
        System.out.println(numRand);
        String resConsole = String.valueOf(numRand);
        String joueur = "";
        int cp = 0;
        for(int i=0;i<round;i++){
            joueur = System.console().readLine();
            cp = Integer.valueOf(joueur);
            if(joueur.equals(resConsole)){
                mess = "vous avez obtenue le bon numéro !";
                return mess; 
            }else if(!joueur.equals(resConsole) && i<round-1){
                if(cp < numRand){
                    System.out.println("essayez encore ! indice: le chiffre est trop petit");
                }else if(cp > numRand){
                    System.out.println("essayez encore ! indice: le chiffre est trop grand");
                }else{
                    System.out.println("vous êtes en dehors");
                }
            }else{
                mess = "vous n'avez jamais obtenu le bon numéro, vous avez donc perdu la partie.";
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