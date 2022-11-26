package com.streams;
import java.util.*;
import java.util.stream.Collectors;

class News{
    int newsid;
    String postedByUser;
    String commentByUser;
    String comment;
    News(int newsid, String postedByUser, String comment){

    }

    public News(int newsid, String postedByUser, String commentByUser, String comment) {
        this.newsid = newsid;
        this.postedByUser = postedByUser;
        this.commentByUser = commentByUser;
        this.comment = comment;
    }

    @Override
    public String toString()

    {
        return "News{" + "newid=" + newsid + ",postedByUser=" + postedByUser + '/' + ",commentByUser=" + commentByUser + '/' + ",comment=" + comment + '/' + '}';
    }



    public int getNewsid() {
        return newsid;
    }

    public void setNewsid(int newsid) {
        this.newsid = newsid;
    }

    public String getPostedByUser() {
        return postedByUser;
    }

    public void setPostedByUser(String postedByUser) {
        this.postedByUser = postedByUser;
    }

    public String getCommentByUser() {
        return commentByUser;
    }

    public void setCommentByUser(String commentByUser) {
        this.commentByUser = commentByUser;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
public class NewsAssign {
    public static int maxComments(List<News>news) {
        List<News> news1 = news;
        List<News> list = new ArrayList<>();
        int mx = 0;
        list = news.stream().filter(news2 -> news1.stream().anyMatch(one -> one.getNewsid() == news2.getNewsid() && one != news2)).collect(Collectors.toCollection(ArrayList::new));
        Map<Integer, Integer> mp = new HashMap<>();
        for (News news2 : list) {
            if (mp.containsKey(news2.getNewsid())) {
                mp.put(news2.getNewsid(), mp.get(news2.getNewsid()) + 1);
            } else {
                mp.put(news2.getNewsid(),1);
            }
        }
        Set s1=mp.entrySet();
        Iterator itr=s1.iterator();
        int id=0;
        while(itr.hasNext()){
            Map.Entry m1=(Map.Entry)itr.next();
            System.out.println(m1.getKey()+" "+m1.getValue());
            if(mx<(int)m1.getValue()){
                mx=(int)m1.getValue();
                id=(int)m1.getKey();
            }
        }
        System.out.println(id);
        return id;
    }
    public static int budgetCount(List<News>news){
        String budget="budget";
        long budgetC=news.stream().filter(p->p.getComment().contains(budget)).count();
        System.out.println(budgetC);
        return (int)budgetC;
    }
    public static String maxCommentsByUser(List<News>news) {
        List<News> news1 = news;
        List<News> list = new ArrayList<>();
        list = news.stream().filter(news2 -> news1.stream().anyMatch(one -> one.getNewsid() == news2.getNewsid() && one != news2)).collect(Collectors.toCollection(ArrayList::new));
        Map<String, Integer> mp = new HashMap<>();
        for (News news2 : list) {
            if (mp.containsKey(news2.getCommentByUser())) {
                mp.put(news2.getCommentByUser(), mp.get(news2.getCommentByUser()) + 1);
            } else {
                mp.put(news2.getCommentByUser(), 1);
            }
        }
        Set s1 = mp.entrySet();
        Iterator itr = s1.iterator();
        String id = "";
        int mx = 0;
        while (itr.hasNext()) {
            Map.Entry m1 = (Map.Entry) itr.next();
            System.out.println(m1.getKey() + " " + m1.getValue());
            if (mx < (int) m1.getValue()) {
                mx = (int) m1.getValue();
                id = (String) m1.getKey();
            }
        }
        System.out.println(id);
        return id;
    }
    public static Map<String,Integer>sortMaxCommentsByUser(List<News>news){
        Map<String,Long>mp1=new HashMap<>();

        mp1=news.stream().collect(Collectors.groupingBy(News::getCommentByUser,Collectors.counting()));
        List<Map.Entry<String,Long>>list=new LinkedList<Map.Entry<String,Long>>(mp1.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Long>>() {
            @Override
            public int compare(Map.Entry<String, Long> o1, Map.Entry<String, Long> o2) {
                return -(o1.getValue()).compareTo(o2.getValue());
            }
        });
        HashMap<String,Integer>temp=new LinkedHashMap<String,Integer>();
        for(Map.Entry<String,Long> aa:list){
            temp.put(aa.getKey(),(int)(long)aa.getValue());
        }
        return temp;
    }
    public static void main(String[] args){
        News news1=new News(1,"Bhagya","Sri","comment");
        News news2=new News(2,"Bhagya1","Sri1","budget");
        News news3=new News(1,"Bhagya2","Sri2","comment");
        News news4=new News(3,"Bhagya3","Sri3","budget");
        News news5=new News(1,"Bhagya4","Sri4","comment");
        News news6=new News(3,"Bhagya5","Sri5","budget");
        News news7=new News(1,"Bhagya6","Sri6","comment");


        List<News> news =new ArrayList<>();
        news.add(news1);
        news.add(news2);
        news.add(news3);
        news.add(news4);
        news.add(news5);
        news.add(news6);
        news.add(news7);

        maxComments(news);
        budgetCount(news);
        maxCommentsByUser(news);

        System.out.println(sortMaxCommentsByUser(news));
    }
}
