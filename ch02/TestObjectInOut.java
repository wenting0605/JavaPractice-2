package ch02;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Book implements Serializable {
	private static final long serialVersionUID = 8315449942815314809L;
	
	private String name;
	private double price; // 如果加上transient，該屬性不會加入序列化
	private String author;

	public Book(String name, double price, String author) {
		this.name = name;
		this.price = price;
		this.author = author;
	}

	public void show() {
		System.out.println("書名: " + name);
		System.out.println("定價: " + price);
		System.out.println("作者: " + author);
	}
}

public class TestObjectInOut {
	public static void main(String[] args) throws Exception {
		File file = new File("bookInfo");
		Book[] books = new Book[2];
		books[0] = new Book("Java程式設計", 580.0, "張搧風");
		books[1] = new Book("JSP程式設計", 650.0, "黃會紅");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		for (int i = 0; i < books.length; i++)
			oos.writeObject(books[i]);
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		System.out.println(file.getName() + "檔案內容如下: ");
		System.out.println("--------------------");
		try {
			while (true) {
				((Book) ois.readObject()).show();
				System.out.println("--------------------");
			}
		} catch (EOFException e) {
			System.out.println("資料讀取完畢！");
		}
		ois.close();
		fis.close();
	}
}
