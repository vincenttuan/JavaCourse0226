package lesson36_invoke;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InvokeAll_Demo {
    public static void main(String[] args) throws Exception {
        Callable<Integer> lotto = () -> new Random().nextInt(100);
        
        ExecutorService service = Executors.newCachedThreadPool();
        Collection<Callable<Integer>> list = new ArrayList<>();
        list.add(lotto);
        list.add(lotto);
        list.add(lotto);
        list.add(lotto);
        list.add(lotto);
        service.invokeAll(list).stream().forEach(x -> {
            try {
                System.out.println(x.get());
            } catch (Exception ex) {
            }
        });
        service.shutdown();
    }
}
