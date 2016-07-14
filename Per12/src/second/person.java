package second;

public class person {
	private String name;

	public person()
	{
		name = "No name yet.";
	}
	public person(String n)
	{
		name = n;
	}
	public void setName(String newName)
	{
		name = newName;
	}
	public String getName()
	{
		return name;
	}
	public void print()
	{
		System.out.println("Name: " + name);
	}
	public boolean equals(Object p)
	{
<<<<<<< HEAD
		//return name.equals(p.name);
=======
		return name.equals(p.equals(name));
>>>>>>> e22e7c34fadbd3dcae144fb9181b2bd4416d2ba3
	}

}
