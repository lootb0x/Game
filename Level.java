public class Level{
    private boolean completion;
    private int points;

    public Level(){

    }
    public boolean goalReached(){
        return completion;
    }
    public int getPoints(){
        return points;
    }
    public void goalReacher(boolean inc){
        completion=inc;
    }
    public void setPoints(double inc){
        points=(int)inc;
    }
}