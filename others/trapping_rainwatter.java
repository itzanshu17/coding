public class trapping_rainwatter {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);  
        //int n= sc.nextInt(); 
        int height[] = {0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
        int left_max[]=new int[height.length];
        int right_max[]=new int[height.length];
        int left=0;
        int right=0;
        // left max
        for (int i=0;i<height.length;i++) {
            if(left<height[i]) {
                left=height[i];
            }
            left_max[i]=left;
        }
        //right max
        for (int i=height.length-1;i>=0;i--) {
            if(right<height[i]) {
                right=height[i];
            }
            right_max[i]=right;
        }
        int sum =0;
        int total_height=0;
        int trapped_water=0;
        // actual function 
        for(int i=0;i<height.length;i++){
            total_height=Math.min(left_max[i], right_max[i]);
            trapped_water=total_height-height[i];
            sum = sum +trapped_water;
        }
        System.out.println("Total stored water is : "+sum);
    }
}