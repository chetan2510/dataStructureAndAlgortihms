public class BinarySearch {

    public static void main(String[] args) {

        int[] array = {10, 20 , 30 , 40};
        BinarySearchRecursive(array, 40, 4);
    }

    private static void BinarySearchRecursive(int[] array, int numberToSearch, int lengthToStart) {

        if (lengthToStart > array.length || lengthToStart < 0) {
            System.out.printf("Element not found");
            return;
        }
        if (numberToSearch == array[lengthToStart/2]) {
            System.out.printf("Element found");
            return;
        }
        else if (numberToSearch > array[lengthToStart/2])
            BinarySearchRecursive(array, numberToSearch, (lengthToStart/2 + array.length)/2);
        else
            BinarySearchRecursive(array, numberToSearch, lengthToStart/2);

    }
}
