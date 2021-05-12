package hust.soict.hedspi.test.disc;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
public class TestPassingParameter {
    public static void main(String[] args) {
        // Todo auto-generated method stub
        DigitalVideoDisc junleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
        swap(junleDVD,cinderellaDVD);
        System.out.println("Jungle dvd title : " + junleDVD.getTitle());
        System.out.println("Cinderella dvd title : " + cinderellaDVD.getTitle());

        changeTitle(junleDVD, cinderellaDVD.getTitle());
        System.out.println("Jungle dvd title: " + junleDVD.getTitle());     
    }

    public static void swap(Object o1, Object o2){
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title){
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
}
