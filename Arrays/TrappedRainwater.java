import java.util.*;

public class TrappedRainwater {
    public static int ReturnValue(int height[]) {
        int n = height.length;

        int Leftmax[] = new int[n];
        Leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            Leftmax[i] = Math.max(height[i], Leftmax[i - 1]);
        }

        int Rightmax[] = new int[n];
        Rightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            Rightmax[i] = Math.max(height[i], Rightmax[i + 1]);
        }

        int TotalTrappedWater = 0;

        for (int i = 0; i < n; i++) {
            int WaterLevel = Math.min(Leftmax[i], Rightmax[i]);
            TotalTrappedWater += WaterLevel - height[i];
        }
        return TotalTrappedWater;

    }

    public static void main(String[] args) {
        int height[] = { 3, 5, 7, 3, 2, 9, 1, 2, 6 };
        System.out.println(ReturnValue(height));

    }

}
