package control;

public class drgtesrh {
	public static void main(String args[]) {

		int x,y;

		skip:

		for(x=2; x<4; x++) {

		System.out.print(x + " ");

		for(y=0; y<6;y++) {

		System.out.print(y + " ");

		if (x==y) {

		continue skip;

		}

		}

		}

		}
}
