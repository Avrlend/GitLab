package lab1;
import java.util.Scanner;


public class KompGame {
	 private String  name;
	 Genre genre;
	 private String company;
	 private int year;
	 private int price;
	    
	 public KompGame() {
	 }
	    
	 public KompGame(String name, String genre, String company, int year, int price) {
		 this.name = name;
		 this.name = genre;
	     this.company = company;
	     this.price = year;
	     this.price = price;
	 }
	 
	 public String getName() {
		 return name;
	 }   
	 public String getCompany() {
		 return company;
	 }
	 public int getYear() {
		 return year;
	 }
	 public int getPrice() {
		 return price;
	 }   
	 public void setName(String name) {
		 this.name = name;
	 }
	 public void setCompany(String company) {
		 this.company = company;
	 }
	 public void setYear(int year) {
		 this.year = year;
	 }
	 public void setPrice(int price) {
		 this.price = price;
	 }
	    
	 public void print() {
		 System.out.println("Name: " + name + "\nGenre:" + genre + "\nCompany:" + company  + "\nYear: " + year + "\nPrice: " + price);
	 }
	    
	 public void scans(Scanner s) {
		 //Scanner s = new Scanner(System.in);
		 System.out.println("Enter the name: ");
		 name = s.nextLine();
		 System.out.println("Enter the genre (Number 0-5): ");
	     for (int i=0;i<6;i++)
	    	 Genre.fname(i);
		 int id = s.nextInt();
	     genre = Genre.values()[id];
	     System.out.println("Enter the company: ");
		 company = s.nextLine();
		 System.out.println("Enter the year: ");
		 year = s.nextInt();
		 System.out.println("Enter the price: ");
		 price = s.nextInt();
	    }
	 
	 public void printInfo() {
		 System.out.printf("Игра %s жанра %s от компании %s, %d года выпуска, рекомендуется к продаже за %d  \n", name, genre, company, year, price);
	 }
	 public void nullPrice() {
		 this.price=0;
	 }
}
