package hust.soict.hedspi.aims.disc;

import java.util.StringTokenizer;

public class DigitalVideoDisc {
    // Create some attributes : title, category, director, length, cost
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    // Constructor only have title
    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
    }

    // Constructor have category and title
    public DigitalVideoDisc(String title, String category) {
        super();
        this.title = title;
        this.category = category;
    }

    // Constructor have director, category and title
    public DigitalVideoDisc(String title, String category, String director) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
    }

    // Constructor have all attributes
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    // Viết hàm boolean để search string
    /**
     * gọi pthuc StringTokenizer và viêt thường string nhập vào
     * Viết thường các title trong danh sách, sau đó so sánh
     * cho gọi hasMoreTokens, rồi so sánh các token trong title với các token trong string nhập vào
     * kết quả cho -1 return false
     * Đúng thì return true
     */
    public boolean search(String title){
        StringTokenizer string = new StringTokenizer(title.toLowerCase());
        String t = this.title.toLowerCase();
        while(string.hasMoreTokens()){
            if(t.indexOf(string.nextToken()) == -1){
                return false;
            }
        }
        return true;
    }
}
