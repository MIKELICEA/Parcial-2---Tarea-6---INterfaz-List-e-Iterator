package uaslp.objetos.list.LinkedList;

import uaslp.objetos.list.Iterator;

public class LinkedListIterator implements Iterator {

    private LinkedList.Node currentNode;

    LinkedListIterator(LinkedList.Node startNode)
    {
        currentNode=startNode;
    }

    @Override
    public boolean hasNext(){
        return currentNode != null;
    }

    @Override
    public String next(){
        String data= currentNode.data;
        currentNode=currentNode.next;
        return data;
    }
}
