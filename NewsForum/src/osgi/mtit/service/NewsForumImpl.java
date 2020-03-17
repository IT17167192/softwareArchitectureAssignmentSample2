package osgi.mtit.service;

import java.util.ArrayList;

public class NewsForumImpl implements NewsForum {
	
	ArrayList<String> allNews = new ArrayList<String>();
	String latestNews = "";
	
	@Override
	public void publishANews(String newsHeader, String newsBody, String newsTags) {
		allNews.add(newsHeader + "\n" + newsBody + "\n" + newsTags);
		latestNews = newsHeader + "\n" + newsBody + "\n" + newsTags;
	}

	@Override
	public ArrayList<String> getAllNews() {		                                                           
		System.out.println("=========================\n-WORLD WIDE NEWS PORTAL-\n=========================\nAll Feeds\n=============");
		return allNews;
	}

	@Override
	public String getLatestNews() {
		return "=========================\n-WORLD WIDE NEWS PORTAL-\n=========================\nLatest Feed\n=============\n"+latestNews;
	}

}
