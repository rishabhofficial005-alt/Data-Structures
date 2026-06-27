import java.util.*;
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        HashSet<Integer> set= new HashSet<>();
        int sum=0;
        int repeating_element=-1;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(!set.contains(grid[i][j])){
                    set.add(grid[i][j]);
                }
                else{
                    repeating_element=grid[i][j];
                }

               
                sum=sum+grid[i][j];
            }
        }
       long actual_sum = (long)(n * n) * ((n * n) + 1) / 2;
       int missing_value = (int)(actual_sum)- (sum - repeating_element);
       return new int[]{repeating_element, missing_value};
    }
}