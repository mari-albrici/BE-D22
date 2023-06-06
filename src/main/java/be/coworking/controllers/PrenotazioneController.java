package be.coworking.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.coworking.exceptions.UnknownLanguage;
import be.coworking.services.PrenotazioneService;

@RestController
@RequestMapping("/bookings")
public class PrenotazioneController {

	@Autowired
	PrenotazioneService prenotazioneService;

	@GetMapping("")
	public String home() {
		return "Choose a language / Scegli la lingua";
	}
	
	@GetMapping("/it")
	public String homeIt() {
		return "Benvenuto nelle prenotazioni di postazione";
	}
	
	@GetMapping("/en")
	public String homeEn() {
		return "Welcome to desk bookings";
	}
	
	@GetMapping("/{lang}")
	public String handleUnknownLanguage(@PathVariable String lang) {
		throw new UnknownLanguage(lang);
	}
}

