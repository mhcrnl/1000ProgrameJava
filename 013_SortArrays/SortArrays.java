import java.util.Arrays;

public class SortArrays{
    public static void main(String[] args){
	int[] array = { 12,34,3, 402, 540, 8,9};
	System.out.println("Array Elements before sort");

	for(int elem: array){
	    System.out.println(elem);
	}

	Arrays.sort(array);
	System.out.println("Array Elements after sort:");

	for(int elem: array){
	    System.out.println(elem);
	}
    }
}
