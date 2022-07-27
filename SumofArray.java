public class SumofArray {
    public static void main(String[] args) {
        int[] numArr={1,2,3,4,5,6};
        for (int i: sumOfArray(numArr))
            System.out.println(i);
    }
    public static int[] sumOfArray(int[] intArr){
        int[] sumArr=new int[intArr.length];
        sumArr[0]=intArr[0];
        for(int i=1;i<sumArr.length;i++)
            sumArr[i]=intArr[i]+sumArr[i-1];
        return sumArr;
    }
}
