package photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// â€œCopy Image Addressâ€�)
 String Kitten="https://images.unsplash.com/photo-1518791841217-8f162f1e1131?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&w=1000&q=80";
		// 2. create a variable of type "Component" that will hold your image
Component name=createImage(Kitten);
		// 3. use the "createImage()" method below to initialize your Component

		// 4. add the image to the quiz window
quizWindow.add(name);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String Question=JOptionPane.showInputDialog("What color is the kitten");
		// 7. print "CORRECT" if the user gave the right answer
if(Question.equals("Orange")) {
	System.out.println("Correct");
	System.out.println(name);
}else {
	System.out.println("Incorrect");
}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
quizWindow.remove(name);
		// 10. find another image and create it (might take more than one line
		// of code)

		// 11. add the second image to the quiz window
String bunny="http://cdn.24.co.za/files/Cms/General/d/3773/2b17ff1846f34f629db4e7d0174d4652.jpg";
Component image= createImage(bunny);
quizWindow.add(image);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String Question2=JOptionPane.showInputDialog("what is the bunny favorite food");
	
if(Question2.equals("Carrot")) {
	System.out.println("Correct");
	System.out.println(image);
}else {
	System.out.print("Incorrect");

}
	}
	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
