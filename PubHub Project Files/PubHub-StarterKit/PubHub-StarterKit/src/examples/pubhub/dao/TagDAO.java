package examples.pubhub.dao;

import java.util.List;

import examples.pubhub.model.Book;

public interface TagDAO {
	public void addTag(String tagName, String isbn);
	public void removeTag(String tagName, String isbn);
	public List<String> getTagsByISBN(String isbn);
	public List<Book> getBooksByTag(String tagName);
} // interface