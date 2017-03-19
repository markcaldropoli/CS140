package assignment08;

public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getArea() {
		if(width == 0 || height == 0) {
			return 0;
		}
		if(width < 0 || height < 0) {
			throw new IllegalArgumentException("Width and height must be positive.");
		}
		if(width == 1) {
			return height;
		}
		Rectangle newRect = new Rectangle(width-1,height);
		return height + newRect.getArea();
	}
}
