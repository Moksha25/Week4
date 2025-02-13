package Queue_Interface.Circular_Buffer_Simulation;

public class Buffer
{
    int[] buffer;
    int head = 0;
    int tail = 0;
    int size = 0;
    int capacity;

    public Buffer(int capacity)
    {
        this.capacity = capacity;
        this.buffer = new int[capacity];
    }

    public void enqueue(int value)
    {
        buffer[tail] = value;
        tail = (tail + 1) % capacity;

        if(size < capacity)
        {
            size++;
        }
        else
        {
            head = (head + 1) % capacity;
        }
    }

    public int dequeue()
    {
        if(size == 0) return -1;
        int value = buffer[head];
        head = (head + 1) % capacity;
        size--;
        return value;
    }

    public void printBuffer()
    {
        System.out.println("Buffer : ");
        for(int i=0; i<size; i++)
        {
            System.out.println(buffer[(head + i) % capacity] + " ");
        }
        System.out.println();
    }

    public static void main (String args[])
    {
        Buffer b = new Buffer(3);
        b.enqueue(1);
        b.enqueue(2);
        b.enqueue(3);
        b.printBuffer();

        b.enqueue(4);
        b.printBuffer();

        b.dequeue();
        b.printBuffer();
    }
}
