package TDD.Movie;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MovieTest {
	
	@Test
	public void should_return_0_when_just_created() {
		Movie movie = new Movie();
		assertThat(movie.averageRating()).isEqualTo(0);
	}
	
	@Test
	public void should_return_1_when_1_was_reated() {
		Movie movie = new Movie();
		movie.rate(1);
		assertThat(movie.averageRating()).isEqualTo(1);
	}
	
	
	
	

}
