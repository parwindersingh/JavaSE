/*
Given:
Street has N number of houses, index 0 to N-1
String D[] = {"PM", "GPM", "M"}; //P - Plastice, G - Glass, M - Metal
int T[] = {1,4,5}; //Time taken from previous location to next house location
Garbage put in time 1 min for each bag

Output: When all the truck would be back on starting point
//23
 */
package interview.questions;
import java.util.*;
public class GarbageTruckProblem {

    static int findTime(String D[], int T[]){
        Map<Character,Integer> truck = new HashMap<>();
        for(int i=0; i<D.length; i++){
            char ch[] = D[i].toCharArray();
            for(char c : ch){
                int travelTime = T[i]*2;
                if (truck.containsKey(c)) {
                    truck.put(c, truck.get(c) + 1 + travelTime);
                } else {
                    truck.put(c, 1+travelTime);
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        String D[] = {"PM", "GPM", "M"};
        int T[] = {1,4,5};
        System.out.println("Time: "+findTime(D,T));
    }
}
