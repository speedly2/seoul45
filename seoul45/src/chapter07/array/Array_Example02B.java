package chapter07.array;

import java.util.Scanner;

public class Array_Example02B {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size;
		
		do {
			System.out.print("배열의 크기 : ");			
			size = scan.nextInt();
			if(size < 2)
				System.out.println("2 이상의 값을 입력하세요.");
			else {
				int arr[] = new int[size];
				int sum = 0;
				
				for (int i = 0; i < arr.length; i++) {
					System.out.print("arr["+i+"] = ");
					arr[i] = scan.nextInt();
					sum += arr[i];
				}
				
				for (int j = 0; j < arr.length; j++) {
					System.out.print(arr[j]);
					if(j < arr.length - 1)
						System.out.print(" + ");
				}
				
				System.out.println(" = " + sum);
			}	
		} while (size < 2);

		
	}

}
