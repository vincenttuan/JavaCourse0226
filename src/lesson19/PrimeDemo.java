package lesson19;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeDemo {
    
    public static void main(String[] args) {
        // Java 7
        // 判斷質數
        for(int n=1;n<=100;n++) {
            if(checkPrime(n)) {
                System.out.println(n + "是質數");
            }
        }
        
        // Java 8
        // 判斷質數
       IntStream.rangeClosed(2, 100)
                .filter(x -> checkPrime2(x))
                .forEach(x -> System.out.println(x + "是質數"));
       
       List<Integer> primeList = IntStream.rangeClosed(2, 100)
                                          .filter(x -> checkPrime2(x))
                                          .boxed() // int -> Integer
                                          .collect(Collectors.toList());
        System.out.println(primeList);
        System.out.println(primeList.get(5));
    }
    // Java 7
    public static boolean checkPrime(int n) {
        if (n < 2) return false;
        boolean isPrime = true;
        for(int i=2;i<=n/2;i++) {
            if(n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    
    // Java 8
    public static boolean checkPrime2(int n) {
        if (n < 2) return false;
        boolean isPrime = IntStream.rangeClosed(2, n/2).noneMatch(x -> n % x == 0);
        return isPrime;
    }
    
    
}
