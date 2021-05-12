package hust.soict.hedspi.aims.utils;

public class MyDate {
    private int day;
    private int month;
    private int year;

    // Getter and setter
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Tạo các class để đổi kiểu string về int
    // 1. Trường hợp đầu vào 3 string
    public MyDate(String day, String month, String year) {
        this.day = DateUtils.toIntDay(day);
        this.day = DateUtils.toIntMonth(month);
        this.year = Integer.parseInt(year);
    }

    // 2. Trường hợp có 1 đầu vào là kiểu Int
    public MyDate(int day, String month, String year) {
        this.day = day;
        this.month = DateUtils.toIntMonth(month);
        this.year = Integer.parseInt(year);
    }

    public MyDate(String day, int month, String year) {
        this.day = DateUtils.toIntDay(day);
        this.month = month;
        this.year = Integer.parseInt(year);
    }

    public MyDate(String day, String month, int year) {
        this.day = DateUtils.toIntDay(day);
        this.month = DateUtils.toIntDay(day);
        this.year = year;
    }

    // 3. Trường hợp 2 đầu vào kiểu Int
    public MyDate(int day, int month, String year) {
        this.day = day;
        this.month = month;
        this.year = Integer.parseInt(year);
    }

    public MyDate(int day, String month, int year) {
        this.day = day;
        this.month = DateUtils.toIntMonth(month);
        this.year = year;
    }

    public MyDate(String day, int month, int year) {
        this.day = DateUtils.toIntDay(day);
        this.month = month;
        this.year = year;
    }

    // 4. Trường hợp 3 đầu vào là kiểu int
    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Hàm trả về ngày tháng năm kiểu string
    public String toStringDate() {
        return String.join(" ", DateUtils.toStringDay(day), DateUtils.toStringMonth(month), Integer.toString(year));
    }

    public String toStringDMYYYY() {
        return String.join("/", DateUtils.toStringDay(day), DateUtils.toStringMonth(month), Integer.toString(year));
    }
}
