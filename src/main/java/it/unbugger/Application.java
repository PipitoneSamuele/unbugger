package it.unbugger;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class Application {

	public static String path = "C:\\Users\\samue\\Desktop\\sw projects\\unbugger\\src\\test";

	public static void main(String[] args) throws IOException {
		//SpringApplication.run(Application.class, args);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter path for file (it start from " + path + ")");
		String s = scanner.nextLine();

		System.out.println("Path: " + path + s);
		File directory = new File(path+s);
		File[] files = directory.listFiles();

		if(files == null) {
			System.out.println("No files found in the choosen directory");
			return;
		}

		System.out.println("Which file do you want to timerize? (write the number)");
		int count = 0;
		for (File file : files) {
			System.out.println(++count + ") " + file.getName());
		}

		int chosenFileNumber = Integer.parseInt(scanner.nextLine());
		File chosenFile = files[chosenFileNumber-1];
		System.out.println("You chose: " + chosenFile.getName());

		System.out.println("Your file contains: ");
		List<String> fileStrings = Files.readAllLines(chosenFile.toPath(), StandardCharsets.UTF_8);
		for(String fileLine : fileStrings) {
			System.out.println(fileLine);
		}
	}

}
