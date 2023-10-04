import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_game {
    JFrame window;
    JPanel titlenamepanel,startbuttonpanel,nameInputPanel, maintextpanel,choicebuttonpanel,resultpanel;
    JLabel titlelabel,resultlabel;
    JTextField nameInput;
    JTextArea maintextarea;
    JButton startbutton,submitNameButton,choicebutton1,choicebutton2,restartbutton,exitbutton;
    Titlescreenhandler tsHandler= new Titlescreenhandler();
    NameCatcher ncr=new NameCatcher();
    Choice101 c101=new Choice101();
    Choice10101 c10101=new Choice10101();
    Choice10102 c10102=new Choice10102();
    Choice1010201 c1010201=new Choice1010201();
    Choice101020101 c101020101=new Choice101020101();
    Choice101020102 c101020102=new Choice101020102();
    Choice1010202 c1010202=new Choice1010202();
    Choice102 c102=new Choice102();
    Choice10201 c10201=new Choice10201();
    Choice10202 c10202=new Choice10202();
    Choice1020101 c1020101=new Choice1020101();
    Choice1020102 c1020102=new Choice1020102();
    Choice102010101 c102010101=new Choice102010101();
    Choice102010102 c102010102=new Choice102010102();

    Start_again st_over=new Start_again();
    Exit_Game exgame=new Exit_Game();


    String user;
    Boolean breakfast,shower,go_Window,be_normal,focus_study,compliment_crush,ask_for_date,punch_her,study_now;
    Font titlefont=new Font("Times New Roman",Font.BOLD,50);
    Font buttonfont=new Font("Times New Roman",Font.BOLD,30);
    Container con;

    public void WelcomePage(){

        window=new JFrame();
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        window.setVisible(true);
        con=window.getContentPane();

        titlenamepanel=new JPanel();
        titlenamepanel.setBounds(400, 0,600,80);
        titlenamepanel.setBackground(Color.black);


        titlelabel=new JLabel("1 Day Of Highschool Life");
        titlelabel.setBackground(Color.black);
        titlelabel.setForeground(Color.yellow );
        titlelabel.setFont(titlefont);
        titlelabel.setBounds(400,0,600,80);
        titlenamepanel.add(titlelabel);



        nameInputPanel = new JPanel();
        nameInputPanel.setBounds(300,450,200,100);
        nameInputPanel.setBackground(Color.black);
        nameInputPanel.setForeground(Color.green);

        nameInput = new JTextField(20);
        nameInput.setBackground(Color.black);
        nameInput.setForeground(Color.green);
        nameInput.setBounds(300,400,200,50);
        nameInput.setFont(buttonfont);
        con.add(nameInput);

        submitNameButton = new JButton("Submit Name");
        submitNameButton.setBackground(Color.white);
        submitNameButton.setForeground(Color.green);
        submitNameButton.setFont(buttonfont);
        submitNameButton.addActionListener(ncr);
        nameInputPanel.add(submitNameButton);
        con.add(nameInputPanel);

        maintextpanel= new JPanel();
        maintextpanel.setBounds(400,100,600,250);
        maintextpanel.setBackground(Color.black);
        con.add(maintextpanel);

        maintextarea=new JTextArea("Welcome! This is a choice based game which\n" +
                "means the end of this game depends upon your choices." +
                " So choose Wisely! Enjoy The Game!");
        maintextarea.setBounds(400,100,600,250);
        maintextarea.setBackground(Color.black);
        maintextarea.setForeground(Color.green);
        maintextarea.setFont(buttonfont);
        maintextarea.setLineWrap(true);
        maintextarea.setEditable(false);
        maintextpanel.add(maintextarea);




        startbuttonpanel=new JPanel();
        startbuttonpanel.setBounds(600,400,200,100);
        startbuttonpanel.setBackground(Color.black);

        startbutton=new JButton("START");
        startbutton.setBackground(Color.black);
        startbutton.setForeground(Color.green);
        startbutton.setFont(buttonfont);
        startbutton.addActionListener(tsHandler);
        startbuttonpanel.add(startbutton);




        con.add(titlenamepanel);
        con.add(startbuttonpanel);

    }
    public void beginning(){
//        titlenamepanel.setVisible(false);
        startbuttonpanel.setVisible(false);
        maintextpanel.setVisible(false);
        nameInput.setVisible(false);
        nameInputPanel.setVisible(false);
        go_Window=false;
        shower=false;
        breakfast=false;
        be_normal=false;
        focus_study=false;
        compliment_crush=false;
        ask_for_date=false;
        punch_her=false;
        study_now=false;
        maintextpanel= new JPanel();
        maintextpanel.setBounds(400,100,600,250);
        maintextpanel.setBackground(Color.black);
        con.add(maintextpanel);

        maintextarea=new JTextArea("You wake up and check the clock."+
                "You're late \non the first day of your highschool."+"You feel\nhungry and need a bath too.'"+user+"' what will\n you do next?\n\t" +
                "1.Take A Bath\n\t" +
                "2.Eat Breakfast");
        maintextarea.setBounds(400,100,600,250);
        maintextarea.setBackground(Color.black);
        maintextarea.setForeground(Color.green);
        maintextarea.setFont(buttonfont);
        maintextarea.setLineWrap(true);
        maintextarea.setEditable(false);
        maintextpanel.add(maintextarea);

        choicebuttonpanel=new JPanel();
        choicebuttonpanel.setBounds(550,350,300,300);
        choicebuttonpanel.setBackground(Color.gray);
        choicebuttonpanel.setLayout(new GridLayout(4,1));
        con.add(choicebuttonpanel);

        choicebutton1=new JButton("Choice1");
        choicebutton1.setBackground(Color.black);
        choicebutton1.setForeground(Color.green);
        choicebutton1.setFont(buttonfont);
        choicebutton1.addActionListener(c101);
        choicebutton1.addActionListener(c10101);
        choicebutton1.addActionListener(c1010201);
        choicebutton1.addActionListener(c101020101);
        choicebutton1.addActionListener(c10201);
        choicebutton1.addActionListener(c1020101);
        choicebutton1.addActionListener(c102010101);
        choicebuttonpanel.add(choicebutton1);

        choicebutton2=new JButton("Choice2");
        choicebutton2.setBackground(Color.black);
        choicebutton2.setForeground(Color.green);
        choicebutton2.setFont(buttonfont);
        choicebutton2.addActionListener(c10102);
        choicebutton2.addActionListener(c101020102);
        choicebutton2.addActionListener(c1010202);
        choicebutton2.addActionListener(c102);
        choicebutton2.addActionListener(c10202);
        choicebutton2.addActionListener(c1020102);
        choicebutton2.addActionListener(c102010102);
        choicebuttonpanel.add(choicebutton2);

        restartbutton=new JButton("Start Over");
        restartbutton.setBackground(Color.black);
        restartbutton.setForeground(Color.green);
        restartbutton.setFont(buttonfont);
        restartbutton.addActionListener(st_over);
        choicebuttonpanel.add(restartbutton);

        exitbutton=new JButton("Exit");
        exitbutton.setBackground(Color.black);
        exitbutton.setForeground(Color.green);
        exitbutton.setFont(buttonfont);
        exitbutton.addActionListener(exgame);
        choicebuttonpanel.add(exitbutton);

        resultpanel=new JPanel();
        resultpanel.setBounds(550,350,300,300);
        resultpanel.setBackground(Color.red);
        resultpanel.setLayout(new GridLayout(4,1));
        con.add(resultpanel);
        resultpanel.setVisible(false);

        resultlabel=new JLabel();
        resultlabel.setBackground(Color.white);
        resultlabel.setForeground(Color.green);
        resultlabel.setFont(titlefont);
        resultpanel.add(resultlabel);

    }
    public class Titlescreenhandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            beginning();
        }
    }
    public class NameCatcher implements ActionListener{
        public void actionPerformed(ActionEvent event){
            user=nameInput.getText();
            nameInput.setForeground(Color.WHITE);
            nameInput.setText(user+" Saved");
        }


    }

///Shower Part
    public class Choice101 implements ActionListener{
        public void actionPerformed (ActionEvent event){
            if (!shower && !breakfast){
                shower=true;
                choicebutton1.setText("Go From Window");
                choicebutton2.setText("Be Normal");
                restartbutton.setText("Start Over");
                maintextarea.setEditable(true);
                maintextarea.setText("You took a bath and now you feel fresh.\n You reached school and it is extremely late.\n"
                        +"You can see Principal taking round in the wing.How will you" +
                        " go in your class?\nWhat will you do next?");
                maintextarea.setEditable(false);}
        }
    }
    public class Choice10101 implements ActionListener{
        public void actionPerformed(ActionEvent event){
            if((shower && !breakfast)&&!go_Window&&!be_normal){
                go_Window=true;
                maintextarea.setEditable(true);
                maintextarea.setText("You stood on a ledge and started climbing.\nYou were feeling weak" +
                        " because of not having\n breakfast and your hand slipped."
                        +"Whack!\nYou fell on the ground like lightning!\n" +user+
                        " You are dead!");
                maintextarea.setEditable(false);
                choicebutton1.setVisible(false);
                choicebutton2.setVisible(false);
            }
        }
    }
    public class Choice10102 implements ActionListener{
        public void actionPerformed(ActionEvent event){
            if((shower && !breakfast)&&!be_normal&&!go_Window){
                be_normal=true;
                maintextarea.setEditable(true);
                maintextarea.setText("You bravely entered the corridor and started\nwalking" +
                        "toward your class.You greeted your\nPrincipal and he complimented" +
                        "you for\nyour fragrance as you had shower.\nYou entered your class and sat in the back.\n" +
                        "In Class you notice your crush looking more\n" +
                        "beautiful than ever.What will you do?");
                maintextarea.setEditable(false);
                choicebutton1.setText("Compliment Her");
                choicebutton2.setText("Focus On Studying");
            }
        }
    }
    public class Choice1010201 implements ActionListener{
        public void actionPerformed(ActionEvent event){
            if((shower && !breakfast)&&be_normal&&!go_Window&&!compliment_crush&&!focus_study){
                compliment_crush=true;
                maintextarea.setEditable(true);
                maintextarea.setText("You mustered the courage and complimented your crush.\n She blushed and smiled at you.\n"
                                + " It made your day :-)\n Will you play the next move?");
                maintextarea.setEditable(false);
                choicebutton1.setText("Ask her for a date");
                choicebutton2.setText("Study Now");
            }
        }
    }
    public class Choice101020101 implements ActionListener{
        public void actionPerformed(ActionEvent event){
            if((shower && !breakfast)&&be_normal&&!go_Window&&compliment_crush&&!ask_for_date){
                ask_for_date=true;
                maintextarea.setEditable(true);
                maintextarea.setText("You casually ask her if she's up for a date,\n" +
                                     "and you're stoked when she says, 'Sure, \n" +
                                     "why not?' You both walk out of  the\n" +
                                     "classroom together,hand in hand.Today turned\n" +
                                     "out to be a total win. Congrats,"+user+" you just had\n" +
                                     "an awesome day at high school!");
                maintextarea.setEditable(false);
                choicebutton1.setVisible(false);
                choicebutton2.setVisible(false);
            }
        }
    }
    public class Choice101020102 implements ActionListener{
        public void actionPerformed(ActionEvent event){
            if((shower &&!breakfast)&&be_normal&&!go_Window&&compliment_crush&&!study_now&&!ask_for_date){
                study_now=true;
                maintextarea.setEditable(true);
                maintextarea.setText("With the memory of your compliment to your\n" +
                                     "crush still brightening your day, you decide\n" +
                                     "to hit the books. The hours fly by as "+user+" \n" +
                                     "immerse yourself in your studies, making\n" +
                                     "it a memorable day at high school.");
                maintextarea.setEditable(false);
                choicebutton1.setVisible(false);
                choicebutton2.setVisible(false);
            }
        }
    }
    public class Choice1010202 implements ActionListener{
        public void actionPerformed(ActionEvent event){
            if((shower && !breakfast)&&be_normal&&!go_Window&&!focus_study&&!compliment_crush){
                focus_study=true;
                maintextarea.setEditable(true);
                maintextarea.setText("Compliment your crush? Nah, you're way too\n" +
                                     "busy for that.You choose to focus on\n" +
                                     "studying, because who has time for trivialities?\n"+
                                     user+" spend the day becoming a genius\n"+
                                     "Congrats, you had an intellectually\n superior day " +
                                     "at high school.");
                maintextarea.setEditable(false);
                choicebutton1.setVisible(false);
                choicebutton2.setVisible(false);
            }
        }
    }

    ///Breakfast Part
    public class Choice102 implements ActionListener{
        public void actionPerformed(ActionEvent event){
            if(!shower && !breakfast){
                breakfast=true;
                choicebutton1.setText("Go From Window");
                choicebutton2.setText("Be Normal");
                restartbutton.setText("Start Over");
                maintextarea.setEditable(true);
                maintextarea.setText("You had cornflakes with protien shake\nand now you feel energized.You reached school and it is extremely late."
                        +"You can see\nPrincipal taking round in the wing.\nHow will you" +
                        " go in your class?\nWhat will you do next?");
                maintextarea.setEditable(false);}
        }
    }
    public class Choice10201 implements ActionListener{
        public void actionPerformed(ActionEvent event){
            if((!shower && breakfast)&&!go_Window&&!be_normal){
                go_Window=true;
                maintextarea.setEditable(true);
                maintextarea.setText("You stood on a ledge and started climbing.\nYou were feeling strong" +
                        " because of having\n breakfast and you reached your class."
                        +"In Class\nyou notice your crush looking more beautiful\nthan ever. " +
                        "What Will You Do?!");
                maintextarea.setEditable(false);
                choicebutton1.setText("Compliment Her");
                choicebutton2.setText("Focus On Studying");
            }
        }
    }
    public class Choice10202 implements ActionListener{
        public void actionPerformed(ActionEvent event){
            if((!shower && breakfast)&&!be_normal&&!go_Window){
                be_normal=true;
                maintextarea.setEditable(true);
                maintextarea.setText("You bravely entered the corridor despite\n" +
                                     "not having a shower. As you walked towards\n" +
                                     "your class, your smelly state drew the \n" +
                                     "Principal's attention. He scolded you for\n" +
                                     "not maintaining proper hygiene and sent\n" +
                                      "you back home.\n" +
                                     user+"'s day ends in embarrassment.");
                maintextarea.setEditable(false);
                choicebutton1.setVisible(false);
                choicebutton2.setVisible(false);
            }
        }
    }
    public class Choice1020101 implements ActionListener{
        public void actionPerformed(ActionEvent event){
            if((!shower && breakfast)&&!be_normal&&go_Window&&!compliment_crush&&!focus_study){
                compliment_crush=true;
                maintextarea.setEditable(true);
                maintextarea.setText("You muster the courage and compliment\n" +
                                     "your crush.However, as you get closer,\n" +
                                     "she wrinkles her nose and says,\n"
                        +            "'Eww, you stink! Stay away!'\n" +
                                     "You feel embarrassed and rejected.\n"
                        +             " What will you do next?");
                maintextarea.setEditable(false);
                choicebutton1.setText("Punch Her");
                choicebutton2.setText("Study Now");
            }
        }
    }
    public class Choice1020102 implements ActionListener{
        public void actionPerformed(ActionEvent event){
            if((!shower && breakfast)&&!be_normal&&go_Window&&!focus_study&&!compliment_crush){
                focus_study=true;
                maintextarea.setEditable(true);
                maintextarea.setText(user+" ignored that girl and focused on\n" +
                                     "your studies.Years later, your choice\n" +
                                     "bore fruit as you became a \n" +
                                      "successful business person.Bravo!");
                maintextarea.setEditable(false);
                choicebutton1.setVisible(false);
                choicebutton2.setVisible(false);
            }
        }
    }
    public class Choice102010101 implements ActionListener{
        public void actionPerformed(ActionEvent event){
            if((!shower && breakfast) && !be_normal && go_Window && compliment_crush&&!punch_her&&!study_now){
                punch_her=true;
                maintextarea.setEditable(true);
                maintextarea.setText("You lose control and punch your crush.\n" +
                                     "The situation escalates quickly,and you\n" +
                                     "find yourself in a serious altercation.\n" +
                                     "The school authorities are called,and \n" +
                                     "you get suspended on your first day.\n" +
                                     user+"'s high school life takes a disastrous turn");
                maintextarea.setEditable(false);
                choicebutton1.setVisible(false);
                choicebutton2.setVisible(false);
            }
        }
    }
    public class Choice102010102 implements ActionListener{
        public void actionPerformed(ActionEvent event){
            if((!shower && breakfast)&&!be_normal&&go_Window&&compliment_crush&&!study_now&&!punch_her){
                study_now=true;
                maintextarea.setEditable(true);
                maintextarea.setText("You're A 'G'."+user+"\n" +
                                    "You decide to pour your energy into studying\n" +
                                    "and self-improvement. Over time, you become\n" +
                                   " a driven, successful individual who achieves\n" +
                                   " great things in life."+user+"'s journey as a Sigma\n" +
                                   " Male has begun. " +
                                    "Keep rising to the top!");
                maintextarea.setEditable(false);
                choicebutton1.setVisible(false);
                choicebutton2.setVisible(false);
            }
        }
    }
    public class Start_again implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            beginning();

        }
    }
    public class Exit_Game implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            System.exit(0);

        }
    }

    public static void main(String[] args){
        Main_game ld= new Main_game();
        ld.WelcomePage();

    }



}
