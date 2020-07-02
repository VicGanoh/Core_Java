package java.lamda_expressions.enumeration_;

public class TestMain {
    public static void main(String[] args) {
        Months clr,clr2;
       clr = Months.January;
       clr2 =Months.March;
       /*if (clr == clr2)
           System.out.println("Months are same");
       else
           System.out.println("Months are not the same.");
        */

       clr = Months.April;

       //using enumeration in a switch statement.
      /* switch (clr){
           case January:
               System.out.println("January.");
               break;
           case February:
               System.out.println("February.");
               break;
           case March:
               System.out.println("March.");
               break;
           case April:
               System.out.println("April.");
               break;
           case May:
               System.out.println("May.");
               break;
           case June:
               System.out.println("June.");
               break;
           case July:
               System.out.println("July.");
               break;
           case August:
               System.out.println("August.");
               break;
           case September:
               System.out.println("September.");
               break;
           case October:
               System.out.println("October.");
               break;
           case November:
               System.out.println("November.");
               break;
           case December:
               System.out.println("December.");
               break;
           default:
               System.out.println("Month not found.");
       }
       */

      //using built in enumeration methods

     /*  //using enhanced for loop to print out all enum values
        System.out.println("Months of the year with number of days: ");
        for(Months month: Months.values()){
            System.out.println(month + " has " + month.getNo_of_days() + " days.");
        }
        //use valueOf method
        clr = Months.valueOf("January");
        System.out.println("clr contains " + clr);
      */

     //check position of enums value in list
        System.out.println(Months.April + "'s postion: " + Months.April.ordinal());
    }
}
