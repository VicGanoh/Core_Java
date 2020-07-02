package java.lamda_expressions.enumeration_;
//enumerations of months of the year
public enum Months {
    January(30), February(28), March(31), April(30), May(31), June(30), July(30), August(30), September(30), October(31), November(30), December(31);

    private int no_of_days;
    Months(int days){
        no_of_days = days;
    }
    public int getNo_of_days(){
        return no_of_days;
    }

}
