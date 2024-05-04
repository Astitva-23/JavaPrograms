public class MinMax {

    public int max(int [] array){
        int max = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
    public int min(int [] array){
        int min = array[0];

        for(int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
    public static void main(String args[]){
        int[] arrayList = {5, 15, 9, 75, 63};
        MinMax m = new MinMax();
        System.out.println("Max no. is " + m.max(arrayList));
        System.out.println("Min no. is " + m.min(arrayList));
    }
}
