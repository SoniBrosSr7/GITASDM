//Updated the java code with insertion sort code in branch b3

public class insertionsort {

    void insertionSorting(int arr[]){
        int n = arr.length;

        for (int i=1; i< n; ++i){
        	int key = arr[i];
        	int j = i-1;
        while(j>=0 && arr[j]>key) {
        	arr[j+1] = arr[j];
        	j=j-1;
        }
        arr[j+1] = key;
        }
    }

	void printArray(int arr[]){
		int n = arr.length;
		for (int i =0; i< n ; ++i){
			System.out.println(arr[i]+ "");
		}
		System.out.println();
	}
	
public static void main (String args[]){
	insertionsort obj = new insertionsort();
    int arr[] = {5,1,8,7,9};
    obj.insertionSorting(arr);
    obj.printArray(arr);
}
}