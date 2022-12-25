import java.util.*;

class Main {

public static void findMin(int[]arr, int n){

Arrays.sort(arr);

int max = -1; int left = arr[0], right = arr[0];

for(int i=0;i<n;i++){

if(i%2==0){

int temp = Math.abs(arr[i]-left);

left = arr[i];

max = Math.max(max,temp);

}else{

int temp = Math.abs(arr[i]-right);

right = arr[i];

max = Math.max(max,temp);

}

}

System.out.println(max);

}

public static void main(String args[] ) throws Exception {

Scanner sc = new Scanner(System.in);

int n = sc.nextInt();

int arr[] = new int[n];

for(int i=0; i<n ;i++){

arr[i] = sc.nextInt();

}

findMin(arr,n);

}

}