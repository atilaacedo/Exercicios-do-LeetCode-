package LeetCode832;

public class FlipAndInvert {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] invertAndFlipImage = new int[image.length][image[0].length];
        int lin = 0;
        for(int i = 0; i < image.length ; i++){
            int col = 0;
            for(int j = image[i].length -1 ; j >= 0; j--){
                if(image[i][j] == 1) invertAndFlipImage[lin][col] = 0;
                else invertAndFlipImage[lin][col] = 1;

                col++;
            }

            lin++;
        }

        return invertAndFlipImage;
    }
}
