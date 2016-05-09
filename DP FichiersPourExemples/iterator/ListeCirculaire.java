package iteratorCorrection;

// ListeCirculaire.java

//package ListeCirculaires;
import java.util.*;

public class ListeCirculaire<T> extends java.util.AbstractSequentialList
{
     private Node header;
     private int size = 0;
  
     public ListeCirculaire()
          { 
          }
  
     public ListeCirculaire(List<T> list)
          { 
               super();
               addAll(list);
          }
  
     public ListIterator<T> listIterator(int index)
          {
               return new RingIterator(index);
          }

     public int size()
          { 
               return size;
          }
  
     // Classe représentant les noeuds de la liste circulaire
     // doublement chainée
     private static class Node
     { 
          Object object;
          Node previous, next;

          Node(Object object, Node previous, Node next)
               {
                    this.object = object;
                    this.previous = previous;
                    this.next = next;
               }
          Node(Object object)
               { 
                    this.object = object;
                    this.previous = this.next = this;
               }
     }
  
     // Classe permettant de naviguer à travers les noeuds
     private class RingIterator implements ListIterator
     {
          private Node next, lastReturned;
          private int nextIndex;
    
          RingIterator(int index)
               { 
                    if (index<0 || index>size)
                         throw new IndexOutOfBoundsException("Index : " + index);
                    next=(size==0?null:header);
                    for (nextIndex=0; nextIndex<index; nextIndex++)
                         next = next.next;
               }
    
          public boolean hasNext()
               {
                    return size > 0;
               }
    
          public boolean hasPrevious()
               {
                    return size > 0;
               }
    
          public Object next()
               { 
                    if (size==0)
                         throw new NoSuchElementException();
                    lastReturned = next;
                    next = next.next;
                    nextIndex = (nextIndex==size-1?0:nextIndex+1);
                    return lastReturned.object;
               }
    
          public Object previous()
               { 
                    if (size==0)
                         throw new NoSuchElementException();
                    next = lastReturned = next.previous;
                    nextIndex = (nextIndex==0?size-1:nextIndex-1);
                    return lastReturned.object;
               }
    
          public int nextIndex()
               {
                    return nextIndex;
               }
    
          public int previousIndex()
               {
                    return (nextIndex==0?size-1:nextIndex-1);
               }
   
          public void add(Object object)
               {
                    if (size==0)
                    { 
                         next = header = new Node(object);
                         nextIndex = 0;
                    }
                    else
                    {
                         Node newNode = new Node(object,next.previous,next);
                         newNode.previous.next = next.previous = newNode;
                    }
                    lastReturned = null;
                    ++size;
                    nextIndex = (nextIndex==size-1?0:nextIndex+1);
               }
    
          public void remove()
               {
                    if (lastReturned==null)
                         throw new IllegalStateException();
                    if (next==lastReturned)
                         next = lastReturned.next;
                    else
                         nextIndex = (nextIndex==0?size-1:nextIndex-1);
                    lastReturned.previous.next = lastReturned.next;
                    lastReturned.next.previous = lastReturned.previous;
                    lastReturned = null;
                    --size;
               }
    
          public void set(Object object)
               { 
                    if (lastReturned==null)
                         throw new IllegalStateException();
                    lastReturned.object = object;
               }
     } 
}
