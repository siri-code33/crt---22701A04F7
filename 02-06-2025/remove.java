class Main {
    public static void main(String[] args){
       int[] nums={1,1,2,2,4,5,5,6,7,8};
       int i=0;
       for(int j=0;j<nums.length;j++){
           if(nums[i]!=nums[j]){
               nums[i+1]=nums[j];
           i++;
            }
       }
       for(int j=0;j<=i;j++){
       System.out.println(nums[j]+"");
    }
    }
}
    
