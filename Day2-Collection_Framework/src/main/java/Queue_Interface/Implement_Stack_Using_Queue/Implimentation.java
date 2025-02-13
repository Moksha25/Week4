package Queue_Interface.Implement_Stack_Using_Queue;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.LinkedList;
import java.util.Queue;

public class Implimentation
{
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int x)
    {
        q2.add(x);

        while(!q1.isEmpty())
        {
            q2.add(q1.poll());
        }

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop()
    {
        return q1.isEmpty() ? -1 : q1.poll();
    }

    public int top()
    {
        return q1.isEmpty() ? -1 : q1.peek();
    }

    public boolean isEmpty()
    {
        return q1.isEmpty();
    }

    public static void main (String args[])
    {
        Implimentation stack = new Implimentation();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop());
        System.out.println(stack.top());
        System.out.println(stack.isEmpty());

        System.out.println("Queue 1 : " + stack.q1);
        System.out.println("Queue 2 : " + stack.q2);
    }
}
