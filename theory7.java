//Cортиврока массива

public class Main {
    public static void main(String[] args) {

        int a[]={1,9,23,40,0,1,0,12};
        
        for(int i=1; i<a.length; i++)
            for(int j=0; j<(a.length-i); j++)
                if(a[j]>a[j+1]) {
                    x = a[j+1];
                    a[j+1]=a[j];
                    a[j] = x;
                }

        for(int i=0; i<a.length; i++)
            System.out.print(a[i]+" ");

    }
}
