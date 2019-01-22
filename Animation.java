import java.awt.*;
import hsa.Console;
import java.lang.*;

public class Animation extends Thread
{

    private Console c;


    public void splashScreen ()
    {
   
	for (int i = 0 ; i < 371 ; i++)
	{
	    c.setColor (Color.black);
	    c.fillRect (-71 + i, 100, 70, 70);
	    c.fillRect (-71 + i, 200, 70, 70);
	    c.fillRect (-221 + i, 100, 70, 70);
	    c.fillRect (-221 + i, 200, 70, 70);
	    c.setColor (Color.red);
	    c.fillRect (-66 + i, 105, 60, 60);
	    c.fillRect (-66 + i, 205, 60, 60);
	    c.fillRect (-216 + i, 105, 60, 60);
	    c.fillRect (-216 + i, 205, 60, 60);
	    c.setColor (Color.white);
	    c.fillRect (-72 + i, 100, 1, 70);
	    c.fillRect (-72 + i, 200, 1, 70);
	    c.fillRect (-222 + i, 100, 1, 70);
	    c.fillRect (-222 + i, 200, 1, 70);
	    try
	    {
		sleep (2);
	    }
	    catch (Exception e)
	    {
	    }
	}
	for (int i = 0 ; i < 371 ; i++)
	{
	    c.setColor (Color.black);
	    c.fillRect (-71 + i, 300, 70, 70);
	    c.fillRect (-71 + i, 400, 70, 70);
	    c.fillRect (-221 + i, 300, 70, 70);
	    c.fillRect (-221 + i, 400, 70, 70);
	    c.setColor (Color.red);
	    c.fillRect (-66 + i, 305, 60, 60);
	    c.fillRect (-66 + i, 405, 60, 60);
	    c.fillRect (-216 + i, 305, 60, 60);
	    c.fillRect (-216 + i, 405, 60, 60);
	    c.setColor (Color.white);
	    c.fillRect (-72 + i, 300, 1, 70);
	    c.fillRect (-72 + i, 400, 1, 70);
	    c.fillRect (-222 + i, 300, 1, 70);
	    c.fillRect (-222 + i, 400, 1, 70);
	    try
	    {
		sleep (2);
	    }
	    catch (Exception e)
	    {
	    }
	}
	for (int i = 0 ; i < 350 ; i++)
	{
	    c.setColor (Color.black);
	    c.fillRect (800 - i, 300, 70, 70);
	    c.fillRect (800 - i, 400, 70, 70);
	    c.fillRect (950 - i, 300, 70, 70);
	    c.fillRect (950 - i, 400, 70, 70);
	    c.setColor (Color.red);
	    c.fillRect (805 - i, 305, 60, 60);
	    c.fillRect (805 - i, 405, 60, 60);
	    c.fillRect (956 - i, 305, 60, 60);
	    c.fillRect (956 - i, 405, 60, 60);
	    c.setColor (Color.white);
	    c.fillRect (871 - i, 300, 1, 70);
	    c.fillRect (871 - i, 400, 1, 70);
	    c.fillRect (1021 - i, 300, 1, 70);
	    c.fillRect (1021 - i, 400, 1, 70);
	    try
	    {
		sleep (2);
	    }
	    catch (Exception e)
	    {
	    }
	}
	for (int i = 0 ; i < 350 ; i++)
	{
	    c.setColor (Color.black);
	    c.fillRect (800 - i, 100, 70, 70);
	    c.fillRect (800 - i, 200, 70, 70);
	    c.fillRect (950 - i, 100, 70, 70);
	    c.fillRect (950 - i, 200, 70, 70);
	    c.setColor (Color.red);
	    c.fillRect (805 - i, 105, 60, 60);
	    c.fillRect (805 - i, 205, 60, 60);
	    c.fillRect (956 - i, 105, 60, 60);
	    c.fillRect (956 - i, 205, 60, 60);
	    c.setColor (Color.white);
	    c.fillRect (871 - i, 100, 1, 70);
	    c.fillRect (871 - i, 200, 1, 70);
	    c.fillRect (1021 - i, 100, 1, 70);
	    c.fillRect (1021 - i, 200, 1, 70);
	    try
	    {
		sleep (2);
	    }
	    catch (Exception e)
	    {
	    }
	}
	c.setColor (Color.white);
	c.fillRect (149, 200, 70, 70);
	c.fillRect (299, 100, 70, 70);
	c.setColor (Color.red);
	c.fillOval (149, 200, 70, 70);
	c.setColor (Color.green);
	c.fillOval (299, 100, 70, 70);
	try
	{
	    sleep (800);
	}
	catch (Exception e)
	{
	}
	c.setColor (Color.black);
	c.fillRect (149, 200, 70, 70);
	c.fillRect (299, 100, 70, 70);
	c.setColor (Color.red);
	c.fillRect (154, 205, 60, 60);
	c.fillRect (304, 105, 60, 60);
	try
	{
	    sleep (500);
	}
	catch (Exception e)
	{
	}
	c.setColor (Color.white);
	c.fillRect (149, 400, 70, 70);
	c.fillRect (299, 200, 70, 70);
	c.setColor (Color.orange);
	c.fillOval (149, 400, 70, 70);
	c.setColor (Color.pink);
	c.fillOval (299, 200, 70, 70);
	try
	{
	    sleep (800);
	}
	catch (Exception e)
	{
	}
	c.setColor (Color.black);
	c.fillRect (149, 400, 70, 70);
	c.fillRect (299, 200, 70, 70);
	c.setColor (Color.red);
	c.fillRect (154, 405, 60, 60);
	c.fillRect (304, 205, 60, 60);
	try
	{
	    sleep (500);
	}
	catch (Exception e)
	{
	}
	c.setColor (Color.white);
	c.fillRect (450, 300, 75, 75);
	c.fillRect (600, 200, 75, 75);
	c.setColor (Color.blue);
	c.fillOval (450, 300, 70, 70);
	c.setColor (Color.blue);
	c.fillOval (600, 200, 70, 70);
	try
	{
	    sleep (800);
	}
	catch (Exception e)
	{
	}
	for (int x = 0 ; x < 3 ; x++)
	{
	    c.setColor (Color.white);
	    c.fillOval (450, 300, 70, 70);
	    c.fillOval (600, 200, 70, 70);
	    try
	    {
		sleep (200);
	    }
	    catch (Exception e)
	    {
	    }


	    c.setColor (Color.blue);
	    c.fillOval (450, 300, 70, 70);
	    c.fillOval (600, 200, 70, 70);
	    try
	    {
		sleep (200);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public Animation (Console con)
    {
	c = con;
    }


    public void run ()
    {
	splashScreen ();
    }
}
