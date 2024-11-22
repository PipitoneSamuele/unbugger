package it.unbugger;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;
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

		if(files != null) {
			for (File file : files) {
				System.out.println(file.getName());
			}
		}
	}

}
