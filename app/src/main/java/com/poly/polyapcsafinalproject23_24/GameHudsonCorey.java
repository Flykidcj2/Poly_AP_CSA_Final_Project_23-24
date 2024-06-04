import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.poly.polyapcsafinalproject23_24.GameActivity;
import com.poly.polyapcsafinalproject23_24.R;

import java.util.Scanner;

public class GameHudsonCorey extends GameActivity {

    //instance variables
    //    variables you plan to use throughout the adventure
    private Scanner scan:
    private int numLives;
    //private Player player; (optional)
    private TextView tvTitle, tvSubtitle, tvStoryText;
    private ImageView ivStory;
    private Button btn1, btn2, btn3, btn4;
            private boolean isWon;
    private int numLives;

    @Override
    protected void run() {
        setContentView(R.layout.activity_game_4_button);

        tvTitle = findViewById(R.id.tv_title);
        tvSubtitle = findViewById(R.id.tv_subtitle);
        tvStoryText = findViewById(R.id.tv_story);
        ivStory = findViewById(R.id.iv_story);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);

        tvTitle.setText("BACKYARD BASEBALL");
        tvSubtitle.setText("BASEBALL EDITION");

        numLives = 4;
        start();
    }


    private void setAllBtnsVisible()
    {
        btn1.setVisibility(TextView.VISIBLE);
        btn2.setVisibility(TextView.VISIBLE);
        btn3.setVisibility(TextView.VISIBLE);
        btn4.setVisibility(TextView.VISIBLE);
    }

    private void start()
    {
        tvTitle.setText("BACKYARD BASEBALL");
        tvSubtitle.setText("BASEBALL EDITION");

        String text = "Lets play baseball, lets go! What position you would like to play?";


        tvStoryText.setText(text);

        setAllBtnsVisible();

        btn1.setText("ShortStop");
        btn2.setText("Catcher");
        btn3.setText("Pitcher");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shortStop();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                catcher();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pitcher();
            }
        });

    }


    public void run()
    {
        //initialize number of lives
        numLives = 5;
        //cretae a scanner object for user input
        scan = new Scanner(System.in);

        //cretae a player object (optional)
        //player = new Person(...)
        start();
    }

    private void start()
    {

        Util.clearConsole();
        String text = """
      Baseball EDITION

      Lets play baseball, lets go!
      """;
        Stsrem.out.println(text);

        Util.pauseConsole();

        text = """
      What position you would like to play?
      1. Shortstop
      2. Catcher
      3. Pitcher
      """;
        System.out.println(text);
        int choice = Util.enterInt(1,3);

        if (choice ==1)
        {
            shortStop();
        }
        else if (choice == 2)
        {
            catcher();//catcher();
        }
        else if (choice == 3)
        {
            pitcher();//pitcher();
        }
    }

    private void firstBase()
    {
        Util.clearConsole();
        String text = """
      Do you like playing shortStop?
      1. Yes, You make a lot of plays
      2. No, You can't ground tyhe ball.
      """
        System.out.println(text);
        int choice = Util.enterInt(1,2);
        if (choice == 1)
        {
            veryWell();
        }
        else if (choice == 2)
        {
            struggling();//struggle();
        }
    }

    private void veryWell()
    {
        Util.clearConsole();
        String text = """
      Do you keep on doing well in your classes?
      1. keep doing well.
      2. Lose motivation.
      """;
        System.out.println(text);
        int choice = Util.enterInt(1,2);
        if (choice == 1)
        {
            gradute();
        }
        else if (choice == 2)
        {
            loseMotivation()
        }
    }

    private void graduate()
    {
        util.clearConsole();
        String text = """
      Congrats, you graduated! What do you want to do?
      1. Work for a successful comapny.
      2. Get a normal job.
      """;
        System.out.println(text);
        int choice = Util.enterInt(1,2);
        if (choice == 1)
        {
            System.out.println("You work for a successful company and get paid a lot... YOU WIN!!");
            Util.pauseConsole();
            System.out.println("Play again!");
            start();
        }
        else if (choice == 2)
        {
            getJob();//getJob();
        }
    }

    private void struggle()
    {
        Util.clearConsole();
        String text = """
      You are struggling and thinking of dropping out...
      1. Keep trying.
      2. drop out.
      """;
        System.out.println(text);
        int choice = util.enterInt(1,2);
        if (choice == 1)
        {
            keepTrying();
        }
        else if (choice == 2)
        {
            dropOut();//dropout();
        }
    }

    private void keepTrying()
    {
        Util.clearConsole();
        String text = """
      you keep on trying does it end up paying off?
      1. Yes, you go on to graduate.
      2. No, you end up dropping out of school.
      """;
        System.out.println(text);
        int choice = Util.enterInt(1,2);
        if (choice == 1)
        {
            graduate();
        }
        else if (choice == 2)
        {
            dropOut();//dropout();
        }
    }

    private void dropOut()
    {
        Util.clearConsole();
        String text = """
      You dropped out of college, what do you do now?
      1. Get a job.
      2. Stay at parent's house.
      """;
        System.out.println(text);
        int choice = Util.enterInt(1,2);
        if (choice == 1)
        {
            getJob();
        }
        else if (choice == 2)
        {
            stayAtParents();//dropout();
        }
    }

    private void getJob()
    {
        Util.clearConsole();
        String text = """
      Where would you like to work at?
      1. Rasing canes
      2. make good money as a doctor
      """;
        System.out.println(text);
        int choice = Util.enterInt(1,2);
        if (choice == 1)
        {
            rasingCanes();
        }
        else if (choice == 2)
        {
            badJob();//struggle();
        }

        private void doctorJob()
        {
            Util.clearConsole();
            String text = """
      You get a big opportunity at the job do you take it?
      1. Yes, start making double what you make.
      2. No, continue making good momey.
      """;
            System.out.println(text);
            int choice = Util.enterInt(1,2);
            if (choice == 1)
            {
                bigOpportunity();
            }
            else if (choice == 2)
            {
                start();//struggle();
            }
        }

        private void badJob()
        {
            Util.clearConsole();
            String text """
      You start your job but things aren't looking good wha do you do?
      1. Fired for being late everyday
      2.Quit, and go live with your granparents.
      """;
            System.out.println(text);
            int choice = Util.enterInt(1,2);
            if (choice == 1)
            {
                jobOrLate();
            }
            else if (choice == 2)
            {
                stayAtGranParents();//struggle();
            }
        }

        private void bigOpportunity()
        {
            Util.clearConsole();
            String text = """
      You took it and make more money, but are you smart wit it
      1. Yes, and you buy anything you want.
      2. No, gamble all your money.
      """;

            System.out.println(text);
            int choice = Util.enterInt(1,2);
            if (choice == 1)
            {
                System.out.println("You retired with all the money you made and lived a best life...YOU WIN!!");
                System.out.println("Play again!");
                start();
            }
            else if (choice == 2)
            {
                stayAtGranParents();//struggle();
            }
        }

  private voidjobOrLate()
        {
            Util.clearConsole();
            String text = """
      You got fired for being late, look for another job or be late to everything.
      1. No one wants to hire you, stay at granparent's house.
      2. stae being late and don't look for another job.
      """;
            System.out.println(text);
            int choice = Util.enterInt(1,2);
            if (choice == 2)
            {
                stayAtGranParents();
            }
            else if (choice == 2)
            {
                start();//struggle();
            }
        }

        private void stayAtGranParents()
        {
            Util.clearConsole();
            String text = """
      You stay at your granparents house, do you help around the farm?
      1. Yes, you do help around the farm.
      2. You do not help around the farm and your granparent's are getting mad at you.
      """;
            System.out.println(text);
            int choice = Util.enterInt(1,2);
            if (choice == 2
            {
                helpWithFarm();
            }
    else if (choice == 2)
        {
            granparentssMad();//struggle();
        }
        }

        private void helWithFarm()
        {
            Util.clearConsole();
            String text = """
      You help out with the farm but do you also cook breakfast.
      1. Yes, you do chores and breakfast.
      2. No, you only do chores.
      """;
            System.out.println(text);
            int choice = Util.enterInt(1,2);
            if (choice == 2
            {
                makeGranParentsProud();
            }
    else if (choice == 2)
        {
            chores();//struggle();
        }
        }

        private void makeGranParentsProud()
        {
            Util.clearConsole();
            String text = """
      They suggest you get a job, you agree with them?.
      1. Yes,and decide to get a job.
      2. No, and granparents had enough of you and kick you out.
      """;
            System.out.println(text);
            int choice = Util.enterInt(1,2);
            if (choice == 2
            {
                getJob();
            }
    else if (choice == 2)
        {
            start();//struggle();
        }
        }

        private void chores()
        {
            Util.clearConsole();
            String text = """
      You start doing chores around the farm.
      1. Do you continue only doing chores.
      2. You finally give in and start cooking breakfast.
      """;
            System.out.println(text);
            int choice = Util.enterInt(1,2);
            if (choice == 2
            {
                helpWithHouse();
            }
    else if (choice == 2)
        {
            helpWithHouse();//struggle();
        }
        }

        private void continueBeingLazy()
        {
            Util.clearConsole();
            String text = """
      You are now kicked out of your granparents house what do you do?.
      1. Live in your car.
      2. Live in the homless shelter.
      3. Find a job.
      """;
            System.out.println(text);
            int choice = Util.enterInt(1,2);
            if (choice == 2
            {
                System.out.println("Now your in your car");
                Util.pauseConsole();
                start();
            }
    else if (choice == 2)
        {
            start();//struggle();
        }
        else if (choice == 3)
        {
            getJob();
        }
        }

        private void defeat()
        {
            //run method when defeated

    /*
    //lose a life
    //numLives--;

    //clear console, display text etc
    //System.out.println(...)

    //determine if player gets to play again
    if (numLives > 0)
    {
    //if you still have lives, return to start()
    start();
    }
    else
    {
      //print game over message
    }
    */
        }
    }
