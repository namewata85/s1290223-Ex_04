public class Cointoss{

    public static int countH;
    public static int countT;
    public static void main(String[] args){

        System.out.println("Tossing a coin...");
        for(int i=1;i<4;i++){
            System.out.print("Round"+ i +":");
            double coin = Math.floor(Math.random() * 2) + 1 ;
            if(coin == 1){
                System.out.println("Heads");
                countH++;
            }
            else{
                System.out.println("Tails");
                countT++;
            }
        }
        System.out.println("Heads: " + countH +", Tails: " + countT);
    }
}