/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package feedsreader;

/**
 *
 * @author pranay
 */
public class FeedsReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        String s="http://feeds.feedburner.com/androidnovaorg";
        
        RSSFeedParser parser = new RSSFeedParser(s);
    Feed feed = parser.readFeed();
    System.out.println(feed);
    for (FeedMessage message : feed.getMessages()) 
    {
      System.out.println(message);

    }
    }
}

    

    