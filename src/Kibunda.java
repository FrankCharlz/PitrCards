import java.util.ArrayList;
import java.util.List;


public class Kibunda {
	
	private List<Card> kibunda;
	
	public Kibunda(){
		kibunda = new ArrayList<Card>();
	}
	
	public void add(Card card) {
		this.kibunda.add(card);
	}

	public Card pop(){
		return kibunda.remove(kibunda.size() - 1);
		
	}
	
}
