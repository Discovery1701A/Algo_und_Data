package de.hs_el.streekmann.algodat.aufgabe2;

public class EmptyQueueException extends RuntimeException 
{
	public EmptyQueueException()  {
        super("Queue is empty!");
     } 
}