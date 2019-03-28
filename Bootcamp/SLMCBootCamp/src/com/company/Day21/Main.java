package com.company.Day21;

import com.company.Day20.OrderingSystem.Item;
import com.company.Day20.OrderingSystem.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        List orders = new ArrayList();
        //List cart = new ArrayList();

        com.company.Day20.OrderingSystem.Item BigMacLargeFriesAndCoke = new com.company.Day20.OrderingSystem.Item(1,"BigMac w/Large Fries and Coke",195);
        com.company.Day20.OrderingSystem.Item BigMacRegularFriesAndCoke = new com.company.Day20.OrderingSystem.Item(2,"BigMac w/Regular Fries and Coke",175);

        com.company.Day20.OrderingSystem.Item QuarterPounderWithCheeseLargeFriesAndCoke = new com.company.Day20.OrderingSystem.Item(3,"Quarter Pounder with Cheese w/Large Fries and Coke",195);
        com.company.Day20.OrderingSystem.Item QuarterPounderWithCheeseRegularFriesAndCoke = new com.company.Day20.OrderingSystem.Item(4,"Quarter Pounder with Cheese w/Regular Fries and Coke",175);

        com.company.Day20.OrderingSystem.Item DoubleCheeseBurgerLargeFriesAndCoke = new com.company.Day20.OrderingSystem.Item(5,"Double Cheeseburger w/Large Fries and Coke",162);
        com.company.Day20.OrderingSystem.Item DoubleCheeseBurgerRegularFriesAndCoke = new com.company.Day20.OrderingSystem.Item(6,"Double Cheeseburger w/Regular Fries and Coke",142);

        com.company.Day20.OrderingSystem.Item McChickenSandwichLargeFriesAndCoke = new com.company.Day20.OrderingSystem.Item(7,"McChicken Sandwich w/Large Fries and Coke",155);
        com.company.Day20.OrderingSystem.Item McChickenSandwichRegularFriesAndCoke = new com.company.Day20.OrderingSystem.Item(8,"McChicken Sandwich w/Regular Fries and Coke",135);

        com.company.Day20.OrderingSystem.Item FilletOFishLargeFriesAndCoke = new com.company.Day20.OrderingSystem.Item(9,"Fillet-O-Fish w/Large Fries and Coke",155);
        com.company.Day20.OrderingSystem.Item FilletOFishRegularFriesAndCoke = new com.company.Day20.OrderingSystem.Item(10,"Fillet-O-Fish w/Regular Fries and Coke", 135);

        com.company.Day20.OrderingSystem.Item CheeseBurgerDeluxeLargeFriesAndCoke = new com.company.Day20.OrderingSystem.Item(11,"Cheeseburger Deluxe w/Large Fries and Coke",133);
        com.company.Day20.OrderingSystem.Item CheeseBurgerDeluxeRegularFriesAndCoke = new com.company.Day20.OrderingSystem.Item(12,"Cheeseburger Deluxe w/Regular Fries and Coke",113);

        com.company.Day20.OrderingSystem.Item CheeseBurgerLargeFriesAndCoke = new com.company.Day20.OrderingSystem.Item(13, "Cheeseburger w/Large Fries and Coke",115);
        com.company.Day20.OrderingSystem.Item CheeseBurgerRegularFriesAndCoke = new com.company.Day20.OrderingSystem.Item(14,"Cheeseburger w/Regular Fries and Coke",95);

        com.company.Day20.OrderingSystem.Item BurgerMcdoLargeFriesAndCoke = new com.company.Day20.OrderingSystem.Item(15,"Burger Mcdo w/Large Fries and Coke",102);
        com.company.Day20.OrderingSystem.Item BurgerMcdoRegularFriesAndCoke = new com.company.Day20.OrderingSystem.Item(16,"Burger Mcdo w/Regular Fries and Coke",82);

        com.company.Day20.OrderingSystem.Item ChickenMcdo2WithRiceLargeCoke = new com.company.Day20.OrderingSystem.Item(17,"2-pc Chicken Mcdo with Rice w/Large Coke",169);
        com.company.Day20.OrderingSystem.Item ChickenMcdo2WithRiceRegularCoke = new com.company.Day20.OrderingSystem.Item(18,"2-pc Chicken Mcdo with Rice w/Regular Coke",159);

        com.company.Day20.OrderingSystem.Item McNuggets6PcsLargeCoke = new com.company.Day20.OrderingSystem.Item(19,"6-pc McNuggets w/Large Coke",165);
        com.company.Day20.OrderingSystem.Item McNuggets6PcsRegularCoke = new com.company.Day20.OrderingSystem.Item(20,"6-pc McNuggets w/Regular Coke",145);

        com.company.Day20.OrderingSystem.Item ChickenMcdo1WithRiceLargeCoke = new com.company.Day20.OrderingSystem.Item(21,"1-pc Chicken Mcdo with Rice w/Large Coke",105);
        com.company.Day20.OrderingSystem.Item ChickenMcdo1WithRiceRegularCoke = new com.company.Day20.OrderingSystem.Item(22,"1-pc Chicken Mcdo with Rice w/Regular Coke",89);

        com.company.Day20.OrderingSystem.Item ChickenMcdo1WithMcSpaghettiLargeCoke = new com.company.Day20.OrderingSystem.Item(23,"1-pc Chicken Mcdo with McSpaghetti w/Large Coke",129);
        com.company.Day20.OrderingSystem.Item ChickenMcdo1WithMcSpaghettiRegularCoke = new com.company.Day20.OrderingSystem.Item(24,"1-pc Chicken Mcdo with McSpaghetti w/Regular Coke",119);

        com.company.Day20.OrderingSystem.Item MushroomPepperSteak1LargeCoke = new com.company.Day20.OrderingSystem.Item(25,"1-pc Mushroom Pepper Steak w/Large Coke",70);
        com.company.Day20.OrderingSystem.Item MushroomPepperSteakRegularCoke = new com.company.Day20.OrderingSystem.Item(26,"1-pc Mushroom Pepper Steak w/Regular Coke",60);

        com.company.Day20.OrderingSystem.Item CrispyChickenFilletWithRiceLargeCoke = new com.company.Day20.OrderingSystem.Item(27,"Chicken Fillet with Rice w/Large Coke",90);
        com.company.Day20.OrderingSystem.Item CrispyChickenFilletWithRiceRegularCoke = new com.company.Day20.OrderingSystem.Item(28,"Chicken Fillet with Rice w/Regular Coke",60);

        com.company.Day20.OrderingSystem.Item ChickenFilletAlaKingWithRiceLargeCoke = new com.company.Day20.OrderingSystem.Item(29,"Chicken Fillet Ala King with Rice w/Large Coke",90);
        com.company.Day20.OrderingSystem.Item ChickenFilletAlaKingWithRiceRegularCoke = new com.company.Day20.OrderingSystem.Item(30,"Chicken Fillet Ala King with Rice w/Regular Coke",60);

        orders.add(BigMacLargeFriesAndCoke);
        orders.add(BigMacRegularFriesAndCoke);
        orders.add(QuarterPounderWithCheeseLargeFriesAndCoke);
        orders.add(QuarterPounderWithCheeseRegularFriesAndCoke);
        orders.add(DoubleCheeseBurgerLargeFriesAndCoke);
        orders.add(DoubleCheeseBurgerRegularFriesAndCoke);
        orders.add(McChickenSandwichLargeFriesAndCoke);
        orders.add(McChickenSandwichRegularFriesAndCoke);
        orders.add(FilletOFishLargeFriesAndCoke);
        orders.add(FilletOFishRegularFriesAndCoke);
        orders.add(CheeseBurgerDeluxeLargeFriesAndCoke);
        orders.add(CheeseBurgerDeluxeRegularFriesAndCoke);
        orders.add(CheeseBurgerLargeFriesAndCoke);
        orders.add(CheeseBurgerRegularFriesAndCoke);
        orders.add(BurgerMcdoLargeFriesAndCoke);
        orders.add(BurgerMcdoRegularFriesAndCoke);
        orders.add(ChickenMcdo2WithRiceLargeCoke);
        orders.add(ChickenMcdo2WithRiceRegularCoke);
        orders.add(McNuggets6PcsLargeCoke);
        orders.add(McNuggets6PcsRegularCoke);
        orders.add(ChickenMcdo1WithRiceLargeCoke);
        orders.add(ChickenMcdo1WithRiceRegularCoke);
        orders.add(ChickenMcdo1WithMcSpaghettiLargeCoke);
        orders.add(ChickenMcdo1WithMcSpaghettiRegularCoke);
        orders.add(MushroomPepperSteak1LargeCoke);
        orders.add(MushroomPepperSteakRegularCoke);
        orders.add(CrispyChickenFilletWithRiceLargeCoke);
        orders.add(CrispyChickenFilletWithRiceRegularCoke);
        orders.add(ChickenFilletAlaKingWithRiceLargeCoke);
        orders.add(ChickenFilletAlaKingWithRiceRegularCoke);

        Scanner sc = new Scanner(System.in);

        System.out.println("\tMenu");
        System.out.println("Big Mac");
        System.out.println("Quarter Pounder with Cheese");
        System.out.println("Double Cheeseburger");
        System.out.println("McChicken Sandwich");
        System.out.println("Fillet-OFish");
        System.out.println("Cheese Burger Deluxe");
        System.out.println("Cheeseburger");
        System.out.println("Burger Mcdo");
        System.out.println("2-pc Chicken Mcdo with Rice");
        System.out.println("6-pc McNuggets");
        System.out.println("1-pc Chicken Mcdo with Rice");
        System.out.println("1-pc Chicken Mcdo with McSpaghetti");
        System.out.println("1-pc Mushroom Pepper Steak");
        System.out.println("Crispy Chicken Fillet with Rice");
        System.out.println("Chicken Fillet Ala King with Rice\n");

        com.company.Day20.OrderingSystem.Item item = new Item();
        Order order = new Order();

        boolean moreOrder = true;

        double totalPrice;

            while(moreOrder==true){
                System.out.println("Add an order [Y/N]");
                String prompt = sc.next();
                if(prompt.toUpperCase().equals("Y")){

                    System.out.println("Enter an order : ");
                    int codeOrder = sc.nextInt();
                    String orderSize = "";
                    double quantity;

                    switch (codeOrder){
                        case 1:
                            System.out.println("Regular or Large [R/L]");
                            orderSize = sc.next();
                            if(orderSize.toUpperCase().equals("L")){
                                System.out.println("Enter Quantity");
                                quantity = sc.nextDouble();
                                item.addItem(BigMacLargeFriesAndCoke,BigMacLargeFriesAndCoke.getItemName(),BigMacLargeFriesAndCoke.getItemPrice(),quantity);
                            }else if(orderSize.toUpperCase().equals("R")){
                                System.out.println("Enter Quantity");
                                quantity = sc.nextDouble();
                                item.addItem(BigMacRegularFriesAndCoke,BigMacRegularFriesAndCoke.getItemName(),BigMacRegularFriesAndCoke.getItemPrice(),quantity);
                            }
                            break;
                        case 2:
                            System.out.println("Regular or Large [R/L]");
                            orderSize = sc.next();
                            if(orderSize.toUpperCase().equals("L")){
                                System.out.println("Enter Quantity");
                                quantity = sc.nextDouble();
                                item.addItem(QuarterPounderWithCheeseLargeFriesAndCoke,QuarterPounderWithCheeseLargeFriesAndCoke.getItemName(),QuarterPounderWithCheeseLargeFriesAndCoke.getItemPrice(),quantity);
                            }else if(orderSize.toUpperCase().equals("R")){
                                System.out.println("Enter Quantity");
                                quantity = sc.nextDouble();
                                item.addItem(QuarterPounderWithCheeseRegularFriesAndCoke,QuarterPounderWithCheeseRegularFriesAndCoke.getItemName(),QuarterPounderWithCheeseRegularFriesAndCoke.getItemPrice(),quantity);
                            }
                            break;
                        case 3:
                            System.out.println("Regular or Large [R/L]");
                            orderSize = sc.next();
                            if(orderSize.toUpperCase().equals("L")){
                                System.out.println("Enter Quantity");
                                quantity = sc.nextDouble();
                                item.addItem(DoubleCheeseBurgerLargeFriesAndCoke,DoubleCheeseBurgerLargeFriesAndCoke.getItemName(),DoubleCheeseBurgerLargeFriesAndCoke.getItemPrice(),quantity);
                            }else if(orderSize.toUpperCase().equals("R")){
                                System.out.println("Enter Quantity");
                                quantity = sc.nextDouble();
                                item.addItem(DoubleCheeseBurgerRegularFriesAndCoke,DoubleCheeseBurgerLargeFriesAndCoke.getItemName(),DoubleCheeseBurgerRegularFriesAndCoke.getItemPrice(),quantity);
                            }
                            break;
                        case 4:
                            System.out.println("Regular or Large [R/L]");
                            orderSize = sc.next();
                            if(orderSize.toUpperCase().equals("L")){
                                System.out.println("Enter Quantity");
                                quantity = sc.nextDouble();
                                item.addItem(McChickenSandwichLargeFriesAndCoke,McChickenSandwichLargeFriesAndCoke.getItemName(),McChickenSandwichLargeFriesAndCoke.getItemPrice(),quantity);
                            }else if(orderSize.toUpperCase().equals("R")){
                                System.out.println("Enter Quantity");
                                quantity = sc.nextDouble();
                                item.addItem(McChickenSandwichRegularFriesAndCoke,McChickenSandwichRegularFriesAndCoke.getItemName(),McChickenSandwichRegularFriesAndCoke.getItemPrice(),quantity);
                            }
                            break;
                        case 5:
                            System.out.println("Regular or Large [R/L]");
                            orderSize = sc.next();
                            if(orderSize.toUpperCase().equals("L")){
                                System.out.println("Enter Quantity");
                                quantity = sc.nextDouble();
                                item.addItem(FilletOFishLargeFriesAndCoke,FilletOFishLargeFriesAndCoke.getItemName(),FilletOFishLargeFriesAndCoke.getItemPrice(),quantity);
                            }else if(orderSize.toUpperCase().equals("R")){
                                System.out.println("Enter Quantity");
                                quantity = sc.nextDouble();
                                item.addItem(FilletOFishRegularFriesAndCoke,FilletOFishRegularFriesAndCoke.getItemName(),FilletOFishRegularFriesAndCoke.getItemPrice(),quantity);
                            }
                            break;
                        case 6:
                            System.out.println("Regular or Large [R/L]");
                            orderSize = sc.next();
                            if(orderSize.toUpperCase().equals("L")){
                                System.out.println("Enter Quantity");
                                quantity = sc.nextDouble();
                                item.addItem(CheeseBurgerDeluxeLargeFriesAndCoke,CheeseBurgerDeluxeLargeFriesAndCoke.getItemName(),CheeseBurgerDeluxeLargeFriesAndCoke.getItemPrice(),quantity);
                            }else if(orderSize.toUpperCase().equals("R")){
                                System.out.println("Enter Quantity");
                                quantity = sc.nextDouble();
                                item.addItem(CheeseBurgerDeluxeRegularFriesAndCoke,CheeseBurgerDeluxeRegularFriesAndCoke.getItemName(),CheeseBurgerDeluxeRegularFriesAndCoke.getItemPrice(),quantity);
                            }
                            break;
                        case 7:
                            System.out.println("Regular or Large [R/L]");
                            orderSize = sc.next();
                            if(orderSize.toUpperCase().equals("L")){
                                System.out.println("Enter Quantity");
                                quantity = sc.nextDouble();
                                item.addItem(CheeseBurgerLargeFriesAndCoke,CheeseBurgerLargeFriesAndCoke.getItemName(),CheeseBurgerLargeFriesAndCoke.getItemPrice(),quantity);
                            }else if(orderSize.toUpperCase().equals("R")){
                                System.out.println("Enter Quantity");
                                quantity = sc.nextDouble();
                                item.addItem(CheeseBurgerRegularFriesAndCoke,CheeseBurgerRegularFriesAndCoke.getItemName(),CheeseBurgerRegularFriesAndCoke.getItemPrice(),quantity);
                            }
                            break;
                        case 8:
                            System.out.println("Regular or Large [R/L]");
                            orderSize = sc.next();
                            if(orderSize.toUpperCase().equals("L")){
                                System.out.println("Enter Quantity");
                                quantity = sc.nextDouble();
                                item.addItem(BurgerMcdoLargeFriesAndCoke,BurgerMcdoLargeFriesAndCoke.getItemName(),BurgerMcdoLargeFriesAndCoke.getItemPrice(),quantity);
                            }else if(orderSize.toUpperCase().equals("R")){
                                System.out.println("Enter Quantity");
                                quantity = sc.nextDouble();
                                item.addItem(BurgerMcdoRegularFriesAndCoke,BurgerMcdoRegularFriesAndCoke.getItemName(),BurgerMcdoRegularFriesAndCoke.getItemPrice(),quantity);
                            }
                            break;
                        case 9:
                            System.out.println("Regular or Large [R/L]");
                            orderSize = sc.next();
                            if(orderSize.toUpperCase().equals("L")){
                                System.out.println("Enter Quantity");
                                quantity = sc.nextDouble();
                                item.addItem(ChickenMcdo2WithRiceLargeCoke,ChickenMcdo2WithRiceLargeCoke.getItemName(),ChickenMcdo2WithRiceLargeCoke.getItemPrice(),quantity);
                            }else if(orderSize.toUpperCase().equals("R")){
                                System.out.println("Enter Quantity");
                                quantity = sc.nextDouble();
                                item.addItem(ChickenMcdo2WithRiceRegularCoke,ChickenMcdo2WithRiceRegularCoke.getItemName(),ChickenMcdo2WithRiceRegularCoke.getItemPrice(),quantity);
                            }
                            break;
                        case 10:
                            System.out.println("Regular or Large [R/L]");
                            orderSize = sc.next();
                            if(orderSize.toUpperCase().equals("L")){
                                System.out.println("Enter Quantity");
                                quantity = sc.nextDouble();
                                item.addItem(McNuggets6PcsLargeCoke,McNuggets6PcsLargeCoke.getItemName(),McNuggets6PcsLargeCoke.getItemPrice(),quantity);
                            }else if(orderSize.toUpperCase().equals("R")){
                                System.out.println("Enter Quantity");
                                quantity = sc.nextDouble();
                                item.addItem(McNuggets6PcsRegularCoke,McNuggets6PcsRegularCoke.getItemName(),McNuggets6PcsRegularCoke.getItemPrice(),quantity);
                            }
                            break;
                        case 11:
                            System.out.println("Regular or Large [R/L]");
                            orderSize = sc.next();
                            if(orderSize.toUpperCase().equals("L")){
                                System.out.println("Enter Quantity");
                                quantity = sc.nextDouble();
                                item.addItem(ChickenMcdo1WithRiceLargeCoke,ChickenMcdo1WithRiceLargeCoke.getItemName(),ChickenMcdo1WithRiceLargeCoke.getItemPrice(),quantity);
                            }else if(orderSize.toUpperCase().equals("R")){
                                System.out.println("Enter Quantity");
                                quantity = sc.nextDouble();
                                item.addItem(ChickenMcdo1WithRiceRegularCoke,ChickenMcdo1WithRiceRegularCoke.getItemName(),ChickenMcdo1WithRiceRegularCoke.getItemPrice(),quantity);
                            }
                            break;
                        case 12:
                            System.out.println("Regular or Large [R/L]");
                            orderSize = sc.next();
                            if(orderSize.toUpperCase().equals("L")){
                                System.out.println("Enter Quantity");
                                quantity = sc.nextDouble();
                                item.addItem(ChickenMcdo1WithMcSpaghettiLargeCoke,ChickenMcdo1WithMcSpaghettiLargeCoke.getItemName(),ChickenMcdo1WithMcSpaghettiLargeCoke.getItemPrice(),quantity);
                            }else if(orderSize.toUpperCase().equals("R")){
                                System.out.println("Enter Quantity");
                                quantity = sc.nextDouble();
                                item.addItem(ChickenMcdo1WithMcSpaghettiRegularCoke,ChickenMcdo1WithMcSpaghettiRegularCoke.getItemName(),ChickenMcdo1WithMcSpaghettiRegularCoke.getItemPrice(),quantity);
                            }
                            break;
                        case 13:
                            System.out.println("Regular or Large [R/L]");
                            orderSize = sc.next();
                            if(orderSize.toUpperCase().equals("L")){
                                System.out.println("Enter Quantity");
                                quantity = sc.nextDouble();
                                item.addItem(MushroomPepperSteak1LargeCoke,MushroomPepperSteak1LargeCoke.getItemName(),MushroomPepperSteak1LargeCoke.getItemPrice(),quantity);
                            }else if(orderSize.toUpperCase().equals("R")){
                                System.out.println("Enter Quantity");
                                quantity = sc.nextDouble();
                                item.addItem(MushroomPepperSteakRegularCoke,MushroomPepperSteakRegularCoke.getItemName(),MushroomPepperSteakRegularCoke.getItemPrice(),quantity);
                            }
                            break;
                        case 14:
                            System.out.println("Regular or Large [R/L]");
                            orderSize = sc.next();
                            if(orderSize.toUpperCase().equals("L")){
                                System.out.println("Enter Quantity");
                                quantity = sc.nextDouble();
                                item.addItem(CrispyChickenFilletWithRiceLargeCoke,CrispyChickenFilletWithRiceLargeCoke.getItemName(),CrispyChickenFilletWithRiceLargeCoke.getItemPrice(),quantity);
                            }else if(orderSize.toUpperCase().equals("R")){
                                System.out.println("Enter Quantity");
                                quantity = sc.nextDouble();
                                item.addItem(CrispyChickenFilletWithRiceRegularCoke,CrispyChickenFilletWithRiceRegularCoke.getItemName(),CrispyChickenFilletWithRiceRegularCoke.getItemPrice(),quantity);
                            }
                            break;
                        case 15:
                            System.out.println("Regular or Large [R/L]");
                            orderSize = sc.next();
                            if(orderSize.toUpperCase().equals("L")){
                                System.out.println("Enter Quantity");
                                quantity = sc.nextDouble();
                                item.addItem(ChickenFilletAlaKingWithRiceLargeCoke,ChickenFilletAlaKingWithRiceLargeCoke.getItemName(),ChickenFilletAlaKingWithRiceLargeCoke.getItemPrice(),quantity);
                            }else if(orderSize.toUpperCase().equals("R")){
                                System.out.println("Enter Quantity");
                                quantity = sc.nextDouble();
                                item.addItem(ChickenFilletAlaKingWithRiceRegularCoke,ChickenFilletAlaKingWithRiceRegularCoke.getItemName(),ChickenFilletAlaKingWithRiceRegularCoke.getItemPrice(),quantity);
                            }
                            break;
                            default:
                                System.out.println("Enter a valid code [1-15]");
                    }
                    moreOrder = true;

                }if(prompt.toUpperCase().equals("N")){
                    System.out.println("Do you want to confirm your order?");
                    String confirmation = sc.next();
                    if(confirmation.toUpperCase().equals("N")){                  
                    moreOrder = order.cancelOrder(moreOrder);
                    }if(confirmation.toUpperCase().equals("Y")){
                    System.out.println("Do you want to apply discount?");
                    String discount = sc.next();
                    if(discount.toUpperCase().equals("Y")){
                    item.printReceipt1();
                    break;
                    }if(discount.toUpperCase().equals("N")){
                    item.printReceipt2();
                    break;
                    }
                    }
                }

            }
                    
    }
}
