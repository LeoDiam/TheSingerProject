package com.leo.skiada.singer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		createObjects();//load objects to test functionality
		Scanner scanner= new Scanner(System.in);
		int cont = 1;

		while (cont!=0){
			System.out.println("** Menu **");
			System.out.println("Press 1 to print all songs");
			System.out.println("Press 2 to print all singers");
			System.out.println("Press 3 to create a new singer");
			try {
			cont = scanner.nextInt();
          
			switch(cont){
			case 0:
				break;
			case 1:
				Song.printSongs();
				break;
			case 2:
				Singer.printSingers();
				break;
			case 3:
				Singer.createSinger();
				break;	
			default:
				System.out.println("Wrong input please try again");
			}
		}catch(InputMismatchException ime) {
			String g = scanner.next();
			System.out.println(g+"isnt a corect input \n Try again");
		}
			}
		
	}
	private static void createObjects() {
		Singer s1= new Singer("Tom");
		Singer s2= new Singer("George");
		new Song ("moi",s1);
		new Song ("toi",s2);
	}
}