package com.company.Day21;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Item {

    List cartItem = new ArrayList();
    List <String>cart = new ArrayList<String>();
    List <Double>cartPrice = new ArrayList<Double>();
    List <Double>cartOrderQuantity = new ArrayList<>();
    Double[] arrCartPrice = new Double[cartPrice.size()];
    private int itemID;
    private String itemName;
    private double itemPrice;
    private double itemQuantity;
    private double orderQuantity;
    private double totalPrice;

    public Item(){

    }
        public void addItem(Item item,String itemName,double itemPrice,double itemQuantity){

        cartItem.add(item);
        cart.add(itemName);
        cartPrice.add(itemPrice);
        cartOrderQuantity.add(itemQuantity);
    }
        
    public double computeTotal(List tempCartPrice){
        double total = 0;
        Double[] arrTempCartPrice = new Double[tempCartPrice.size()];
        for(int i = 0;i<arrTempCartPrice.length;i++){
            arrTempCartPrice[i] = cartPrice.get(i) * cartOrderQuantity.get(i);
            total=total+arrTempCartPrice[i];
        }
        return total;
    }
    
       public double computeUndiscountedTotal(List tempCartPrice){
           
        double total = applyDiscount();
        
        return total;
    }
    
    
    public double applyDiscount(){
                    List<Double> tempOrdersPrice = new ArrayList();
                    tempOrdersPrice = cartPrice;
                    totalPrice = computeTotal(tempOrdersPrice)-(computeTotal(tempOrdersPrice)*0.2);
                    return totalPrice;
    }

                   
    public void printReceipt1(){
                    List <Item> tempOrders;
                    List<Double> tempOrdersPrice;
                    List<Double> tempOrdersQuantity;
                    tempOrders = cartItem;
                    tempOrdersPrice = cartPrice;
                    tempOrdersQuantity = cartOrderQuantity;
                    LocalDate date = LocalDate.now();
                    System.out.printf("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t%8s\n",date);
                    for(int i = 0; i<cart.size();i++){
                        System.out.printf("%-70s\t@%-4s\t\t\t%.2f\t\t\t%.2f\n" ,tempOrders.get(i).getItemName(),tempOrdersQuantity.get(i).toString(),tempOrdersPrice.get(i), tempOrdersPrice.get(i)*tempOrdersQuantity.get(i));
                    }
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tTotal is Php\t\t\t\t\t"+computeUndiscountedTotal(tempOrdersPrice));
    }
    
        public void printReceipt2(){
                    List <Item> tempOrders;
                    List<Double> tempOrdersPrice;
                    List<Double> tempOrdersQuantity;
                    tempOrders = cartItem;
                    tempOrdersPrice = cartPrice;
                    tempOrdersQuantity = cartOrderQuantity;
                    LocalDate date = LocalDate.now();
                    System.out.printf("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t%8s\n",date);
                    for(int i = 0; i<cart.size();i++){
                        System.out.printf("%-70s\t@%-4s\t\t\t%.2f\t\t\t%.2f\n" ,tempOrders.get(i).getItemName(),tempOrdersQuantity.get(i).toString(),tempOrdersPrice.get(i), tempOrdersPrice.get(i)*tempOrdersQuantity.get(i));
                    }
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tTotal is Php\t\t\t\t\t"+computeUndiscountedTotal(tempOrdersPrice));
    }

        
        public void voidItem(){
            cart.removeAll(cart);
        }
    
    
/*    public String viewOrder() {
        return  itemName +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tPrice = " + itemPrice;
    }*/

    public int getItemID() {
        return itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Item(int itemID, String itemName, double itemPrice) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

}
