import java.util.Random;
import java.util.Scanner;
public class Musicplayer{
	private Node head;
	private Node tail;
	private Node current;
	private int length;
	private int mode;
		

	private class Node{
		Song song;
		Node prev;
		Node next;

	public Node(Song song){
		this.song = song;
			}
		}
	
 	public Musicplayer(){
		head = null;
		tail = null;
		current = null;
		length = 0;

		}

	//Adds Song at the end

	public void append(Song song){
		Node newSong = new Node(song);
		if(head == null){
			current = newSong;
			head = newSong;
			tail = newSong;
			}
		else{
			tail.next = newSong;
			newSong.prev = tail;
			tail = newSong;
			}
		length++;
		}
	
	//Prints the current playlist

	public void showPlaylist(){
		Node temp = head;
		while(temp != null){
			
			temp.song.display();
			if(current == temp){
				System.out.print("    <--Playing");
			}
			System.out.println();	
			temp = temp.next;
			
			}
		System.out.print("(Add more!)\n");

		}

	//Next function
		

	public void next(){
		if(current == null) return;
		if(mode == 1){
			return;
		}
		if(current.next != null){
			current = current.next;
			}
		
		
		else{
			if(mode == 2){
			current = head;
		}}
	}
	//Previous Function
	
	
	public void previous(){
		if(current == null) return;
		if(mode == 1) {
			return;
		}	
		if(current.prev != null){
			current = current.prev;
			}
			else{
				if(mode == 2){
					current = tail;
				}
			}
		
		
		}


	//Shows the current song 


	public void playCurrent(){
		if(current == null) {System.out.println("Empty list");}
		else{
			current.song.display();
			}
		}

	//remove the current song


	public void removeCurrent(){
		if(current == null) return;
		if(head == tail ){
			head = null;
			tail = null;
			current = null;
			length--;
			return;
			}
		if(current == head){
			Node temp = head;
			head = head.next;
			temp.next = null;
			head.prev = null;
			current = head;
			length--;
			return;
			}
		if(current == tail){
			Node temp = tail;
			tail = tail.prev;
			tail.next = null;
			temp.prev = null;
			current = tail;
			length--;
			return;
			}
		Node temp = current;
		if(current.next != null){
		current = current.next;
		}
		else{
		current = current.prev;
		}

		temp.prev.next = temp.next;
		temp.next.prev = temp.prev;
		temp.next = null;
		temp.prev = null;
		length --;

		}

	//Shuffle function 

	public void shuffle(){
		if(head == null) return;
		Random rand  = new Random();
		int newindex = rand.nextInt(length);
		Node temp = head;
		for(int i = 0 ; i < newindex ; i++){
			temp = temp.next;
			
		}
		while(temp == current){
			newindex = rand.nextInt(length);
			temp = head;
			for(int i = 0 ; i < newindex ; i++){
			temp = temp.next;
		}
		
		}
		current = temp;
		
		
		
	}
	//Search Function

	public String searchSong(String s){
		if(head == null) return "Playlist Empty!";
		Node temp = head;
		while(temp != null){
			if(temp.song.getname().equals(s)){
				return "Song Found!!";
			}else{
				temp = temp.next;
			}
		}
		
		return "Song not Found";
	}

	
	


	
	public static void main(String args[]){
		Musicplayer player1 = new Musicplayer();
		Scanner sc = new Scanner(System.in);

		int value;
		do{
			System.out.println("1.Add\n2.Play\n3.Remove\n4.Next\n5.Previous\n6.Shuffle\n7.Search\n8.Show Playlist\n9.Modes\n10.Exit");
			System.out.println("Enter Your Choice:");
			value = sc.nextInt();
			sc.nextLine();
			switch(value){
				case 1:{
					System.out.println("Enter the Song:" );
					String n = sc.nextLine();
					System.out.println("Enter the Artist:");
					String a = sc.nextLine();
					System.out.println("Enter the Duration:");
					int d = sc.nextInt();
					sc.nextLine();
					Song s = new Song(n,a,d);
					player1.append(s);
					break;
				}
				case 2:
					player1.playCurrent();
					break;
				case 3:
					System.out.println("Removing...");
					player1.removeCurrent();
					break;
				case 4:
					player1.next();
					break;
				case 5:
					player1.previous();
					break;
				case 6:
					System.out.println("Shuffling...");
					player1.shuffle();
					break;
				case 7:
					{
						System.out.println("Enter The Song:");
						String s = sc.nextLine();
						System.out.println(player1.searchSong(s));
					}
					break;	
				case 8:
						System.out.println("Your Playlist:\n");
						player1.showPlaylist();		
						break;
						
				case 9:{
						System.out.println("\n1.Loop Song\n2.Loop Playlist\n3.Normal");
						
						int m = sc.nextInt();
						if(m >=1 && m <=3){
							player1.mode = m;
						}	
					}
					break;
				case 10:

						System.out.println("Exiting...");
						break;
				default:
					System.out.println("Invalid Input");		

			}
			System.out.print("\n");
	
		}while(value != 10);

		



		/*Song s1 = new Song("Believer","Imagine Dragons",120);
		Song s2 = new Song("Sunflower","Post Malone",116);
		Song s3 = new Song("Monster", "Skillet", 112);

		player1.append(s1);
		player1.append(s2);
		player1.playCurrent();
		player1.removeCurrent();
		player1.append(s1);
		player1.append(s3);
		player1.shuffle();
		player1.playCurrent();
		player1.shuffle();
		player1.playCurrent();
		player1.shuffle();
		player1.playCurrent();
		System.out.println("Song Found:\n" + player1.searchm("Believer")+"\n");
		*/
		
			}
}