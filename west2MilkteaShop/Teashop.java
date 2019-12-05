package west2MilkteaShop;

import java.util.ArrayList;
import java.util.Calendar;

public class Teashop implements Shop
{

    //两个arraylist分别装珍珠和椰果
    private ArrayList<Bubble> bubbleList = new ArrayList<>();
    private ArrayList<Coconut> coconutList = new ArrayList<>();

    //两个重载的 add 函数
    public void add(Bubble bubble){
        bubbleList.add(bubble);
    }
    public void add(Coconut coconut){
        coconutList.add(coconut);
    }

    //添加配料函数
    public void Add_ingredient(Ingredient ingredient)
    {
        if(ingredient instanceof Bubble){
            Bubble b = (Bubble) ingredient;
            add(b);
        }
        else if(ingredient instanceof Coconut){
            Coconut c = (Coconut) ingredient;
            add(c);
        }
    }

    //出售奶茶函数
    public void Sell_MilkTea(String name1, String name2) throws SoldOutException {
        Calendar date2 = Calendar.getInstance();
//        Calendar date3 = Calendar.getInstance();
//        int day = (int) ((date2.getTimeInMillis() - date3.getTimeInMillis()) / (1000*3600*24));//此方法为百度
//        System.out.println(day);
//        System.out.println(date2.getTime());
        if(name2.equals("Bubble")){
            if(bubbleList.isEmpty()){
                System.out.println("没有配料啦！");
            }
            else{
                while (!bubbleList.isEmpty()){
                    Bubble b = bubbleList.get(0);
                    Calendar date1 = b.date;
//                    System.out.println(b.toString());test
                    // days 为两个日期之间相差的天数
                    int days = (int) ((date2.getTimeInMillis() - date1.getTimeInMillis()) / (1000*3600*24));//此方法为百度
                    if(days > b.shelflife){
                        bubbleList.remove(0);
                    }
                    else{
                        if(bubbleList.isEmpty()){
                            throw new SoldOutException("不好意思，奶茶卖完了！");
                        }
                        else{
                            bubbleList.remove(0);
                            System.out.println(name1 + " 制作完成！");
                            break;
                        }
                    }
                }
            }
        }
        //如果原料是椰果，同理。
        if(name2.equals("Coconut")){
            if(coconutList.isEmpty()){
                System.out.println("没有配料啦！");
            }
            else{
                while (!coconutList.isEmpty()){
                    Coconut b = coconutList.get(0);
                    Calendar date1 = b.date;
                    // days 为两个日期之间相差的天数
                    int days = (int) ((date2.getTimeInMillis() - date1.getTimeInMillis()) / (1000*3600*24));
                    if(days > b.shelflife){
                        coconutList.remove(0);
                    }
                    else{
                        if(coconutList.isEmpty()){
                            throw new SoldOutException("不好意思，奶茶卖完了！");
                        }
                        else{
                            coconutList.remove(0);
                            System.out.println(name1 + " 奶茶制作完成！");
                            break;
                        }
                    }
                }
            }
        }
    }



}
