public class Task1 {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5};
        int n = 5;
        int sum = 0;
        boolean add = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != n && add == true)
                sum = sum + array[i];
            else if (array[i] == n)
                add = false;
        }
        System.out.print(sum);
    }
}




