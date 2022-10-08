package sorting;

public class BubbleSort {

	public static void main(String[] args) {

		int arr[] = { 23, 4, 2, 18, 56, 34, 234, 22, 3, 1, 8 ,3,19,2};
		int temp;
		int flag=0;
		for (int i = 0; i < arr.length; i++) {// This loop is for number of
												// rounds

			for (int j = 0; j < arr.length-1-i; j++) { // for comparison
				//added-i because in each round last item is already sorted
				

				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag=1;

				}

			}
			if(flag==0) {
				
				break;//no need to execute further because no swapping is happening
			}

		}
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
		}
		

	}

}
