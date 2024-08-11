import java.util.*;
public class RestaurantAndHotelManagement {
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize quantities
        int Qtabels = 0, Qpasta = 0, Qburger = 0, Qnoodles = 0, Qshake = 0, Qchicken = 0, Qpizza = 0, Qmomos = 0, Qcolddrinks = 0;
        int stabels = 0, spasta = 0, sburger = 0, snoodles = 0, sshake = 0, schicken = 0, spizza = 0, smomos = 0,scolddrinks = 0;
        int total_tabels = 0, total_pasta = 0, total_burger = 0, total_noodles = 0, total_shake = 0, total_chicken = 0, total_pizza = 0, total_momos = 0, total_colddrinks = 0;
        int total_stay = 0;
        //Gym Membership
         final int gym_price= 1000;
         int total_gymcost=0;
         

        // Room availability
        int singleAC = 0, doubleAC = 0, singleNonAC = 0, doubleNonAC = 0;
        int bookedSingleAC = 0, bookedDoubleAC = 0, bookedSingleNonAC = 0, bookedDoubleNonAC = 0;

        // Room prices
        final int PRICE_SINGLE_AC = 2000;
        final int PRICE_DOUBLE_AC = 3000;
        final int PRICE_SINGLE_NON_AC = 1000;
        final int PRICE_DOUBLE_NON_AC = 1500;

        // Input quantities
        System.out.println("\n\t       Quantity of items we have");
        System.out.print("Tables available: ");
        Qtabels = scanner.nextInt();
        System.out.print("Quantity of pasta: ");
        Qpasta = scanner.nextInt();
        System.out.print("Quantity of burger: ");
        Qburger = scanner.nextInt();
        System.out.print("Quantity of noodles: ");
        Qnoodles = scanner.nextInt();
        System.out.print("Quantity of shake: ");
        Qshake = scanner.nextInt();
        System.out.print("Quantity of chicken_roll: ");
        Qchicken = scanner.nextInt();
        System.out.print("Quantity of pizza: ");
        Qpizza = scanner.nextInt();
        System.out.print("Quantity of momos: ");
        Qmomos = scanner.nextInt();
        System.out.print("Quantity of cold_drinks ");
        Qcolddrinks = scanner.nextInt();

        // Input room availability
        System.out.println("\n\t       Quantity of rooms available");
        System.out.print("Single Bed A/C rooms: ");
        singleAC = scanner.nextInt();
        System.out.print("Double Bed A/C rooms: ");
        doubleAC = scanner.nextInt();
        System.out.print("Single Bed Non A/C rooms: ");
        singleNonAC = scanner.nextInt();
        System.out.print("Double Bed Non A/C rooms: ");
        doubleNonAC = scanner.nextInt();

        int choice;
        while (true) {
            System.out.println("\n\t\t\t Please select from the menu options");
            System.out.println("1) Book Room");
            System.out.println("2) Tables");
            System.out.println("3) Pasta");
            System.out.println("4) Burger");
            System.out.println("5) Noodles");
            System.out.println("6) Shake");
            System.out.println("7) Chicken");
            System.out.println("8) Pizza");
            System.out.println("9) Momos");
            System.out.println("10) Colddrinks");
            System.out.println("11) Gym Membership");
            System.out.println("12) Information regarding sales and collection");
            System.out.println("13) Exit");

            System.out.print("\nPlease enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: // Book Room
                    System.out.println("\nSelect room type:");
                    System.out.println("A. A/C");
                    System.out.println("B. Non A/C");
                    System.out.print("Your choice (A/B): ");
                    char roomType = scanner.next().charAt(0);
                    System.out.println("Select bed type:");
                    System.out.println("1. Single Bed");
                    System.out.println("2. Double Bed");
                    System.out.print("Your choice (1/2): ");
                    int bedType = scanner.nextInt();

                    int roomCost = 0;
                    if (roomType == 'A') {
                        if (bedType == 1) {
                            if (singleAC - bookedSingleAC > 0) {
                                bookedSingleAC++;
                                roomCost = PRICE_SINGLE_AC;
                            } else {
                                System.out.println("No Single Bed A/C rooms available.");
                                continue;
                            }
                        } else {
                            if (doubleAC - bookedDoubleAC > 0) {
                                bookedDoubleAC++;
                                roomCost = PRICE_DOUBLE_AC;
                            } else {
                                System.out.println("No Double Bed A/C rooms available.");
                                continue;
                            }
                        }
                    } else {
                        if (bedType == 1) {
                            if (singleNonAC - bookedSingleNonAC > 0) {
                                bookedSingleNonAC++;
                                roomCost = PRICE_SINGLE_NON_AC;
                            } else {
                                System.out.println("No Single Bed Non A/C rooms available.");
                                continue;
                            }
                        } else {
                            if (doubleNonAC - bookedDoubleNonAC > 0) {
                                bookedDoubleNonAC++;
                                roomCost = PRICE_DOUBLE_NON_AC;
                            } else {
                                System.out.println("No Double Bed Non A/C rooms available.");
                                continue;
                            }
                        }
                    }

                    System.out.print("Do you need food with your stay? (yes/no): ");
                    String needFood = scanner.next();
                    if (needFood.equalsIgnoreCase("yes")) {
                        System.out.println("\n\t\t\t Food Menu");
                        System.out.println("1) Tables");
                        System.out.println("2) Pasta");
                        System.out.println("3) Burger");
                        System.out.println("4) Noodles");
                        System.out.println("5) Shake");
                        System.out.println("6) Chicken");
                        System.out.println("7) Pizza");
                        System.out.println("8) Momos");
                        System.out.println("9) Colddrinks");
                        System.out.print("\nPlease enter your choice for food: ");
                        int foodChoice = scanner.nextInt();
                        int foodCost = 0;

                        switch (foodChoice) {
                            case 1:
                                System.out.print("\nEnter the number of tables you want: ");
                                int tablesQty = scanner.nextInt();
                                if (Qtabels - stabels >= tablesQty) {
                                    stabels += tablesQty;
                                    total_tabels += tablesQty * 1200;
                                    foodCost += tablesQty * 1200;
                                } else {
                                    System.out.println("Only " + (Qtabels - stabels) + " tables remaining.");
                                }
                                break;
                            case 2:
                                System.out.print("\nEnter the number of pasta you want: ");
                                int pastaQty = scanner.nextInt();
                                if (Qpasta - spasta >= pastaQty) {
                                    spasta += pastaQty;
                                    total_pasta += pastaQty * 250;
                                    foodCost += pastaQty * 250;
                                } else {
                                    System.out.println("Only " + (Qpasta - spasta) + " pasta remaining.");
                                }
                                break;
                            case 3:
                                System.out.print("\nEnter the number of burgers you want: ");
                                int burgerQty = scanner.nextInt();
                                if (Qburger - sburger >= burgerQty) {
                                    sburger += burgerQty;
                                    total_burger += burgerQty * 100;
                                    foodCost += burgerQty * 100;
                                } else {
                                    System.out.println("Only " + (Qburger - sburger) + " burgers remaining.");
                                }
                                break;
                            case 4:
                                System.out.print("\nEnter the number of noodles you want: ");
                                int noodlesQty = scanner.nextInt();
                                if (Qnoodles - snoodles >= noodlesQty) {
                                    snoodles += noodlesQty;
                                    total_noodles += noodlesQty * 150;
                                    foodCost += noodlesQty * 150;
                                } else {
                                    System.out.println("Only " + (Qnoodles - snoodles) + " noodles remaining.");
                                }
                                break;
                            case 5:
                                System.out.print("\nEnter the number of shakes you want: ");
                                int shakeQty = scanner.nextInt();
                                if (Qshake - sshake >= shakeQty) {
                                    sshake += shakeQty;
                                    total_shake += shakeQty * 300;
                                    foodCost += shakeQty * 300;
                                } else {
                                    System.out.println("Only " + (Qshake - sshake) + " shakes remaining.");
                                }
                                break;
                            case 6:
                                System.out.print("\nEnter the number of chicken rolls you want: ");
                                int chickenQty = scanner.nextInt();
                                if (Qchicken - schicken >= chickenQty) {
                                    schicken += chickenQty;
                                    total_chicken += chickenQty * 40;
                                    foodCost += chickenQty * 40;
                                } else {
                                    System.out.println("Only " + (Qchicken - schicken) + " chicken rolls remaining.");
                                }
                                break;
                                case 7:
                                System.out.print("\nEnter the number of Pizza's you want: ");
                                int pizzaQty = scanner.nextInt();
                                if (Qpizza - spizza >= pizzaQty) {
                                    spizza += pizzaQty;
                                    total_pizza += pizzaQty * 200;
                                    foodCost += pizzaQty * 200;
                                } else {
                                    System.out.println("Only " + (Qpizza - spizza) + " Pizza's remaining.");
                                }
                                break;
                                case 8:
                                System.out.print("\nEnter the number of Momos you want: ");
                                int momosQty = scanner.nextInt();
                                if (Qmomos - smomos >= momosQty) {
                                    smomos += momosQty;
                                    total_momos += momosQty * 40;
                                    foodCost += momosQty * 40;
                                } else {
                                    System.out.println("Only " + (Qmomos - smomos) + " Momos remaining.");
                                }
                                break;
                                case 9:
                                System.out.print("\nEnter the number of Cold Drinks you want: ");
                                int colddrinksQty = scanner.nextInt();
                                if (Qcolddrinks - scolddrinks >= colddrinksQty) {
                                    scolddrinks += colddrinksQty;
                                    total_colddrinks += colddrinksQty * 30;
                                    foodCost += colddrinksQty * 30;
                                } else {
                                    System.out.println("Only " + (Qcolddrinks - scolddrinks) + " Cold Drinks remaining.");
                                }
                                break;
                            default:
                                System.out.println("Invalid food choice.");
                        }
                        total_stay += roomCost + foodCost;
                        System.out.println("Total cost (room + food): " + (roomCost + foodCost));
                    } else {
                        total_stay += roomCost;
                        System.out.println("Total cost for the stay: " + roomCost);
                    }
                    break;

                case 2: // Tables
                    System.out.print("\nEnter the number of tables you want: ");
                    int tablesQty = scanner.nextInt();
                    if (Qtabels - stabels >= tablesQty) {
                        stabels += tablesQty;
                        total_tabels += tablesQty * 1200;
                        System.out.println("\n\t" + tablesQty + " table(s) have been allotted to you");
                    } else {
                        System.out.println("Only " + (Qtabels - stabels) + " tables remaining.");
                    }
                     break;

                case 3: // Pasta
                    System.out.print("\nEnter the number of pasta you want: ");
                    int pastaQty = scanner.nextInt();
                    if (Qpasta - spasta >= pastaQty) {
                        spasta += pastaQty;
                        total_pasta += pastaQty * 250;
                        System.out.println("\n\t" + pastaQty + " pasta(s) is/are ordered");
                    } else {
                        System.out.println("Only " + (Qpasta - spasta) + " pasta remaining.");
                    }
                    break;

                case 4: // Burger
                    System.out.print("\nEnter the number of burgers you want: ");
                    int burgerQty = scanner.nextInt();
                    if (Qburger - sburger >= burgerQty) {
                        sburger += burgerQty;
                        total_burger += burgerQty * 100;
                        System.out.println("\n\t" + burgerQty + " burger(s) is/are ordered");
                    } else {
                        System.out.println("Only " + (Qburger - sburger) + " burgers remaining.");
                    }
                     break;

                case 5: // Noodles
                    System.out.print("\nEnter the number of noodles you want: ");
                    int noodlesQty = scanner.nextInt();
                    if (Qnoodles - snoodles >= noodlesQty) {
                        snoodles += noodlesQty;
                        total_noodles += noodlesQty * 150;
                        System.out.println("\n\t" + noodlesQty + " noodle(s) is/are ordered");
                    } else {
                        System.out.println("Only " + (Qnoodles - snoodles) + " noodles remaining.");
                    }
                     break;

                case 6: // Shake
                    System.out.print("\nEnter the number of shakes you want: ");
                    int shakeQty = scanner.nextInt();
                    if (Qshake - sshake >= shakeQty) {
                        sshake += shakeQty;
                        total_shake += shakeQty * 300;
                        System.out.println("\n\t" + shakeQty + " shake(s) is/are ordered");
                    } else {
                        System.out.println("Only " + (Qshake - sshake) + " shakes remaining.");
                    }
                    break;

                case 7: // Chicken
                    System.out.print("\nEnter the number of chicken rolls you want: ");
                    int chickenQty = scanner.nextInt();
                    if (Qchicken - schicken >= chickenQty) {
                        schicken += chickenQty;
                        total_chicken += chickenQty * 40;
                        System.out.println("\n\t" + chickenQty + " chicken roll(s) is/are ordered");
                    } else {
                        System.out.println("Only " + (Qchicken - schicken) + " chicken rolls remaining.");
                    }
                     break;
                     case 8: // Pizza
                    System.out.print("\nEnter the number of Pizza's you want: ");
                    int pizzaQty = scanner.nextInt();
                    if (Qpizza - spizza >= pizzaQty) {
                        spizza += pizzaQty;
                        total_pizza += pizzaQty * 40;
                        System.out.println("\n\t" + pizzaQty + " Pizza(s) is/are ordered");
                    } else {
                        System.out.println("Only " + (Qpizza - spizza) + " Pizza's remaining.");
                    }
                     break;
                     case 9: // Momos
                    System.out.print("\nEnter the number of Momos you want: ");
                    int momosQty = scanner.nextInt();
                    if (Qmomos - smomos >= momosQty) {
                        smomos += momosQty;
                        total_momos += momosQty * 40;
                        System.out.println("\n\t" + momosQty + " Momos(s) is/are ordered");
                    } else {
                        System.out.println("Only " + (Qmomos - smomos) + " Momos remaining.");
                    }
                     break;
                     case 10: // Colddrinks
                    System.out.print("\nEnter the number of Cold Drinks you want: ");
                    int colddrinksQty = scanner.nextInt();
                    if (Qcolddrinks - scolddrinks >= colddrinksQty) {
                        scolddrinks += colddrinksQty;
                        total_colddrinks += colddrinksQty * 40;
                        System.out.println("\n\t" + colddrinksQty + " Cold Drink(s) is/are ordered");
                    } else {
                        System.out.println("Only " + (Qcolddrinks - scolddrinks) + " Cold Drinks remaining.");
                    }
                     break;
                     case 11: // Gym Membership
                     System.out.print("\nEnter the number of months you want to buy gym membership: ");
                     int gym_months = scanner.nextInt();
                     if (gym_months>0) {
                        total_gymcost= gym_price * gym_months;
                        System.out.println("Total Gym cost:"+total_gymcost);
                         System.out.println("\n\t" + "You are now a Gym Member for"+" "+gym_months+" "+"months.");}break;

                case 12: // Information
                    System.out.println("\n\tDetails of the sales and collection");
                    System.out.println("\nNumber of tables we had: " + Qtabels);
                    System.out.println("Number of tables we gave for rent: " + stabels);
                    System.out.println("Remaining tables: " + (Qtabels - stabels));
                    System.out.println("Total collection for tables: " + total_tabels);

                    System.out.println("\nNumber of pasta we had: " + Qpasta);
                    System.out.println("Number of pasta we gave: " + spasta);
                    System.out.println("Remaining pasta: " + (Qpasta - spasta));
                    System.out.println("Total collection for pasta: " + total_pasta);

                    System.out.println("\nNumber of burgers we had: " + Qburger);
                    System.out.println("Number of burgers we gave: " + sburger);
                    System.out.println("Remaining burgers: " + (Qburger - sburger));
                    System.out.println("Total collection for burgers: " + total_burger);

                    System.out.println("\nNumber of noodles we had: " + Qnoodles);
                    System.out.println("Number of noodles we gave: " + snoodles);
                    System.out.println("Remaining noodles: " + (Qnoodles - snoodles));
                    System.out.println("Total collection for noodles: " + total_noodles);

                    System.out.println("\nNumber of shakes we had: " + Qshake);
                    System.out.println("Number of shakes we gave: " + sshake);
                    System.out.println("Remaining shakes: " + (Qshake - sshake));
                    System.out.println("Total collection for shakes: " + total_shake);

                    System.out.println("\nNumber of chicken rolls we had: " + Qchicken);
                    System.out.println("Number of chicken rolls we gave: " + schicken);
                    System.out.println("Remaining chicken rolls: " + (Qchicken - schicken));
                    System.out.println("Total collection for chicken rolls: " + total_chicken);

                    System.out.println("\nNumber of Pizza's we had: " + Qpizza);
                    System.out.println("Number of Pizza's we gave: " + spizza);
                    System.out.println("Remaining Pizza's: " + (Qpizza - spizza));
                    System.out.println("Total collection for Pizza's: " + total_pizza);

                    System.out.println("\nNumber of Momos we had: " + Qmomos);
                    System.out.println("Number of Momos we gave: " + smomos);
                    System.out.println("Remaining Momos: " + (Qmomos - smomos));
                    System.out.println("Total collection for Momos: " + total_momos);

                    System.out.println("\nNumber of Cold Drinks we had: " + Qcolddrinks);
                    System.out.println("Number of Cold Drinks we gave: " + scolddrinks);
                    System.out.println("Remaining Cold Drinks: " + (Qcolddrinks - scolddrinks));
                    System.out.println("Total collection for Cold Drinks: " + total_colddrinks);

                    System.out.println("Total collection for Gym:"+total_gymcost);

                    System.out.println("\nTotal collection for the day: " +
                            (total_tabels + total_pasta + total_burger + total_noodles + total_shake + total_chicken + total_pizza + total_momos + total_colddrinks + total_stay + total_gymcost));
                     break;

                case 13: // Exit
                    System.out.println("Exiting...");
                    System.out.println("Total Stay:"+total_stay);
                    scanner.close();
                    return;

                default:
                    System.out.println("Please select a valid number from the menu.");
            }
        }
    }
}