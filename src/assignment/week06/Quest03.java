package assignment.week06;
// Bir String dizisindeki elemanları alfabetik sıraya göre nasıl sıralarsınız?
import java.util.Arrays;

public class Quest03 {
	public static void main(String[] args) {
		String[] alfa = {"bca", "klap", "ahmet", "ashtanga"};
		Arrays.sort(alfa);
		System.out.println(Arrays.toString(alfa));
	}
}