package uk.co.zac_h.rssmerger

import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping(path = "/")
class NewsAPIRequests {

    @PostMapping(value  = "/create")
    fun createNewsItem(@RequestBody news: NewsModel) : ResponseEntity<Void> {

    }


}