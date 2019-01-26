public class LinearSearch {
    // Implementing the linear search algorithm
    // Input: One array of integers and a target integer
    // Output: The smallest index of the target integer if found. If not found: -1
    public static int linearSearch(int[] data, int target) {
        for( int i = 0; i < data.length; i ++) {
            if (target == data[i]) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 24, 5, 6, 9, 7, 23, 85, 23, 34, 121, 87};
        System.out.println("Search for 9: " + linearSearch(numbers, 9));                    // 4
        System.out.println("Search for 129: " + linearSearch(numbers, 129));                // -1
    }
}