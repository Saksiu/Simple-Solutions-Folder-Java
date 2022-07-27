public class SumofArray {
    public static void main(String[] args) {
        int[] numArr={1,3,20,4,3,2};        //initializing an array with random numbers
        for (int i: sumOfArray(numArr))
            System.out.println(i);
    }
    public static int[] sumOfArray(int[] intArr){   //the quickest solution saving the result in a new array,
        int[] sumArr=new int[intArr.length];        //not changing the initial variables
        sumArr[0]=intArr[0];
        for(int i=1;i<sumArr.length;i++)
            sumArr[i]=intArr[i]+sumArr[i-1];
        return sumArr;
    }
}
