class Main {
    public static void main(String[] args) {
        int[] nums={25,75,100,125};
        for(int i=0;i<nums.length;i++){
            int value=nums[i];
            if(value%2==0){
                System.out.println("even");
            }
            else{
                System.out.println("odd");
            }
        }
        }
}