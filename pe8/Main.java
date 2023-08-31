package pe8;

public class Main {
    public static void main(String[] args){
        LandTract l1 = new LandTract(2, 2);
        LandTract l2 = new LandTract(4, 1);
        System.out.println(l1.getArea(l1.getLength(), l1.getWidth()));
        System.out.println(l2.getArea(l2.getLength(), l2.getWidth()));
        System.out.println(l1);
        System.out.println(l1.equals(l2));
    }
}
