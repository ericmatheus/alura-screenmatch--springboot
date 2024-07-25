package br.com.alura.Screenmatch;

import br.com.alura.Screenmatch.service.ConsumoAPI;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Scanner getData = new Scanner(System.in);
		ConsumoAPI consumoAPI = new ConsumoAPI();
		System.out.print("FILME: ");
		String apikey = "bc3d9b9c";
		System.out.println(consumoAPI.obterDados("https://www.omdbapi.com/?t="+getData.nextLine()+"&apikey="+apikey));

	}
}
