public class HumanTest{
    public static void main(String[] args){
        Human nick = new Human();
        Human max = new Human();

        nick.attack(max);
        System.out.println(max.health);
    }
}