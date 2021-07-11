import java.util.Scanner;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class gsample {

	Scanner sc = new Scanner(System.in);
	JFrame frame;
	Container con;
	JPanel panel, imagepanel,imgpanel,imgpanel1,imgpanel2, imgpanel3,imgpanel4,imgpanel5,imgpanel6,imgpanel7,imgpanel8,imgpanel9,imgpanel10,imgpanel11,chrimgpanel,wbimgpanel,tanimgpanel, startpanel, textpanel, choicepanel, playerpanel;
	JLabel label, imagelabel,imglabel,imglabel1,imglabel2,imglabel3,imglabel4,imglabel5,imglabel6,imglabel7,imglabel8,imglabel9,imglabel10,imglabel11,chrimglabel,wbimglabel,tanimglabel, hplabel, hplabelno, weaponlabel, weaponlabelname;
	ImageIcon image,img,img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,chrimg,wbimg,tanimg;
	GridLayout layout = new GridLayout();
	URL url;
	Font titlefont = new Font("Courier",Font.BOLD+Font.ITALIC,78);
	Font stbutfont = new Font("TimesRoman",Font.BOLD,38);
	Font nomfont = new Font("Times New Roman",Font.ITALIC,25);
	Font chfont = new Font("Times New Roman",Font.BOLD,19);
	Font exfont = new Font("Times New Roman",Font.BOLD,15);
	JButton startbutton, ch1, ch2, ch3, ch4;
	JTextArea textarea;
	String playerName;
	int playerHP,maxHP,tempHP;
	String weapon;
	int position = 1;
	String skill;
	
	private static String[] imageList = {"C:\\Users\\abhin\\Desktop\\dsf final\\refined\\Sakonji_embraces_Tanjiro_and_Nezuko..jpg", "C:\\Users\\abhin\\Desktop\\dsf final\\refined\\HaganezukaFirstApp.jpg","C:\\Users\\abhin\\Desktop\\dsf final\\refined\\blacksword.jpg","C:\\Users\\abhin\\Desktop\\dsf final\\refined\\TanGoodbye.jpg","C:\\Users\\abhin\\Desktop\\dsf final\\refined\\TanVSswampD.jpg","C:\\Users\\abhin\\Desktop\\dsf final\\refined\\Asakusa.jpg","C:\\Users\\abhin\\Desktop\\dsf final\\refined\\Muzan_encountering_Tanjiro.jpg"}; 
	
	mainscreen ms = new mainscreen();
	choicehandler1 chd = new choicehandler1();
	
	public static void main(String args[])
	{
		new gsample();
	}
	
	public gsample()
	{
		frame = new JFrame();
		frame.setSize(800,800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.black);
		frame.setLayout(null);
		con = frame.getContentPane();
		
		panel = new JPanel();
		panel.setBounds(90,100,600,150);
		panel.setBackground(Color.red);
		label = new JLabel("DEMON SLAYER");
		label.setForeground(Color.white);
		label.setFont(titlefont);
		
		imagepanel = new JPanel();
		imagepanel.setBounds(-10,310,800,450);
		imagepanel.setBackground(Color.black);
		con.add(imagepanel);
		ImageIcon image = new ImageIcon("C:\\Users\\abhin\\Downloads\\DemonSlayerStart.jpg");
		imagelabel = new JLabel(image);
		imagepanel.add(imagelabel);
		frame.add(imagepanel);
		
		startbutton = new JButton("START YOUR STORY");
		startbutton.setBounds(120,600,550,100);
		startbutton.setBackground(Color.black);
		startbutton.setForeground(Color.white);
		startbutton.setFont(stbutfont);
		startbutton.addActionListener(ms);
		startbutton.setFocusPainted(false);
		
		panel.add(label);
		frame.add(startbutton);
		con.add(panel);
		
		frame.setVisible(true);
	}
	
	public void gamescreen()
	{
		imagepanel.setVisible(false);
		panel.setVisible(false);
		startbutton.setVisible(false);
		
		textarea = new JTextArea("Choose the character whose story you want to play");
		textarea.setBounds(100,90,600,310);
		textarea.setBackground(Color.black);
		textarea.setForeground(Color.white);
		textarea.setFont(nomfont);
		textarea.setLineWrap(true);
		textarea.setEditable(false);
		con.add(textarea);
		
		imgpanel = new JPanel();
		imgpanel.setBounds(250,410,300,170);
		imgpanel.setBackground(Color.black);
		con.add(imgpanel);
		
		chrimgpanel = new JPanel();
		chrimgpanel.setBounds(185,400,435,190);
		chrimgpanel.setBackground(Color.black);
		con.add(chrimgpanel);
		
		wbimgpanel = new JPanel();
		wbimgpanel.setBounds(250,410,300,170);
		wbimgpanel.setBackground(Color.black);
		con.add(wbimgpanel);
		
		tanimgpanel = new JPanel();
		tanimgpanel.setBounds(250,410,300,170);
		tanimgpanel.setBackground(Color.black);
		con.add(tanimgpanel);
		
		imgpanel1 = new JPanel();
		imgpanel1.setBounds(250,410,300,170);
		imgpanel1.setBackground(Color.black);
		con.add(imgpanel1);
		
		imgpanel2 = new JPanel();
		imgpanel2.setBounds(250,410,300,170);
		imgpanel2.setBackground(Color.black);
		con.add(imgpanel2);
		
		imgpanel3 = new JPanel();
		imgpanel3.setBounds(250,410,300,170);
		imgpanel3.setBackground(Color.black);
		con.add(imgpanel3);
		
		imgpanel4 = new JPanel();
		imgpanel4.setBounds(250,410,300,170);
		imgpanel4.setBackground(Color.black);
		con.add(imgpanel4);
		
		imgpanel5 = new JPanel();
		imgpanel5.setBounds(250,410,300,170);
		imgpanel5.setBackground(Color.black);
		con.add(imgpanel5);
		
		imgpanel6 = new JPanel();
		imgpanel6.setBounds(250,410,300,170);
		imgpanel6.setBackground(Color.black);
		con.add(imgpanel6);
		
		imgpanel7 = new JPanel();
		imgpanel7.setBounds(250,410,300,170);
		imgpanel7.setBackground(Color.black);
		con.add(imgpanel7);
		
		imgpanel8 = new JPanel();
		imgpanel8.setBounds(250,370,300,230);
		imgpanel8.setBackground(Color.black);
		con.add(imgpanel8);
		
		imgpanel9 = new JPanel();
		imgpanel9.setBounds(250,410,300,170);
		imgpanel9.setBackground(Color.black);
		con.add(imgpanel9);
		
		imgpanel10 = new JPanel();
		imgpanel10.setBounds(250,410,300,170);
		imgpanel10.setBackground(Color.black);
		con.add(imgpanel10);
		
		imgpanel11 = new JPanel();
		imgpanel11.setBounds(250,410,300,170);
		imgpanel11.setBackground(Color.black);
		con.add(imgpanel11);
		
		choicepanel = new JPanel();
		choicepanel.setBounds(250,600,300,150);
		choicepanel.setBackground(Color.black);
		choicepanel.setLayout(new GridLayout(4,1));
		con.add(choicepanel);
		try {
			url = new URL("https://i.giphy.com/media/XHqO2dwrVORUMTo7LA/giphy.gif");
        } catch (Exception e) {}
		chrimg = new ImageIcon(url);
		chrimglabel = new JLabel(chrimg);
		chrimgpanel.add(chrimglabel);
		frame.add(chrimgpanel);
		
		ch1 = new JButton("KAMADO TANJIRO");
		ch1.setBackground(Color.black);
		ch1.setForeground(Color.white);
		ch1.setFont(chfont);
		ch1.setFocusPainted(false);
		ch1.addActionListener(chd);
		ch1.setActionCommand("c1");
		choicepanel.add(ch1);
		ch2 = new JButton("AGATSUMA ZENITSU");
		ch2.setBackground(Color.black);
		ch2.setForeground(Color.white);
		ch2.setFont(chfont);
		ch2.setFocusPainted(false);
		ch2.addActionListener(chd);
		ch2.setActionCommand("c2");
		choicepanel.add(ch2);
		ch3 = new JButton("HASHIBIRA INOSUKE");
		ch3.setBackground(Color.black);
		ch3.setForeground(Color.white);
		ch3.setFont(chfont);
		ch3.setFocusPainted(false);
		ch3.addActionListener(chd);
		ch3.setActionCommand("c3");
		choicepanel.add(ch3);
		ch4 = new JButton("");
		ch4.setBackground(Color.black);
		ch4.setForeground(Color.white);
		ch4.setFont(chfont);
		ch4.setFocusPainted(false);
		ch4.addActionListener(chd);
		ch4.setActionCommand("c4");
		choicepanel.add(ch4);
		
		playerpanel = new JPanel();
		playerpanel.setBounds(50,15,700,50);
		playerpanel.setBackground(Color.black);
		con.add(playerpanel);
		
		hplabel = new JLabel("HP:    ");
		hplabel.setFont(nomfont);
		hplabel.setForeground(Color.white);
		playerpanel.add(hplabel);
		hplabelno = new JLabel();
		hplabelno.setFont(nomfont);
		hplabelno.setForeground(Color.white);
		playerpanel.add(hplabelno);
		weaponlabel = new JLabel("       Weapon:    ");
		weaponlabel.setFont(nomfont);
		weaponlabel.setForeground(Color.white);
		playerpanel.add(weaponlabel);
		weaponlabelname = new JLabel();
		weaponlabelname.setFont(nomfont);
		weaponlabelname.setForeground(Color.white);
		playerpanel.add(weaponlabelname);
		
	}
	public void Statsetup(String yourChoice)
	{
		maxHP = 100;
		playerHP = 100;
		if (yourChoice.equals("c1"))
			weapon = "Hand-held Axe";
		else if (yourChoice.equals("c2"))
			weapon = "Stone";
		else if (yourChoice.equals("c3"))
			weapon = "Fists";
		weaponlabelname.setText(weapon);
		hplabelno.setText(""+playerHP);
	}
	public void Tan_abtchar(String yourChoice)
	{	
		chrimgpanel.setVisible(false);
		Statsetup(yourChoice);
		textarea.setText("You've chosen KAMADO TANJIRO !!\nAbout him : \nTanjiro Kamado is the main protagonist of Demon Slayer. He is a \ndemon slayer in the Demon Slayer Corps, who joined to find a remedy \n to turn his sister, Nezuko Kamado, back into a human. Before he became a demon slayer, his family was slaughtered by the demon king, Muzan \nKibutsuji, while his younger sister, Nezuko, was turned into a demon. \n\nBREATH STYLE = WATER BREATHING\n");
		textarea.setFont(chfont);
		playerName = "Tanjiro";
		try {
            url = new URL("https://static.wikia.nocookie.net/kimetsu-no-yaiba/images/e/e8/Tanjiro_using_Fourth_Form_Striking_Tide.gif/revision/latest/scale-to-width-down/250?cb=20190518192815");
        } catch (Exception e) {}
		tanimg = new ImageIcon(url);
		tanimglabel = new JLabel(tanimg);
		tanimgpanel.add(tanimglabel);
		frame.add(tanimgpanel);
		ch1.setText(">");
		ch2.setText("");
		ch3.setText("");
		ch4.setText("");
		position = position + 1;
	}
	public void Zen_abtchar(String yourChoice)
	{
		Statsetup(yourChoice);
		playerName = "Zenitsu";
		position = position + 1;
	}
	public void Ino_abtchar(String yourChoice)
	{
		Statsetup(yourChoice);
		playerName = "Inosuke";
		position = position + 1;
	}
	public void Tan_prologue1()
	{
		tanimgpanel.setVisible(false);
		textarea.setText("You survived the Final Selection. You are officially a member of the \nDemon Slayer Corps. Your Nichirin sword will be delivered to you in a \nweek's time, made from the ore you selected during the Final Selection. You return to Urokodaki-san's house, and see Nezuko has woken up after2 years. You rush towards her and hug her tightly. \"Nezuko! You're \nawake! You're finally awake! Why did you go away like this Nezuko? I \nwas so worried for you!\", you say with a surprised and sad tone. \nUrokodaki-san comes towards you, grabs you both as tears fall from his \neyes.");
		try {
            url = new URL("https://static.wikia.nocookie.net/kimetsu-no-yaiba/images/e/e8/Tanjiro_using_First_Form_Water_Surface_Slash_to_kill_Hand_Demon.gif/revision/latest/scale-to-width-down/320?cb=20200523234255");
        } catch (Exception e) {}
		img = new ImageIcon(url);
		imglabel = new JLabel(img);
		imgpanel.add(imglabel);
		frame.add(imgpanel);
		ch1.setText(">");
		ch2.setText("");
		ch3.setText("");
		ch4.setText("");
		position = position + 1;
	}
	public void Zen_prologue1()
	{
		
	}
	public void Ino_prologue1()
	{
		
	}
	public void Tan_prologue2()
	{
		imgpanel.setVisible(false);
		textarea.setText("\"You came back..\", he speaks. \"Let's have some food and then you can \ntake some rest. Your blade will come in a week. He treats you with some delicious food to celebrate your graduation and certification of becoming a Demon Slayer. \"Tanjiro... you'll encounter many kinds of demons from now on. They won't be as simple to defeat as the Selection demons. You will encounter really strong demons, those which use a technique called Blood Demon Art. However, I'm sure you'll be alright, Tanjiro. I have \nfaith in you. Now eat this good food before I take it away from you.\", he \ntells you, joking around. He tells you that a man named Haganezuka will come to deliver your blade.\"Take some rest for these few days, Tanjiro. You need them.\", he says. You obey him and go to lie down in your room. \"Nezuko, I'll surely turn you back into a human, I promise.\", you \nwhisper, as you fall asleep.");
		ch1.setText(">");
		ch2.setText("");
		ch3.setText("");
		ch4.setText("");
		position = position + 1;
	}
	public void Zen_prologue2()
	{
		
	}
	public void Ino_prologue2()
	{
		
	}
	public void Tan_prologue3()
	{
		textarea.setFont(exfont);
		textarea.setText("On the 7th day, a man wearing a mask comes walking with a bag. He wears a brownish-\nolive coloured robe and a hat that has chimes on it. Urokodaki-san immediately recognises him to be Haganezuka and tells you the same. He comes walking, his chimes dangling. On \narrival, Urokodaki-san invites him to the house. \"I can't wait to see my nichirin katana!\", \nyou think excitedly. Haganezuka-san unravels the katana, and shows it to you. He keeps\nboasting about his swordsmith skills for an hour. When he is done, he asks you to hold it, to see what colour the blade turns into. \"You see, Blue is for Water Breathing, Yellowish-\nOrange is for Flame Breathing, Bright Yellow for Thunder Breathing and so on. Since you wear those Hanafuda earrings, it seems we might get to see a Red katana after such a long time.\" He gives you the sword, and you feel your fingers wrap around the handle. The \nkatana is perfectly weighted, and so balanced. You feel the excitement in you as the katana and your body become one. Both Urokodaki-san and Haganezuka-san hold their breaths to see what colour it turns into. The blade starts to change it's colour. Slowly, slowly, from top to bottom, the blade shines brightly as it adapts to your style.");
		img1 = new ImageIcon(imageList[1]);
		imglabel1 = new JLabel(img1);
		imgpanel1.add(imglabel1);
		frame.add(imgpanel1);
		ch1.setText(">");
		ch2.setText("");
		ch3.setText("");
		ch4.setText("");
		position = position + 1;
	}
	public void Zen_prologue3()
	{
		
	}
	public void Ino_prologue3()
	{
		
	}
	public void Tan_prologue4()
	{
		textarea.setText("Haganezuka-san can't believe his eyes. \"BLACK!!??\" Urokodaki-san is as confused as him, but he keeps himself calm. \"A Black katana...\", he says with a serious tone. \"I don't know what it means, for I've not seen any Black katana User.\" Haganezuka-san is disappointed\nin you as there was no Red katana as he had expected.\"Only time will tell what it means...\", says Urokodaki-san with a thoughtful look towards you. You wave at Haganezuka-san as  he goes, still disappointed in you. Just then, a Kasugai crow arrives.\"GOOO TO THE \nNORTHWEST TOWN QUICKLYYYY....\", the crow speaks with a light screaming voice. \"REPORTS SAYYY THAT THE GIRLS IN THE TOWNNN ARE VANISHINGG AT \nNIGHT.. GO QUICKLYYY!!\", the crow screams. You get ready, with your katana along \nyour hip and wear the Demon Slayer Corps outfit. Urokodaki-san had made a strong \nwooden box for Nezuko, so that she won't be exposed to sunlight. You thank him for his gift, carry Nezuko inside the box, and wear it on your back. \"Let's go save our fellow people,    right Nezuko?\", you say, as both of you travel to the North West town as fast as you can.\n\nWEAPON ACQUIRED = BLACK NICHIRIN KATANA");
		weapon = "Black Nichirin Katana";
		weaponlabelname.setText(weapon);
		weaponlabelname.setFont(nomfont);
		
		img2 = new ImageIcon(imageList[2]);
		imglabel2 = new JLabel(img2);
		imgpanel2.add(imglabel2);
		frame.add(imgpanel2);
		ch1.setText(">");
		ch2.setText("");
		ch3.setText("");
		ch4.setText("");
		position = position + 1;
	}
	public void Zen_prologue4()
	{
		
	}
	public void Ino_prologue4()
	{
		
	}
	public void End_TanPrologue()
	{
		textarea.setFont(stbutfont);
		textarea.setText("\n\n           END OF PROLOGUE");
		imgpanel1.setVisible(false);
		imgpanel2.setVisible(false);
		img3 = new ImageIcon(imageList[3]);
		imglabel3 = new JLabel(img3);
		imgpanel3.add(imglabel3);
		frame.add(imgpanel3);
		ch1.setText(">");
		ch2.setText("");
		ch3.setText("");
		ch4.setText("");
		position = position + 1;
	}
	public void End_ZenPrologue()
	{
		
	}
	public void End_InoPrologue()
	{
		
	}
	public void wtds()
	{
		textarea.setFont(titlefont);
		textarea.setText(" WELCOME TO\nDEMON SLAYER");
		imgpanel3.setVisible(false);
		playerpanel.setVisible(false);
		ch1.setText(">");
		ch2.setText("");
		ch3.setText("");
		ch4.setText("");
		position = position + 1;
	}
	public void w_breath()
	{
		playerpanel.setVisible(true);
		textarea.setFont(chfont);
		textarea.setText("\tBREATH STYLE : WATER BREATHING\n\nFirst Form : Water Surface Slash\nSecond Form : Water Wheel\nThird Form : Flowing Dance\nFourth Form : Striking Tide\nFifth Form : Blessed Rain After The Drought\nSixth Form : Whirlpool\nSeventh Form : Piercing Rain Drop\nEighth Form : Waterfall Basin\nNinth Form : Splashing Water Flow\nTenth Form : Constant Flux");
		try {
            url = new URL("https://static.wikia.nocookie.net/kimetsu-no-yaiba/images/5/5f/Tanjiro_using_Tenth_Form.gif/revision/latest/scale-to-width-down/320?cb=20190810182948");
        } catch (Exception e) {}
		wbimg = new ImageIcon(url);
		wbimglabel = new JLabel(wbimg);
		wbimgpanel.add(wbimglabel);
		frame.add(wbimgpanel);
		ch1.setText(">");
		ch2.setText("");
		ch3.setText("");
		ch4.setText("");
		position = position + 1;
	}
	public void t_breath()
	{
		
	}
	public void b_breath()
	{
		
	}
	public void Tan_game1()
	{
		wbimgpanel.setVisible(false);
		playerpanel.setVisible(true);
		textarea.setFont(chfont);
		textarea.setText("You reach the town. It is already night time. Using your sense of smell,\nyou trace multiple demons in the area. While tracking the smell, you\nencounter a young man sitting on the floor, weeping. \"What's wrong\nsir?\", you gently ask him. \"They took her.. they took my wife away..\",\nhe replies, with a sad, broken voice. His body gives you a faint hint of a\nunique smell of a demon, which surprises you. \"I better be careful, it's a\nstrong demon, along with the other low level demons.\" You stand up and follow the scent of a common demon throughout the dim-lit alley. As soon as you turn left, you see a single demon, standing at the end of the alley-way. You rush towards it, and approach him, your katana held out and\nready for action. \"Time to slay.\"");
		ch1.setText("FIGHT!");
		ch2.setText("");
		ch3.setText("");
		ch4.setText("");
		position = position + 1;
	}
	public void Tan_Fight1()
	{
		playerHP = maxHP;
		hplabelno.setText(""+playerHP);
		textarea.setText("The demon charges towards you at full speed, with both his hands above his head.\n\nWHAT DO YOU DO?");
		ch1.setText("First Form");
		ch2.setText("Second Form");
		ch3.setText("Third Form");
		ch4.setText("");
		position = position + 1;
	}
	public void Zen_Fight1()
	{
		
	}
	public void Ino_Fight1()
	{
		
	}
	public void Tan_Fight2_1()
	{
		playerHP = playerHP - 1;
		tempHP = playerHP;
		hplabelno.setText(""+playerHP);
		textarea.setText("\"Water Breathing : First Form - WATER SURFACE SLASH!\"\n\nYour blade passes through the demon's neck and in one single strike the confrontation is decided. The young man stares at you with awe. \"Please! Can you help me find my wife?\", he speaks, in a worried tone. You agree and start looking for the stronger demon.\n\nHP Lost = "+(100-playerHP));
		ch1.setText(">");
		ch2.setText("");
		ch3.setText("");
		ch4.setText("");
		position = position + 1;
	}
	public void Tan_Fight2_2()
	{
		playerHP = playerHP - playerHP;
		hplabelno.setText(""+playerHP);
		textarea.setText("\"Water Breathing : Second Form - WATER WHEEL!\"\n\nYour blade swings vertically. The demon blocks it with his hands and\nreaches up close and kicks his legs into your guts. You feel the\nexcruciating pain rushing throughout your body as you die.\n\nHP Lost = "+(100-playerHP));
		ch1.setText("RETRY");
		ch2.setText("");
		ch3.setText("");
		ch4.setText("");
		position = position - 1;
	}
	public void Tan_Fight2_3()
	{
		playerHP = playerHP - 2;
		tempHP = playerHP;
		hplabelno.setText(""+playerHP);
		textarea.setText("\"Water Breathing : Third Form - FLOWING DANCE!\"\n\nYou grip the handle tightly and rush towards the demon with difficult \nbending motion, slicing the demon into three parts. The young man \nstares at you with awe. \"Please! Can you help me find my wife?\", he \nspeaks, in a worried tone. You agree and start looking for the stronger \ndemon.\n\nHP Lost = "+(100-playerHP));
		ch1.setText(">");
		ch2.setText("");
		ch3.setText("");
		ch4.setText("");
		position = position + 1;
	}
	public void Tan_game2()
	{
		img4 = new ImageIcon(imageList[4]);
		imglabel4 = new JLabel(img4);
		imgpanel4.add(imglabel4);
		frame.add(imgpanel4);
		playerHP = tempHP;
		hplabelno.setText(""+playerHP);
		textarea.setText("You rush towards the source of the stench. The smell is getting stronger. \"This smell.. It is unbearable!\" You run to a turn and go right, and stop \non your tracks. You see 3 demons, giving the same stench, and standing \ntogether with a girl as hostage. \"THIS WILL BE A NICE MEAL!\", they say, in unison. They dive underground, but you catch hold of one trying \nto escape, and swing out your blade.\n\nWHAT DO YOU DO?");
		ch1.setText("Third Form");
		ch2.setText("Fifth Form");
		ch3.setText("Eighth Form");
		ch4.setText("");
		position = position + 1;
	}
	public void Tan_Fight3_1()
	{
		playerHP = playerHP - playerHP;
		hplabelno.setText(""+playerHP);
		textarea.setText("\"Water Breathing : Third Form - FLOWING DANCE!\"\n\nYou grip the handle tightly and prepare to strike, but the demons are \nquick and approach you quickly, preventing you from starting the \nsequence. They grab your limbs and pull, ripping you apart like a rag \ndoll.\n\nHP Lost = "+(tempHP-playerHP));
		ch1.setText("RETRY");
		ch2.setText("");
		ch3.setText("");
		ch4.setText("");
		position = position - 1;
	}
	public void Tan_Fight3_2()
	{
		playerHP = playerHP - playerHP;
		hplabelno.setText(""+playerHP);
		textarea.setText("\"Water Breathing : Fifth Form - BLESSED RAIN AFTER THE \nDROUGHT!\"\n\nYou prepare to strike really fast, but the other two demons reappear \nagain. The three demons have now surrounded you. Your attack hits one,but the other two punch into your stomach and knock you unconscious.\nYou see the light fading from your eyes.\n\n HP Lost = "+(tempHP-playerHP));
		ch1.setText("RETRY");
		ch2.setText("");
		ch3.setText("");
		ch4.setText("");
		position = position - 1;
	}
	public void Tan_Fight3_3()
	{
		imgpanel4.setVisible(false);
		tempHP = playerHP;
		playerHP = playerHP - 3;
		hplabelno.setText(""+playerHP);
		textarea.setText("\"Water Breathing : Eighth Form - WATERFALL BASIN!\"\n\n You aim for three of them and cut vertically, using the momentum of \nyour body. You strike hard and true, but it does not strike the vital parts \nof the body. The demons hide underground and you carry the girl and \ngive her to the young man for her safety. You start taking the scent of thedemons, and notice that they can't hide it, even if they are underground. You wait for them to resurface.\n\nHP Lost = "+(tempHP-playerHP));
		ch1.setText(">");
		ch2.setText("");
		ch3.setText("");
		ch4.setText("");
		position = position + 1;
	}
	public void Tan_game3()
	{
		tempHP = playerHP;
		hplabelno.setText(""+tempHP);
		textarea.setText("The demons left space open to go underground. You see no other option. \"I have to do it\". You jump into the swamp, and see the demons, \nrecovering from the last attack. They quickly surround you. \"HAHAHAHA!!! THIS IS OUR SPACE! YOU WON'T GET OUT ALIVE!\", they \nscream. You know that you have to think of something before they \nsurround you.\n\n WHAT DO YOU DO? ");
		ch1.setText("Third Form");
		ch2.setText("Fifth Form");
		ch3.setText("Sixth Form");
		ch4.setText("");
		position = position + 1;
	}
	public void Tan_Fight4_1()
	{
		playerHP = playerHP - playerHP;
		hplabelno.setText(""+playerHP);
		textarea.setText("\"Water Breathing : Third Form - FLOWING DANCE!\"\n\nYou are unable to perform it because you have no footing, and helplessly watch the demons approach you with a smile on their face.\n\nHP Lost = "+(tempHP-playerHP));
		playerHP = tempHP;
		ch1.setText("RETRY");
		ch2.setText("");
		ch3.setText("");
		ch4.setText("");
		position = position - 1;
	}
	public void Tan_Fight4_2()
	{
		playerHP = playerHP - playerHP;
		hplabelno.setText(""+playerHP);
		textarea.setText("\"Water Breathing : Fifth Form - BLESSED RAIN AFTER THE \nDROUGHT!\"\n\nYou are unable to perform it because you have no footing, and helplessly watch the demons approach you with a smile on their face.\n\nHP Lost = "+(tempHP-playerHP));
		playerHP = tempHP;
		ch1.setText("RETRY");
		ch2.setText("");
		ch3.setText("");
		ch4.setText("");
		position = position - 1;
	}
	public void Tan_Fight4_3()
	{
		tempHP = playerHP;
		playerHP = playerHP - 2;
		hplabelno.setText(""+playerHP);
		try {
            url = new URL("https://static.wikia.nocookie.net/kimetsu-no-yaiba/images/7/75/Tanjiro_using_Sixth_Style_Whirlpool_against_Swamp_Demon.gif/revision/latest/scale-to-width-down/320?cb=20200524000132");
        } catch (Exception e) {}
		img5 = new ImageIcon(url);
		imglabel5 = new JLabel(img5);
		imgpanel5.add(imglabel5);
		frame.add(imgpanel5);
		textarea.setText("\"Water Breathing : Sixth Form - WHIRLPOOL!\"\n\nYou spin your upper and lower torso to form a ferocious vortex that \ncreates a water whirlpool inside the swamp, with your katana \ndecapitating the three demons and slicing them into fine pieces. You \nemerge out of the surface victorious.\n\nHP Lost = "+(tempHP-playerHP));
		ch1.setText(">");
		ch2.setText("");
		ch3.setText("");
		ch4.setText("");
		position = position + 1;
	}
	public void Tan_game4()
	{
		imgpanel5.setVisible(false);
		tempHP = playerHP;
		hplabelno.setText(""+playerHP);
		skill = "Breath Modification";
		textarea.setText("You arise from the swamp and onto the road. The girl is unconscious but not harmed. The young man, though, who identifies himself as \"Kazumi\", is not doing well. He is still mourning the loss of his wife. You try to \ncomfort him, but he lashes out on you. \"You don't know how it feels!! \nSTOP TELLING ME TO FEEL BETTER!! YOU DON'T KNOW \nANYTHING AT ALL!\", he screams at you. You give him a warm smile, \nand ask him to take care of the girl. Just then, a Kasugai crow arrives. \n\"GOO TOOO TOKYOOOO!!!! THERE'SSS A DEMONN LURKINGG THEERREEEEE!!! GOOO QUICKLLYYYYY!!!\", it screams. You take the wooden box on your back, and set off for the next mission.\n\nSkill Acquired = Breath Modification");
		ch1.setText(">");
		ch2.setText("");
		ch3.setText("");
		ch4.setText("");
		position = position + 1;
	}
	public void Tan_game5()
	{
		playerHP = maxHP;
		hplabelno.setText(""+playerHP);
		img6 = new ImageIcon(imageList[5]);
		imglabel6 = new JLabel(img6);
		imgpanel6.add(imglabel6);
		frame.add(imgpanel6);
		textarea.setText("You arrive at a city called Asakusa, Tokyo. The city has a very lively \nenvironment during the night-time. Streets flooded with joyous people \nwalking on the roads with hands held, several shops on either side of the \nroad and crowd buzzing everywhere. You are amazed by the progress in \nthe big cities. \"Nezuko! This is sooo wonderful!!\" You sit down at a small \nstall to eat some food. You are eating your food when you smell a \nrecognisable smell. \"This smell..?? It seems very familiar!!\" You realise what it is. Your hands freeze and you drop your bowl. \"THIS IS THE \nSCENT OF THE DEMON WHO KILLED MY FAMILY! I SMELLED  IT AT MY HOME WHEN I HAD COME BACK!\" You rush towards the scent, as fast as you can, hoping to catch the source. \"If I'm correct, then this is the person who killed my family. This is KIBUTSUJI MUZAN.\n\n**Health Recovered**");
		ch1.setText(">");
		ch2.setText("");
		ch3.setText("");
		ch4.setText("");
		position = position + 1;
	}
	public void Tan_game6()
	{
		imgpanel6.setVisible(false);
		try {
			url = new URL("https://i.giphy.com/media/2GjhitSySBR0HTxZWG/giphy.gif");
        } catch (Exception e) {}
		img7 = new ImageIcon(url);
		imglabel7 = new JLabel(img7);
		imgpanel7.add(imglabel7);
		frame.add(imgpanel7);
		textarea.setText("You reach the source, and see a man in black suit. He is wearing a white hat. You quickly approach him, and shout his name. \"MUZAN! I WON'T LET YOU GO! YOU MURDERED MY FAMILY!\", you scream. Muzan turns. What you see next, shocks you to the core. He is carrying a human child and has a human wife. Your stomach starts acting weird. You're \nscared and in shock that the humans can't identify that he is a demon, \nand what harm he can do. \"Do you know him?\" His wife asks him. He \nreplies in the negative. You feel tremendous anger surge through your \nbody.\n\nWHAT DO YOU DO?");
		ch1.setText("NOTHING");
		ch2.setText("STRIKE HIM");
		ch3.setText("");
		ch4.setText("");
		position = position + 1;
	}
	public void Tan_game6c1()
	{
		imgpanel7.setVisible(false);
		try {
			url = new URL("https://i.giphy.com/media/6ElLKKw6H6fIJSrG7J/giphy.gif");
        } catch (Exception e) {}
		img8 = new ImageIcon(url);
		imglabel8 = new JLabel(img8);
		imgpanel8.add(imglabel8);
		frame.add(imgpanel8);
		textarea.setText("You are cautious, and avoid risking civilian lives. Muzan's eyes are glossy red, with the light making it shine. It seems that only you were able to \nrecognise that he is a demon. For the sake of the young child's live in his arms, you don't do anything rash. Muzan starts to walk away. Suddenly, you notice him scratch the neck of a man passing by, as fast as your eye \ncould see. You see the man hold his neck, then stagger. He falls down and goes unconscious. His wife begs the pedestrians for help. You rush \ntowards the man as fast as you can, because you know what has happened to him. A lady comes from nowhere, along with a boy, and stares at you \nwith interest. She addresses herself as Tamayo, and the young boy as \nYushiro. They invite you to their house, to treat the demon lying on the \nground.");
		ch1.setText(">");
		ch2.setText("");
		ch3.setText("");
		ch4.setText("");
		position = position + 1;
	}
	public void Tan_game6c2()
	{
		textarea.setText("You are about to strike him, when you see people staring at you while \nyour hand is on your katana's handle. You don't want to give Muzan an \noppurtunity to escape, so you don't do it. You are forced to do 'Nothing'.");
		ch1.setText(">");
		ch2.setText("");
		ch3.setText("");
		ch4.setText("");
		position = position - 1;
	}
	public void Tan_game7()
	{
		imgpanel8.setVisible(false);
		textarea.setText("Tamayo-san explains how she escaped Muzan's curse, how she took many many years to make Yushiro a demon. She also says that she has always \ntried looking for a cure to turn demons into human. You smell her scent, and realise that she and Yushiro are demons themselves, but they don't \nneed much blood to survive, unlike normal demons. Therefore, they are \nnot hostile towards humans. Tamayo-san explains how she needs your \nhelp with the research. \"You'll have to do two things. First let me inspect Nezuko's blood, second, kill demons that are closely related to Muzan \nand bring their blood for me. It won't be simple. Do you still wish to do \nit?\" You reply in the affirmative. \"I want to bring back my young sister. I'm willing to do anything.\", you say. Just then, you hear a loud crash on the house wall, and the house starts to collapse.");
		position = position + 1;
	}
	public void Tan_game8()
	{
		try {
			url = new URL("https://static.wikia.nocookie.net/kimetsu-no-yaiba/images/a/a2/Susamaru_attacks_with_her_Temari.gif/revision/latest/scale-to-width-down/220?cb=20190724051928");
        } catch (Exception e) {}
		img9 = new ImageIcon(url);
		imglabel9 = new JLabel(img9);
		imgpanel9.add(imglabel9);
		frame.add(imgpanel9);
		textarea.setText("You let the dust subside, and see a huge hole in the wall. Through it, you see a girl demon, standing near the opposite fence of the yard. She is \ncarrying two playing volley-balls, called temari balls, which she is \nthrowing on the wall with such force that it is breaking the wall down. \nThe balls seem to have their own mind, and once thrown, they move on \nfree will till they hit the target. Yushiro tries to destroy one by predicting it's movement, but fails to do so, and gets his head blown away to smithe-reens.");
		position = position + 1;
	}
	public void Tan_game9()
	{
		imgpanel9.setVisible(false);
		tempHP = playerHP;
		hplabelno.setText(""+tempHP);
		textarea.setText("You see Susamaru, as the girl identifies herself, preparing to throw a \ntemari straight at you. You know it will just change direction if you try \nto slice it. She releases the ball with force, straight towards you.\n\nWHAT DO YOU DO?");
		ch1.setText("Third Form");
		ch2.setText("Seventh Form");
		ch3.setText("Sixth Form");
		ch4.setText("");
		position = position + 1;
	}
	public void Tan_Fight9_1()
	{
		tempHP = playerHP;
		playerHP = playerHP - playerHP;
		hplabelno.setText(""+playerHP);
		textarea.setText("\"Water Breathing : Third Form - FLOWING DANCE!\"\n\nYou grip the handle and prepare to strike, but are unable to connect \nwith the ball and slice it off in time. It deviates and shoots right to your \nface, completely smashing it.\n\nHP Lost = "+(tempHP-playerHP));
		playerHP = tempHP;
		ch1.setText("RETRY FIGHT");
		ch2.setText("");
		ch3.setText("");
		ch4.setText("");
		position = position - 1;
	}
	public void Tan_Fight9_2()
	{
		tempHP = playerHP;
		playerHP = playerHP - 2;
		hplabelno.setText(""+playerHP);
		textarea.setText("\"Water Breathing : Seventh Form - PIERCING RAIN DROP!\"\n\nYou hold the blade and position it like a javelin. As soon as the ball \ncomes close, you pierce it with your blade, getting it stuck and hence \nstopping it's movement. However, it just slides out and prepares to hit \nyou again.\n\nHP Lost = "+(tempHP-playerHP));
		ch1.setText(">");
		ch2.setText("");
		ch3.setText("");
		ch4.setText("");
		position = position + 1;
	}
	public void Tan_Fight9_3()
	{
		tempHP = playerHP;
		playerHP = playerHP - playerHP;
		hplabelno.setText(""+playerHP);
		textarea.setText("\"Water Breathing : Sixth Form - WHIRLPOOL!\"\n\nYou try to create a vortex to disrupt the ball's flow, but it seems that it is being controlled by some other force. Your attack has no effect. The ball hits you hard in the head. You collapse immediately.\n\nHP Lost = "+(tempHP-playerHP));
		playerHP = tempHP;
		ch1.setText("RETRY FIGHT");
		ch2.setText("");
		ch3.setText("");
		ch4.setText("");
		position = position - 1;
	}
	public void Tan_game10()
	{
		tempHP = playerHP;
		hplabelno.setText(""+tempHP);
		textarea.setText("Yushiro calls you. \"Tanjiro! You can't see the arrows?\"...\"What arrows? Where?\", you reply. He gives you a piece of his magical cloth. You wear it on ur head, and suddenly you see the arrows guiding the balls. \"All I \nhave to do now is dodge the arrows!!\", you think, and thank Yushiro for \nthe cloth. Nezuko takes Tamayo to the basement for safety. Then she goes to tackle the other demon hiding in the trees, whose name is known to be Yahaba. Nezuko kicks Yahaba, causing the temari to stop temporarily. You slice the temaris and rush towards Susamaru, to fight her. You're \nabout to reach withing striking distance.\n\nWHAT DO YOU DO?");
		ch1.setText("First Form");
		ch2.setText("Third Form");
		ch3.setText("");
		ch4.setText("");
		position = position + 1;
	}
	public void Tan_Fight10_1()
	{
		tempHP = playerHP;
		playerHP = playerHP - playerHP;
		hplabelno.setText(""+playerHP);
		textarea.setText("\"Water Breathing : First Form - WATER SURFACE SPLASH!\"\n\nYou attack with a horizontal slice, but it's not fast enough and linear. It \ngets blocked and Susamaru is able to throw a temari right to your head.\n\nHP Lost = "+(tempHP-playerHP));
		playerHP = tempHP;
		ch1.setText("RETRY FIGHT");
		ch2.setText("");
		ch3.setText("");
		ch4.setText("");
		position = position - 3;
	}
	public void Tan_Fight10_2()
	{
		tempHP = playerHP;
		playerHP = playerHP - 2;
		hplabelno.setText(""+playerHP);
		try {
			url = new URL("https://static.wikia.nocookie.net/kimetsu-no-yaiba/images/5/57/Tanjiro_using_Third_Form_Flowing_Dance_on_Susamaru.gif/revision/latest/scale-to-width-down/320?cb=20210607091237");
        } catch (Exception e) {}
		img10 = new ImageIcon(url);
		imglabel10 = new JLabel(img10);
		imgpanel10.add(imglabel10);
		frame.add(imgpanel10);
		textarea.setText("\"Water Breathing : Third Form - FLOWING DANCE!\"\n\nYou move with impressive agility, slicing with numerous quick slashes.\n You manage to chop Susamaru's hands off, and stop behind her with an opening.\n\nHP Lost = "+(tempHP-playerHP));
		ch1.setText(">");
		ch2.setText("");
		ch3.setText("");
		ch4.setText("");
		position = position + 1;
	}
	public void Tan_game11()
	{
		imgpanel10.setVisible(false);
		tempHP = playerHP;
		hplabelno.setText(""+tempHP);
		textarea.setText("Susamaru regenerates her hands within seconds. You are amazed at the \nspeed of her regeneration. \"Are they related to Kibutsuji, Tamayo san?\" you ask. Before she can answer, Susamaru replies,\"We're the Twelve \nKizukis..BEAT US IF YOU CAN!\" Tamayo san tells you that if it is true, then their blood is important. You know this will be a tough fight. You \ngroup with Nezuko, and change opponents. You rush towards Yahaba. \nNezuko rushes towards Susamaru. You approach Yahaba with speed \nand find the opening thread. \"This is my chance!\" You're about to slash his neck when he points his arrows to you and disorients you. You miss \nby not much. The arrows start pummeling you through the air and leave you to fall. You have to think of something, and quick.\n\nWHAT DO YOU DO?");
		ch1.setText("Third Form");
		ch2.setText("Sixth Form");
		ch3.setText("Eighth Form");
		ch4.setText("");
		position = position + 1;
	}
	public void Tan_Fight11_1()
	{
		tempHP = playerHP;
		playerHP = playerHP-playerHP;
		hplabelno.setText(""+playerHP);
		textarea.setText("\"Water Breathing : Third Form - FLOWING DANCE!\"\n\nYou are not able to perform it mid-air. You land on the ground at \ntremendous speed and hear your bones break and blood splatter as the \nlittle life in you fades away.\n\nHP Lost = "+(tempHP-playerHP));
		playerHP = tempHP;
		ch1.setText("RETRY FIGHT");
		ch2.setText("");
		ch3.setText("");
		ch4.setText("");
		position = position - 5;
	}
	public void Tan_Fight11_2()
	{
		tempHP = playerHP;
		playerHP = playerHP-playerHP;
		hplabelno.setText(""+playerHP);
		textarea.setText("\"Water Breathing : Sixth Form - WHIRLPOOL!\"\n\nYou are able to perform it mid-air, but it's effectiveness is not enough for you to land safely. You land on the ground at tremendous speed and \nhear your bones break and blood splatter as the little life in you fades \naway.\n\nHP Lost = "+(tempHP-playerHP));
		playerHP = tempHP;
		ch1.setText("RETRY FIGHT");
		ch2.setText("");
		ch3.setText("");
		ch4.setText("");
		position = position - 5;
	}
	public void Tan_Fight11_3()
	{
		tempHP = playerHP;
		playerHP = playerHP - 3;
		hplabelno.setText(""+playerHP);
		textarea.setText("\"Water Breathing : Eighth Form - WATERFALL BASIN!\"\n\nYou slash vertically with all your force as you hit the ground and manage to land safely.\n\nHP Lost = "+(tempHP-playerHP));
		ch1.setText(">");
		ch2.setText("");
		ch3.setText("");
		ch4.setText("");
		position = position + 1;
	}
	public void Tan_game12()
	{
		tempHP = playerHP;
		playerHP = playerHP - 7;
		hplabelno.setText(""+playerHP);
		textarea.setText("You regain your footing, and run towards Yahaba. However, his arrows \nthrow you and you hit a tree. They come once again but you dodge it. \nYou realise that you need to divert the arrows and use them for your \nfavour. You see more arrows coming towards you.\n\nHPLost = "+(tempHP-playerHP)+"\n\nWHAT DO YOU DO?");
		ch1.setText("Fifth Form");
		ch2.setText("Sixth Form");
		ch3.setText("Eighth Form");
		ch4.setText("");
		position = position + 1;
	}
	public void Tan_Fight12_1()
	{
		tempHP = playerHP;
		playerHP = playerHP - 2;
		hplabelno.setText(""+playerHP);
		textarea.setText("\"Water Breathing : Fifth Form - BLESSED RAIN AFTER THE \nDROUGHT!\"\n\nYou use the rotation of the fifth form to envelope the arrows and boost \nyour attack.\n\nHP Lost = "+(tempHP-playerHP));
		ch1.setText(">");
		ch2.setText("");
		ch3.setText("");
		ch4.setText("");
		position = position + 1;
	}
	public void Tan_Fight12_2()
	{
		tempHP = playerHP;
		playerHP = playerHP - playerHP;
		hplabelno.setText(""+playerHP);
		textarea.setText("\"Water Breathing : Sixth Form - WHIRLPOOL!\"\n\nYou don't get enough momentum, and the arrows smash you to a rock, \nbreaking your ribs, and rupturing your lungs.\n\nHP Lost = "+(tempHP - playerHP));
		playerHP = tempHP;
		ch1.setText("RETRY FIGHT");
		ch2.setText("");
		ch3.setText("");
		ch4.setText("");
		position = position - 7;
	}
	public void Tan_Fight12_3()
	{
		tempHP = playerHP;
		playerHP = playerHP - playerHP;
		hplabelno.setText(""+playerHP);
		textarea.setText("\"Water Breathing : Eighth Form - WATERFALL BASIN!\"\n\nYou try to land a vertical blow, but you're slower than the arrows, and it throws you off guard and smashes you on a rock.\n\nHP Lost = "+(tempHP-playerHP));
		playerHP = tempHP;
		ch1.setText("RETRY FIGHT");
		ch2.setText("");
		ch3.setText("");
		ch4.setText("");
		position = position - 7;
	}
	public void Tan_game13()
	{
		tempHP = playerHP;
		hplabelno.setText(""+tempHP);
		textarea.setText("Your idea is working. The arrows are now joining to form a streamline \nand help your blade swing faster and stronger. You have to quickly \nthink of how to control this or else they will disperse again.\n\nWHAT DO YOU DO?");
		ch1.setText("Fourth Form");
		ch2.setText("Sixth Form");
		ch3.setText("Third Form");
		ch4.setText("");
		position = position + 1;
	}
	public void Tan_Fight13_1()
	{
		tempHP = playerHP;
		playerHP = playerHP - playerHP;
		hplabelno.setText(""+playerHP);
		textarea.setText("\"Water Breathing : Fourth Form - STRIKING TIDE!\"\n\nYou try to land a clean, precise blow, but your swing is too linear, and \nthe arrows catch your movement, throw you off guard and smash you on a rock.\n\nHP Lost = "+(tempHP-playerHP));
		playerHP = tempHP;
		ch1.setText("RETRY FIGHT");
		ch2.setText("");
		ch3.setText("");
		ch4.setText("");
		position = position - 9;
	}
	public void Tan_Fight13_2()
	{
		tempHP = playerHP;
		playerHP = playerHP - 2;
		hplabelno.setText(""+playerHP);
		textarea.setText("\"Water Breathing : Sixth Form - WHIRLPOOL!\"\n\nYou use the footwork of the sixth form to stop the movement of the \narrows. You perform the Third Form to come closer to Yahaba, within \nstriking distance and prepare to attack.\n\nHP Lost = "+(tempHP-playerHP));
		ch1.setText(">");
		ch2.setText("");
		ch3.setText("");
		ch4.setText("");
		position = position + 1;
	}
	public void Tan_Fight13_3()
	{
		tempHP = playerHP;
		playerHP = playerHP - playerHP;
		hplabelno.setText(""+playerHP);
		textarea.setText("\"Water Breathing : Third Form - FLOWING DANCE!\"\n\nYou can't be agile with those arrows on your heels, you need a solid \nattack to nullify them first. You lose your balance, and the arrows throw you high up and drop you.\n\nHP Lost = "+(tempHP-playerHP));
		playerHP = tempHP;
		ch1.setText("RETRY FIGHT");
		ch2.setText("");
		ch3.setText("");
		ch4.setText("");
		position = position - 9;
	}
	public void Tan_game14()
	{
		tempHP = playerHP;
		hplabelno.setText(""+tempHP);
		textarea.setText("Your combination is working. You take stance for a close range attack.\n\nWHAT DO YOU DO?");
		ch1.setText("Fourth Form");
		ch2.setText("Second Form");
		ch3.setText("");
		ch4.setText("");
		position = position + 1;
	}
	public void Tan_Fight14_1()
	{
		tempHP = playerHP;
		playerHP = playerHP - playerHP;
		hplabelno.setText(""+playerHP);
		textarea.setText("\"Water Breathing : Fourth Form - STRIKING TIDE!\"\n\nYour attack is too linear, and Yahaba blocks it. His arrows catch your \narms and wrap tightly, causing immense pain to you. You drop your \nblade and watch as the arrows carry you high in the air and drop you.\n\nHP Lost = "+(tempHP-playerHP));
		playerHP = tempHP;
		ch1.setText("RETRY FIGHT");
		ch2.setText("");
		ch3.setText("");
		ch4.setText("");
		position = position - 11;
	}
	public void Tan_Fight14_2()
	{
		tempHP = playerHP;
		playerHP = playerHP - 4;
		hplabelno.setText(""+playerHP);
		try {
			url = new URL("https://static.wikia.nocookie.net/kimetsu-no-yaiba/images/5/5c/Tanjiro_using_Second_Form_Modified_Horizontal_Water_Wheel_to_slice_Yahaba%27s_head.gif/revision/latest/scale-to-width-down/320?cb=20190601180138");
        } catch (Exception e) {}
		img11 = new ImageIcon(url);
		imglabel11 = new JLabel(img11);
		imgpanel11.add(imglabel11);
		frame.add(imgpanel11);
		textarea.setText("\"Water Breathing : Second Form - WHIRLPOOL - Modified - \nLATERAL WATER WHEEL!\"\n\nYou turn sideways and jump, using your momentum, and perform the \nWater Wheel sideways. It reaches Yahaba's neck, and slices it off with a \nclean cut. You get up, as you watch him disintegrate.\n\nHP Lost = "+(tempHP-playerHP));
		ch1.setText(">");
		ch2.setText("");
		ch3.setText("");
		ch4.setText("");
		position = position + 1;
	}
	public void Tan_game15()
	{
		imgpanel11.setVisible(false);
		tempHP = playerHP;
		hplabelno.setText(""+tempHP);
		textarea.setFont(exfont);
		textarea.setText("Your fight with Yahaba has left you weak.You can't possibly fight Susamaru now. You \nwatch Nezuko and Yushiro fight her, but to no avail. Nezuko tries to kick the temari ball, \nbut loses her leg in the process. Yushiro is putting up a good fight, but it is not enough to \ndefeat her. You struggle to get up and fight. Your body is exhausted, and won't allow it. You lie down on the ground, helpless. Susamaru has become stronger, and grown six arms now. She is on a different level than the rest of you. You are not certain if you will win this fight. Just then, Tamayo-san comes forward, and starts talking about her pathetic leader, Kibutsuji Muzan. This fires up her mind. Susamaru gets angry and defends his master. Tamayo-san is casting her Blood Demon Art spell scretly, so that Susamaru's mind starts to falter and \nshe makes a mistake. Unfortunately for her, she calls out Muzan's name by mistake, thus invoking the curse Muzan has set up on all demons under him. She begs for his forgiveness \nbut Muzan's curse spawns demonic arms throughout her body and rip her apart. She dies a painful death.");
		ch1.setText(">");
		ch2.setText("");
		ch3.setText("");
		ch4.setText("");
		position = position + 1;
	}
	public void Tan_game16()
	{
		tempHP = maxHP;
		hplabelno.setText(""+tempHP);
		textarea.setFont(chfont);
		textarea.setText("You extract some blood from Susamaru's decaying body, and give the \nsample to Tamayo-san. She goes to treat Nezuko, who is still hurt from \nearlier. She later examines Susamaru's body, and tells you that she \nisn't a member of the Twelve Kizuki (12 moons). On the other hand, she was lied to by Muzan and only used by him for his work. Tanjiro realised the cruel way Muzan treated all of his sub-ordinates, like pawns. After \neverything is done, Tamayo-san informs you that they are moving to a \ndifferent place. You bid them farewell and move on to your next mission, to a South - South-East town.\n\n**Health Recovered**");
		ch1.setText(">");
		ch2.setText("");
		ch3.setText("");
		ch4.setText("");
		position = position + 1;
	}
	public void EndTan_p1()
	{
		playerpanel.setVisible(false);
		choicepanel.setVisible(false);
		textarea.setFont(stbutfont);
		textarea.setText("\n\n              END OF PART 1");
	}
	
	public class mainscreen implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			gamescreen();
		}
	}
	public class choicehandler1 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String yourChoice = e.getActionCommand();
			if (position == 1)
			{
				if (e.getSource() == ch1)
					Tan_abtchar(yourChoice);
				else if (e.getSource() == ch2)
					Zen_abtchar(yourChoice);
				else if (e.getSource() == ch3)
					Ino_abtchar(yourChoice);
			}
			else if (position == 2)
			{
				if (e.getSource() == ch1)
					Tan_prologue1();
				else if (e.getSource() == ch2)
					Zen_prologue1();
				else if (e.getSource() == ch3)
					Ino_prologue1();
			}
			else if (position == 3)
			{
				if (e.getSource() == ch1)
					Tan_prologue2();
				else if (e.getSource() == ch2)
					Zen_prologue2();
				else if (e.getSource() == ch3)
					Ino_prologue2();
			}
			else if (position == 4)
			{
				if (e.getSource() == ch1)
					Tan_prologue3();
				else if (e.getSource() == ch2)
					Zen_prologue3();
				else if (e.getSource() == ch3)
					Ino_prologue3();
			}
			else if (position == 5)
			{
				if (e.getSource() == ch1)
					Tan_prologue4();
				else if (e.getSource() == ch2)
					Zen_prologue4();
				else if (e.getSource() == ch3)
					Ino_prologue4();
			}
			else if (position == 6)
			{
				if (e.getSource() == ch1)
					End_TanPrologue();
				else if (e.getSource() == ch2)
					End_ZenPrologue();
				else if (e.getSource() == ch3)
					End_InoPrologue();
			}
			else if (position == 7)
			{
				if (e.getSource() == ch1)
				{
					wtds();
				}
			}
			else if (position == 8)
			{
				if (e.getSource() == ch1)
					w_breath();
				else if (e.getSource() == ch2)
					t_breath();
				else if (e.getSource() == ch3)
					b_breath();
			}
			else if (position == 9)
			{
				if (e.getSource() == ch1)
					Tan_game1();
			}
			else if (position == 10)
			{
				if (e.getSource() == ch1)
					Tan_Fight1();
				else if (e.getSource() == ch2)
					Zen_Fight1();
				else if (e.getSource() == ch3)
					Ino_Fight1();
			}
			else if (position == 11)
			{
				if (e.getSource() == ch1)
					Tan_Fight2_1();
				else if (e.getSource() == ch2)
					Tan_Fight2_2();
				else if (e.getSource() == ch3)
					Tan_Fight2_3();
			}
			else if (position == 12)
			{
				if (e.getSource() == ch1)
					Tan_game2();
			}
			else if (position == 13)
			{
				if (e.getSource() == ch1)
					Tan_Fight3_1();
				else if (e.getSource() == ch2)
					Tan_Fight3_2();
				else if (e.getSource() == ch3)
					Tan_Fight3_3();
			}
			else if (position == 14)
			{
				if (e.getSource() == ch1)
					Tan_game3();
			}
			else if (position == 15)
			{
				if (e.getSource() == ch1)
					Tan_Fight4_1();
				else if (e.getSource() == ch2)
					Tan_Fight4_2();
				else if (e.getSource() == ch3)
					Tan_Fight4_3();
			}
			else if (position == 16)
			{
				if (e.getSource() == ch1)
					Tan_game4();
			}
			else if (position == 17)
			{
				if (e.getSource() == ch1)
					Tan_game5();
			}
			else if (position == 18)
			{
				if (e.getSource() == ch1)
					Tan_game6();
			}
			else if (position == 19)
			{
				if (e.getSource() == ch1)
					Tan_game6c1();
				else if (e.getSource() == ch2)
					Tan_game6c2();
			}
			else if (position == 20)
			{
				if (e.getSource() == ch1)
					Tan_game7();
			}
			else if (position == 21)
			{
				if (e.getSource() == ch1)
					Tan_game8();
			}
			else if (position == 22)
			{
				if (e.getSource() == ch1)
					Tan_game9();
			}
			else if (position == 23)
			{
				if (e.getSource() == ch1)
					Tan_Fight9_1();
				else if (e.getSource() == ch2)
					Tan_Fight9_2();
				else if (e.getSource() == ch3)
					Tan_Fight9_3();
			}
			else if (position == 24)
			{
				Tan_game10();
			}
			else if (position == 25)
			{
				if (e.getSource() == ch1)
					Tan_Fight10_1();
				else if (e.getSource() == ch2)
					Tan_Fight10_2();
			}
			else if (position == 26)
			{
				Tan_game11();
			}
			else if (position == 27)
			{
				if (e.getSource() == ch1)
					Tan_Fight11_1();
				else if (e.getSource() == ch2)
					Tan_Fight11_2();
				else if (e.getSource() == ch3)
					Tan_Fight11_3();
			}
			else if (position == 28)
			{
				if (e.getSource() == ch1)
					Tan_game12();
			}
			else if (position == 29)
			{
				if (e.getSource() == ch1)
					Tan_Fight12_1();
				else if (e.getSource() == ch2)
					Tan_Fight12_2();
				else if (e.getSource() == ch3)
					Tan_Fight12_3();
			}
			else if (position == 30)
			{
				if (e.getSource() == ch1)
					Tan_game13();
			}
			else if (position == 31)
			{
				if (e.getSource() == ch1)
					Tan_Fight13_1();
				else if (e.getSource() == ch2)
					Tan_Fight13_2();
				else if (e.getSource() == ch3)
					Tan_Fight13_3();
			}
			else if (position == 32)
			{
				if (e.getSource() == ch1)
					Tan_game14();
			}
			else if (position == 33)
			{
				if (e.getSource() == ch1)
					Tan_Fight14_1();
				else if (e.getSource() == ch2)
					Tan_Fight14_2();
			}
			else if (position == 34)
			{
				if (e.getSource() == ch1)
					Tan_game15();
			}
			else if (position == 35)
			{
				if (e.getSource() == ch1)
					Tan_game16();
			}
			else if (position == 36)
			{
				if (e.getSource() == ch1)
					EndTan_p1();
			}
			
		}
	}
}