import java.util.Arrays;
public class App {
    public static void main(String[] args) throws Exception {
        boolean lockers[] = new boolean[200];    

        for (int studentOne = 0; studentOne<lockers.length-1; studentOne++){
            Double square = Math.sqrt(studentOne);
            if ((square*square)==studentOne) lockers[studentOne] = !lockers[studentOne];
        }

        System.out.println(Arrays.toString(lockers));
    }
}