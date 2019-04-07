package assignment1.db;

import assignment1.app.Igel;

public class DBFeldFix extends DB {
	Igel[] db;

	public DBFeldFix(int maxSize) {

		this.db = new Igel[maxSize];
		System.out.println(db.length);
		this.size = 0;

	}

	public Igel get(int i) {
		System.out.println("element at " + i + " Position" + db[i - 1]);
		return db[i - 1];

	}

	public void swap(int a, int b) {

		try {
			Igel tmp = this.db[a - 1];
			this.db[a - 1] = this.db[b - 1];
			this.db[b - 1] = tmp;
		} catch (Exception e) {
			throw new IndexOutOfBoundsException();
		}
	}

	@Override
	public void appendLast(Igel o) {
		// TODO Auto-generated method stub
		try {
			this.db[size] = o;
			System.out.println("One element appended at location: " + this.size());
			size++;
			// System.out.println("One element appended at location: " + this.size());

		} catch (Exception e) {
			throw new IndexOutOfBoundsException();
		}
	}

	@Override
	public Igel removeLast() {
		try {

			size = this.size() - 1;
			return this.db[this.size()];

//			for(int i =0; i<rIgel.length;i++) {
//				rIgel[i] = this.igel[i];
//			}
		} catch (Exception e) {
			throw new IndexOutOfBoundsException();
		}

	}

	public String toString() {
		StringBuilder tmp = new StringBuilder();
		tmp.append(this.getClass().getName());

		for (Igel igel : db) {
			if (igel != null)
				tmp.append(igel.toString());
			else
				System.out.println("is null");

		}

		return tmp.toString();
	}

}