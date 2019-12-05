package west2MilkteaShop;

import java.util.Calendar;

abstract class Ingredient {
    protected String name;//原料名称
    protected Calendar date;//生产日期
    protected int shelflife;//保质期

//    构造函数中的date需要预先创建一个对象
    public Ingredient(String name, Calendar date, int shelflife) {
        this.name = name;
        this.date = date;
        this.shelflife = shelflife;
    }
    @Override
    public String toString(){
        int y = date.get(Calendar.YEAR);
        int m = date.get(Calendar.MONTH);
        int d = date.get(Calendar.DAY_OF_MONTH);
        String ddate = ""+ y + "." + m + "." + d ;
        String ans = "原料名字："+ name + " 原料生产日期：" + ddate + " 原料保质期：" + shelflife + " Days";
        return ans;
    }
}
