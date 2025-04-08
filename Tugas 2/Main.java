class Cuboid {
    double height;
    double width;
    double length;

    double getVolume(){
        return height * width * length;
    }
}

public class Main{
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.height = 20;
        cuboid.width = 15;
        cuboid.length = 15;
        System.out.printf("Volume = %2.2f", cuboid.getVolume());
    }
}