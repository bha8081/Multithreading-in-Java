public class Movie_Book_App extends Thread
{
	public static Book_Theater_Set b;
	int seats;

	public void run()
	{
		b.bookSeat(seats);
	}
	public static void main(String[] args)
	{
		b = new Book_Theater_Set();

		Movie_Book_App mov = new Movie_Book_App();
		mov.seats=9;
		mov.start();

		Movie_Book_App mov2 = new Movie_Book_App();
		mov2.seats=6;
		mov2.start();
	}
}