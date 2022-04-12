import java.util.Arrays;
public class App {
    public static void main(String[] args) throws Exception {
        // A school has 200 lockers. All locker are initially closed.  
        boolean lockers[] = new boolean[200];    
        
        // The first student goes through all the lockers and opens all the lockers. 
        Arrays.fill(lockers, true);
        
        // The second student goes to every second locker and closes the locker if its open and opens the locker if its closed.  
        for (int studentTwo = 0; studentTwo<lockers.length-1; studentTwo+=2){
            lockers[studentTwo] = !lockers[studentTwo];
        }

        // The third student goes to every third locker and closes the locker if its open and opens the locker if its closed.  
        for (int studentThree = 0; studentThree<lockers.length-1; studentThree++){
            if (studentThree % 3 == 0) lockers[studentThree] = !lockers[studentThree];
        }

        System.out.println(Arrays.toString(lockers));
    }
}