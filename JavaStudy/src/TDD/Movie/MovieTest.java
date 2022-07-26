package TDD.Movie;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MovieTest {
	
	@Test
	public void canCreateMovie() {
		
		Movie movie = new Movie();
		assertThat(movie.averageRating()).isEqualTo(0);
	}
	
	

}
