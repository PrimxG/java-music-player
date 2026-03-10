import java.util.Random;
public class Musicplayer{
	private Node head;
	private Node tail;
	private Node current;
	private int length;
		

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
			System.out.print(" <-> ");
			temp = temp.next;
			}
		System.out.print("(Add more!)\n");

		}

	//Next function
		

	public void next(){
		if(current != null && current.next != null){
			current = current.next;
			}
		
		}

	//Previous Function
	
	
	public void previous(){
		if(current != null && current.prev != null){
			current = current.prev;
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
	public String searchm(String s){
		if(head == null) return null;
		Node temp = head;
		while(temp != null){
			if(temp.song.getname().equals(s)){
				return temp.song.getname();
			}else{
				temp = temp.next;
			}
		}
		return null;
	}
	
	
	public static void main(String args[]){
		Musicplayer player1 = new Musicplayer();
		
		Song s1 = new Song("Believer","Imagine Dragons",120);
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

		
			}

		}