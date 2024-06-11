package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Lesson;
import entities.Task;
import entities.Video;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int totalDuration = 0;
		
		List<Lesson> list = new ArrayList<>();
		
		System.out.print("How many lessons does the course have? ");		
		int numLessons = sc.nextInt();
		System.out.println();
		
		for (int i = 0; i < numLessons; i++) {
			System.out.printf("Lesson #%d data: %n", i+1);
			sc.nextLine();
			
			System.out.print("Task or Video? (t/v) ");
			char typeLesson = sc.next().charAt(0); 
			sc.nextLine();
			
			System.out.print("Title: ");
			String title = sc.nextLine();
			
			if (typeLesson == 't') {
				System.out.print("Description: ");
				String description = sc.nextLine();
				System.out.print("Number of questions: ");
				int questionCount = sc.nextInt();
				list.add(new Task(title, description, questionCount));
			} else {
				System.out.print("URL: ");
				String url = sc.nextLine();
				System.out.println();
				System.out.print("Duration in seconds: ");
				int seconds = sc.nextInt();
				list.add(new Video(title, url, seconds));
			}
			
			System.out.println();
		}
		
		
		for (Lesson lesson : list) {
			totalDuration += lesson.duration();
		}
		
		System.out.println("TOTAL COURSE DURATION IN SECONDS: " + totalDuration);
		
		sc.close();

	}

}
