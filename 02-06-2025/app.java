class Main {
    public static void main(String[] args) {
    App a= new App("ff","A++",9999,new String[]{"awesome","stress gain"});
    a.summary();
    }
}
class App{
    String name;
    String category;
    int downloads;
    String[] reviews;
    App(String name,String category,int downloads,String[] reviews){
        this.name=name;
        this.category=category;
        this.downloads=downloads;
        this.reviews=reviews;
    }
    void summary(){
        System.out.println(name);
        System.out.println(category);
        System.out.println(downloads);
        System.out.println(reviews);
        if(downloads>900){
            System.out.println("popular");
        }
        else{
            System.out.println("normal");
         }
        }
    }
