//nested classes

public class Robot {
	
	private int id ;
	
  private  class Brain{
		public void think(){
			System.out.println("robot " + id + "thinking");
		}
		
	}
  
 public  static class Battery{
	  public void charge(){
		  System.out.println("battery charging");
	  }
  }
	public Robot(int id) {
		this.id = id;
		}
	public void start(){
		System.out.println("starting a robot with id: " + id);

		Brain brain = new Brain();
		brain.think();
		final String name = "harish";
		
		class Temp{
			public void doSth(){
				System.out.println(id);
				System.out.println(name);
			}
		}
		Temp temp = new Temp();
		temp.doSth();
			}
			
		}
	
	

