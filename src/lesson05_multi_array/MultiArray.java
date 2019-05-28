package lesson05_multi_array;

public class MultiArray {
    public static void main(String[] args) {
        
        int[][] scores = 
        {
            {100, 90, 70}, 
            {90, 70, 40},
            {80, 100, 60},
        };
        
        System.out.println(scores.length + "組");
        
        // case 1
        int[] score1 = scores[0];
        int[] score2 = scores[1];
        int[] score3 = scores[2];
        
        print(score1);
        print(score2);
        print(score3);
        
        // case 2
        for(int i=0;i<scores.length;i++) {
            int[] score = scores[i];
            print(score);
        }
    }
    
    public static void print(int[] score) {
        for(int i=0;i<score.length;i++) {
            System.out.print(score[i] + " ");
        }
        System.out.println();
    }
    
}
