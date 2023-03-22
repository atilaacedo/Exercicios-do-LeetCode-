package LeetCode605;

public class CanPlaceFlowers {

    public static void main(String[] args) {
        CanPlaceFlowers c = new CanPlaceFlowers();
        int[] n = { 1, 0, 0, 0, 1, 0, 0 };

        System.out.println(c.canPlaceFlowers(n, 1));

    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {

            if (flowerbed.length == 1 && flowerbed[0] == 0)
                return true;

            if (i > 0 && i < flowerbed.length - 1) {
                if (flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                    count++;
                    flowerbed[i] = 1;
                }
            } else if (flowerbed[0] == 0 && flowerbed[1] == 0) {
                count++;
                flowerbed[0] = 1;
            } else if (flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0) {
                count++;
                flowerbed[flowerbed.length - 1] = 1;
            }

        }

        if (count < n)
            return false;

        return true;
    }
}
