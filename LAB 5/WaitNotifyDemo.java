// Program 7: Using wait() and notify()
class SharedData {
    private int data;
    private boolean available = false;

    synchronized void put(int value) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Producer interrupted");
            }
        }
        data = value;
        available = true;
        System.out.println("Produced: " + value);
        notify(); 
    }

    synchronized int get() {
        while (!available) { 
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Consumer interrupted");
            }
        }
        available = false;
        System.out.println("Consumed: " + data);
        notify();
        return data;
    }
}

class Producer implements Runnable {
    SharedData sd;
    Producer(SharedData s) {
        sd = s;
        new Thread(this, "Producer").start();
    }
    public void run() {
        int i = 1;
        while (i <= 5) {
            sd.put(i++);
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}

class Consumer implements Runnable {
    SharedData sd;
    Consumer(SharedData s) {
        sd = s;
        new Thread(this, "Consumer").start();
    }
    public void run() {
        int i = 1;
        while (i <= 5) {
            sd.get();
            try { Thread.sleep(500); } catch (Exception e) {}
            i++;
        }
    }
}

class WaitNotifyDemo {
    public static void main(String[] args) {
        SharedData sd = new SharedData();
        new Producer(sd);
        new Consumer(sd);
    }
}
