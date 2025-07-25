package bubble;

public class BubbleSort {
    
    public static int[] sort(int[] Integers){

        int length = Integers.length;

        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length - i - 1; j++){
                if(Integers[j] > Integers[j+1]){
                    int temp = Integers[j];
                    Integers[j] = Integers[j+1];
                    Integers[j+1] = temp;
                }
            }
        }
        return Integers;
    }
    
    public static void main(String[] args) {
    
    }
}
