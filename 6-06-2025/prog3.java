class Main {
    public static void main(String[] args) {
        int[] a={2,3,18,19,22};
        int[] b={1,6,9,21,27,30};
        int[] c=new int[a.length+b.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<a.length&&j<b.length){
            if(a[i]<b[j]){
                c[k]=a[i];
                k++;
                i++;
            }
            else{
                c[k]=b[j];
                k++;
                j++;
            }
            }
            while(i<a.length){
                c[k]=a[i];
                i++;
                k++;
            }
            while(j<b.length){
                c[k]=b[j];
                k++;
                j++;
            }
            System.out.print("elements in c are:");
            for(k=0;k<c.length;k++){
              System.out.println(c[k]+" ");  
            }
        }
    }
