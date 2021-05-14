public class Main {
    public static void main(String[] args) {
        float tiсketPrice = 10085.50F;
        int costOneMile = 20;

        int milesAmount = (int) (tiсketPrice / costOneMile);
        System.out.println("На вашем счету: " + milesAmount + " миль");

    }
}
