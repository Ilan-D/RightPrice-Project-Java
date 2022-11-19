import java.util.Random;

public class RightPrice{
    static Random rand = new Random();

    public static int RandRange(int a, int b){
        return (rand.nextInt(b-a)+a);
    }

    public static String party(int n, int round){
        String mess = "";
        int num = RandRange(0, n);
        String resConsole = String.valueOf(num);
        String joueur = "";
        for(int i=0;i<round;i++){
            joueur = System.console().readLine();
            if(joueur.equals(resConsole)){
                mess = "vous avez obtenue le bon numéro !";
                return mess; 
            }else if(!joueur.equals(resConsole) && i<round){
                System.out.println("essayez encore !");
            }else{
                mess = "vous n'avez jamais obtenu le bon numéro, vous avez donc perdu la partie";
            }
        }
        return mess;
    }


    public static void main(String[] args) {  
        System.out.println(party(100, 5));
    }
}