public class Main {
    public static void main(String[] args){
        int str = (int) (Math.random() * 20) + 10;
        int max = 40 - str;
        int range = max - 10;
        int agi = (int) (Math.random() * range) + 10;
        int smt = 50 - str - agi;
        int dam = 5 * smt;
        int health = 1000;
        double mod;
        for (int i = 0; i <= 10; i++) {
            mod = dam * (Math.random() * (1.5 - .5) + .5);
            health -= mod;
            if (health <= 0){
                System.out.println("Success");
                break;
            }
            if (i == 10 && !(health <= 0)){
                System.out.println("Failure");
            }
        }
    }
}
