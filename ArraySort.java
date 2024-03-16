import java.util.Arrays;

class SortData {
    public int[] num;
    
    public void asce(){
        Arrays.sort(this.num);
    }
    
    public void desc(){
        asce();
        int[] temp = new int[num.length];
        for(int i = (num.length - 1) , j = 0 ; i >= 0 ; i--, j++){
            temp[j] = num[i];
        }
        this.num = temp;
    }
    
    SortData(int[] m){
        this.num = m;
    }
}


public class ArraySort {
    public static void main(String[] args) {
        SortData s = new SortData(new int[]{3,5,1,0,7,2});
        s.asce();
        System.out.println(Arrays.toString(s.num));

        SortData s1 = new SortData(new int[]{6,4,2,9,1});
        s1.desc();
        System.out.println(Arrays.toString(s1.num));
    }
}
