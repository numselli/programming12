import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class date {
    private Date dateObj = new Date();
    private Calendar calObj = Calendar.getInstance();
    private SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");

    date(){
        calObj.setTime(dateObj);
    }

    // add
    public void increaseDay(int amount){
        calObj.add(7, amount);
    }
    public void increaseMonth(int amount){
        calObj.add(2, amount);
    }
    public void increaseYear(int amount){
        calObj.add(1, amount);
    }

    // remove
    public void decreaseDay(int amount){
        calObj.add(7, -amount);
    }
    public void decreaseMonth(int amount){
        calObj.add(2, -amount);
    }
    public void decreaseYear(int amount){
        calObj.add(1, -amount);
    }

    public String getDate(){
        return dateFormatter.format(calObj.getTime());
    }
}