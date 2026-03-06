

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
	
	public void showPlaylist(){
		Node temp = head;
		while(temp != null){
			temp.song.display();
			System.out.print(" <-> ");
			temp = temp.next;
			}
		System.out.print("(Add more!)\n");

		}
	public void next(){
		if(current != null && current.next != null){
			current = current.next;
			}
		
		}
	public void previous(){
		if(current != null && current.prev != null){
			current = current.prev;
			}
		}

	public void playCurrent(){
		if(current == null) {System.out.println("Empty list");}
		else{
			current.song.display();
			}
		}
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
	public static void main(String args[]){
		Musicplayer mc = new Musicplayer();
		
		Song s1 = new Song("Believer","Imagine Dragons",120);
		Song s2 = new Song("Unholy Gravebirth","Infant Anhilator",116);

		mc.append(s1);
		mc.append(s2);
		mc.playCurrent();
		mc.removeCurrent();
		mc.playCurrent();
		mc.removeCurrent();
		mc.playCurrent();
		
			}

=======

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
	
	public void showPlaylist(){
		Node temp = head;
		while(temp != null){
			temp.song.display();
			System.out.print(" <-> ");
			temp = temp.next;
			}
		System.out.print("(Add more!)\n");

		}
	public void next(){
		if(current != null && current.next != null){
			current = current.next;
			}
		
		}
	public void previous(){
		if(current != null && current.prev != null){
			current = current.prev;
			}
		}

	public void playCurrent(){
		if(current == null) {System.out.println("Empty list");}
		else{
			current.song.display();
			}
		}
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
	public static void main(String args[]){
		Musicplayer mc = new Musicplayer();
		
		Song s1 = new Song("Believer","Imagine Dragons",120);
		Song s2 = new Song("Unholy Gravebirth","Infant Anhilator",116);

		mc.append(s1);
		mc.append(s2);
		mc.playCurrent();
		mc.removeCurrent();
		mc.playCurrent();
		mc.removeCurrent();
		mc.playCurrent();
		
			}

>>>>>>> 799be36c347d5ff8bacaaf04ca86f0f2c44e4ddc
}