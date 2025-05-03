public class Game{
    private Level levelone=new Level();
    private Level leveltwo=new Level();
    private Level levelthree=new Level();
    private boolean bonus;
    public Game(){
    play();
    }
    public void bonusProc(){
        bonus=true;
    }
    public boolean isBonus(){
    return bonus;
    }
    public void play(){
    levelone.setPoints(Math.random()*1000);
    leveltwo.setPoints(Math.random()*1000);
    levelthree.setPoints(Math.random()*1000);
    if (Math.random()>0.5) levelone.goalReacher(true);
    if (Math.random()>0.5) leveltwo.goalReacher(true);
    if (Math.random()>0.5) levelthree.goalReacher(true);
    }
    
    public void setLevels(int level, int points, boolean completed){
    if (!(level<0&&level>3)){
        if (level==1){
            levelone.setPoints(points);
            levelone.goalReacher(completed);
        }
        else  if (level==2){
            leveltwo.setPoints(points);
            leveltwo.goalReacher(completed);
        }
        else{
            levelthree.setPoints(points);
            levelthree.goalReacher(completed);
        }
    
    }
    
    }
    public int getScore(){
    int ret=0;
    if (levelone.goalReached())
    {
     ret+=levelone.getPoints();
      if (leveltwo.goalReached())
      {
       ret+=leveltwo.getPoints();
       if (levelthree.goalReached())
        {
         ret+=levelthree.getPoints();
        }
      }
    }
    
    if (isBonus()) ret=ret*3;
    
    return ret;
    }
    
    public int playManyTimes(int num){
    int max=0;
    for (int i=0;i<num;i++)
    {
    Game sim=new Game();
    sim.play();
    if (sim.getScore()>max) max=sim.getScore();
    }
    return max;
    }
    }