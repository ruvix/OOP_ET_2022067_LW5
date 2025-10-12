package LW2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Q7 {
    public static void main(String[] args) {
        Date Today;
        SimpleDateFormat sdf;
        Today=new Date();
        sdf=new SimpleDateFormat("EEEE, MMMM dd,yyyy");
        System.out.println(sdf.format(Today));

    }
}
