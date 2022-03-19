public static String gridChallenge(List<String> grid) {
    // Write your code here
        for(int i=0;i<grid.size();i++){
            char[] array = grid.get(i).toCharArray();
            Arrays.sort(array);
            grid.set(i,String.valueOf(array));
        }
        for(int i=0;i<grid.size()-1;i++){
            for(int j=0;j<grid.get(i).length();j++){
                if(grid.get(i).charAt(j)>grid.get(i+1).charAt(j))
                return "NO";
            }
        }
    
    return "YES";
    }
