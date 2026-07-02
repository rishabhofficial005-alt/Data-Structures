class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int rows=matrix.length;
       int cols=matrix[0].length; 
       int start_row=0;
       int end_row=rows-1;
       while(start_row<=end_row){
        int mid_row=start_row+(end_row-start_row)/2;
        if(target>=matrix[mid_row][0] && target<=matrix[mid_row][cols-1]){
            int start_column=0;
            int end_column=cols-1;
            while(start_column<=end_column){
                int mid_column=start_column+(end_column-start_column)/2;
                if(target==matrix[mid_row][mid_column]){
                    return true;
                }
                else if(target>matrix[mid_row][mid_column]){
                    start_column=mid_column+1;
                }
                else{
                    end_column=mid_column-1;
                }
            }
            return false;
        }
        else if(target<matrix[mid_row][0]){
            end_row=mid_row-1;
        }
        else{
            start_row=mid_row+1;
        }
       }
       return false;
    }
}