package west2MilkteaShop;

interface Shop
{
    public void Add_ingredient(Ingredient ingredient);
    public void Sell_MilkTea(String name1, String name2) throws SoldOutException;
}
