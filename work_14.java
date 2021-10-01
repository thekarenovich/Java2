//Сложить два массива и отсортировать 
//Сортиврока ))

public class Main {
    public static void main(String[] args) {

        int a1[]={1,2,3,4};
        int a2[]={2,5,7,8};
        int a[] = new int[a1.length + a2.length];

        int x;

        // a = a1 + a2
        for(int i=0; i<a1.length; i++)
            a[i]=a1[i];
        for(int i=0; i<a2.length; i++)
            a[i+a1.length]=a2[i];
        for(int i=0; i<a.length; i++)
            System.out.print(a[i]+" ");

        System.out.println();

        // теперь сортируем массив а
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
