public class App {
    public static void main(String[] args) throws Exception {
        int [] a = new int[10];
        a[0] = 1;
        a[0] = 2;
        a[0] = 3;
        a[0] = 4;
        a[0] = 5;
        system.out.println("mang a:");
        for (int i=0; i< a.length;i++){
            for(int j = i+1; j < a.length; j++){
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j]= temp;
                }
            }
        }
        system.out.println("mang a sau khi sap xep:");
        for (int i=0; i< a.length;i++);

    }
}
