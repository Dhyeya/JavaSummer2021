
public class TicTacToeBox {
	int position;
	String text = "";
	
	public void setPosition(int position) {
		this.position = position;
	}
	
	public int getPosition() {
		return position;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public String getText() {
		return text;
	}
	
	public boolean isEmpty() {
		if (text.equals("")) {
			return true; 
		} else {
			return false;
		}
	}
}
