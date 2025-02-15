package Dev2025.PlayMuzics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class PlayMuzicsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(PlayMuzicsApplication.class, args);
	}
	@Autowired
	private ChatGpt gpt;
	private final Scanner scanner = new Scanner(System.in);

	@Override
	public void run(String... args) throws Exception {
		while (true){
			System.out.print("""
					Escolha uma opção no menu:
					1 - Falar com o chat.
					2 - Inserir Artistas no banco de dados.
					3 - Insrir Musicas no banco de dados.
					0 - sair
					""");
			int option = scanner.nextInt();
			scanner.nextLine();
			switch (option) {
				case 1:
					talkToChat();
					break;
				case 2:
					break;
				case 0:
					scanner.close();
					System.exit(0);

				default:
					System.out.println("Opção inválida.");
					break;

			}
		}
	}
	public void talkToChat(){
		String ask = "";
		while(true){
			System.out.println("*** Faça uma pergunta ao chat? ***");
			ask = scanner.nextLine();
			if(!ask.equals("0")){
				String response = gpt.askChat(ask);
				System.out.println(response);
			}
			else {break;}
		}
	}
}
