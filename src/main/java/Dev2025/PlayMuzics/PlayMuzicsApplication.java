package Dev2025.PlayMuzics;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class PlayMuzicsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PlayMuzicsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		
		String response = scanner.nextLine();
	}
}
