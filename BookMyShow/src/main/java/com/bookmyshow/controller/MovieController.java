package com.bookmyshow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookmyshow.model.Movie;
import com.bookmyshow.service.MovieService;


@RestController
@RequestMapping("/movie")
public class MovieController {

	@Autowired 
	MovieService movieService;
	
	@PostMapping("/save")
	public ResponseEntity<Movie> save(@RequestBody Movie movie,HttpStatus code)
	{
		return new ResponseEntity<>(movieService.save(movie),code.CREATED);
	}
	@DeleteMapping("/delete")
	public ResponseEntity<String> delete(Integer id,HttpStatus code)
	{
		return new ResponseEntity<>(movieService.delete(id),code.OK);
	}
	@GetMapping("/get")
	public ResponseEntity<Movie> get(Integer id,HttpStatus code)
	{
		return new ResponseEntity<>(movieService.get(id),code.FOUND);
	}
	@PutMapping("/update")
	public ResponseEntity<Movie> update(@RequestBody Movie movie,HttpStatus code)
	{
		return new ResponseEntity<>(movieService.update(movie),code.OK);
	}
}
