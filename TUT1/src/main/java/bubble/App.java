package bubble;

public class App {

    public static void main(String[] args) {
        int[] numbers1 = {70,61,72,83,38};
        int[] sortedNumbers = BubbleSort.sort(numbers1);
        System.out.println("Sorted Numbers a): ");
        for (int num : sortedNumbers) {
            System.out.print(num + " ");
        }
        
        
    }
}
