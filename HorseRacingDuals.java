import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        //int D = 10000000;
        List<Integer> tableauPuissances = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            int pi = in.nextInt();
            tableauPuissances.add(pi);
            
        }
        Collections.sort(tableauPuissances);
        //Integer [] tableauClasse = tableauPuissances.stream().toArray(new Integer[sizeof(tableauPuissances)]::new);
        int answer = Integer.MAX_VALUE;
        
        for (int i = 0; i < tableauPuissances.size()-1; i++){
            /*int result = tableauClasse[i+1] - tableauClasse[i];
            if ( result < D){
                D = result;
                }*/
            int current = tableauPuissances.get(i);
            int next = tableauPuissances.get(i+1);
            //System.err.println(current + " - " + next);
            int D = next - current;
            if ( D < answer) {
                answer = D;
            }
        }

        System.err.println();

        System.out.println(answer);
    }
}
