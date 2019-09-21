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

	// Adds a tag to a book
	@Override
	public void addTag(String tagName, String isbn) {
		try {
			connection = DAOUtilities.getConnection();

			String sql = "insert into book_tags (\"isbn_13\", \"tag_name\") values (\'" + isbn + "\',\'" + tagName
					+ "\')";

			stmt = connection.prepareStatement(sql);
			stmt.executeQuery();
		} catch (Exception e) {
			System.out.println("Duplicate entry!");
		} finally {
			closeResources();
		} // try catch
	} // addTag

	// Removes a tag from a book
	@Override
	public void removeTag(String tagName, String isbn) {
		try {
			// Establishes the connection
			connection = DAOUtilities.getConnection();

			// SQL statement is made into a string, prepared, and executed
			String sql = "delete from book_tags where book_tags.isbn_13=\'" + isbn + "\' and book_tags.tag_name=\'"
					+ tagName + "\'";

			stmt = connection.prepareStatement(sql);
			stmt.executeQuery();
		} catch (Exception e) {
			System.out.println("No entry found!");
		} finally {
			closeResources();
		} // try catch
	} // remove tag

	// Returns all of the tags by a specified ISBN
	@Override
	public List<String> getTagsByISBN(String isbn) {
		List<String> tags = new ArrayList<>();

		try {
			connection = DAOUtilities.getConnection();

			String sql = "select tag_name from book_tags where isbn_13 = \'" + isbn + "\'";

			stmt = connection.prepareStatement(sql);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				tags.add(rs.getString("tag_name"));
			} // while

			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeResources();
		} // try catch

		return tags;
	} // getTagsByISBN

	// Returns the books by the specified tag
	@Override
	public List<Book> getBooksByTag(String tagName) {
		List<String> isbnList = new ArrayList<>();
		List<Book> books = new ArrayList<>();

		try {
			connection = DAOUtilities.getConnection();

			// First, we have to find all of the book ISBNs associated with a tag
			String sql = "select * from book_tags where tag_name = \'" + tagName + "\'";
			stmt = connection.prepareStatement(sql);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				isbnList.add(rs.getString("isbn_13"));
			} // while

			rs.close();
			
			// Now we can narrow down our search since we have the ISBNs
			String sql2 = "select * from books";
			stmt = connection.prepareStatement(sql2);

			rs = stmt.executeQuery();

			int i = 0;
			while (rs.next()) {
				Book book = new Book();

				book.setIsbn13(isbnList.get(i));
				book.setAuthor(rs.getString("author"));
				book.setTitle(rs.getString("title"));
				book.setPublishDate(rs.getDate("publish_date").toLocalDate());
				book.setPrice(rs.getDouble("price"));
				book.setContent(rs.getBytes("content"));

				books.add(book);
				i++;
			} // while
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeResources();
		} // try catch

		return books;
	} // getBooksByTag

	private void closeResources() {
		try {
			if (stmt != null)
				stmt.close();
		} catch (SQLException e) {
			System.out.println("Could not close statement!");
			e.printStackTrace();
		} // try catch

		try {
			if (connection != null)
				connection.close();
		} catch (SQLException e) {
			System.out.println("Could not close connection!");
			e.printStackTrace();
		} // try catch
	} // closeResources
} // class
