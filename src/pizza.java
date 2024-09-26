import java.sql.SQLOutput;

public class pizza {
    public static void main(String[] args) {
        int pizzaprice =200;
        int puffprice=40;
        int coldrinkprice=120;

        int pizzaqty =5;
        int puffqty =6;
        int cooldrinkqty = 2;


        int totalpizzacost=pizzaqty*pizzaprice;
        int totalpuffcost=puffqty*puffprice;
        int totalcooldrinkcost=cooldrinkqty*coldrinkprice;

        int grandtotal=totalpizzacost+totalpuffcost+totalcooldrinkcost;

        System.out.println("bill details:");
        System.out.println("total cost of pizzas :" +totalpizzacost);
        System.out.println("total cost of puff cost :" +totalpuffcost);
        System.out.println("total cost of coldrink cost :" +totalcooldrinkcost);
        System.out.println("grand total cost :" +grandtotal);
    }
}
