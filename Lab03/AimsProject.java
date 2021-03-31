package Lab03;

public class AimsProject {
    public static void main(String[] args) {
        // Test chơi lúc nhập thông tin
        /** 
        DigitalVideoDisc dvda = new DigitalVideoDisc("Love", "Sturt up");
        System.out.println("Category : " + dvda.getCategory());
        System.out.println("Title : " + dvda.getTitle());
        System.out.println("=================================================");
        DigitalVideoDisc dvdb = new DigitalVideoDisc("Nguyễn Tiến Thành", "Love", "Startup");
        System.out.println("Director : " + dvdb.getDirector());
        System.out.println("Category : " + dvdb.getCategory());
        System.out.println("Title : " + dvdb.getTitle());
        System.out.println("=================================================");
        DigitalVideoDisc dvdc = new DigitalVideoDisc("Nguyễn Tiến Thành", "Love", "Startup", 90, 3);
        System.out.println("Director : " + dvdc.getDirector());
        System.out.println("Category : " + dvdc.getCategory());
        System.out.println("Title : " + dvdc.getTitle());
        System.out.println("Length : " + dvdc.getLength() + " phút");
        System.out.println("Cost : " + dvdc.getCost() + " $");
        */
        Order anOrder = new Order();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation","George Lucas", 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		
		System.out.println("Total Cost is: ");
		System.out.println(anOrder.totalCost());
		
		anOrder.removeDigitalVideoDisc(dvd2);
		System.out.println("Total Cost is: ");
		System.out.println(anOrder.totalCost());
		
		anOrder.removeDigitalVideoDisc(dvd1);
		anOrder.removeDigitalVideoDisc(dvd3);
		System.out.println("Total Cost is: ");
		System.out.println(anOrder.totalCost());
		
		anOrder.removeDigitalVideoDisc(dvd2);
    }
}
