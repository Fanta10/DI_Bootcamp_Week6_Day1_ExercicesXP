
public class Circle {
	//attributs de la classe circle
	private double radius = 1.0 ;
	private String color = "red";
	
	//methode de la classe circle
	
	//constructor sans parametre
	public Circle(){
		
	};
	
	//constructor avec un parametre radius
	public Circle(double radius){
		this.radius = radius;
		
	};
	
	//constructor avec deux parametre radius et color
		public Circle(double radius, String color){
			this.radius = radius;
			this.color = color;			
		};
		
		//getter et setter attribut radius
		public double getRadius(){
			return radius;
			
		}
		public void setRadius(double radius){
			this.radius = radius;
		}
		
		//getter et setter color
				public String getColor(){
					return color;
					
				}
				public void setColor(String color){
					this.color = color;
				}
				
				
						
					@Override
				public String toString() {
					return "Circle [radius=" + radius + ", color=" + color
							+ "]";
				}
					
				
				public double getArea(){
					return Math.PI * radius *radius ;
				}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
