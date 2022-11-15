package LeetCode766;

public class ToeplitzMatrix {
    
    public static boolean isToeplitzMatrix(int[][] matrix) {
        if(matrix.length == 1)
            return true;

        int lin = matrix.length;
        int col = matrix[0].length;
        

        for(int i = 0; i < lin;i++){
            for(int j = 0; j < col; j++){
                if((i == matrix.length-1 && j == 0) || (i == 0 && j == matrix[i].length-1)){
                    continue;
                }else if(i + 1 < matrix.length && j +1 < matrix[i].length){
                    if(matrix[i][j] != matrix[i+1][j+1])
                        return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //int[][] matrix = {{1,2,3,4}, {5,1,2,3} ,{9,5,1,2}};
        int[][] matrix2 = {{1,2},{2,2}};

        System.out.println(isToeplitzMatrix(matrix2));
       
        

    }
}
