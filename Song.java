package com.leo.skiada.singer;

public class Song {
	protected static Song [] songs= new Song[20];//array to store the Songs
	private static int count;//count created objects

	private Singer singer;//each song is described by a Singer object
	private String title;

	public Song(String title,Singer singer) {
		this.title=title;
		this.singer=singer;

		songs[count]=this;//add object to the array
		count++;//increase the number of created singers
	}

	public Singer getSinger() {//return the singer as the field is private
		return singer;
	}

	@Override
	public String toString() {
		return "Song  title=" + title+" " + ", Singer[" + singer +" ]";
	}

	public static void printSongs() {
		for(int i=0;i<songs.length; i++){//search the songs array
			if (songs[i]!=null){//if a song exists in the specific position [i]- remember that some positions may be empty
				System.out.println (songs[i]);
			}
		}
	}

}

