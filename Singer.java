package com.leo.skiada.singer;

import java.util.Scanner;

public class Singer {
	protected static Singer [] singers= new Singer[20];//array to store the Singers (and SongWriters as the storage takes place in the constructor)
	private static int count; //count created objects
	private int id; //singers id
	private String name;//singers name

	public Singer(String name) {
		this.name = name;
		singers[count]=this;//add object to the array
		count++;//increase the number of created singers
		id=count;//assign the current value of the static variable count to the id
	}

	public String getName() {
		return name;
	}

		public void findSongs() {//find songWriter's song
			for (int z=0; z<Song.songs.length;z++){//search the songs
				if(Song.songs[z]!=null){//if a song exists in the specific position [i]- remember that some positions may be empty
					if(Song.songs[z].getSinger().getName().equals(this.name)){//compare song's songWriter to the songWriter that is searching for his songs (this)
						System.out.println(Song.songs[z]);//print the song
					}
				}
			}
	}

	@Override
	public String toString() {
		return "name=" + name ;
	}
	public static void createSinger() {//create new singer
		Scanner scanner= new Scanner (System.in);
		System.out.println("Singer's name: ");
		String name= scanner.next();//title is needed
		Singer singer=new Singer(name);
		System.out.println(singer.getName()+ " has been added to our list");
	}

	public static void printSingers() {
			for(int i=0;i<singers.length; i++){//search the singer array
				if (singers[i]!=null){//if a singer exists in the specific position [i]- remember that some positions may be empty
					System.out.println (singers[i]);
					singers[i].findSongs();
				}
			}
	}


}
