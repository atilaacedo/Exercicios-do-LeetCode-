public class Teste {

    public static void main(String[] args) {
        int[][] nums = {{3,5,6}, {2,95,8}, {19,8,10}};
        int[] novoNums = largestOfFour(nums);
        for(int i = 0; i < novoNums.length; i++) {
            System.out.print(novoNums[i] +" ");
          }
    }

    public static int[] largestOfFour(int[][] arr) {
        int[] array =  new int[arr.length];
        
        int index =0;
      
        for(int i = 0; i < arr.length; i++) {
            int greaters = arr[i][i];
          for(int j = 0; j < arr[i].length; j++) {
                if(greaters < arr[i][j]){
                    greaters = arr[i][j];
                }

                if(j  == arr[i].length-1) {
                    array[index] = greaters;
                    index++;
                }
          }
        }
      
        return array;
      }
}
