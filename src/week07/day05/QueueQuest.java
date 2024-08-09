package week07.day05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/*
 1- İçerisinde String isimler tutacak bir queue tanımlayalim. adi biletKuyrugu olsun.
kuyruga 10 kisi ekleyelim ve biletSatis isimli bir metotta 1-15 arası random sayida kisiye biletleri dagitalim.

Biletini alanlar için; ".. biletini aldı" çıktısı verelim.
Bilet bittiginde : "Bilet kalmadi..." ciktisi verelim.

Biletini alamayanlari yazdiralim. "... bilet alamadi..."
* */
public class QueueQuest {
	public static void main(String[] args) {
		Queue<String> biletKuyrugu = new LinkedList<>();
		biletKuyrugu.offer("Alex");
		biletKuyrugu.offer("Mehmet");
		biletKuyrugu.offer("Ahmet");
		biletKuyrugu.offer("Kerem");
		biletKuyrugu.offer("Can");
		biletKuyrugu.offer("Durmaz");
		biletKuyrugu.offer("Cansu");
		biletKuyrugu.offer("Elif");
		biletKuyrugu.offer("Alice");
		biletKuyrugu.offer("Keriz");
		biletSatis(biletKuyrugu);
	}
	public static void biletSatis(Queue<String> biletKuyrugu){
		Random random = new Random();
		int biletSayisi = random.nextInt(15) + 1; // Random number between 1-15
		
		System.out.println("Toplam " + biletSayisi + " bilet satılacak.");
		
		while (!biletKuyrugu.isEmpty() && biletSayisi > 0) {
			String kisi = biletKuyrugu.poll();
			System.out.println(kisi + " biletini aldı.");
			biletSayisi--;
		}
		
		if (biletSayisi == 0) {
			System.out.println("Bilet kalmadı...");
		}
		
		// Print people who couldn't get tickets
		while (!biletKuyrugu.isEmpty()) {
			System.out.println(biletKuyrugu.poll() + " bilet alamadı...");
		}
	}
}