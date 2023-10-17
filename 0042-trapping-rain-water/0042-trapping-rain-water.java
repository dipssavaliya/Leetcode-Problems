class Solution {
    public int trap(int[] height) {
          int n= height.length;
        if(height.length<=2)
        {
            return 0;
        }
        int[] leftArray=new int[n];
        int[] rightArray=new int[n];

         leftArray[0]=height[0];
        //left subaarray boundry cal
        for(int i=1;i<n;i++)
        {
           leftArray[i]=Math.max(height[i], leftArray[i-1]);
        }
        //right subarray bounday cal
         rightArray[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rightArray[i]=Math.max(rightArray[i+1], height[i]);
        }
       // System.out.println("left Array : "+Arrays.toString(leftArray));
        //System.out.println("right Array : "+Arrays.toString(rightArray));
       
        int trappedWater =0;
        for(int i=0;i<height.length;i++)
        {
            int waterLevelminheigth= Math.min(leftArray[i],rightArray[i]);
             trappedWater += waterLevelminheigth-height[i];
        }
       return trappedWater;
    
    }
}