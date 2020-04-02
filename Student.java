class Student {
	String index;
	String firstName;
	String lastName;
	List<Integer> grades;

	Student(String id, String fn, String ln, List<Integer> grades)
	{
		this.index = id;
		this.firstName = fn;
		this.lastName = ln;
		this.grades = grades;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getAverage() {
		return grades.stream()
				.mapToInt(x -> x)
				.average().getAsDouble();
	}

	public int ECTSCredits() {
		return grades.stream()
				.filter(x -> x > 5)
				.reduce((summary, current) -> summary + 6)
				.get();
	}
}
