class HotDogStand {

    private int id;
    private int hotDogsSold;

    public HotDogStand(int id, int hotDogsSold) {
        this.id = id;
        this.hotDogsSold = hotDogsSold;
    }

    public int getId() {
        return id;
    }

    public int getHotDogsSold() {
        return hotDogsSold;
    }

    public void justSold() {
        hotDogsSold++;
    }
}

public class HotDogStandRunner {
    public static void main(String[] args) {

        HotDogStand stand1 = new HotDogStand(101, 0);
        HotDogStand stand2 = new HotDogStand(102, 0);
        HotDogStand stand3 = new HotDogStand(103, 5); // started the day with 5 already sold

        stand1.justSold();
        stand1.justSold();
        stand1.justSold();


        for (int i = 0; i < 5; i++) {
            stand2.justSold();
        }

        stand3.justSold();
        stand3.justSold();

        System.out.println("Stand " + stand1.getId() + " sold: " + stand1.getHotDogsSold());
        System.out.println("Stand " + stand2.getId() + " sold: " + stand2.getHotDogsSold());
        System.out.println("Stand " + stand3.getId() + " sold: " + stand3.getHotDogsSold());
    }
}
