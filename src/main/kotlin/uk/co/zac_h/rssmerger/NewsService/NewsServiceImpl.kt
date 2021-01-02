package uk.co.zac_h.rssmerger.NewsService

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service
import uk.co.zac_h.rssmerger.NewsModel
import uk.co.zac_h.rssmerger.NewsRepository

@Service("userService")
class NewsServiceImpl : NewsService {

    @Qualifier("newsRepository")
    @Autowired
    private lateinit var newsRepository: NewsRepository

    override fun findAll(): List<NewsModel> = newsRepository.findAll()

    override fun findNewsBySource(source: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isNewsItemExists(newsModel: NewsModel) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun saveNewsItem(newsModel: NewsModel) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun deleteNewsItem(newsModel: NewsModel) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}