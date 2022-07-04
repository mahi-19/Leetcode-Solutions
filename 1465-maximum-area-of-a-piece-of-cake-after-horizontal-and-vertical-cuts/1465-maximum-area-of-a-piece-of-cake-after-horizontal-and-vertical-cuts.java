class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        int maxHeight = horizontalCuts[0];
        int maxWidth = verticalCuts[0];
        for(int i=1; i<horizontalCuts.length;i++){
            maxHeight = Math.max(maxHeight, horizontalCuts[i]-horizontalCuts[i-1]);
        }// for     
        maxHeight = Math.max(maxHeight, h-horizontalCuts[horizontalCuts.length-1]);
        for(int i=1; i<verticalCuts.length;i++){
            maxWidth = Math.max(maxWidth, verticalCuts[i]-verticalCuts[i-1]);
        }//for
        maxWidth = Math.max(maxWidth, w-verticalCuts[verticalCuts.length-1]);
        return (int)((long)maxHeight * maxWidth % 1000000007);  
        
    }
}