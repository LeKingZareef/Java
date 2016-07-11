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
		return name.equals(p.name);
	}

}
