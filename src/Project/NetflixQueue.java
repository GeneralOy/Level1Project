package Project;

import java.util.ArrayList;
import java.util.Collections;

public class NetflixQueue {

	ArrayList<Movie> movies = new ArrayList<Movie>();

	public Movie getBestMovie() {
		this.sortMoviesByRating();
		return movies.get(0);
	}

	public void addMovie(Movie movie) {
		movies.add(movie);
	}

	public Movie getMovie(int movieNumber) {
		if (movieNumber < movies.size())
			return movies.get(movieNumber);
		else
			System.err.println(
					"That index is larger than the movie queue. Pass a smaller number to the getMovie() method.");
		return null;
	}

	public void sortMoviesByRating() {
		Collections.sort(movies);
	}

	public void printMovies() {
		System.out.println("Your Netflix queue contains: ");
		for (Movie movie : movies) {
			System.out.println(movie);
		}
	}

	public void printPopularMovies(int popularity) {
		if (popularity == 0) {
			System.out.println("The most popular movie on your queue is " + getMovie(popularity));

		} else if (popularity == 1) {
			System.out.println("The second most popular movie on your queue is " + getMovie(popularity));

		}
	}

}
