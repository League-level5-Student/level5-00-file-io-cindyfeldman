package _03_To_Do_List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
String[] ask;
	public static void main(String[] args) {
		ToDoList t = new ToDoList();
		t.create();
	}
	void create() {
		panel = new JPanel();
		frame = new JFrame();
		frame.add(panel);
		addTask = new JButton();
		viewTasks = new JButton();
		removeTasks = new JButton();
		saveList = new JButton();
		loadList = new JButton();
		panel.add(addTask);
		 
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
		JButton buttonpressed =  (JButton)e.getSource();
		if(buttonpressed==addTask) {
			for (int i = 0; i < ask.length; i++) {
				
			
			ask[i] = JOptionPane.showInputDialog("give me a task)");
			}
		}
		else if(buttonpressed == viewTasks) {
			for (int i = 0; i < ask.length; i++) {
				System.out.println(ask[i]);
			}
		}
		
	}
}
