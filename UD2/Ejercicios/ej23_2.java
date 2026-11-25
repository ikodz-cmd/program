	public class ej23_2 {
		public static void main(String[] args) {
			System.out.println("DADO ALEATORIO");
			for (int i = 1; i <= 10; i++) {
			int numero = (int) (Math.random()*(6 - 1 + 1) + 1);
			System.out.println(numero);
			}
		}
}