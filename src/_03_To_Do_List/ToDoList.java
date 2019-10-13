package _03_To_Do_List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ToDoList implements ActionListener {
	JFrame frame ;
	JPanel panel;
	JButton addTask;
	JButton viewTasks;
	JButton removeTasks;
	JButton saveList;
	JButton loadList;
	String sf;

ArrayList<String> list ;
	public static void main(String[] args) {
		ToDoList t = new ToDoList();
		t.create();
	}
	void create() {
		
		frame = new JFrame();
		panel = new JPanel();
		frame.add(panel);
		frame.setVisible(true);
		addTask = new JButton();
		viewTasks = new JButton();
		removeTasks = new JButton();
		saveList = new JButton();
		loadList = new JButton();
	
		addTask.setText("Add Text");
		viewTasks.setText("View Tasks");
		removeTasks.setText("Remove tasks");
		saveList.setText("Save List");
		loadList.setText("Load List");
		panel.add(addTask);
		panel.add(viewTasks);
		panel.add(removeTasks);
		panel.add(saveList);
		panel.add(loadList);
		 frame.pack();
		addTask.addActionListener(this);
		 viewTasks.addActionListener(this);
		 removeTasks.addActionListener(this);
		 saveList.addActionListener(this);
		 loadList.addActionListener(this);
		 
		 
	}
	/*
	 * Create a program with five buttons, add task, view tasks, remove task, save list, and load list. 
	 * 
	 * When add task is clicked:
	 * 		ask the user for a  task and save it to an array list
	 * 
	 * When the view tasks button is clicked:
	 *		show all the tasks in the list
	 * 
	 * When the remove task button is clicked:
	 * 		prompt the user for which task to remove and take it off of the list.
	 * 
	 * When the save list button is clicked:
	 * 		Save the list to a file
	 * 
	 * When the load list button is clicked:
	 * 		Prompt the user for the location of the file and load the list from that file
	 * 
	 * When the program starts, it should automatically load the last saved file into the list.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		list = new ArrayList<String>();
		JButton buttonpressed =  (JButton)e.getSource();
		if(buttonpressed==addTask) {
			String s  = JOptionPane.showInputDialog("give me a task");
		for (int i = 0; i < list.size(); i++) {
		sf = list.get(i);
		}sf = s;
	
		
		}
		
		else if(buttonpressed == viewTasks) {
		list.add(sf);
			System.out.println(list);
		}
		else if(buttonpressed == removeTasks) { 
			String remove = JOptionPane.showInputDialog("Which Item do you want to remove?");
			for (int i = 0; i < list.size(); i++) {
				if(remove.equals(list.get(i))){
					list.remove(list.get(i));
				}
			}}
			else if(buttonpressed == saveList) {
				try {
					FileWriter fw = new FileWriter("src/_03_To_Do_List/text.txt",true);
			
				for (int i = 0; i < list.size(); i++) {
					fw.write(list.get(i));
				}}
				catch(IOException ex) {
					ex.printStackTrace();
				}
			}
			else {
			String s =	JOptionPane.showInputDialog("Where is the file located?");
			try {
				BufferedReader br = new BufferedReader(new FileReader(s));
				
			String line = br.readLine();
			while(line!=null) {
				System.out.println(line);
				line = br.readLine();}
				br.close();
			}	
			catch(FileNotFoundException f1) {
				f1.printStackTrace();
		
			}
			catch(IOException f2) {
				f2.printStackTrace();
			}
			
	}
		
	}}

