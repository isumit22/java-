class A {
    synchronized void printName(String name) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread implements Runnable {
    A obj;
    String name;

    MyThread(A obj, String name) {
        this.obj = obj;
        this.name = name;
    }

    public void run() {
        obj.printName(name);
    }
}

public class syn {
    public static void main(String[] args) {
        A obj = new A();

        MyThread mt1 = new MyThread(obj, "A");
        MyThread mt2 = new MyThread(obj, "B");

        Thread t1 = new Thread(mt1);
        Thread t2 = new Thread(mt2);

        t1.start();
        t2.start();
    }
}

