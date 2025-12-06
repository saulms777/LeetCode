public class P11_ContainerWithMostWater {

    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int area = 0;
        while (l < r) {
            area = Math.max(area, (r - l) * Math.min(height[l], height[r]));
            if (height[l] < height[r]) l++;
            else r--;
        }
        return area;
    }

    public static void main(String[] args) {
        P11_ContainerWithMostWater p = new P11_ContainerWithMostWater();
        System.out.println(p.maxArea(new int[]{1,8,6,2,5,4,8,3,7})); // 49
        System.out.println(p.maxArea(new int[]{1,1})); // 1
        System.out.println(p.maxArea(new int[]{1,2,3,1000,9})); // 9
        System.out.println(p.maxArea(new int[]{2,3,4,5,18,17,6})); // 17
    }

}
