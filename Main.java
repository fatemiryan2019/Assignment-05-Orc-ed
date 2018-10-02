public class Main {
    public static void main(String[] args){
        int str = (int) (Math.random() * 20) + 10;
        int max = 40 - str;
        int range = max - 10;
        int agi = (int) (Math.random() * range) + 10;
        int intel = 50 - str - agi;
        // intel = 19;
        //System.out.println(smt);
        int dam = 5 * intel;
        int health = 1000;
        double mod;
        mod = dam * (Math.random() * (1.5 - .5) + .5);
        health -= mod;
        if (health <= 0){
            System.out.println("Success");
            }
        mod = dam * (Math.random() * (1.5 - .5) + .5);
        health -= mod;
        if (health <= 0) {
            System.out.println("Success");

        }
        mod = dam * (Math.random() * (1.5 - .5) + .5);
        health -= mod;
        if (health <= 0) {
            System.out.println("Success");
        }
        mod = dam * (Math.random() * (1.5 - .5) + .5);
        health -= mod;
        if (health <= 0) {
            System.out.println("Success");
        }
        mod = dam * (Math.random() * (1.5 - .5) + .5);
        health -= mod;
        if (health <= 0) {
            System.out.println("Success");
        }
        mod = dam * (Math.random() * (1.5 - .5) + .5);
        health -= mod;
        if (health <= 0) {
            System.out.println("Success");
        }
        mod = dam * (Math.random() * (1.5 - .5) + .5);
        health -= mod;
        if (health <= 0) {
            System.out.println("Success");
        }
        mod = dam * (Math.random() * (1.5 - .5) + .5);
        health -= mod;
        if (health <= 0) {
            System.out.println("Success");
        }
        mod = dam * (Math.random() * (1.5 - .5) + .5);
        health -= mod;
        if (health <= 0) {
            System.out.println("Success");
        }
        mod = dam * (Math.random() * (1.5 - .5) + .5);
        health -= mod;
        if (health <= 0) {
            System.out.println("Success");
        }
        if (health >= 0){
            System.out.println("Failure");
        }
        System.out.println("\nFor 60-70% success rate, intelligence should be at least 19\nFor the same success rate with an intelligence level of 10, the base damage should be 10");
    }
}
