package lesson08;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Demo {
    public static void main(String[] args) {
        Queue jobs = new LinkedList();
        jobs.offer("拿報紙");
        jobs.offer("寫報告");
        jobs.offer("倒茶水");
        jobs.offer("見客戶");
        jobs.offer("發薪水");
        System.out.println(jobs);
        
        while(!jobs.isEmpty()) {
            System.out.println("進行 " + jobs.poll() + " 工作");
        }
        
        System.out.println(jobs);
        
        if(jobs.isEmpty()) {
            System.out.println("下班了");
        }
    }
}
