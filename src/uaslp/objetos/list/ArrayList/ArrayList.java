package uaslp.objetos.list.ArrayList;

import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.List;

public class ArrayList implements List {

    private  static final int DEFAULT_SIZE = 5; //Primer tamaño del arreglo que crecera conforme se agreguen elementos
    private String[] array;
    private int size;

    public ArrayList(int size){
        array = new String[size];
    }

    public ArrayList(){
        array = new String[DEFAULT_SIZE];
    }

    @Override
    public void addAtTail(String data)
    {
        if(size == array.length){
            increaseArrayList();
        }
        array[size]=data;
        size++;
    }

    @Override
    public void addAtFront(String data)
    {
        if(size == array.length)
        {
            increaseArrayList();
        }

        if (size >= 0) System.arraycopy(array, 0, array, 1, size);
        array[0]=data;
        size++;
    }

    @Override
    public void remove(int index)
    {
        if (index < 0 || index >= size)
        {
            return;
        }

        if (size - 1 - index >= 0) System.arraycopy(array, index + 1, array, index, size - 1 - index);

        array[size-1]=null;

        size--;
    }

    @Override
    public void removeAll()
    {
        for(int i=0;i<size;i++)
        {
            array[i]=null;
        }
        size=0;
    }

    @Override
    public void removeAllWithValue(String data)
    {

    }

    @Override
    public String getAt(int index)
    {
        return index >= 0 && index < size ? array[index] : null;
    }

    @Override
    public void setAt(int index,String data)
    {
        if(index >= 0 && index < size)
        {
            array[index]=data;
        }
    }

    @Override
    public int getSize()
    {
        return size;
    }

    @Override
    public Iterator getIterator() {
        return new Iterator() { //Clase anónima de iterator
                      //También es una inner class no estática
            private int currentItem;

            @Override
            public boolean hasNext() {
                return currentItem < size;
            }

            @Override
            public String next() {
                return array[currentItem++];
            }
        };
    }

    private void increaseArrayList(){
        String []newArray = new String[array.length * 2];

        if (size >= 0) System.arraycopy(array, 0, newArray, 0, size);

        array=newArray;
    }
}

