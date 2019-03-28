package com.company.Day20.OrderingSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order extends Item{

    List<Item> items = new ArrayList<>();
    List cart = new ArrayList();
    
    private double orderQuantity;
    private double orderTotalAmount;
    private final double orderDiscount = 0.2;
    private double orderDiscountedPrice;
    private double totalPrice;
    
    private int orderID;
    private String orderName;
    private double orderPrice;
    private String confirmation;
    
    Scanner sc = new Scanner(System.in);
    
    Item item = new Item();
    
    
       
    public boolean cancelOrder (boolean moreOrder){
                        System.out.println("Do you want to cancel orders?");
                        String cancelOrders = sc.next();
                        if("Y".equals(cancelOrders.toUpperCase())){
                            item.voidItem();
                            System.out.println("Thank you");
                            return false;
                        }else if("N".equals(cancelOrders.toUpperCase())){
                            return true;
                        }
                        return true;
    }

    public void applyDiscount(double totalPrice){

    }

 }
