public class trappedRainwater {
    public static int trap(int[] height) {
        int n = height.length;
    
        // LeftMax Boundary
        int LeftMax[] = new int[n];
        LeftMax[0] = height[0];
        for(int i = 1; i < n; i++){
            LeftMax[i] = Math.max(height[i] , LeftMax[i-1]);
        }

        // rightMax  Boundary
        int RightMax[] = new int[n];
        RightMax[n-1] = height[n-1];
        for(int i = n-2; i >= 0 ; i--){
            RightMax[i] = Math.max(height[i], RightMax[i+1]);
        }

        //loop
        int trappedWater = 0;
        for(int i =0; i < n; i++){
            //rainwater
            int rainWaterLevel = Math.min(LeftMax[i] , RightMax[i]);
            //TrappedWater
            trappedWater += (rainWaterLevel - height[i]);
        }
        return trappedWater;
    }
    public static void main(String args[]){
        int height[] = {0,2,0,3,1,0,1,3,2,1};
        System.out.println(trap(height));
    }
}
