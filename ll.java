class node
{
    int data;
    node next;

    node(int data)
    {
        this.data=data;
        this.next=null;
    }
}

public class ll
{
    int size;
    node head;
    node tail;

    void traverse()
    {
         node temp=head;
        while (temp!=null) 
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println(" end ");
    }

    void inerstatbegin(int val)
    {
        node node1 = new node(val);

        node1.next=head;
        head=node1;

        if(tail==null)
        {
            tail=head;
        }
        size++;
    }
    public static void main(String[] args) 
    {
        ll  llobj = new ll();

        /// creating node 
        node first = new node(10);
        node second = new node(20);
        node third = new node(30);
        llobj.size=3;

        //// address of next variable 
       
        llobj.head=first;
        first.next= second;
        second.next=third;
        llobj.tail=third;

        llobj.traverse();   
        llobj.inerstatbegin(07);
        llobj.traverse();
        System.out.println("size "+ llobj.size);
        System.out.println("tail "+llobj.tail.data);
        
    }
    
}
