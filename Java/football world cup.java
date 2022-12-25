import java.util.*;
class Pair{
    int wins;
    String name;
   
    public Pair(int wins, String name){
        this.wins=wins;
        this.name=name;
    }
 }

class footballWorldCup{
    int n = 32;
	Pair[] arr;

	public footballWorldCup(Pair[] arr) {
		this.arr = arr;
		
		Arrays.sort(this.arr, (t1, t2) -> t1.name.compareTo(t2.name));
		Arrays.sort(this.arr, (t1, t2) -> t2.wins -t1.wins);
	}

	String[] topSixteen() {
		String[] arr2 = new String[16];
		for (int i = 0; i < 16; i++) {
			arr2[i] = arr[i].name;
		}
		return arr2;
	}

	String[] topEight() {
		String[] arr2 = new String[8];
		for (int i = 0; i < 8; i++) {
			arr2[i] = arr[i].name;
		}
		return arr2;
	}

	String[] topFour() {
		String[] arr2 = new String[4];
		for (int i = 0; i < 4; i++) {
			arr2[i] = arr[i].name;
		}
		return arr2;
	}

	String[] topTwo() {
		String[] arr2 = new String[2];
		for (int i = 0; i < 2; i++) {
			arr2[i] = arr[i].name;
		}
		return arr2;
	}

	String winner() {
		return arr[0].name;
	}
  // complete the class as mentioned in the problem statement
}