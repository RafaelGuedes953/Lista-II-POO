package questao3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Datas {
    
    public Datas(){}
    
    public String getDate(){
        DateFormat dateFormat= new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public String getHour(){
        DateFormat hourFormat= new SimpleDateFormat("hh:mm:ss");
        Date hour = new Date();
        return hourFormat.format(hour);
    }
}
