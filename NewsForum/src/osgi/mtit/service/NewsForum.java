package osgi.mtit.service;

import java.util.ArrayList;

public interface NewsForum {
	public void publishANews(String newsHeader, String newsBody, String newsTags);
	public ArrayList<String> getAllNews(); 
	public String getLatestNews();
}
