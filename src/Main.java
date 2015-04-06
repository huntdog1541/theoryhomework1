import thrcomphw1.Node;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by David on 4/2/2015.
 */
public class Main {

    private static ArrayList<Node> nd;

    public Main()
    {
        nd = new ArrayList<Node>();
        Node temp = new Node('c', false, 0);
        nd.add(temp);
        Node temp2 = new Node('o', false, 1);
        nd.add(temp2);
        Node temp3 = new Node('c', false, 2);
        nd.add(temp3);
        Node temp4 = new Node('o', false, 3);
        nd.add(temp4);
        Node temp5 = new Node('n', false, 4);
        nd.add(temp5);
        Node temp6 = new Node('u', false, 5);
        nd.add(temp6);
        Node temp7 = new Node('t', false, 6);
        nd.add(temp7);
        Node temp8 = new Node(' ', true, 7);
        nd.add(temp8);

    }

    public static void main(String[] args)
    {
        Main mn = new Main();
        Node currentNode = nd.get(0);

        int iterator = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String temp = in.nextLine();
        currentNode.printState();
        int i = 0;
        while(i < temp.length())
        {
            if(currentNode.moveNext(temp.charAt(i)))
            {
                iterator++;
                currentNode = nd.get(iterator);
                currentNode.printState();
            }
            else
            {
                if(!currentNode.accepted())
                {
                    currentNode = nd.get(0);
                    currentNode.printState();
                    iterator = 0;
                }
                else
                    currentNode.printState();
            }
            i++;
        }
        if(currentNode.accepted())
            System.out.println("\nAccepted String");
        else
            System.out.println("\nRejected String");
    }
}
