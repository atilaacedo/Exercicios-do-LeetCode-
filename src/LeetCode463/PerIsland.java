package LeetCode463;

public class PerIsland {
    public int islandPerimeter(int[][] grid) {
        int per = 0;
        

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == 1){
                    if(j > 0){
                        if(grid[i][j-1] == 0) per++;
                    }else{
                        per++;
                    }

                    if(j < grid[i].length -1){
                        
                        if(grid[i][j+1] == 0) per++;
                    }else{
                        per++;
                    }

                    if(i > 0){
                        if(grid[i-1][j] == 0) per++;
                    }else{
                        per++;
                    }

                    if(i < grid.length-1){
                        if(grid[i+1][j] == 0) per++;
                    }else{
                        per++;
                    }


                    
            }
        }
            }
        return per;
    }

    public static void main(String[] args) {
        PerIsland p = new PerIsland();
        int[][] nums = {{1,1}}; 
        int n = p.islandPerimeter(nums);
        System.out.println(n);

    }
}
