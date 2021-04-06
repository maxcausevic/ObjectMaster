public class HumanTest{
    public static void main(String[] args){
        Human nick = new Human();
        Human max = new Human();

        nick.attack(max);
        System.out.println(max.health);

        Wizard dumbledore = new Wizard();
        Samarai nishi = new Samarai();
        Ninja rio = new Ninja();

        dumbledore.heal(nishi);
        nishi.deathBlow(rio);
        System.out.println(nishi.health);
        System.out.println(rio.health);
    }
}