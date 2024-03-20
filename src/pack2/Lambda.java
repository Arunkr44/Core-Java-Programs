package pack2;

interface Call{
	void me();
}
public class Lambda {
		public static void main(String[] args) {
			Call yt=()-> System.out.println("hello");
			yt.me();
		}
}
