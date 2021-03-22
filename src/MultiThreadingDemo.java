class MultiThread extends Thread{
    public void run(){
        int n=5;
        for(int i=0;i<n;i++)
        try {
            Thread.sleep(3000);
                System.out.println("Thread " + Thread.currentThread().getId());
        } catch (Exception e){
                System.out.println("Exception is caught");
        }
    }
}

public class MultiThreadingDemo {
    public static void main(String args[]){
            MultiThread mt=new MultiThread();
            mt.start();
        }
    }

