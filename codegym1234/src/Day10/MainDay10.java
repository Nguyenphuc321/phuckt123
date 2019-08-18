package Day10;

import model.Customer;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class MainDay10 implements ApplicationRunningInterface {
    public static void main(String[] args) {
        MainDay10 mainDay10 = new MainDay10();
        mainDay10.run();
    }
    public static void runningRequestDay10(){
        Customer2 customer01 = new Customer2("Watcher02",11);
        Customer2 customer02 = new Customer2("Watcher02",18);
        Customer2 customer03 = new Customer2("Watcher03",21);

        Queue<Customer2> queueCustomer = new LinkedList<>();
        queueCustomer.add(customer01);
        queueCustomer.add(customer02);
        queueCustomer.add(customer03);
        System.out.println("-----day10------");
        showAllCustomerInQueue(queueCustomer);
    }
    public static void showAllCustomerInQueue(Queue<Customer2> customerQueue){
        Iterator i = customerQueue.iterator();
        while (i.hasNext()){
            System.out.println(i.next()+" ");
        }
    }
    @Override
    public void run(){
        runningRequestDay10();
    }




}
