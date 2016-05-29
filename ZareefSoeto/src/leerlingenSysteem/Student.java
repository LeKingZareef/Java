package leerlingenSysteem;

class Student {
	private String Naam, Voornaam;
	private int Score, Average, HighScore;
	
	public Student(){
		this("Zareef", "Soeto");
	}
	public Student (String Naam, String Voornaam){
		this.Naam = Naam;
		this.Voornaam = Voornaam;
	}
	public int getScore() {
		return Score;
	}
	public void setScore(int score) {
		Score = score;
	}
	public int getAverage() {
		return Average;
	}
	public void setAverage(int average) {
		Average = average;
	}
	public int getHighScore() {
		return HighScore;
	}
	public void setHighScore(int highScore) {
		HighScore = highScore;
	}
	public String getNaam() {
		return Naam;
	}

	public void setNaam(String naam) {
		Naam = naam;
	}

	public String getVoornaam() {
		return Voornaam;
	}

	public void setVoornaam(String voornaam) {
		Voornaam = voornaam;
	} 
	
}
