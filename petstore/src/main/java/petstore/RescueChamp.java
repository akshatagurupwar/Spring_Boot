package petstore;

public class RescueChamp {
	
	private String champName;
	private int animalsRescued;
	
	
	
	public String getChampName() {
		return champName;
	}
	public void setChampName(String champName) {
		this.champName = champName;
	}
	public int getAnimalsRescued() {
		return animalsRescued;
	}
	public void setAnimalsRescued(int animalsRescued) {
		this.animalsRescued = animalsRescued;
	}
	public RescueChamp(String champName, int animalsRescued) {
		super();
		this.champName = champName;
		this.animalsRescued = animalsRescued;
	}
	public RescueChamp() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
