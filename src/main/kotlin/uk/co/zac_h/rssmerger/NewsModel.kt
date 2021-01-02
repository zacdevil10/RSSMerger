package uk.co.zac_h.rssmerger

import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "news")
data class NewsModel(
        @JsonProperty(value = "url")
        @Column(name = "url")
        val url: String,
        @JsonProperty(value = "title")
        @Column(name = "title")
        val title: String,
        @JsonProperty(value = "pubDate")
        @Column(name = "pubdate")
        val pubDate: String,
        @JsonProperty(value = "source")
        @Column(name = "source")
        val source: String
)