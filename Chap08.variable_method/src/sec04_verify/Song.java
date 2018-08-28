package sec04_verify;

import java.util.Arrays;

public class Song {

	private String title;
	private String artist;
	private String album;
	private String[] composer;
	private int year;
	private int track;
	
	void show() {
		
		System.out.println("title : "+this.title +"\nsinger : "+this.artist+"\n앨범: "+this.album
				+"\ncomposer : "+Arrays.toString(this.composer)+"\nyear : "+ this.year +"\ntrack num : "+this.track);
	}
	
	Song(){
		
	}
	
	Song(String title, String artist, String album, String[] composer, int year, int track){
		this.title=title;
		this.artist=artist;
		this.album=album;
		this.composer=composer;
		this.year=year;
		this.track=track;
	}
	public static void main(String[] args) {
		
		Song test = new Song("엄마","홍진영","엄마 부탁",new String[] {"윤일상","한효주","김을동"},2016,5);
		test.show();
	}
}
