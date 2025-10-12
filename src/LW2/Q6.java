package LW2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Q6 {
    public static void main(String[] args) {
        Date today;
        SimpleDateFormat sdf;
        today=new Date();
        sdf=new SimpleDateFormat("dd MMMM yyyy");
        System.out.println(sdf.format(today));


    }
}
