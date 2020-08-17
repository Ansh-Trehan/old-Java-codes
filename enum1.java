class EnumDemo3
{
	public static void main(String[] rk)
	{
		for (MonthWithDays s : MonthWithDays.values())
		System.out.println(s);
	}
}
enum MonthWithDays
{
	January(31),February(28),March(31);
	int days;
	MonthWithDays(int a)
	{
		days = a;
	}
}