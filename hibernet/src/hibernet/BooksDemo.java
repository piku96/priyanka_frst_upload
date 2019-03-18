package hibernet;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class BooksDemo {

	public static void main(String [] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Select Option 1 to add the details in the table\n "+"Select Option 2 to display the table \n"+
				"Select Option 3 to update the table \n"+"Select Option 4 to delete the table \n"
				+"Select Option 5 to exit \n");
		int option = sc.nextInt();
		
		for(int  i=0; i<option; i++) {
			switch(option) {
			
			case 1: addBooks(factory,sc);
					break;
				
			case 2: displayBooks(factory,sc);
					break;
					
			case 3: updateBooks(factory,sc);
					break;
					
			case 4: deleteBooks(factory,sc);
					break;
		
			case 5: System.exit(1);
					break;
					
			default: System.out.println("Please enter another option");
			
			}
			
		}
	}
		
		public static void addBooks(SessionFactory factory, Scanner sc) {
			Session session=factory.openSession();
			Transaction tx =session.beginTransaction();
			
		System.out.println("Enter the number of books: ");
		int count= sc.nextInt();
		
		for(int i=0; i<count; i++) {
			Books b =new Books();
			System.out.print("Enter the name of book "+(i+1));
			String name = sc.next();
			b.setBookName(name);
			b.setDate(new Date());
			
			session.save(b);
		}
		
		tx.commit();
		session.close();
		}
		
		
		public static void deleteBooks(SessionFactory factory, Scanner sc) {
			Session session=factory.openSession();
			System.out.println("Enter the number of bookId you want to delete : ");
			int bookId = sc.nextInt();
			session=factory.openSession();
			Transaction tx= session.beginTransaction();
			Books book = session.get(Books.class, bookId);
			session.delete(book);
			tx.commit();
			session.close();
		}
		
		
		public static void updateBooks(SessionFactory factory, Scanner sc) {
			Session session=factory.openSession();
			System.out.println("Enter the bookId you want to update : ");
			int bookId = sc.nextInt();
			Transaction tx= session.beginTransaction();
			
			Books b= session.get(Books.class, bookId);
			
			System.out.println("Enter the name of book to update");
			String bookName = sc.next();
			b.setBookName(bookName);
			session.update(b);
			tx.commit();
			session.close();
		}
		/*	
		
		public static void displayBooks(SessionFactory factory1, Scanner sc1 ) {
		session=factory1.openSession();
		Books book = session.get(Books.class, 1);
		
		System.out.println(book);
		session.close();
		
		session=factory1.openSession();
		List bookList = session.createQuery("from Books").list();
		
		Iterator itr = bookList.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		
		}
		session.close();
		}
		
		
		session=factory1.openSession();
		List bookList1 = session.createQuery("from Books where bookName='C#'").list();
		
		Iterator itr1 = bookList1.iterator();
		
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		
		}
		session.close();
		
		session=factory1.openSession();
		System.out.println("Enter the name of book");
		String name= sc1.next();
		List bookList2 = session.createQuery("from Books where bookName='"+name+"'").list();
		
		Iterator itr2 = bookList2.iterator();
		
		while(itr1.hasNext()) {
			System.out.println(itr2.next());
		
		}
		session.close();
		
	
		
		
	}	*/	

	private static void displayBooks(SessionFactory factory, Scanner sc){
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		Books book = session.get(Books.class, 1);
		
		System.out.println(book);
		session.close();
		
		session=factory.openSession();
		List bookList = session.createQuery("from Books").list();
		
		Iterator itr = bookList.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		
		}
		session.close();
		}
		
	}



