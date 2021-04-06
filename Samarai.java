public class Samarai extends Human{
    static int samaraicount = 0;
    public Samarai(){
        this.health = 200;
        samaraicount += 1;
    }
    public void deathBlow(Human opponent){
        opponent.health = 0;
        this.health = (this.health/2);
    }
    public void meditate(Human opponent){
        this.health +=(this.health/2);
    }
    public int howMany(){
        System.out.println(samaraicount);
        return samaraicount;
    }
}