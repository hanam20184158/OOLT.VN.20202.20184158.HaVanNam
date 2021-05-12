package hust.soict.hedspi.test.utils;
import hust.soict.hedspi.aims.utils.MyDate;
import hust.soict.hedspi.aims.utils.DateUtils;
public class testDate {
    public static void main(String[] args) {
        MyDate a = new MyDate(15,05,2000);
        MyDate b = new MyDate(1,"May",2000);

        MyDate[] list = new MyDate[]{a,b};

        list = DateUtils.sortDate(list);
        for(int i=0; i<list.length; i++){
            System.out.println(list[i].toStringDate());
        }
    }
}
