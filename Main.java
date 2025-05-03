public class Main{
    public static void main(String[] args)
    {
        public class Main{
            public static void main(String[] args) {
            Game gameone=new Game();
            System.out.println(gameone.getScore());
            System.out.println(gameone.playManyTimes(500));
            System.out.println("\n");
            Game gametwo=new Game();
            gametwo.setLevels(1, 1000, true);
            gametwo.setLevels(2, 1000, true);
            gametwo.setLevels(3, 1000, true);
            gametwo.bonusProc();
            System.out.println(gametwo.getScore());
            }
        }
        

    }
}