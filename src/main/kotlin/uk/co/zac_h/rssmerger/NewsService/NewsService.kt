package uk.co.zac_h.rssmerger.NewsService

import uk.co.zac_h.rssmerger.NewsModel

interface NewsService {
    fun findAll(): List<NewsModel>
    fun findNewsBySource(source: String)
    fun isNewsItemExists(newsModel: NewsModel)
    fun saveNewsItem(newsModel: NewsModel)
    fun deleteNewsItem(newsModel: NewsModel)
}