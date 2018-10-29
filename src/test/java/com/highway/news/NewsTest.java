package com.highway.news;

import com.highway.common.ICommonJunit;
import com.highway.model.News;
import com.highway.service.INewsService;
import com.highway.util.response.Page;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Creaed by fj on 2018/10/29
 */

public class NewsTest  extends ICommonJunit{

    @Autowired
    INewsService newsService;

    @Test
    public void addNews(){
        News news = new News();
        news.setContent("test11");
        newsService.addNews(news);
    }

    @Test
    public void updateNews(){
        News news = new News();
        news.setContent("test11");
        news.setId(1);
        newsService.updateNews(news);
    }

    @Test
    public void getNews(){
        List<News> newsList = newsService.getAllNews(1,10);
        System.out.println(newsList.size());
    }

    @Test
    public void getNewsByType(){
        Page<News> newsPage = newsService.getNewsByType(1,10,0,false);
        System.out.println(newsPage);
    }

}
