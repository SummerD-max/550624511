package west2MilkteaShop;

public class MilkTea
{
    protected String name;
    protected Ingredient ingredient;

    public MilkTea(String name, Ingredient ingredient) {
        this.name = name;
        this.ingredient = ingredient;
    }
    @Override
    public String toString(){
        String ingre = ingredient.toString();
        String ans = "奶茶名字："+ name + " " + ingre;
        return ans;
    }
}
