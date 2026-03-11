public class Song{
	private String name;
	private String artist;
	private int duration;

	public Song(String name, String artist , int duration){
		this.name = name;
		this.artist = artist;
		this.duration = duration;

		}	
	public String getname(){
		return name;
	}	
	public void display(){
		System.out.println(name + " -- " + artist + " -- " + duration + " sec"+"\n");
		
		}





	}