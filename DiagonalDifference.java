 public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    
        int value = 0;
        for (int i = 0; i < arr.size(); i++)
            value += (arr.get(i).get(i) - arr.get(i).get(arr.size() - i - 1));
        
        return Math.abs(value);
    }

}
