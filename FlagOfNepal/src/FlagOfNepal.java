public class FlagOfNepal {
	public static void main(String[] args) {
		//sun
		for(int i = 0; i < 11; i++) {
			for(int j = 0; j <= i; j++) {
				if(i == 0 || i == 10 || j == 0 || j == i) {
					System.out.print("4  ");
				}else if(i == 6 && j == 3){
					System.out.print("*  ");
				}else if(i == 7 && (j == 2 || j == 3 || j == 4)){
					System.out.print("*  ");
				}else if(i == 8 && j == 3){
					System.out.print("*  ");
				}else {
					System.out.print("   ");
				}
			}
			if(i != 11)
				System.out.print("\n");
			else
				System.out.print("");
		}
		
		//moon
		for(int i = 0; i < 11; i++) {
			for(int j = 0; j <= i; j++) {
				if(i == 0 || i == 10 || j == 0 || j == i) {
					System.out.print("4  ");
				}else if(i == 7 && (j == 2 || j == 4)){
					System.out.print("*  ");
				}else if(i == 8 && j == 3){
					System.out.print("*  ");
				}else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		
		for(int k = 0; k<7; k++) {
			System.out.println("4");
		}
	}
}