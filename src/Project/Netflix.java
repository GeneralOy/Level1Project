package Project;

public class Netflix {
	public static void main(String[] args) {
		Movie movie1 = new Movie("Pirates of the Carribean 5", 3);
		Movie movie2 = new Movie("Assassin's Creed", 4);
		Movie movie3 = new Movie("Twilight", 0);
		Movie movie4 = new Movie("Star Wars: The Force Awakens", 5);
		Movie movie5 = new Movie("Halo 4: Forwards Unto Dawn", 1);
		NetflixQueue queue1 = new NetflixQueue();
		queue1.addMovie(movie1);
		queue1.addMovie(movie2);
		queue1.addMovie(movie3);
		queue1.addMovie(movie4);
		queue1.addMovie(movie5);
		queue1.printMovies();
		queue1.sortMoviesByRating();
		queue1.getBestMovie();
		queue1.printPopularMovies(0);
		queue1.printPopularMovies(1);
		System.out.println("Pirates of the Carribean 5 tickets; " + movie1.getTicketPrice());
		System.out.println("Assassin's Creed tickets; " + movie2.getTicketPrice());
		System.out.println("Twilight tickets; " + movie3.getTicketPrice());
		System.out.println("Star Wars: The Force Awakens tickets; " + movie4.getTicketPrice());
		System.out.println("Halo 4: Forwards Unto Dawn tickets; " + movie5.getTicketPrice());
	}

}
