package services;

import java.util.List;
import java.util.ArrayList;
import entities.Prenotazione;
import entities.Utente;
import entities.Edificio;
import entities.Postazione;
import enums.Tipo;
import lombok.Data;

import org.springframework.stereotype.Service;

@Data
@Service
public class PrenotazioneService {

	private List<Prenotazione> prenotazioni = new ArrayList<>(List.of(
			new Prenotazione(
					new Utente("Mario", "Rossi"), 
					new Postazione(1, "coworking", Tipo.OPENSPACE, 10, new Edificio(1, "Blocco A", "Via Maj", "Milano")))
			));

}
