public class Main {

    public static void main(String[] args) {
	TwoDirList geekList = new TwoDirList();

		System.out.println(geekList.isEmpty());

		geekList.insertFirst(1);

		System.out.println(geekList.isEmpty());

	geekList.insertFirst(2);
	geekList.insertFirst(3);

	geekList.insertLast(7);
	geekList.insertLast(8);
	geekList.insertLast(9);

	geekList.displayList();

	geekList.deleteFirst();
	geekList.deleteFirst();

	geekList.displayList();
    }
}
