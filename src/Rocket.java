import java.util.Random;

public class Rocket {
    private String starTrack;
    private int mass;

    public Rocket(String starTrack, int mass) {
        this.starTrack = starTrack;
        this.mass = mass;
    }

    public String getStarTrack() {
        return starTrack;
    }

    public void setStarTrack(String starTrack) {
        this.starTrack = starTrack;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    private boolean checkSystem(){
        System.out.println("Предстартовая проверка");
        Random random = new Random(10);
        int x = random.nextInt();
        return x % 2 ==0;
    }
    public void start(){
        System.out.println("Ракета " + starTrack + " успешно стартанула с грузом в " + mass);
    }

}
