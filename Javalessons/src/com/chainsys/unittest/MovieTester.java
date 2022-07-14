package com.chainsys.unittest;

import com.chainsys.classandmethods.Movie;

public class MovieTester {
		public static void testMovie() {
			Movie firstMovie = new Movie();
			firstMovie.setMoviename("Panda");
			firstMovie.setYearOfrelease(2022);
			firstMovie.setActorname("Mohanlal");
			firstMovie.setProducername("KS RaviKumar");
			System.out.println(firstMovie.getMoviename());
			System.out.println(firstMovie.getYearOfrelease());
			System.out.println(firstMovie.getActorname());
			System.out.println(firstMovie.getProducername());
			
		}
	}

