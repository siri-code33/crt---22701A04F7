public class Main {
 public static void main(String[] args) {
 student s1= new student();
  System.out.println(s1.name);
   System.out.println(s1.roll);
    System.out.println(s1.attendence());
    s1.payfee(19999);
    }
}
class student{
String name="siri";
String roll="224f7";
String branch="ece";
      int year=3;
      char section='d';
      void payfee(int amount){
     System.out.println("paying:"+amount+"to the college");    
      }
      int attendence(){
          System.out.println("sending the attendence to the college");
          return 74;
      }
}
