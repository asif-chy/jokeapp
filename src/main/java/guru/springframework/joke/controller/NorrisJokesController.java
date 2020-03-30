package guru.springframework.joke.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.joke.services.NorrisJokes;

@Controller
public class NorrisJokesController {
	
	private final NorrisJokes norrisJokes;
	
	public NorrisJokesController(NorrisJokes norrisJokes) {
		super();
		this.norrisJokes = norrisJokes;
	}

	@RequestMapping({"/",""})
	public String sayJoke(Model model) {
		
		model.addAttribute("joke", norrisJokes.getJoke());
		
		return "jokes";
	}
	
}
