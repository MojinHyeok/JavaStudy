package TDD.Movie;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MovieTest {
	private Movie movie;
	
	@Before
	public void setUp() {
		movie =new Movie();
	}
	
	@Test
	public void should_return_0_when_just_created() {
		assertThat(movie.averageRating()).isEqualTo(0);
	}
	
	@Test
	public void should_return_1_when_1_was_reated() {
		movie.rate(1);
		assertThat(movie.averageRating()).isEqualTo(1);
	}
	
	@Test
	public void should_return_4_when_3_and_5_was_reated() {
		movie.rate(3);
		movie.rate(5);
		assertThat(movie.averageRating()).isEqualTo(4);
	}
	

}
