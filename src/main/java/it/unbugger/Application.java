package it.unbugger;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Application {

	public static String path = "C:\\Users\\samue\\Desktop\\sw projects\\unbugger\\src\\test\\files";

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter path for file (it start from " + path + ")");
		String s = scanner.nextLine();

		System.out.println(path + s);
	}

}
