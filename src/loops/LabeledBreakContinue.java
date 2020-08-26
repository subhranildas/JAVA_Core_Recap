package loops;

public class LabeledBreakContinue {

	public static void main(String[] args) {
		
		// Normal break statement in action
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i==1) break;				// here only the inner loop breaks
				System.out.print("* ");
			}
			System.out.println();
		}
		
		Outer:					// This is the label for the outer loop
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i==1) break Outer;		// here the Label is mentioned so outer loop breaks
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i==1) continue;				// here only the inner loop continues
				System.out.print("# ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		Outer:					// This is the label for the outer loop
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i==1) continue Outer;	// here the Label is mentioned so outer loop continues
				System.out.print("# ");
			}
			System.out.println();
		}
		

	}

}
