import java.util.*;
public class Duplicate {
  public static void main(String[] args) {
    int[] arr = {8, 1, 7, 6, 2, 19, 1, 19};
    Arrays.sort(arr);
    for(int i = 0; i < arr.length - 1; i++){
      if(arr[i] == arr[i+1]){
        System.out.println("Duplicate Element " + arr[i]);
      }
    }
  }
}


