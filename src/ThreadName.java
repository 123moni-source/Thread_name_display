//Create two threads and assign names ‘Scooby’ and ‘Shaggy’ to the two threads. Display both thread names.
public class ThreadName {
    public static void main(String[] args) {
        Thread m1=new Thread("Scoopy")
        {
            public void run()
            {
                System.out.println(Thread.currentThread().getName());
            }
        };
        Thread m2=new Thread("Shaggy")
        {
            public void run()
            {
                System.out.println(Thread.currentThread().getName());
            }
        };
        m1.start();
        m2.start();
    }

}
