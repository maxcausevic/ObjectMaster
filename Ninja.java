public class Ninja extends Human{
    public Ninja(){
        this.stealth = 10;
    }
    public void steal(Human opponent){
        opponent.health -= this.stealth;
        this.health += this.stealth;
    }
    public void runAway(Human opponent){
        this.health -= 10;
    }
}