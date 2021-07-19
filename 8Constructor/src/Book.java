
public class Book {
	public String title;
	public int numberOfPages;
	public String author;
	public int year;
	public double cost;
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	
	public int getNumberOfPages() {
		return numberOfPages;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public double getCost() {
		return cost;
	}
	
	public void printInfo() {
		System.out.println("Title: " + title);
		System.out.println("Number of pages: " + numberOfPages);
		System.out.println("Author: " + author);
		System.out.println("Year: " + year);
		System.out.println("Cost: $" + cost);
	}
}
