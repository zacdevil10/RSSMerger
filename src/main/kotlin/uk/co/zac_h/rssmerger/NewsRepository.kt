package uk.co.zac_h.rssmerger

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository("newsRepository")
interface NewsRepository : JpaRepository<NewsModel, Long> {
}