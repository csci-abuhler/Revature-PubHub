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
		//List<String> tags = new ArrayList<>();
		//tags = tag.getTagsByISBN("1111111111111");
		// 1111111111111
		//System.out.println(tags);
		tag.removeTag("test", "1");
	} // main

	@Override
	public void addTag(String tagName, String isbn) {
		try {
			connection = DAOUtilities.getConnection();

			String sql = "insert into book_tags (\"isbn_13\", \"tag_name\") values (\'" + isbn + "\',\'" + tagName + "\')";

			stmt = connection.prepareStatement(sql);
			stmt.executeQuery();
		} catch (Exception e) {
			System.out.println("Duplicate entry!");
		} finally {
			closeResources();
		} // try catch
	} // addTag

	@Override
	public void removeTag(String tagName, String isbn) {
		try {
			connection = DAOUtilities.getConnection();
			
			String sql = "delete from book_tags where book_tags.isbn_13=\'" + isbn + "\' and book_tags.tag_name=\'" + tagName + "\'";
			
			stmt = connection.prepareStatement(sql);
			stmt.executeQuery();
		} catch (Exception e) {
			System.out.println("No entry found!");
		} finally {
			closeResources();
		} // try catch
	} // remove tag

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

	@Override
	public List<Book> getBooksByTag(String tagName) {
		// TODO Auto-generated method stub
		return null;
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
