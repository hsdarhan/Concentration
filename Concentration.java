/* Harsimran Darhan
January 18 2017

Welcome to the two player game of Concentration! This game will test your short term memory.
The user will be first taken to the main menu, where they will have the option to either
continue to play, check the high scores, view the instructions and exit. If the user
chooses to play, they will be taken to level select, where they can choose either level 1, 2 or 3.
In the game there will be a certain amount of cards based on the level. Each player selects 2 cards, which
then flip over. If the cards are a match they remain face up, and the player receives 1 point.
After each set of flips, the turns alternate. The game continues until all of the cards have been succesfully flipped.
Then the winner will be displayed, and the user will be taken back to the main menu.



Instance Variable Dictionary
------------------------------------------------------------------------------------------------------------------------------------------------------
Name                Type                        Purpose

select              int                     Store player 1's input.
select2             int                     Stores player 2's input.
score               int                     Stores player 1's score.
score2              int                     Stores player 2's score.
finalScore          int                     Stores the winners score.
loserScore          int                     Stores the losers score.
header              String                  Stores the header
p1 - p8             Image                   Stores the images for the first level
pM1 - pM18          Image                   Stores the images for the second level
PH1 - pH32          Image                   Stores the images for the third level
instructions        Image                   Stores the instructions image.
choice              String                  Stores menu input
level               String                  Stores level input
name                String                  Stores the name of player 1
name2               String                  Stores the name of player 2
winner              String                  Stores the name of the winner
loser               String                  Stores the name of the loser
winningLevel        String                  Stores the winning level.
counter             int                     Stores players turn.
easyPic            Image []                 Stores images for first level
mediumPic          Image []                 Stores images for second level
hardPic            Image []                  Stores images for third level
EASY             static final int           Stores the number of cards in first level
MEDIUM           static final int           Stores the number of cards in second level
HARD             static final int               Stores the number of cards in third level
xEasy               int []                    Stores x coordinates for cards in first level
xMedium             int []                    Stores x coordinates for cards in second level
xHard               int []                    Stores x coordinates for cards in third level
yEasy               int []                    Stores y coordinates for cards in first level
yMedium             int []                    Stores y coordinates for cards in second level
yHard               int []                    Stores y coordinates for cards in third level
checkEasy          boolean []                 Stores either true or false to determine if the image was flipped.
checkMedium        boolean []                 Stores either true or false to determine if the image was flipped.
checkHard          boolean []                 Stores either true or false to determine if the image was flipped.
ensure             boolean                    Stores either true or false to call check method.
c                  reference                  Allows access to Console
tie                boolean                    Stores either true or false to determine if the game is a tie.
*/

//import section
import java.awt.*;
import hsa.*;
import java.io.*;
import java.applet.*;

public class Concentration
{

    Console c;
    int select, select2, score = 0, score2 = 0, finalScore = 0, loserScore = 0;
    String header = "Concentration High Scores";
    Image p1, p2, p3, p4, p5, p6, p7, p8;
    Image pM1, pM2, pM3, pM4, pM5, pM6, pM7, pM8, pM9, pM10, pM11, pM12, pM13, pM14, pM15, pM16, pM18, pM17;
    Image pH1, pH2, pH3, pH4, pH5, pH6, pH7, pH8, pH9, pH10, pH11, pH12, pH13, pH14, pH15, pH16, pH17, pH18, pH19, pH20, pH21, pH22, pH23, pH24, pH25, pH26, pH27, pH28, pH29, pH30, pH31, pH32;
    Image instructions;
    String choice, level, name = "", name2 = "", winner = "", loser = "", winningLevel;
    int counter = 2;
    static final int EASY = 16;
    static final int MEDIUM = 36;
    static final int HARD = 64;
    Image[] easyPic = new Image [EASY];
    Image[] mediumPic = new Image [MEDIUM];
    Image[] hardPic = new Image [HARD];
    int[] xEasy = new int [EASY];
    int[] yEasy = new int [EASY];
    int[] xMedium = new int [MEDIUM];
    int[] yMedium = new int [MEDIUM];
    int[] xHard = new int [HARD];
    int[] yHard = new int [HARD];
    boolean[] checkEasy = new boolean [EASY];
    boolean[] checkMedium = new boolean [MEDIUM];
    boolean[] checkHard = new boolean [HARD];
    boolean ensure = false;
    boolean tie = false;

    // This method is responsible for the animation.
    public void splashScreen ()
    {
	Animation a = new Animation (c);
	a.run ();
    }


    // This method is responsible for loading the images.
    public void loadImage ()
    {
	p1 = Toolkit.getDefaultToolkit ().getImage ("easyPics/fblogo.jpg");
	p2 = Toolkit.getDefaultToolkit ().getImage ("easyPics/snplogo.png");
	p3 = Toolkit.getDefaultToolkit ().getImage ("easyPics/instalogo.jpg");
	p4 = Toolkit.getDefaultToolkit ().getImage ("easyPics/redditlogo.jpg");
	p5 = Toolkit.getDefaultToolkit ().getImage ("easyPics/vinelogo.jpg");
	p6 = Toolkit.getDefaultToolkit ().getImage ("easyPics/pluslogo.png");
	p7 = Toolkit.getDefaultToolkit ().getImage ("easyPics/tumblogo.png");
	p8 = Toolkit.getDefaultToolkit ().getImage ("easyPics/linklogo.png");
	pM1 = Toolkit.getDefaultToolkit ().getImage ("mediumPics/sport1.png");
	pM2 = Toolkit.getDefaultToolkit ().getImage ("mediumPics/sport2.jpg");
	pM3 = Toolkit.getDefaultToolkit ().getImage ("mediumPics/sport3.jpg");
	pM4 = Toolkit.getDefaultToolkit ().getImage ("mediumPics/sport4.jpg");
	pM5 = Toolkit.getDefaultToolkit ().getImage ("mediumPics/sport5.jpg");
	pM6 = Toolkit.getDefaultToolkit ().getImage ("mediumPics/sport6.jpg");
	pM7 = Toolkit.getDefaultToolkit ().getImage ("mediumPics/sport7.jpg");
	pM8 = Toolkit.getDefaultToolkit ().getImage ("mediumPics/sport8.jpg");
	pM9 = Toolkit.getDefaultToolkit ().getImage ("mediumPics/sport9.jpg");
	pM10 = Toolkit.getDefaultToolkit ().getImage ("mediumPics/sport10.jpg");
	pM11 = Toolkit.getDefaultToolkit ().getImage ("mediumPics/sport11.jpg");
	pM12 = Toolkit.getDefaultToolkit ().getImage ("mediumPics/sport12.jpg");
	pM13 = Toolkit.getDefaultToolkit ().getImage ("mediumPics/sport13.jpg");
	pM14 = Toolkit.getDefaultToolkit ().getImage ("mediumPics/sport14.jpg");
	pM15 = Toolkit.getDefaultToolkit ().getImage ("mediumPics/sport15.jpg");
	pM16 = Toolkit.getDefaultToolkit ().getImage ("mediumPics/sport16.jpg");
	pM17 = Toolkit.getDefaultToolkit ().getImage ("mediumPics/sport17.jpg");
	pM18 = Toolkit.getDefaultToolkit ().getImage ("mediumPics/sport18.jpg");
	pH1 = Toolkit.getDefaultToolkit ().getImage ("hardPics/flag1.png");
	pH2 = Toolkit.getDefaultToolkit ().getImage ("hardPics/flag2.png");
	pH3 = Toolkit.getDefaultToolkit ().getImage ("hardPics/flag3.png");
	pH4 = Toolkit.getDefaultToolkit ().getImage ("hardPics/flag4.png");
	pH5 = Toolkit.getDefaultToolkit ().getImage ("hardPics/flag5.png");
	pH6 = Toolkit.getDefaultToolkit ().getImage ("hardPics/flag6.png");
	pH7 = Toolkit.getDefaultToolkit ().getImage ("hardPics/flag7.png");
	pH8 = Toolkit.getDefaultToolkit ().getImage ("hardPics/flag8.png");
	pH9 = Toolkit.getDefaultToolkit ().getImage ("hardPics/flag9.png");
	pH10 = Toolkit.getDefaultToolkit ().getImage ("hardPics/flag10.png");
	pH11 = Toolkit.getDefaultToolkit ().getImage ("hardPics/flag11.png");
	pH12 = Toolkit.getDefaultToolkit ().getImage ("hardPics/flag12.png");
	pH13 = Toolkit.getDefaultToolkit ().getImage ("hardPics/flag13.png");
	pH14 = Toolkit.getDefaultToolkit ().getImage ("hardPics/flag14.png");
	pH15 = Toolkit.getDefaultToolkit ().getImage ("hardPics/flag15.png");
	pH16 = Toolkit.getDefaultToolkit ().getImage ("hardPics/flag16.png");
	pH17 = Toolkit.getDefaultToolkit ().getImage ("hardPics/flag17.png");
	pH18 = Toolkit.getDefaultToolkit ().getImage ("hardPics/flag18.png");
	pH19 = Toolkit.getDefaultToolkit ().getImage ("hardPics/flag19.png");
	pH20 = Toolkit.getDefaultToolkit ().getImage ("hardPics/flag20.png");
	pH21 = Toolkit.getDefaultToolkit ().getImage ("hardPics/flag21.png");
	pH22 = Toolkit.getDefaultToolkit ().getImage ("hardPics/flag22.png");
	pH23 = Toolkit.getDefaultToolkit ().getImage ("hardPics/flag23.png");
	pH24 = Toolkit.getDefaultToolkit ().getImage ("hardPics/flag24.png");
	pH25 = Toolkit.getDefaultToolkit ().getImage ("hardPics/flag25.png");
	pH26 = Toolkit.getDefaultToolkit ().getImage ("hardPics/flag26.png");
	pH27 = Toolkit.getDefaultToolkit ().getImage ("hardPics/flag27.png");
	pH28 = Toolkit.getDefaultToolkit ().getImage ("hardPics/flag28.png");
	pH29 = Toolkit.getDefaultToolkit ().getImage ("hardPics/flag29.png");
	pH30 = Toolkit.getDefaultToolkit ().getImage ("hardPics/flag30.png");
	pH31 = Toolkit.getDefaultToolkit ().getImage ("hardPics/flag31.png");
	pH32 = Toolkit.getDefaultToolkit ().getImage ("hardPics/flag32.png");
	instructions = Toolkit.getDefaultToolkit ().getImage ("instructions.png");

	MediaTracker tracker = new MediaTracker (new Frame ());
	tracker.addImage (p1, 0);
	tracker.addImage (p2, 0);
	tracker.addImage (p3, 0);
	tracker.addImage (p4, 0);
	tracker.addImage (p5, 0);
	tracker.addImage (p6, 0);
	tracker.addImage (p7, 0);
	tracker.addImage (p8, 0);

	tracker.addImage (pM1, 0);
	tracker.addImage (pM2, 0);
	tracker.addImage (pM3, 0);
	tracker.addImage (pM4, 0);
	tracker.addImage (pM5, 0);
	tracker.addImage (pM6, 0);
	tracker.addImage (pM7, 0);
	tracker.addImage (pM8, 0);
	tracker.addImage (pM9, 0);
	tracker.addImage (pM10, 0);
	tracker.addImage (pM11, 0);
	tracker.addImage (pM12, 0);
	tracker.addImage (pM13, 0);
	tracker.addImage (pM14, 0);
	tracker.addImage (pM15, 0);
	tracker.addImage (pM16, 0);
	tracker.addImage (pM17, 0);
	tracker.addImage (pM18, 0);

	tracker.addImage (pH1, 0);
	tracker.addImage (pH2, 0);
	tracker.addImage (pH3, 0);
	tracker.addImage (pH4, 0);
	tracker.addImage (pH5, 0);
	tracker.addImage (pH6, 0);
	tracker.addImage (pH7, 0);
	tracker.addImage (pH8, 0);
	tracker.addImage (pH9, 0);
	tracker.addImage (pH10, 0);
	tracker.addImage (pH11, 0);
	tracker.addImage (pH12, 0);
	tracker.addImage (pH13, 0);
	tracker.addImage (pH14, 0);
	tracker.addImage (pH15, 0);
	tracker.addImage (pH16, 0);
	tracker.addImage (pH17, 0);
	tracker.addImage (pH18, 0);
	tracker.addImage (pH19, 0);
	tracker.addImage (pH20, 0);
	tracker.addImage (pH21, 0);
	tracker.addImage (pH22, 0);
	tracker.addImage (pH23, 0);
	tracker.addImage (pH24, 0);
	tracker.addImage (pH25, 0);
	tracker.addImage (pH26, 0);
	tracker.addImage (pH27, 0);
	tracker.addImage (pH28, 0);
	tracker.addImage (pH29, 0);
	tracker.addImage (pH30, 0);
	tracker.addImage (pH31, 0);
	tracker.addImage (pH32, 0);
	tracker.addImage (instructions, 0);
	try
	{
	    tracker.waitForAll ();
	}
	catch (InterruptedException e)
	{
	}

	if (tracker.isErrorAny ())
	{

	    return;
	}
    }


    // This method is responsible for clearing the screen, and drawing the title.
    private void drawTitle ()
    {
	c.clear ();
	c.setColor (Color.black);
	c.setFont (new Font ("Agency FB", Font.BOLD, 50));
	c.drawString ("CONCENTRATION", 280, 50);
    }


    /* This method is responsible for displaying the main menu.
    The while loop loops the user input, unless it is valid.
    The validity is determined by the if statements, as the input must be either 1, 2,3 or 4.
    The line variable is used to clear the input, incase of an invalid input.
    */
    public void mainMenu ()
    {
	drawTitle ();

	c.setColor (Color.black);

	int line = 11;

	c.setCursor (4, 1);
	c.println ("Welcome to the main menu!");
	c.println ();
	c.println ("1.      Play");
	c.println ("2.      Highscores");
	c.println ("3.      Instructions");
	c.println ("4.      Exit");
	c.println ();

	line++;
	while (true)
	{
	    c.setCursor (line, 1);
	    c.print ("Please select one of the options:");
	    choice = c.readString ();
	    if ((!choice.equals ("1")) && (!choice.equals ("2")) && (!choice.equals ("3")) && (!choice.equals ("4")))
	    {
		new Message ("Please choose either '1', '2', '3' or '4'!", "ERROR");
		c.setCursor (line, 1);
		c.println ();
	    }
	    else
		break;
	}
    }


    /* This method is responsible for the main concentration game.
    The first 6 for loops are used to add values to the arrays, while the next 3 for loops add values to the boolean arrays.
    The first while loop is the main loop that loops both of the players' input.
    The first if statement determines who's turn it is, based on the incrementing counter.
    The next while loop loops the first players input incase of invalid input. This is done in a try catch block, which catches the invalid input.
    The invalid input is detected by two if statements. The possible errors are that the user enters a picture already chosen, or does not enter numbers 1-16.
    The while loops breaks when a valid input is entered, or 100 is entered (incase the user wants to exit).
    The same process is written again, except for the second player. The game continues until all of the cards have been flipped. One done so,
    the winner and their score is displayed.

    Local Variable Dictionary
    ------------------------------------------------------------------------------------------------------------------------------------------------------
    Name            Type                        Purpose
    increaser       int                        Used to give values to arrays.
    increaser2       int                        Used to give values to arrays.
    increaser3      int                        Used to give values to arrays.

    */

    public void display ()
    {


	int increaser = 0;
	int increaser2 = 0;
	int increaser3 = 0;
	score = 0;
	score2 = 0;
	counter = 2;
	drawTitle ();
	tie = false;

	easyPic [0] = p1;
	easyPic [1] = p4;
	easyPic [2] = p2;
	easyPic [3] = p6;
	easyPic [4] = p8;
	easyPic [5] = p7;
	easyPic [6] = p3;
	easyPic [7] = p8;
	easyPic [8] = p7;
	easyPic [9] = p1;
	easyPic [10] = p6;
	easyPic [11] = p2;
	easyPic [12] = p5;
	easyPic [13] = p3;
	easyPic [14] = p5;
	easyPic [15] = p4;


	mediumPic [0] = pM1;
	mediumPic [1] = pM3;
	mediumPic [2] = pM9;
	mediumPic [3] = pM1;
	mediumPic [4] = pM6;
	mediumPic [5] = pM8;
	mediumPic [6] = pM3;
	mediumPic [7] = pM2;
	mediumPic [8] = pM7;
	mediumPic [9] = pM11;
	mediumPic [10] = pM18;
	mediumPic [11] = pM17;
	mediumPic [12] = pM5;
	mediumPic [13] = pM2;
	mediumPic [14] = pM4;
	mediumPic [15] = pM5;
	mediumPic [16] = pM18;
	mediumPic [17] = pM16;
	mediumPic [18] = pM8;
	mediumPic [19] = pM10;
	mediumPic [20] = pM9;
	mediumPic [21] = pM16;
	mediumPic [22] = pM14;
	mediumPic [23] = pM14;
	mediumPic [24] = pM13;
	mediumPic [25] = pM12;
	mediumPic [26] = pM10;
	mediumPic [27] = pM7;
	mediumPic [28] = pM11;
	mediumPic [29] = pM15;
	mediumPic [30] = pM15;
	mediumPic [31] = pM12;
	mediumPic [32] = pM17;
	mediumPic [33] = pM4;
	mediumPic [34] = pM6;
	mediumPic [35] = pM13;


	hardPic [0] = pH32;
	hardPic [1] = pH1;
	hardPic [2] = pH13;
	hardPic [3] = pH3;
	hardPic [4] = pH7;
	hardPic [5] = pH2;
	hardPic [6] = pH10;
	hardPic [7] = pH3;
	hardPic [8] = pH14;
	hardPic [9] = pH2;
	hardPic [10] = pH19;
	hardPic [11] = pH13;
	hardPic [12] = pH26;
	hardPic [13] = pH8;
	hardPic [14] = pH25;
	hardPic [15] = pH19;
	hardPic [16] = pH22;
	hardPic [17] = pH1;
	hardPic [18] = pH4;
	hardPic [19] = pH31;
	hardPic [20] = pH32;
	hardPic [21] = pH20;
	hardPic [22] = pH31;
	hardPic [23] = pH20;
	hardPic [24] = pH15;
	hardPic [25] = pH14;
	hardPic [26] = pH28;
	hardPic [27] = pH8;
	hardPic [28] = pH16;
	hardPic [29] = pH15;
	hardPic [30] = pH30;
	hardPic [31] = pH16;
	hardPic [32] = pH21;
	hardPic [33] = pH23;
	hardPic [34] = pH7;
	hardPic [35] = pH29;
	hardPic [36] = pH21;
	hardPic [37] = pH30;
	hardPic [38] = pH4;
	hardPic [39] = pH29;
	hardPic [40] = pH10;
	hardPic [41] = pH27;
	hardPic [42] = pH24;
	hardPic [43] = pH28;
	hardPic [44] = pH17;
	hardPic [45] = pH25;
	hardPic [46] = pH27;
	hardPic [47] = pH24;
	hardPic [48] = pH5;
	hardPic [49] = pH26;
	hardPic [50] = pH11;
	hardPic [51] = pH11;
	hardPic [52] = pH23;
	hardPic [53] = pH6;
	hardPic [54] = pH9;
	hardPic [55] = pH17;
	hardPic [56] = pH12;
	hardPic [57] = pH22;
	hardPic [58] = pH18;
	hardPic [59] = pH5;
	hardPic [60] = pH6;
	hardPic [61] = pH9;
	hardPic [62] = pH12;
	hardPic [63] = pH18;

	for (int q = 0 ; q < 16 ; q = q + 4)
	{
	    xEasy [(q - 4) + 4] = 150;
	    xEasy [((q + 1) - 4) + 4] = 300;
	    xEasy [((q + 2) - 4) + 4] = 450;
	    xEasy [((q + 3) - 4) + 4] = 600;

	}

	for (int i = 0 ; i < EASY ; i = i + 4)
	{
	    increaser++;

	    yEasy [i] = (100 * increaser);
	    yEasy [i + 1] = (100 * increaser);
	    yEasy [i + 2] = (100 * increaser);
	    yEasy [i + 3] = (100 * increaser);
	}

	for (int q = 0 ; q < 36 ; q = q + 6)
	{
	    xMedium [(q - 6) + 6] = 125;
	    xMedium [((q + 1) - 6) + 6] = 225;
	    xMedium [((q + 2) - 6) + 6] = 325;
	    xMedium [((q + 3) - 6) + 6] = 425;
	    xMedium [((q + 4) - 6) + 6] = 525;
	    xMedium [((q + 5) - 6) + 6] = 625;
	}
	for (int i = 0 ; i < MEDIUM ; i = i + 6)
	{
	    increaser2++;
	    yMedium [i] = (70 * increaser2);
	    yMedium [i + 1] = (70 * increaser2);
	    yMedium [i + 2] = (70 * increaser2);
	    yMedium [i + 3] = (70 * increaser2);
	    yMedium [i + 4] = (70 * increaser2);
	    yMedium [i + 5] = (70 * increaser2);
	}


	for (int i = 0 ; i < HARD ; i = i + 8)
	{
	    xHard [(i - 8) + 8] = 130;
	    xHard [((i + 1) - 8) + 8] = 200;
	    xHard [((i + 2) - 8) + 8] = 270;
	    xHard [((i + 3) - 8) + 8] = 340;
	    xHard [((i + 4) - 8) + 8] = 410;
	    xHard [((i + 5) - 8) + 8] = 480;
	    xHard [((i + 6) - 8) + 8] = 550;
	    xHard [((i + 7) - 8) + 8] = 620;


	}
	for (int i = 0 ; i < HARD ; i = i + 8)
	{
	    increaser3++;
	    yHard [i] = (57 * increaser3);
	    yHard [i + 1] = (57 * increaser3);
	    yHard [i + 2] = (57 * increaser3);
	    yHard [i + 3] = (57 * increaser3);
	    yHard [i + 4] = (57 * increaser3);
	    yHard [i + 5] = (57 * increaser3);
	    yHard [i + 6] = (57 * increaser3);
	    yHard [i + 7] = (57 * increaser3);
	}

	for (int i = 0 ; i < checkEasy.length ; i++)
	{
	    checkEasy [i] = true;

	}
	for (int i = 0 ; i < checkMedium.length ; i++)
	{
	    checkMedium [i] = true;
	}
	for (int i = 0 ; i < checkHard.length ; i++)
	{

	    checkHard [i] = true;
	}

	drawBackground ();

	while (true)
	{

	    c.setFont (new Font ("Agency FB", Font.BOLD, 30));

	    if ((counter % 2) != 0)
	    {
		c.setColor (Color.white);
		c.fillRect (0, 510, 200, 80);
		c.setColor (Color.black);
		c.drawString (name2 + "'s turn:", 10, 540);
	    }
	    else
	    {
		c.setColor (Color.white);
		c.fillRect (0, 510, 200, 80);
		c.setColor (Color.black);
		c.drawString (name + "'s turn:", 10, 540);
	    }

	    while (true)
	    {
		ensure = false;
		try
		{

		    c.setCursor (28, 1);
		    c.print ("What picture do you want to flip?");

		    select = Integer.parseInt (c.readLine ());

		    if (select == 100)
			break;
		    if (select < maximum (level) && select > 0)
		    {
			chosen ();
			if (ensure == false)
			{
			    drawPic ();
			    break;
			}
		    }
		    else
		    {
			new Message (selection (level), "ERROR");
		    }
		}
		catch (NumberFormatException e)
		{
		    new Message ("Please enter a number!", "ERROR");


		}
		c.setCursor (28, 1);
		c.println ();
	    }
	    if (select == 100)
		break;
	    while (true)
	    {
		ensure = false;
		try
		{

		    c.setCursor (28, 1);
		    c.print ("What is the second picture you want to flip?");

		    select2 = Integer.parseInt (c.readLine ());
		    if (select2 == 100)
			break;
		    if (select2 < maximum (level) && select2 > 0)
		    {
			secondChosen ();
			if (ensure == false)
			{
			    drawSecondPic ();
			    break;
			}
		    }
		    else
		    {
			new Message (selection (level), "ERROR");
		    }
		}
		catch (NumberFormatException e)
		{
		    new Message ("Please enter a number!", "ERROR");

		}
		c.setCursor (28, 1);
		c.println ();
	    }
	    if (select2 == 100)
		break;
	    try
	    {
		Thread.sleep (1000);
	    }
	    catch (Exception e)
	    {
	    }


	    clear ();
	    counter++;
	    if (over ())
	    {
		c.clear ();
		break;
	    }

	    c.setCursor (28, 1);
	    c.println ();

	}
	drawTitle ();

	c.setCursor (7, 1);
	calculateScore ();
	if (tie == false)
	{
	    c.println ("The Winner is: " + winner + " with a score of " + finalScore + " on level " + winningLevel);
	    c.println (loser + "'s score is " + loserScore);
	}
	else
	{
	    c.println ("It is a tie!");
	    c.println ("Both players scored " + finalScore + " points on level " + winningLevel);

	}
	sortScores ();
	pauseProgram ();
    }


    private void sortScores ()
    {
	final int LINES = 10;
	int[] scores = new int [LINES];

	String[] winnersAndLevel = new String [LINES];
	int storedScore = 0;
	int counter = 0;
	String line = "";
	String storedWinnerAndLevel = "";

	int i;

	try
	{
	    BufferedReader in = new BufferedReader (new FileReader ("highscores.txt"));
	    in.readLine ();
	    while (counter < LINES)
	    {

		line = in.readLine ();
		if (line != null)
		{
		    for (i = line.length () - 1 ; i > 0 ; i--)
		    {
			if (line.charAt (i) == ' ')

			    break;

		    }
		    storedScore = Integer.parseInt (line.substring (i + 1));
		    storedWinnerAndLevel = line.substring (0, i - 1);

		}
		else
		    break;
	    }


	}


	catch (IOException e)
	{

	}


	catch (NumberFormatException e)
	{

	}
    }


    // This private mathod is responsible for calculating the highscores, aswell as determining the winner and loser.
    // The if statements are used to determine what score is higher, and then declare varibles to the winner and loser.

    private void calculateScore ()
    {
	if (score > score2)
	{
	    winner = name;
	    finalScore = score;
	    loser = name2;
	    loserScore = score2;

	}


	else if (score2 > score)
	{
	    winner = name2;
	    finalScore = score2;
	    loser = name;
	    loserScore = score;
	}
	else
	{
	    if (score2 == score)
	    {
		tie = true;

		winner = name2 + "/" + name;
		finalScore = score;
	    }
	}


	winningLevel = level;
    }


    // This method is responsible for puasing the program at any given moment.
    private void pauseProgram ()
    {
	c.println ();
	c.print ("Press any key to continue...");
	c.getChar ();
    }


    // Private method that draws the first picture.
    // The if statements draw the picture according to the level.
    private void drawPic ()
    {
	if (level.equals ("1"))

	    c.drawImage (easyPic [select - 1], xEasy [select - 1], yEasy [select - 1], null);
	else if (level.equals ("2"))

	    c.drawImage (mediumPic [select - 1], xMedium [select - 1], yMedium [select - 1], null);
	else
	{
	    if (level.equals ("3"))
		c.drawImage (hardPic [select - 1], xHard [select - 1], yHard [select - 1], null);

	}
    }


    // Private method that draws the second picture according to the level
    // The if statements draw the picture according to the level.
    private void drawSecondPic ()
    {
	if (level.equals ("1"))

	    c.drawImage (easyPic [select2 - 1], xEasy [select2 - 1], yEasy [select2 - 1], null);
	else if (level.equals ("2"))
	    c.drawImage (mediumPic [select2 - 1], xMedium [select2 - 1], yMedium [select2 - 1], null);
	else
	{
	    if (level.equals ("3"))
		c.drawImage (hardPic [select2 - 1], xHard [select2 - 1], yHard [select2 - 1], null);

	}
    }


    // private method that checks if a picture has already been chosen according to the level.
    // the outter if statements check to see what level it is, the inner if statements check to see if the picture was chosen.
    private void chosen ()
    {
	if (level.equals ("1"))
	{
	    if (checkEasy [select - 1] == false)
	    {
		new Message ("You aleady chose this", "ERROR");
		ensure = true;
	    }
	}


	if (level.equals ("2"))
	{
	    if (checkMedium [select - 1] == false)
	    {
		new Message ("You aleady chose this", "ERROR");
		ensure = true;
	    }
	}


	if (level.equals ("3"))
	{
	    if (checkHard [select - 1] == false)
	    {
		new Message ("You aleady chose this", "ERROR");
		ensure = true;
	    }
	}
    }


    // private method that checks if the second input has been chosen, as well as if the first input is the same as the second input, according to the level.
    //the outer if statements check what level it is, and the inner if statements check to see if the second picture was chosen, and if the first picture is the same as the second.
    private void secondChosen ()

    {
	if (level.equals ("1"))
	{
	    if (checkEasy [select2 - 1] == false || select == select2)
	    {
		new Message ("You aleady chose this", "ERROR");
		ensure = true;
	    }
	}


	if (level.equals ("2"))
	{
	    if (checkMedium [select2 - 1] == false || select == select2)
	    {
		new Message ("You aleady chose this", "ERROR");
		ensure = true;
	    }
	}


	if (level.equals ("3"))
	{

	    if (checkHard [select2 - 1] == false || select == select2)
	    {
		new Message ("You aleady chose this", "ERROR");
		ensure = true;
	    }

	}
    }


    // This private method returns an error message, according to what level it is.
    // The if statements return a message based on the level
    // The perameter pass is the level.
    private String selection (String level)
    {
	if (level.equals ("1"))
	    return "Please enter a number between 1 and 16!";
	else if (level.equals ("2"))
	    return "Please enter a number between 1 and 36!";
	else
	    return "Please enter a number between 1 and 64!";
    }


    // This private method returns the highest card, based on the level.
    // The if statements return an integer based on what level it is.
    // The perameter pass is the level.
    private int maximum (String level)
    {
	if (level.equals ("1"))
	    return (17);

	else if (level.equals ("2"))
	    return (37);
	else
	    return (65);
    }


    // This private method draws the background.
    // The if statements draw certain cards based on what the level is.
    // The for loops draw the cards.
    // The for loop variables increment certain amount of times to draw the cards.
    private void drawBackground ()
    {
	if (level.equals ("1"))
	{
	    for (int i = 0 ; i < 16 ; i++)
	    {
		c.setColor (Color.black);
		c.fillRect (xEasy [i], yEasy [i], 70, 70);
		c.setColor (Color.red);
		c.fillRect (xEasy [i] + 5, yEasy [i] + 5, 60, 60);
		c.setColor (Color.black);
		c.setFont (new Font ("Agency FB", Font.BOLD, 50));
		c.drawString (String.valueOf (i + 1), xEasy [i] + 25, yEasy [i] + 55);
	    }
	}


	else if (level.equals ("2"))

	    {
		for (int i = 0 ; i < MEDIUM ; i++)
		{

		    c.setColor (Color.black);
		    c.fillRect (xMedium [i], yMedium [i], 60, 60);
		    c.setColor (Color.green);
		    c.fillRect (xMedium [i] + 5, yMedium [i] + 5, 50, 50);
		    c.setColor (Color.black);
		    c.setFont (new Font ("Agency FB", Font.BOLD, 38));
		    c.drawString (String.valueOf (i + 1), xMedium [i] + 15, yMedium [i] + 45);

		}
	    }


	else
	{
	    if (level.equals ("3"))
	    {
		for (int i = 0 ; i < HARD ; i++)
		{
		    c.setColor (Color.black);

		    c.fillRect (xHard [i], yHard [i], 50, 50);
		    c.setColor (Color.blue);
		    c.fillRect (xHard [i] + 5, yHard [i] + 5, 40, 40);
		    c.setColor (Color.black);
		    c.setFont (new Font ("Agency FB", Font.BOLD, 28));
		    c.drawString (String.valueOf (i + 1), xHard [i] + 15, yHard [i] + 38);
		}
	    }

	}
    }


    // This private blackbox method returns either true or false to determine if the first picture is a match of the second picture.
    // The if statements return true based on what level it is, other wise false is returned.
    private boolean checker (int a, int b)
    {
	if (level.equals ("1"))
	{
	    if (easyPic [a - 1] == easyPic [b - 1])
	    {
		return true;
	    }
	}


	else if (level.equals ("2"))
	{
	    if (mediumPic [a - 1] == mediumPic [b - 1])
	    {
		return true;
	    }
	}


	else
	{
	    if (hardPic [a - 1] == hardPic [b - 1])
	    {
		return true;
	    }
	}


	return false;
    }


    /* This private method is responsible for redrawing the cards, if the images are not a match. Other wise it re draws the images.

     The first if statement checks if they are a match. The next if statement increments the score based on the counter. The inner
     if statements draw the images and set their boolean value to false, accordingly to the level.
     If they are not a match, the cards are redrawn accordinly to the level.
    */
    private void clear ()
    {

	if (checker (select, select2))
	{
	    if ((counter % 2) != 0)

		score2++;
	    else if ((counter % 2) == 0)
		score++;


	    if (level.equals ("1"))
	    {

		c.drawImage (easyPic [select - 1], xEasy [select - 1], yEasy [select - 1], null);
		c.drawImage (easyPic [select2 - 1], xEasy [select2 - 1], yEasy [select2 - 1], null);
		checkEasy [select - 1] = false;
		checkEasy [select2 - 1] = false;
	    }


	    else if (level.equals ("2"))
	    {

		c.drawImage (mediumPic [select - 1], xMedium [select - 1], yMedium [select - 1], null);
		c.drawImage (mediumPic [select2 - 1], xMedium [select2 - 1], yMedium [select2 - 1], null);
		checkMedium [select - 1] = false;
		checkMedium [select2 - 1] = false;

	    }
	    else
	    {
		if (level.equals ("3"))
		{
		    c.drawImage (hardPic [select - 1], xHard [select - 1], yHard [select - 1], null);
		    c.drawImage (hardPic [select2 - 1], xHard [select2 - 1], yHard [select2 - 1], null);
		    checkHard [select - 1] = false;
		    checkHard [select2 - 1] = false;
		}
	    }
	}


	else
	{
	    if (level.equals ("1"))
	    {
		c.setColor (Color.black);
		c.fillRect (xEasy [select - 1], yEasy [select - 1], 70, 70);
		c.setColor (Color.red);
		c.fillRect (xEasy [select - 1] + 5, yEasy [select - 1] + 5, 60, 60);
		c.setColor (Color.black);
		c.setFont (new Font ("Agency FB", Font.BOLD, 50));
		c.drawString (String.valueOf (select), xEasy [select - 1] + 25, yEasy [select - 1] + 55);
		c.setColor (Color.black);
		c.fillRect (xEasy [select2 - 1], yEasy [select2 - 1], 70, 70);
		c.setColor (Color.red);
		c.fillRect (xEasy [select2 - 1] + 5, yEasy [select2 - 1] + 5, 60, 60);
		c.setColor (Color.black);
		c.setFont (new Font ("Agency FB", Font.BOLD, 50));
		c.drawString (String.valueOf (select2), xEasy [select2 - 1] + 25, yEasy [select2 - 1] + 55);
	    }


	    else if (level.equals ("2"))
	    {

		c.setColor (Color.black);
		c.fillRect (xMedium [select - 1], yMedium [select - 1], 60, 60);
		c.setColor (Color.green);
		c.fillRect (xMedium [select - 1] + 5, yMedium [select - 1] + 5, 50, 50);
		c.setColor (Color.black);
		c.setFont (new Font ("Agency FB", Font.BOLD, 38));
		c.drawString (String.valueOf (select), xMedium [select - 1] + 15, yMedium [select - 1] + 45);

		c.setColor (Color.black);
		c.fillRect (xMedium [select2 - 1], yMedium [select2 - 1], 60, 60);
		c.setColor (Color.green);
		c.fillRect (xMedium [select2 - 1] + 5, yMedium [select2 - 1] + 5, 50, 50);
		c.setColor (Color.black);
		c.setFont (new Font ("Agency FB", Font.BOLD, 38));
		c.drawString (String.valueOf (select2), xMedium [select2 - 1] + 15, yMedium [select2 - 1] + 45);
	    }
	    else
	    {
		if (level.equals ("3"))
		{
		    c.setColor (Color.black);

		    c.fillRect (xHard [select - 1], yHard [select - 1], 50, 50);
		    c.setColor (Color.blue);
		    c.fillRect (xHard [select - 1] + 5, yHard [select - 1] + 5, 40, 40);
		    c.setColor (Color.black);

		    c.setFont (new Font ("Agency FB", Font.BOLD, 28));
		    c.drawString (String.valueOf (select), xHard [select - 1] + 15, yHard [select - 1] + 38);
		    c.setColor (Color.black);

		    c.fillRect (xHard [select2 - 1], yHard [select2 - 1], 50, 50);
		    c.setColor (Color.blue);
		    c.fillRect (xHard [select2 - 1] + 5, yHard [select2 - 1] + 5, 40, 40);
		    c.setColor (Color.black);

		    c.setFont (new Font ("Agency FB", Font.BOLD, 28));
		    c.drawString (String.valueOf (select2), xHard [select2 - 1] + 15, yHard [select2 - 1] + 38);
		}
	    }

	}
    }


    // This method returns true or false to determine if all of the cards have been successfully flipped.
    // The outer if statements determine the level, while the inner if statements run a for loop to check if any of the values in the boolean array are true.
    // If even one is false, it means not all cards have been flipped. in whichcase false is returned. Otherwise true is returned.
    private boolean over ()
    {
	if (level.equals ("1"))
	{
	    for (int i = 0 ; i < checkEasy.length ; i++)
	    {
		if (checkEasy [i] == true)
		{
		    return false;
		}

	    }
	}


	if (level.equals ("2"))
	{
	    for (int i = 0 ; i < checkMedium.length ; i++)
	    {
		if (checkMedium [i] == true)
		{
		    return false;
		}

	    }
	}


	if (level.equals ("3"))
	{
	    for (int i = 0 ; i < checkHard.length ; i++)
	    {
		if (checkHard [i] == true)
		{
		    return false;
		}
	    }
	}


	return true;
    }


    /* This method is reponsible for colelcting the level, and the names of player1 and player 2.
    This is done using while loops, each containing if statements that determine if the input is valid or invlid.
    If the input is invalid, the question is looped. Otherwise the loop is broken and the program continues to the next level.
    */
    public void levelSelect ()
    {

	drawTitle ();
	c.setCursor (5, 1);
	c.println ("1.    Easy");
	c.println ("2.    Medium");
	c.println ("3.    Hard");
	c.println ();

	while (true)
	{
	    c.setCursor (9, 1);
	    c.print ("Please select a level: ");
	    level = c.readLine ();
	    if ((!level.equals ("1")) && (!level.equals ("2")) && (!level.equals ("3")))
	    {
		new Message ("Please choose either '1', '2', or '3'!", "ERROR");
		c.setCursor (9, 1);
		c.println ();
	    }
	    else
		break;

	}


	while (true)
	{
	    c.setCursor (10, 1);
	    c.print ("Player 1's name:");
	    name = c.readLine ();
	    if (name.length () > 10)
	    {
		new Message ("Too long!");
		c.setCursor (10, 1);
		c.println ();
	    }
	    else if (name.length () < 1)
	    {
		new Message ("Please enter a name!");
		c.setCursor (10, 1);
		c.println ();
	    }
	    else
		break;
	}


	while (true)
	{
	    c.setCursor (11, 1);
	    c.print ("Player 2's name:");
	    name2 = c.readLine ();
	    if (name2.length () > 10)
	    {
		new Message ("Too long!");
		c.setCursor (11, 1);
		c.println ();
	    }
	    else if (name2.length () < 1)
	    {
		new Message ("Please enter a name!");
		c.setCursor (11, 1);
		c.println ();
	    }
	    else
		break;
	}
    }



    /*This method is responsible for displaying the highscores in console
    The try catch statement is there to use Buffered Reader and Printwriter
    The first while loop is there to loop the display if the user wants to see it again.
    The first if statement checks if the first line is the header in which case it prints the title,
    otherwise an error Message appears.
    The next while loop displays all of the lines from the file, using an if statement to check if the line is not empty
    The next if statements clear or return to the main menu, depending on the user input.

       Local Variable Dictionary
       ------------------------------------------------------------------------------------------------------------------------------------------------------
       Name            Type                        Purpose
	 line             String                   Stores the value of the line
	 clear          String                    Stores whether the user wants to clear the highscores or not.

       */



    public void highScore ()
    {
	String line = "";
	String clear="";

	try
	{
	    while (true)
	    {
		drawTitle ();
		BufferedReader in = new BufferedReader (new FileReader ("highscores.txt"));
		if (in.readLine ().equals (header))
		{
		    c.println ("High Scores");
		    c.println (" Name           Score          Level");
		}
		else
		{
		    new Message ("This file is corrupt!");
		    break;
		}
		while (true)
		{
		    if (line != null)
		    {
			line = in.readLine ();
			if (line != null)
			{
			    c.println (line);
			}
		    }
		    else
			break;
		}
		c.println ("Would you like to clear the high scores?");
		c.println ("y - yes");
		c.println ("n - no");
		clear = c.readLine ();
		if (clear.equalsIgnoreCase ("y"))
		{
		    PrintWriter out = new PrintWriter (new FileWriter ("highscores.txt"));
		    out.println (header);
		    out.close ();
		    return;
		}
		else if (clear.equalsIgnoreCase ("n"))
		{
		    break;
		}

		else
		{
		    new Message ("Please choose either 'y' or 'n'", "ERROR");
		}


	    }

	}

	catch (FileNotFoundException e)
	{
	    new Message ("This file is corrupt.");
	}


	catch (IOException e)
	{
	}
    }


    // This method displays the instructions.
    public void instructions ()
    {
	c.drawImage (instructions, 0, 50, null);
	c.setCursor (28, 1);
	pauseProgram ();
    }


    // This method displays a good bye message, and exits the program.
    public void goodBye ()
    {
	drawTitle ();
	c.setCursor (6, 1);
	c.println ("Thanks for playing!");
	c.println ("This program was designed by Harsimran Darhan.");
	c.println ("This program will now exit.");
	pauseProgram ();
	c.close ();

    }


    // This is the console constructor.
    public Concentration ()
    {
	c = new Console (30, 100);
    }


    /* This is the main.
       Local Variable Dictionary
       ------------------------------------------------------------------------------------------------------------------------------------------------------
       Name            Type                        Purpose
	 q             reference                   References the Concentration Class

       */
    public static void main (String[] args)
    {
	Concentration q = new Concentration ();
	q.loadImage ();
	q.splashScreen ();
	while (true)
	{

	    q.mainMenu ();
	    if (q.choice.equals ("1"))
	    {
		q.levelSelect ();
		q.display ();
	    }
	    else if (q.choice.equals ("2"))

		q.highScore ();
	    else if (q.choice.equals ("3"))
		q.instructions ();
	    else
		break;
	}


	q.goodBye ();

    }
}


