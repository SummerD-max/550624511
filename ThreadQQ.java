

import java.util.Scanner;

class HelloWorld {
    private int n;
    private static int cnt = 0;
    public HelloWorld( int n){
        this.n = n;
    }
    public synchronized void hello() throws InterruptedException{
        while(cnt!=n){
            System.out.print("Hello");
            notify();
            wait();
        }
    }

    public synchronized void world() throws InterruptedException{
        while (cnt!=n){
            cnt++;
            System.out.println("World!");
            notify();
            wait();
        }

    }

}

class PrintWorld implements Runnable{
    HelloWorld helloWorld;
    public PrintWorld(HelloWorld helloWorld){
        this.helloWorld = helloWorld;
    }
    @Override
    public void run(){
        try {
            helloWorld.world();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class PrintHello implements Runnable {
    HelloWorld helloWorld;
    public PrintHello(HelloWorld helloWorld){
        this.helloWorld = helloWorld;
    }
    @Override
    public void run() {
        try {
            helloWorld.hello();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ThreadQQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HelloWorld helloWorld = new HelloWorld(n);
        PrintHello printHello = new PrintHello(helloWorld);
        PrintWorld printWorld = new PrintWorld(helloWorld);
        new Thread(printHello).start();
        new Thread(printWorld).start();
    }
}

