package model;

public class MainCategory {
    public int getSeat() {
        return Seat;
    }

    public void setSeat(int seat) {
        Seat = seat;
    }

    public int getSofa() {
        return Sofa;
    }

    public void setSofa(int sofa) {
        Sofa = sofa;
    }

    public MainCategory(int seat, int sofa) {
        Seat = seat;
        Sofa = sofa;
    }

    int Seat;
    int Sofa;

    public void getInfo() {
        System.out.println("*********** Movie Information *********** ");
        System.out.println("Seat:" + this.getSeat());
        System.out.println("Sofa:" + this.getSofa());
    }

}
