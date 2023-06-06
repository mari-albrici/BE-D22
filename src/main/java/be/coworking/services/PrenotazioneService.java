package be.coworking.services;

import java.util.List;
import java.util.ArrayList;

import lombok.Data;

import org.springframework.stereotype.Service;

import be.coworking.entities.Edificio;
import be.coworking.entities.Postazione;
import be.coworking.entities.Prenotazione;
import be.coworking.entities.Utente;
import be.coworking.entities.enums.Tipo;

@Data
@Service
public class PrenotazioneService {

	private List<Prenotazione> prenotazioni = new ArrayList<>(List.of(
			new Prenotazione(
					new Utente("Mario", "Rossi"), 
					new Postazione(1, "coworking", Tipo.OPENSPACE, 10, new Edificio(1, "Blocco A", "Via Maj", "Milano")))
			));

}
