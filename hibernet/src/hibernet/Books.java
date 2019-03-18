package hibernet;

import java.util.Date;


import javax.persistence.*;

@Entity
@Table(name = "Book_Details")
public class Books {
	@Id
	@GeneratedValue
	@Column (name="ïd")
	private int BookId;
	
	private String BookName;
	private Date Date;


	public String getBookName() {
		return BookName;
	}

	public void setBookName(String bookName) {
		BookName = bookName;
	}

	public Date getDate() {
		return Date;
	}

	public void setDate(Date date) {
		Date = date;
	}


}
