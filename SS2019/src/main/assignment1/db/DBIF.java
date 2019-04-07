package assignment1.db;

import assignment1.app.Igel;

public interface DBIF {
	public boolean isEmpty();

	public int size();

	public void appendLast(Igel o);

	public Igel removeLast();

	public Igel get(int i);

	public void swap(int a, int b);

}