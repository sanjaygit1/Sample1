package demo;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SampleTest {

	public static void main(String[] args) throws Throwable {
		
		//hello
		Screen scr = new Screen();
	
		Pattern mini = new Pattern("C:\\Users\\Shobha\\Pictures\\Screenshots\\MinimizeBar1.png");
		scr.click(mini);
	
		Pattern search = new Pattern("C:\\Users\\Shobha\\Pictures\\Screenshots\\searchBarrr.png");
		scr.type(search, "NotePad");
		
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		Pattern page = new Pattern("C:\\Users\\Shobha\\Pictures\\Screenshots\\screenPage.png");
		scr.type(page, "Shobha");
	}

}
