package gitLab_practice1;

public class Orange {
	String color;
	Orange(String color)
	{
		this.color=color;
	}
	String getColor()
	{
		return color;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orange greenApple = new Orange ("Green");
		String color = greenApple.getColor();
		System.out.println("color of the apple is"+color);
		
		}

	

}
