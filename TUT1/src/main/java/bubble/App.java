package bubble;

public class App {

    public static void main(String[] args) {
        int[] numbers1 = {70,61,72,83,38};
        int[] sortedNumbers1 = BubbleSort.sort(numbers1);
        System.out.println("Sorted Numbers a): ");
        for (int num : sortedNumbers1) {
            System.out.print(num + " ");
        }
        
        int[] numbers2 = {7,2,76,4,99};
        int[] sortedNumbers2 = BubbleSort.sort(numbers2);
        System.out.println("\nSorted Numbers b):");
        for(int num : sortedNumbers2){
            System.out.print(num + " ");
        }

        int[] numbers3 = {28,9,13,78,19};
        int[] sortedNumbers3 = BubbleSort.sort(numbers3);
        System.out.println("\nSorted Numbers c):");
        for(int num : sortedNumbers3){
            System.out.print(num + " ");
        }

        int[] numbers4 = {68,84,41,62,18};
        int[] sortedNumbers4 = BubbleSort.sort(numbers4);
        System.out.println("\nSorted Numbers d):");
        for(int num : sortedNumbers4){
            System.out.print(num + " ");
        }

        int[] numbers5 = {37,57,40,13,50};
        int[] sortedNumbers5 = BubbleSort.sort(numbers5);
        System.out.println("\nSorted Numbers e):");
        for(int num : sortedNumbers5){
            System.out.print(num + " ");
        }

    }
}
