package examples.pubhub.dao;

import java.util.List;

import examples.pubhub.model.Book;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import examples.pubhub.model.Book;
import examples.pubhub.utilities.DAOUtilities;

public class TagDAOImpl implements TagDAO {

	Connection connection = null;
	PreparedStatement stmt = null;

	public static void main(String[] args) {
		TagDAOImpl tag = new TagDAOImpl();
		tag.removeTag("test", "1111111111111");
		// 1111111111111
	} // main

	@Override
	public void addTag(String tagName, String isbn) {
		try {
			connection = DAOUtilities.getConnection();

			String sql = "insert into book_tags (\"isbn_13\", \"tag_name\") values (\'" + isbn + "\',\'" + tagName
					+ "\')";

			stmt = connection.prepareStatement(sql);

			try {
				stmt.executeQuery();
			} catch (Exception e) {
				System.out.println("Duplicate entry!");
			} // try catch
		} catch (Exception e) {
			e.printStackTrace();
		} // try catch
	} // addTag

	@Override
	public void removeTag(String tagName, String isbn) {
		try {
			connection = DAOUtilities.getConnection();

			String sql = "delete from book_tags where book_tags.isbn_13=\'" + isbn + "\' and book_tags.tag_name=\'" + tagName + "\'";

			stmt = connection.prepareStatement(sql);

			try {
				stmt.executeQuery();
			} catch (Exception e) {
				System.out.println("No entry found!");
			} // try catch
		} catch (Exception e) {
			e.printStackTrace();
		} // try catch
	} // remove tag

	@Override
	public List<Book> getTagsByISBN(String isbn) {
		List<Book> tags = new ArrayList<>();
		
		return tags;
	}

	@Override
	public List<Book> getBooksByTag(String tagName) {
		// TODO Auto-generated method stub
		return null;
	}
} // class
