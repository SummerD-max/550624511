package west2MilkteaShop;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) throws SoldOutException {
//        让我们假设生产日期为今天 获取一下现在日期
        Calendar calendar = Calendar.getInstance();
        //注：火奴鲁鲁是一种珍珠
        Ingredient honolulu = new Bubble("火奴鲁鲁",calendar);

        //让我们来看看火奴鲁鲁的生产日期和保质期
        System.out.println(honolulu.toString());

//        火焰奶茶是用火奴鲁鲁制作的
        MilkTea tea = new MilkTea("火焰奶茶", honolulu);
//        看看火焰奶茶的信息
        System.out.println(tea.toString());

        //西二奶茶店开张啦！
        Teashop teashop = new Teashop();
        //购买原料火奴鲁鲁,世界上只有一个这种原料
        teashop.Add_ingredient(honolulu);
        //销售火焰奶茶
        teashop.Sell_MilkTea("火焰奶茶","Bubble");
        //没有火奴鲁鲁了，卖完了。
        teashop.Sell_MilkTea("火焰奶茶","Bubble");

//        奶茶店功能测试完毕
    }
}

