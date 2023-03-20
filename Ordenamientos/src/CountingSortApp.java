public class CountingSortApp {
    public static void main(String[] args){
        int maxSize = 15;                   // array size
		CountingSort obj = new CountingSort(maxSize);
		
        obj.insert('g');
        obj.insert('e');
        obj.insert('e');
        obj.insert('k');
        obj.insert('s');
        obj.insert('f');
        obj.insert('o');
        obj.insert('r');
        obj.insert('g');
        obj.insert('e');
        obj.insert('e');
        obj.insert('k');
        obj.insert('s');

        obj.display();

		obj.sort();

        obj.display();
	}
}
