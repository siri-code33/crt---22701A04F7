class Main {
    public static void main(String[] args) {
    int num=4531;
    int count=0;
    while(num>0){
        int digit=num%10;
        if(digit%2!=0)count=count+1;
        num=num/10;
            
        }
        System.out.println("number of odd digits are:"+count);
    }
    }
