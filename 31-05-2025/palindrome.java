public class Main {
    public static void main(String[] args) {
int num=111;
int reverse=0;
int temp=num;
while(temp>0){
   int  digit=temp%10;
    reverse=reverse*10+digit;
    temp=temp/10;
}
if(num==reverse)
{
    System.out.println("palindrome");
}
else
{
    System.out.println("not palindrome");
}
    
}
}