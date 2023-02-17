package mvc.model;

public class Giocatore {
	
	private String nome;
	private String cognome;
	private Squadra squadraGioca;
	private int nMaglia;
    enum Ruolo {P,D,C,A}
    private Ruolo ruolo;
	private int gol;
	private int partiteGiocate;
	
	public Giocatore(String nome, String cognome, Squadra squadraGioca, int nMaglia, Ruolo ruolo) {
		this.nome = nome;
		this.cognome = cognome;
		this.squadraGioca = squadraGioca;
		this.nMaglia = nMaglia;
		this.ruolo = ruolo;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getGol() {
		return gol;
	}

	public void setGol(int gol) {
		this.gol = gol;
	}

	public int getPartiteGiocate() {
		return partiteGiocate;
	}

	public void setPartiteGiocate(int partiteGiocate) {
		this.partiteGiocate = partiteGiocate;
	}

	public Squadra getSquadraGioca() {
		return squadraGioca;
	}
	public Ruolo getRuolo() {
		return ruolo;
	}

	public void setRuolo(Ruolo ruolo) {
		this.ruolo = ruolo;
	}

	public int getnMaglia() {
		return nMaglia;
	}

	public void setnMaglia(int nMaglia) {
		this.nMaglia = nMaglia;
	}

	public void setSquadraGioca(Squadra squadraGioca) {
		this.squadraGioca = squadraGioca;
	}
	public String stampaDati() {
		return "Nome: " + this.nome.charAt(0) +". "+ this.cognome +" "+this.nMaglia +"\n"+
	           "Ruolo: " +"\n"+
	           "Squadra: "+ this.squadraGioca.getNome()+"\n"+
			   "Gol segnati: "+ this.gol +"\n"+
	           "Partite giocate: "+this.partiteGiocate;
	}

	
	
	
	

}
