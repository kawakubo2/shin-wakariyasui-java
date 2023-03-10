package chapter20;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/*
 * 本を表すクラスです
 * 例題CalculatingExample.java、SummarizingExample.java で使います
 * クイズや演習問題でも使用します。
 */
public class Book implements Comparable<Book>{
	private int number;
	private String title;
	private String genre;
	private String author;
	private int price;
	private boolean stock;

	public Book() {}

	public Book(int number, String title, String genre, String author, int price, boolean stock) {
		this.number = number;
		this.title = title;
		this.genre = genre;
		this.author = author;
		this.price = price;
		this.stock = stock;
	}
	
	public int getNumber() {
		return number;
	}

	public String getTitle() {
		return title;
	}

	public String getGenre() {
		return genre;
	}

	public String getAuthor() {
		return author;
	}

	public int getPrice() {
		return price;
	}

	public boolean isStock() {
		return stock;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setStock(boolean stock) {
		this.stock = stock;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if(number != other.number)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [" +
				" number=" + number +
				",title=" + title +
				",genre=" + genre +
				",author=" + author +
				",price=" + price +
				",stock=" + stock +
				" ]";
	}

	@Override
	public int compareTo(Book other) {
		return Integer.compare(number, other.number);
	}	
	
	public static List<Book> getBooks(String pathStr){
		List<Book> list = new ArrayList<>(30);
		
		Path path = Paths.get(pathStr);
		
		try(Scanner in = new Scanner(path);) {		
			in.useDelimiter(",|"+System.lineSeparator());
			while(in.hasNext()) {					
				int number = in.nextInt();
				String title = in.next();
				String genre = in.next();
				String author = in.next();
				int price = in.nextInt();
				boolean stock = in.nextBoolean();
				
				list.add(new Book(number, title, genre, author, price, stock));
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
	public static List<Book> getList(){
		List<Book> list = Arrays.asList(
			new Book(1010,"情報倫理","OTHER","小川洋子",1250,true),
			new Book(1020,"テンプル騎士団","HISTORY","水野昭二",1600,true),
			new Book(1030,"材料工学","SCIENCE","田中宏",3000,true),
			new Book(1040,"スポーツ統計","SCIENCE","新森明子",2100,true),
			new Book(1050,"太平記縁起","NOVEL","佐藤秀夫",1500,true),
			new Book(1060,"データ分析","SCIENCE","千田正樹",1800,true),
			new Book(1070,"社会保障政策","OTHER","浦中恵子",2200,false),
			new Book(1080,"社会経済史","HISTORY","木村花子",2200,true),
			new Book(1090,"イスラム建国史","HISTORY","吉村敬",1800,true),
			new Book(1100,"鋳物の化学","SCIENCE","田中宏",3200,true),
			new Book(1110,"健康科学のはなし","SCIENCE","角田圭吾",1200,true),
			new Book(1120,"世界の鉱山","OTHER","田中宏",2300,true),
			new Book(1130,"日本史","HISTORY","木村花子",2000,true),
			new Book(1140,"正覚寺","NOVEL","田中一郎",1000,false),
			new Book(1150,"粉末冶金科学","SCIENCE","田中宏",2800,false)	);
		return list;
	}


}
