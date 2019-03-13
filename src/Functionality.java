
public class Functionality {
	private String message_;
	public Functionality(String msg){
	this.message_ = msg;
	}
      
	public String hello(){
		return this.message_;
	}   

	public String fake_hello(){
		return null;
	}
	

	public int f_x2(int x)
	{
		return x*2;
	}

	public float min(float x, float y)
	{
		return (x<y)?x:y;
	}

	public double root(double x)
	{
		return Math.sqrt(x);
	}
}
