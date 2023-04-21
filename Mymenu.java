import java.util.Scanner;
public class Mymenu {
    private String Fname;
    private String Password;

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }


    //-------------------------------------------------------------------------------------
    /*
        منو ورود کار بر که با انتخاب ان وارد اپشن های ان میشود
     */
    public void Menu1() {
        while (true) {
            Scanner keyboardInput = new Scanner(System.in);
            System.out.println("-------------------------------------------------------Please SIGN IN-------------------------------------------------------");
            System.out.println("<1> to sign in");
            System.out.println("<2> to sign up");
            int Sinin = keyboardInput.nextInt();
            switch (Sinin) {
                case 1:
                    Mymenu signin = new Mymenu();
                    Myfunction Serch = new Myfunction();
                    System.out.println("Your Fname is: ");
                    Scanner input = new Scanner(System.in);
                    signin.setFname(input.nextLine());
                    System.out.println(" Enter Your Password : ");
                    Scanner input1 = new Scanner(System.in);
                    signin.setPassword(input1.nextLine());
                    System.out.println("HI\t" + signin.getFname());
                    Serch.Serchadmon(signin.getPassword(), signin.getFname());

                    break;
                case 2:
                    Mymenu signup = new Mymenu();
                    Myfunction user = new Myfunction();
                    System.out.println("Your Fname is: ");
                    Scanner input2 = new Scanner(System.in);
                    signup.setFname(input2.nextLine());
                    System.out.println(" Enter Your Password : ");
                    Scanner input3 = new Scanner(System.in);
                    signup.setPassword(input3.nextLine());
                    user.Saveinfo(signup.getFname(), signup.getPassword());

                    break;
            }
            keyboardInput.close();
        }

    }
}
