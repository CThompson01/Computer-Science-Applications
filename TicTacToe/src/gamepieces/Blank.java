package gamepieces;

public class Blank extends GamePiece {
	public Blank() {
		this.type = "Blank";
		this.symbol = "1";
	}

	public Blank(String symbol) {
		this.type = "Blank";
		this.symbol = symbol;
	}
}
