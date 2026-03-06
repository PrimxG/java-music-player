public void shuffle(){
		if(head == null) return;
		Random rand  = new Random();
		int newindex = rand.nextInt(length);
		Node temp = head;
		for(int i = 0 ; i < newindex ; i++){
			temp = temp.next;
		}
		current = temp;

	}