package java.lamda_expressions.multi_threading;

public class NextThread implements Runnable{
   private static  String name_;
    Thread t;
    String name;

    NextThread(String threadname){
        name = threadname;
        //create a new second thread
        t = new Thread(this,name);
        System.out.println("Child Thread: "+t);
    }


    //entry point for the second thread
    public void run() {
        try{
            for (int i=5;i>0;i--)
                System.out.println("Child thread: "+ i);
            Thread.sleep(500);
        }
        catch(InterruptedException e){
            System.out.println( name +" interrupted");
        }
        System.out.println(name +" exiting");
    }

}
