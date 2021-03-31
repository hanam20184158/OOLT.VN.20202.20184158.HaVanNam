package Lab03;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    /**
     * khởi tạo các hàm :
     * + setter : nhập giá trị cho biến
     * + getter : lấy giá trị của biến
     * @return
     */
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

    /**
     * Phương thức khởi tạo chỉ có title
     * @param title
     */
    public DigitalVideoDisc(String title){
        super();
        this.title = title;
    }
    /**
     * Phương thức khởi tạo có cả category và title
     * @param category
     * @param title
     */
    public DigitalVideoDisc(String category, String title){
        super();
        this.category = category;
        this.title = title;
    }
    /**
     * Phương thức khởi tạo có cả 3 thuộc tính : director, category, title.
     * @param director
     * @param category
     * @param title
     */
    public DigitalVideoDisc(String director, String category, String title){
        //super();
        this.director = director;
        this.category = category;
        this.title = title;
    }

    public DigitalVideoDisc(String director, String category, String title, float cost){
        //super();
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
    }
    /**
     * Khởi tạo phương thức có 5 thuộc tính dưới đây
     * @param director
     * @param category
     * @param title
     * @param length
     * @param cost
     */
    public DigitalVideoDisc(String director, String category, String title, int length, float cost ){
        //super(); 
        // ? Tại sao nếu có super lại bị lỗi
        /**
         * Khởi tạo kế thừa từ hàm trên. cú pháp : this(dtuong1, dtuong2, dtuong3....) */ 
        this(director,category,title);
        this.length = length;
        this.cost = cost;

    }
    
}
