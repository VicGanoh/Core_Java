package java.lamda_expressions.multi_threading;

public class ThreadMain {
    public static void main(String[] args){
      /*  Thread t = Thread.currentThread();
        System.out.println("current thread: "+ t);
        //change name of thread
        t.setName("My Thread");
        System.out.println("New thread name: "+t);
       try {
           for (int i = 5; i > 0; i--)
               System.out.println(i);
           Thread.sleep(1000);
       }catch(InterruptedException e){
           System.out.println("Main thread Interrupted");
       }
        System.out.println("Exiting main");
       */

      //creating multiple threads
      NextThread nt = new NextThread("One"); //create a new thread and applying the factory method
      NextThread nt1 = new NextThread("Two");
      NextThread nt2 = new NextThread("Three");

        nt.t.start();//start new thread
        nt1.t.start();
        nt2.t.start();

        System.out.println("Thread One ALive: "+ nt.t.isAlive());
        System.out.println("Thread Two ALive: "+ nt1.t.isAlive());
        System.out.println("Thread Three ALive: "+ nt2.t.isAlive());

        //wait for threads to finish
        try{
            System.out.println("Waiting for threads to finish");
            nt.t.join();
            nt1.t.join();
            nt2.t.join();
           /* for (int i=5;i>0;i--)
                System.out.println("Main Thread: "+ i);
            Thread.sleep(1000);
            */
        }
        catch(InterruptedException e){
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Thread One ALive: "+ nt.t.isAlive());
        System.out.println("Thread two ALive: "+ nt2.t.isAlive());
        System.out.println("Thread three ALive: "+ nt.t.isAlive());
        System.out.println("Main thread exiting.");
    }
}
