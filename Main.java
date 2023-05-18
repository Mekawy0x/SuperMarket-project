import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Scanner input1 = new Scanner(System.in);
    System.out.println("Enter your choose");
    // array list of objects from classes
    ArrayList<Staff> staffs = new ArrayList();
    ArrayList<Client> clients = new ArrayList();
    ArrayList<Category> categories = new ArrayList();
    ArrayList<Product> products = new ArrayList();
    ArrayList<Product> soldproducts = new ArrayList();
    ArrayList<Invoice> buys = new ArrayList();

    inventory Inventory = new inventory();

    categories.add(new Category("Milk"));
    categories.add(new Category("Fruits and Vegetables"));
    categories.add(new Category("Drinks"));
    categories.add(new Category("Chipsy"));
    categories.add(new Category("Chocolate"));

    Inventory.setcategorys(categories);

    categories.get(0).getproducts()
        .add(new Product("01", "El Mara3i", categories.get(0).getCategory(), 20, 25, "1-1-2025", 20, 0));
    categories.get(0).getproducts()
        .add(new Product("02", "Juhaina", categories.get(0).getCategory(), 25, 30, "1-1-2025", 20, 0));
    categories.get(0).getproducts()
        .add(new Product("03", "Bekhero", categories.get(0).getCategory(), 21, 26, "1-1-2025", 20, 0));
    categories.get(1).getproducts()
        .add(new Product("01", "Apple", categories.get(1).getCategory(), 9, 10, "1-1-2025", 20, 0));
    categories.get(1).getproducts()
        .add(new Product("02", "Mango", categories.get(1).getCategory(), 10, 15, "1-1-2025", 20, 0));
    categories.get(1).getproducts()
        .add(new Product("03", "Kaka", categories.get(1).getCategory(), 7, 10, "1-1-2025", 20, 0));
    categories.get(2).getproducts()
        .add(new Product("01", "Pepsi", categories.get(2).getCategory(), 5, 8, "1-1-2025", 20, 0));
    categories.get(2).getproducts()
        .add(new Product("02", "Coca", categories.get(2).getCategory(), 5, 8, "1-1-2025", 20, 0));
    categories.get(2).getproducts()
        .add(new Product("03", "7 Up", categories.get(2).getCategory(), 5, 8, "1-1-2025", 20, 0));
    categories.get(3).getproducts()
        .add(new Product("01", "Chipsy", categories.get(3).getCategory(), 3, 7, "1-1-2025", 20, 0));
    categories.get(3).getproducts()
        .add(new Product("02", "Tiger", categories.get(3).getCategory(), 5, 7, "1-1-2025", 20, 0));
    categories.get(3).getproducts()
        .add(new Product("03", "Bravo", categories.get(3).getCategory(), 4, 7, "1-1-2025", 20, 0));
    categories.get(4).getproducts()
        .add(new Product("01", "Galaxy", categories.get(4).getCategory(), 10, 15, "1-1-2025", 20, 0));
    categories.get(4).getproducts()
        .add(new Product("02", "Kitkat", categories.get(4).getCategory(), 10, 15, "1-1-2025", 20, 0));
    categories.get(4).getproducts()
        .add(new Product("03", "Moro", categories.get(4).getCategory(), 10, 15, "1-1-2025", 20, 0));
    // for(int i=0; i<categories.size();i++){
    // for(int j=0;j<categories.get(i).getproducts().size();j++){
    // System.out.println(categories.get(i).getproducts().get(j).toString());
    // }
    // }

    // System.out.println(categories.get(0).toString());
    // clients.add(new Client("yasser", "01142803764", "2206201", 42, "fouad",
    // "Alex", "55"));
    // clients.get(0).getBuy().add(new Invoice("2003",
    // categories.get(0).getproducts(), 0));
    // clients.get(0).getBuy().get(0).calc_initial_price();
    // clients.get(0).getBuy().get(0).calc_final_price(5);
    // clients.get(0).getBuy().get(0).printInvoice();

    // variables for switch
    // for second switch [login and regisrty]
    char choose1;
    // for first switch [ staff system, client system, cashier system]
    String Choose;
    // to check password and username
    boolean flag = false;
    // to return for previous page
    char returngo = '\u0000';
    // choose2 for choose categorys
    String choose2;

    // do while for first switch
    do {

      System.out.println("M.Staff system management");
      System.out.println("N.Client system management");
      System.out.println("O.Cashier system management");
      System.out.println("E.to out");

      Choose = input.next();
      // this for choosing staff system
      switch (Choose.toLowerCase()) {

        case "m":
          // do for second switch
          do {
            System.out.println("Enter your choose");
            System.out.println("a.Registry");
            System.out.println("b.Login");
            System.out.println("e.to return");

            choose1 = input.next().charAt(0);
            switch (choose1) {
              // this for choosing registry
              case 'a':
                System.out.println(
                    "Enter staff name ,Enter staff address, Enter staff phone, Enter staff id, Enter staff age, Enter staff salary, Enter satff Bonus, Enter privatecard staff username, Enter privatecard staff password, Enter staff pointofsale");
                // Staff s = ;
                input.nextLine();
                staffs.add(new Staff(input.nextLine(), input.nextLine(), input.next(), input.next(), input.nextInt(),
                    input.nextDouble(), input.nextDouble(), new PrivateCard(input.next(), input.next(), input.next())));

                break;
              // this for choosing login
              case 'b':
                // this for login to your account
                do {
                  System.out.println("Enter your username");
                  String username = input.next();

                  // this check if you have account or not

                  if (staffs.size() == 0) {
                    System.out.println("You don't register");
                    System.out.println("e.to return back");
                    returngo = input.next().charAt(0);
                  }
                  // this check if username matchs the input username
                  else {
                    for (int i = 0; i < staffs.size(); i++) {
                      // if true

                      if (staffs.get(i).PC.getUsername().equalsIgnoreCase(username)) {
                        // enter password of this username

                        System.out.println("Enter your password");
                        String password = input.next();

                        // check password of this user matchs the input password
                        // if true
                        if (staffs.get(i).PC.getCode().equals(password)) {
                          System.out.println("Login Success");
                          flag = true;
                          System.out.println("e.to return back");
                          returngo = input.next().charAt(0);
                          // break to exit from for
                          break;
                        }
                        // if false

                        else {
                          boolean check = true;

                          System.out.println("Wrong pass try another one");

                          // to enter password again

                          while (check)
                          // check : if he enterd pass true check if is false or not
                          {
                            System.out.println("Enter your password");
                            password = input.next();

                            // check if password matchs or not

                            if (staffs.get(i).PC.getCode().equals(password)) {
                              System.out.println("Login Success");
                              flag = true;
                              check = false;
                            }

                          } // exit while for check
                          System.out.println("Enter e to out");
                          returngo = input.next().charAt(0);

                        }
                        break;
                        // to exit from for loop

                      }

                      // if username doesn't match
                      else {
                        // this check that the all objects in array list don't have the input username
                        if (i == staffs.size() - 1) {

                          System.out.println("username is incorrect");

                          System.out.println("e.to return back");
                          returngo = input.next().charAt(0);
                        } // if of staff.size-1

                      } // else : if of staff.size-1

                    } // exit of for loop
                  } // exit of else that check username found or not

                  // exit do while for login
                } while (flag == false || returngo != 'e');

            }// exit switch(choose 1)
          } while (choose1 != 'e');// exit for [login and regisrty]
          // for client system
          break;// exit form case M
        // for [login and register to client]

        case "n":

          do {

            System.out.println("Enter your choose");
            System.out.println("a.Registry");
            System.out.println("b.Login");
            System.out.println("e.to return");

            choose1 = input.next().charAt(0);
            // switch for [login and registry]
            switch (choose1) {
              // for register new client
              case 'a':
                System.out.println(
                    "Enter client name , Enter client phone, Enter client id, Enter client age, Enter your street, Enter your town, Enter your home number");

                input.nextLine();
                clients.add(new Client(input.nextLine(), input.next(), input.next(), input.nextInt(), input.next(),
                    input.next(), input.next()));
                // exit from switch choose1 a

                break;

              // for login client

              case 'b':
                // for enter username of client
                do {
                  System.out.println("Enter your name");
                  String name = input.next();

                  // check if you have username of clients or not

                  if (clients.size() == 0) {
                    System.out.println("You don't register");
                    System.out.println("e.to return back");
                    returngo = input.next().charAt(0);
                    break;
                  } // exit check if you have username of clients or not
                  // if he registered before
                  else {
                    // loop to check username in array list

                    for (int i = 0; i < clients.size(); i++) {
                      // check username matchs input username
                      if (clients.get(i).Name.equalsIgnoreCase(name)) {

                        System.out.println("Enter your ID");
                        String id = input.next();
                        // check password matchs input password
                        if (clients.get(i).Id.equalsIgnoreCase(id)) {
                          System.out.println("Login Success");
                          flag = true;
                          // System.out.println("e.to return back");
                          // returngo = input.next().charAt(0);
                          // exit from for loop
                          
                        } // exit if to check password

                        // username matchs but password not match
                        else {
                          boolean check = true;
                          System.out.println("Wrong id try another one");

                          // iterator to enter password if password not true
                          while (check)

                          {
                            System.out.println("Enter your ID");
                            id = input.next();
                            // check new password enterd matchs the password in arraylist
                            if (clients.get(i).Id.equalsIgnoreCase(id)) {
                              System.out.println("Login Success");
                              flag = true;
                              check = false;
                            } // exit check new password enterd matchs the password in arraylist

                          } // exit iterator to enter password if password not true

                        } // exit username matchs but password not match

                        //switch 
                        do{ 
                      System.out.println("Enter Your Choose");
                      System.out.println("0.Milk");
                      System.out.println("1.fruits and vegetables");
                      System.out.println("2.Drinkes");
                      System.out.println("3.chips");
                      System.out.println("4.chocolate");
                      //choose2 for switch category
                      choose2 = input.next();

                      switch(choose2.toLowerCase()){
                        //choose cat1 
                         
                        case "0":
                       do{
                        System.out.println(categories.get(0).toString());  
                         //switch product on case 0
                       
                         String milk = input.next();

                         switch(milk){
                          
                          case "0":
                          soldproducts.add(new Product("El Mara3i", 25, input.nextInt()));
                          break;

                          case "1":
                          soldproducts.add(new Product("Juhaina",30 , input.nextInt()));
                          break;

                          case "2":
                          soldproducts.add(new Product("Bekhero",26 , input.nextInt()));
                          break;
                        
                         }//exit switch milk}while();
                         System.out.println("enter v to choose another product from milk");
                        }while(input.next().charAt(0)=='v');
                        break;
                      
                         case "1":
                         do{ 
                        System.out.println(categories.get(1).toString());  
                         //switch product on case 0
                         String fv = input.next();

                         switch(fv){
                          
                          case "0":
                          soldproducts.add(new Product("Apple", 10, input.nextInt()));
                          break;

                          case "1":
                          soldproducts.add(new Product("Mango",15 , input.nextInt()));
                          break;

                          case "2":
                          soldproducts.add(new Product("Kaka",10 , input.nextInt()));
                          break;
                         }//exit switch fv
                         System.out.println("enter v to choose another product from fruite and vegetables");
                        }while(input.next().charAt(0)=='v');
                         break;// break fv

                         case "2":
                         do{ 
                        System.out.println(categories.get(2).toString());  
                         //switch product on case 0
                         String drink = input.next();

                         switch(drink){
                          
                          case "0":
                          soldproducts.add(new Product("Pepsi", 8, input.nextInt()));
                          break;

                          case "1":
                          soldproducts.add(new Product("Coca",8 , input.nextInt()));
                          break;

                          case "2":
                          soldproducts.add(new Product("7 Up",8 , input.nextInt()));
                          break;
                         }//exit switch drinkes
                         System.out.println("enter v to choose another product from drinks");
                        }while(input.next().charAt(0)=='v');
                         break;//break drinkes

                         case "3":
                         do{ 
                        System.out.println(categories.get(0).toString());  
                         //switch product on case 0
                         String chips = input.next();

                         switch(chips){
                          
                          case "0":
                          soldproducts.add(new Product("Chipsy", 7, input.nextInt()));
                          break;

                          case "1":
                          soldproducts.add(new Product("Tiger",7 , input.nextInt()));
                          break;

                          case "2":
                          soldproducts.add(new Product("Bravo",7 , input.nextInt()));
                          break;
                         }//exit switch chips
                         System.out.println("enter v to choose another product from chips");
                        }while(input.next().charAt(0)=='v');
                         break;// break chips

                         case "4":
                         do{ 
                        System.out.println(categories.get(0).toString());  
                         //switch product on case 0
                         String chocolate = input.next();

                         switch(chocolate){
                          
                          case "0":
                          soldproducts.add(new Product("Galaxy", 15, input.nextInt()));
                          break;

                          case "1":
                          soldproducts.add(new Product("Kitkat",15 , input.nextInt()));
                          break;

                          case "2":
                          soldproducts.add(new Product("Moro",15 , input.nextInt()));
                        
                          break;
                        
                         }//exit switch chocolate
                         System.out.println("enter v to choose another product from chocolate");
                        }while(input.next().charAt(0)=='v');
                         break;// break chocolate
                        
                         
                      }//exit switch choose 2
                      System.out.println("enter c to choose another items if no enter another letter");
                    }while(input.next().charAt(0)=='c');//from catigors
                      clients.get(i).addInvoice(new Invoice(soldproducts));
                      clients.get(i).getBuys().get(i).printInvoice();


                      System.out.println("Enter e to out");
                          returngo = input.next().charAt(0);
                          
                      } // exit check username matchs input username

                      // when username not found in array list
                      else {

                        if (i == clients.size() - 1) {
                          System.out.println("name is incorrect");
                          // flag = false;

                          System.out.println("e.to return back");
                          returngo = input.next().charAt(0);
                        } // exit i = staffsize

                      } // exit when username not found in array list

                    } // قفلة ال for loop

                  } // exit if he registered before

                } while (flag == false || returngo != 'e');// exit for enter username of client

            }// exit switch for [login and registry]
          } while (choose1 != 'e');// exit for [login and register to client]
          break;// exit this for choosing client system

        case "O":
          System.out.println("Exit");
          // dispose();

      }// exit this for choosing type system

    } while (!Choose.equals("E"));// exit do while for first switch

  }// exit main
}// exit class

