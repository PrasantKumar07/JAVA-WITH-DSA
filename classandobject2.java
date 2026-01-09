

/*public class classandobject2 {

    public static void main(String[] args) {
        Pen p1 = new Pen(); // creating object of Pen class
        p1.color = "blue";
        p1.tip = 5;
        System.out.println(p1.color);
        System.out.println(p1.tip);

        p1.setcolor("yellow");
        p1.setTip(8);
        System.out.println(p1.color);
        System.out.println(p1.tip);
    }






}



class Pen {
        String  color;
        int tip;

        void setcolor(String newcolor){ // this is setter method
            color = newcolor;
        }

        void setTip(int newtip){ // this is setter method
            tip = newtip;
        }
}  
*/

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class BankAccount {
   public String username;
   private String password;
    public void setPassword(String newPassword) {
         password = newPassword;
    }

    
}

public class classandobject2 {

    public static void main(String[] args) {
        Pen p1 = new Pen();

        p1.color = "blue";
        p1.tip = 5;
        System.out.println(p1.color);
        System.out.println(p1.tip);

        p1.setColor("yellow");
        p1.setTip(8);
        System.out.println(p1.color);
        System.out.println(p1.tip);

        BankAccount myAccount = new BankAccount();
        myAccount.username = "user123";
       // myAccount.password = "pass123"; // This line would cause an error because password
        myAccount.setPassword("newpass456"); // This line would also cause an error
    }
}
