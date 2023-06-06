package entities;

import enums.Tipo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Postazione {
	private int id;
	private String descrizione;
	private Tipo tipo;
	private int occupanti;
	private Edificio edificio;
}
