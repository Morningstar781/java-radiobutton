package Main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
@SuppressWarnings({ "serial", "unused" })
public  class MyFrame extends JFrame implements ActionListener {

	JRadioButton birdButton;
	JRadioButton catButton;
	JRadioButton dogButton;
	JRadioButton rabbitButton;
	JRadioButton pigButton;
	
	ImageIcon birdIcon;
	ImageIcon catIcon;
	ImageIcon dogIcon;
	ImageIcon rabbitIcon;
	ImageIcon pigIcon;
	
 MyFrame(){
	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 this.setLayout(new FlowLayout());
	 
	 birdIcon = new ImageIcon("bird.png");
	 catIcon = new ImageIcon("cat.png");
	 dogIcon = new ImageIcon("dog.png");
	 rabbitIcon = new ImageIcon("rabbit.png");
	 pigIcon = new ImageIcon("pig.png");
	
	 
	 
	  birdButton = new JRadioButton("bird");
	  catButton = new JRadioButton("cat");
	  dogButton = new JRadioButton("dog");
	  rabbitButton = new JRadioButton("rabbit");
	  pigButton = new JRadioButton("pig");
	  
	 ButtonGroup group = new ButtonGroup();
	 group.add(birdButton);
	 group.add(catButton);
	 group.add(dogButton);
	 group.add(rabbitButton);
	 group.add(pigButton);
	 
	 
	 birdButton.addActionListener(this);
	 catButton.addActionListener(this);
	 dogButton.addActionListener(this);
	 rabbitButton.addActionListener(this);
	 pigButton.addActionListener(this);
	 
	 birdButton.setIcon(birdIcon);
	 catButton.setIcon(catIcon);
	 dogButton.setIcon(dogIcon);
	 rabbitButton.setIcon(rabbitIcon);
	 pigButton.setIcon(pigIcon);
	 
	 this.add(birdButton);
	 this.add(catButton);
	 this.add(dogButton);
	 this.add(rabbitButton);
	 this.add(pigButton);
	 
	 this.pack();
	 this.setVisible((true));
	 
	

 
 birdButton.addActionListener(new ActionListener() {
     @SuppressWarnings("unused")
	public void actionPerformed(ActionEvent e) {
         JOptionPane.showMessageDialog(null, "You selected bird");
     }
 });

 catButton.addActionListener(new ActionListener() {
     public void actionPerformed(ActionEvent e) {
         JOptionPane.showMessageDialog(null, "You selected cat");
     }
 });
 
 dogButton.addActionListener(new ActionListener() {
     public void actionPerformed(ActionEvent e) {
         JOptionPane.showMessageDialog(null, "You selected dog");
     }
 });
 
 rabbitButton.addActionListener(new ActionListener() {
     public void actionPerformed(ActionEvent e) {
         JOptionPane.showMessageDialog(null, "You selected rabbit");
     }
 });
 
 pigButton.addActionListener(new ActionListener() {
     public void actionPerformed(ActionEvent e) {
         JOptionPane.showMessageDialog(null, "You selected pig");
     }
 });
}
 
 public static void main(String[] args) {
     // Create and display the frame
     MyFrame example = new MyFrame();
     example.setVisible(true);
 }

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
