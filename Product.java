import java.util.Scanner;

public class Product
{
  
    protected String brand;
    protected String name;
    protected String coloring;
    protected int price;
    protected int id;
    protected static int quanity;
    
    public int PriceDifference(int b) {
        Helper.calc(this.price,b);
        return -1;
    }
    public int getprice() {
        return this.price;
    }
    int getid() {
        return this.id;
    }
 
    void changeid() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите новый id товара : ");
        this.id = scn.nextInt();
        scn.close();
    }
    static void setquanity(int number){
        Product.quanity = number;
    }
    static int countofproduct()
    {
        return Product.quanity;
    }
}
