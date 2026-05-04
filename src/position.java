
public class position {
	float x;
	float y;
	
	final static float prisonx1=3f;
	final static float prisonx2=12f;
	final static float prisony1=2f;
	final static float prisony2=10f;
	
	public position(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public void setposition(float x,float y) {
		this.x=x;
		this.y=y;
	}
	
	public String getposition() {
		return "La position est: (" + this.x + "," + this.y + ")";
	}
	

	

}
