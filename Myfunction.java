import java.util.Scanner;
public class Myfunction {
      String[] Saveinfo = new String[10];
      String[] Savepass = new String[10];

    //ذخیره ورودی از کاربر
    public  void Saveinfo(String info , String pass){
        Savepass[0] = pass;
        Saveinfo[0] = info;
  }
  //-------------------------------------------------------
  //جستوجو برای پیدا کردن ادمین و منو ادمین
    public void Serchadmon(String Savepass,String Saveinfo){
          if (Saveinfo == "admin" || Savepass == "admin"){
              Scanner keyboardInput = new Scanner(System.in);
              System.out.println("------------------------------------------------------- ADMIN MENUE OPTIONS -------------------------------------------------------");
              System.out.println("<1> Add");
              System.out.println("<2> Update");
              System.out.println("<3> Remove");
              System.out.println("<4> Flight schedules");
              System.out.println("<0> Sign out");
              int Number = keyboardInput.nextInt();
              switch (Number) {
                  case 1:
                      System.out.println("Enter your FLIGHTID");
                      Scanner Id = new Scanner(System.in);
                      Id.nextLine();
                      System.out.println("ORIGIN");
                      Scanner Origin = new Scanner(System.in);
                      Origin.nextLine();
                      System.out.println("DESTINATION");
                      Scanner Destination = new Scanner(System.in);
                      Destination.nextLine();
                      System.out.println("DATE");
                      Scanner Date = new Scanner(System.in);
                      Date.nextLine();
                      System.out.println("TIME");
                      Scanner Time = new Scanner(System.in);
                      Time.nextLine();
                      System.out.println("PRICE");
                      Scanner Price = new Scanner(System.in);
                      Price.nextLine();
                      System.out.println("SEATS");
                      Scanner Aeats = new Scanner(System.in);
                      Aeats.nextLine();
                      break;
                  case 2:
                      System.out.println("comig soon");
                      break;
                  case 3:
                      System.out.println("comig soon");
                      break;
                  case 4:
                      System.out.println("comig soon");
                      break;
                  case 0:

                      break;

              }

          }
          //منو کاربر
          else {
              Scanner keyboardInput = new Scanner(System.in);
              System.out.println("-------------------------------------------------------PASSENGER MENU OPTION-------------------------------------------------------");
              System.out.println("CHANGE PASSWORD");
              System.out.println("SEARCH FLIGHT TICKETS");
              System.out.println("BOOKING TICKET");
              System.out.println("TICKET CANCELLATION");
              System.out.println("BOOKED TICKETS");
              System.out.println("ADD CHARGE");
              System.out.println("SIGN OUT");
              int Number = keyboardInput.nextInt();
              switch (Number) {
                  case 1:
                      System.out.println("ENTER YOUR NEW PASSWORD");
                      Scanner NewPassword = new Scanner(System.in);
                      NewPassword.nextLine();
                      break;
                  case 2:
                      System.out.println("|WX_12\t"+"|YAZD\t"+"|TEHRAN\t"+"|1401_12_10\t"+"|12:30\t"+"|700,000\t"+"|51\t");
                      System.out.println("|WZ_15\t"+"|MASHHAD\t"+"|AHVAZ\t"+"|1401_12_11\t"+"|08:00\t"+"|900,000\t"+"|245\t");
                      System.out.println("|BG_22\t"+"|SHIRAZ\t"+"|TABRIZ\t"+"|1401_12_12\t"+"|22:30\t"+"|1,100,000\t"+"|12\t");
                      break;
                  case 3:
                      System.out.println("|WX_12\t"+"|YAZD\t"+"|TEHRAN\t"+"|1401_12_10\t"+"|12:30\t"+"|700,000\t"+"|51\t");
                      System.out.println("|WZ_15\t"+"|MASHHAD\t"+"|AHVAZ\t"+"|1401_12_11\t"+"|08:00\t"+"|900,000\t"+"|245\t");
                      System.out.println("|BG_22\t"+"|SHIRAZ\t"+"|TABRIZ\t"+"|1401_12_12\t"+"|22:30\t"+"|1,100,000\t"+"|12\t");
                      break;
                  case 4:
                      System.out.println("comig soon");
                      break;
                  case 5:
                      System.out.println("comig soon");
                      break;
                  case 6:
                      System.out.println("comig soon");
                      break;
                  case 7:
                      System.out.println("comig soon");
                      break;
                  case 8:
                      System.out.println("comig soon");
                      break;
                  case 0:
                      System.out.println("comig soon");
                      break;
              }
          }
  }
}
