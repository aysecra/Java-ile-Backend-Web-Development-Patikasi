
public class Employee {
	String name;
	double salary;
	int workHours, hireYear;
	
	public Employee(String name, double salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	public double tax() {
		if(salary > 1000) {
			return 0.03 * this.salary;
		}
		return 0;
	}
	
	public int bonus() {
		if(this.workHours > 40)
			return (this.workHours - 40) * 30;
		return 0;
		// assumed default workHours is 40
	}
	
	public double raiseSalary() {
		int year = 2021 - this.hireYear;
		if(year < 10) 
			return 0.05 * this.salary;
		
		else if(year > 19)
			return 0.15 * this.salary;
			
		else if(year > 9) 
			return 0.1 * this.salary;
		
		return 0;
	}
	
	public String toString() {
		int bonus =  bonus();
		double tax = tax();
		double raise = raiseSalary();
		return "Adý : "+ this.name + "\n"
				+ "Maaþý : "+ this.salary +"\n"
				+ "Çalýþma Saati : " + this.workHours + "\n"
				+ "Baþlangýç Yýlý : " + this.hireYear +"\n"
				+ "Vergi : " + tax + "\n"
				+ "Bonus : " + bonus + "\n"
				+ "Maaþ Artýþý : " + raise + "\n"
				+ "Vergi ve Bonuslar ile birlikte maaþ : " + (this.salary + bonus - tax) + "\n"
				+ "Toplam Maaþ : " + (this.salary + raise + bonus - tax);
	}
}
