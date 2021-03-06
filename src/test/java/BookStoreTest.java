


import static org.junit.Assert.*;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import br.edu.unidavi.poo.maven.App;
import br.edu.unidavi.poo.maven.BookStore;

public class BookStoreTest {

	// This is sufficient accuracy since we're handling currency values, which
	// should be equal to within 2 decimal places.
	private static final double EQUALITY_TOLERANCE = 0.001;

	private BookStore bookStore;

	@Before
	public void setUp() {
		bookStore = new BookStore();
	}
	
	@Test
	public void appTest() {
		App.main(new String[] {});
		assertThat(0.0, CoreMatchers.is(0.0));
	}

	@Test
	public void onlyASingleBook() {
		List<Integer> books = Collections.singletonList(1);
		assertThat(bookStore.calculateBasketCost(books), CoreMatchers.is(8.0));
	}

	@Test
	public void twoOfSameBook() {
		List<Integer> books = Arrays.asList(1, 1);
		//assertEquals(16, bookStore.calculateBasketCost(books), EQUALITY_TOLERANCE);
		assertThat(bookStore.calculateBasketCost(books), CoreMatchers.is(16.0));
	}

	//@Ignore("Remove to run test")
	@Test
	public void emptyBasket() {
		List<Integer> books = Collections.emptyList();
		//assertEquals(0, bookStore.calculateBasketCost(books), EQUALITY_TOLERANCE);
		assertThat(bookStore.calculateBasketCost(books), CoreMatchers.is(0.0));
	}

	//@Ignore("Remove to run test")
	@Test
	public void twoDifferentBooks() {
		List<Integer> books = Arrays.asList(1, 2);
		//assertEquals(15.20, bookStore.calculateBasketCost(books), EQUALITY_TOLERANCE);
		assertThat(bookStore.calculateBasketCost(books), CoreMatchers.is(15.2));
	}

	//@Ignore("Remove to run test")
	@Test
	public void threeDifferentBooks() {
		List<Integer> books = Arrays.asList(1, 2, 3);
		//assertEquals(21.6, bookStore.calculateBasketCost(books), EQUALITY_TOLERANCE);
		assertThat(bookStore.calculateBasketCost(books), CoreMatchers.is(21.6));
	}

	//@Ignore("Remove to run test")
	@Test
	public void fourDifferentBooks() {
		List<Integer> books = Arrays.asList(1, 2, 3, 4);
		//assertEquals(25.6, bookStore.calculateBasketCost(books), EQUALITY_TOLERANCE);
		assertThat(bookStore.calculateBasketCost(books), CoreMatchers.is(25.6));
	}

	//@Ignore("Remove to run test")
	@Test
	public void fiveDifferentBooks() {
		List<Integer> books = Arrays.asList(1, 2, 3, 4, 5);
		//assertEquals(30, bookStore.calculateBasketCost(books), EQUALITY_TOLERANCE);
		assertThat(bookStore.calculateBasketCost(books), CoreMatchers.is(30.0));
	}

	//@Ignore("Remove to run test")
	@Test
	public void twoGroupsOfFourIsCheaperThanGroupOfFivePlusGroupOfThree() {
		List<Integer> books = Arrays.asList(1, 1, 2, 2, 3, 3, 4, 5);
		//assertEquals(51.60, bookStore.calculateBasketCost(books), EQUALITY_TOLERANCE);
		assertThat(bookStore.calculateBasketCost(books), CoreMatchers.is(51.6));
	}

	//@Ignore("Remove to run test")
	@Test
	public void groupOfFourPlusGroupOfTwoIsCheaperThanTwoGroupsOfThree() {
		List<Integer> books = Arrays.asList(1, 1, 2, 2, 3, 4);
		//assertEquals(40.8, bookStore.calculateBasketCost(books), EQUALITY_TOLERANCE);
		assertThat(bookStore.calculateBasketCost(books), CoreMatchers.is(40.8));
	}

	//@Ignore("Remove to run test")
	@Test
	public void twoEachOfFirst4BooksAnd1CopyEachOfRest() {
		List<Integer> books = Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5);
		//assertEquals(55.60, bookStore.calculateBasketCost(books), EQUALITY_TOLERANCE);
		assertThat(bookStore.calculateBasketCost(books), CoreMatchers.is(55.60));
	}

	//@Ignore("Remove to run test")
	@Test
	public void twoCopiesOfEachBook() {
		List<Integer> books = Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5);
		//assertEquals(60.00, bookStore.calculateBasketCost(books), EQUALITY_TOLERANCE);
		assertThat(bookStore.calculateBasketCost(books), CoreMatchers.is(60.00));
	}
	
	/*
	@Ignore("Remove to run test")
	@Test
	public void threeCopiesOfFirstBookAnd2EachOfRemaining() {
		List<Integer> books = Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 1);
		//assertEquals(68.00, bookStore.calculateBasketCost(books), EQUALITY_TOLERANCE);
		assertThat(bookStore.calculateBasketCost(books), CoreMatchers.is(68.00));
	}

	@Ignore("Remove to run test")
	@Test
	public void threeEachOFirst2BooksAnd2EachOfRemainingBooks() {
		List<Integer> books = Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 1, 2);
		//assertEquals(75.20, bookStore.calculateBasketCost(books), EQUALITY_TOLERANCE);
		assertThat(bookStore.calculateBasketCost(books), CoreMatchers.is(75.20));
	}
	*/
	
}