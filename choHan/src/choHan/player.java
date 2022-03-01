package choHan;

public class player {
    private String name = "";;
    private int points=0;

    public player (String name){
        this.name = name;
    }
    
    public int getPoints (){
        return this.points;
    }

    public void addPoint(){
        this.points+=1;
    }

    public String getName(){
        return this.name;
    }
}
