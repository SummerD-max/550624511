package west2MilkteaShop;

import java.util.Calendar;

public class Coconut extends Ingredient{
    public Coconut(String name, Calendar date)
    {
        super(name,date,5);
    }

    @Override
    public String toString(){
        int y = date.get(Calendar.YEAR);
        int m = date.get(Calendar.MONTH) + 1;
        int d = date.get(Calendar.DAY_OF_MONTH);
        String ddate = ""+ y + "." + m + "." + d ;
        String ans = "原料名字："+ name + " 原料生产日期：" + ddate + " 原料保质期：" + shelflife + " Days";
        return ans;
    }
}
