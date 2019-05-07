package houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {

	public static void main(String[] args) {
		Robot r2d2 = new Robot();
		r2d2.miniaturize();
		r2d2.moveTo(50, 450);
		r2d2.penDown();
		r2d2.setSpeed(100);
       drawHouse(r2d2,"" , 189);
       drawHouse(r2d2,"medium",179);
       drawHouse(r2d2,"large",179);
       drawHouse(r2d2,"large",139);
       drawHouse(r2d2,"large",179);
       drawHouse(r2d2,"medium",119);
       drawHouse(r2d2,"large",109);
       drawHouse(r2d2,"medium",179);
       drawHouse(r2d2,"large",179);
       
	}

	
	static void drawHouse(Robot r, String h, int color) {
		int Height = 60;
		
		if("medium".equals(h)){
			Height=120;
		
		}else if ("large".equals(h)) {
			Height=250;
				}

		r.setPenColor(color, color, color);
		r.move(Height);
		r.turn(90);
		r.move(20);
		r.turn(90);	
		r.move(Height);
		r.setPenColor(0, 255, 0);
		r.turn(-90);
		r.move(15);
		r.turn(-90);

}

	void drawPointyRoof(Robot r2) {
		r2.turn(45);
		r2.move(25);
		r2.turn(90);
		r2.move(25);
		r2.turn(45);
	}

	void drawFlatRoof(Robot r1) {
	    r1.turn(90);
		r1.move(20);
		r1.turn(90);	
	}
}
