package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isExtraCheese;
    private boolean isExtraToppings;
    private boolean isTakeAway;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price=300;
        }else{
            this.price=400;
        }
        isExtraCheese=false;
        isExtraToppings=false;
        isTakeAway=false;
        bill="Base Price Of The Pizza: "+ this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheese){
            this.price+=80;
            this.bill+="Extra Cheese Added: 80\n";
            this.isExtraCheese=true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(this.isVeg){
            this.price+=70;
            this.bill+="Extra Toppings Added: 70\n";
            this.isExtraToppings=true;
        }else{
            this.bill+="Extra Toppings Added: 120\n";
            this.isExtraToppings=true;
            this.price+=120;
        }
    }

    public void addTakeaway(){
        this.bill+="Paperbag Added: 20\n";
        this.isTakeAway=true;
        // your code goes here
        this.price+=20;
    }

    public String getBill(){
        // your code goes here
        return this.bill + "Total Price: "+  this.price +
                "\n";
    }
}
