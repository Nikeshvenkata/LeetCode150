package Array_String;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int ans = 0, p1 = 0, p2 = height.length - 1;
        while(p1 < p2){
            int h = Math.min(height[p1], height[p2]);
            int w = p2 - p1;
            int area = h * w;
            if(area > ans){ans = area;}
            if(height[p1] > height[p2]){p2--; }
            else p1++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }
}
