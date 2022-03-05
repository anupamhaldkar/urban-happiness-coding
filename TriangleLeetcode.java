class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
       int row = triangle.size();
        int col = triangle.get(row-1).size();
        int[] arr = new int[row+1];
        for(int i=row-1;i>=0;i--){
            for(int j=0;j<=i;j++){
                arr[j] = triangle.get(i).get(j)+ Math.min(arr[j],arr[j+1]);
            }
        }
        return arr[0];
       
    /*   return recursion(triangle,0,0);
        
    }
    static int recursion(List<List<Integer>> triangle,int row,int column){
        if(row==triangle.size()-1)
            return triangle.get(row).get(column);
       return triangle.get(row).get(column)+ Math.min(recursion(triangle,row+1,column),recursion(triangle,row+1,column+1));
    }
     */
         
}
}
