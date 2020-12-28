package stackAndQueves;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Driver {
	public static void main (String[] args) throws InterruptedException{
		int [] routes = {1,2,3};
		
		System.out.println("It's a new day on Mt.Desperation! ");
		//Instantiate queue for climbers to line up
		Queue<String> queue = new LinkedList<String>();
		Climber climber1 = new Climber ("Barney");
		Climber climber2 = new Climber ("Betty");
		Climber climber3 = new Climber ("Ethel");
		Climber climber4 = new Climber ("Fred");
		Climber climber5 = new Climber ("John");
		Climber climber6 = new Climber ("Juliet");
		Climber climber7 = new Climber ("Romeo");
		Climber climber8 = new Climber ("Wilma");
		Climber climber9 = new Climber ("Zelda");
		
		queue.offer(climber1.getName());
		queue.offer(climber2.getName());
		queue.offer(climber3.getName());
		queue.offer(climber4.getName());
		queue.offer(climber5.getName());
		queue.offer(climber6.getName());
		queue.offer(climber7.getName());
		queue.offer(climber8.getName());
		queue.offer(climber9.getName());
		
		for (String linedUp : queue) 
        	System.out.println(linedUp + " lines up");
		
		//Stack for cave
		Stack<String> stack = new Stack<String>();
		Climber c1 = new Climber ("Barney");
		Climber c2 = new Climber ("Betty");
		Climber c3 = new Climber ("Ethel");
		Climber c4 = new Climber ("Fred");
		Climber c5 = new Climber ("John");
		Climber c6 = new Climber ("Juliet");
		Climber c7 = new Climber ("Romeo");
		Climber c8 = new Climber ("Wilma");
		Climber c9 = new Climber ("Zelda");
		
		stack.add(c1.getName());
		stack.add(c2.getName());
		stack.add(c3.getName());
		stack.add(c4.getName());
		stack.add(c5.getName());
		stack.add(c6.getName());
		stack.add(c7.getName());
		stack.add(c8.getName());
		stack.add(c9.getName());
		
		for (String cave : stack) 
        	System.out.println("Yeti throws " + cave + " into the ice cave!");
		
		//Queue2 for escape routes 
		Queue<String> queue2 = new LinkedList<String>();
		Climber climb9 = new Climber ("Zelda");
		Climber climb8 = new Climber ("Wilma");
		Climber climb7 = new Climber ("Romeo");
		Climber climb6 = new Climber ("Juliet");
		Climber climb5 = new Climber ("John");
		Climber climb4 = new Climber ("Fred");
		Climber climb3 = new Climber ("Ethel");
		Climber climb2 = new Climber ("Betty");
		Climber climb1 = new Climber ("Barney");
		
		queue2.offer(climb9.getName());
		queue2.offer(climb8.getName());
		queue2.offer(climb7.getName());
		queue2.offer(climb6.getName());
		queue2.offer(climb5.getName());
		queue2.offer(climb4.getName());
		queue2.offer(climb3.getName());
		queue2.offer(climb2.getName());
		queue2.offer(climb1.getName());
		
		int round = 0;
		while (!queue2.isEmpty()) {
			//Remove queues
			System.out.println(queue2.remove() + " escapes from the cave and slides down descent route " + round% routes.length);
			Thread.sleep(500);
			round++;
		}
	}
}
