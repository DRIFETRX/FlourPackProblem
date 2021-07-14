package udemyCodingExercises;

public class FlourPacker {
	public static boolean canPack(int bigCount, int smallCount, int goal) {
		if(bigCount<0 || smallCount<0 || goal<0) {
			return false;
		}
		else {
			int bigCountKilos= bigCount*5;
			if(bigCountKilos+smallCount ==goal) {
				System.out.println("Packing is possible");
				return true;
			}
			else if((bigCountKilos>=goal && goal%5==0)||(bigCountKilos>=goal && goal%5<=smallCount)){
				System.out.println("Packing is possible");
				return true;
			}
			else if(smallCount>=goal) {
				System.out.println("Packing is possible");
				return true;
			}
			else if(bigCountKilos+smallCount>goal && goal%5<=smallCount) {
				System.out.println("Packing is possible");
				return true;
			}
			else {
				System.out.println("Packing is not possible");
				return false;
			}
		}
		
	}

	public static void main(String[] args) {
		canPack(10, 4, 9);

	}

}
