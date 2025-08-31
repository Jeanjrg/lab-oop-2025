


public class Main {
    public static void main(String[] args) {
        Lightcone lc1 = new Lightcone("Before Dawn", 50);
        Character kafka = new Character("Kafka", 1200, 100, 80, 10, lc1);

        Lightcone lc2 = new Lightcone("The Seriousness of Breakfast", 30);
        Character danHeng = new Character("Dan Heng", 1000, 80, 160, 20, lc2);

        kafka.displayInfo();
        danHeng.displayInfo();
        kafka.fight(danHeng);

        
    }
}




