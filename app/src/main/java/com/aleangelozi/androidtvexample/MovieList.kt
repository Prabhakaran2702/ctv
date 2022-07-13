package com.aleangelozi.androidtvexample

object MovieList {
    val MOVIE_CATEGORY = arrayOf(
        "Top Stories",
        "Entertainment",
        "Lifestyle",
        "Food",
        "Sports",
        "Events"
    )

    val list: List<Movie> by lazy {
        setupMovies()
    }
    private var count: Long = 0

    private fun setupMovies(): List<Movie> {
        val title = arrayOf(
            "The President, the Statesman and the Globalist",
            "UAE nationals and residents congratulate UAE President",
            "5 violations other than speeding that Dubai Police radars catch",
            "Khaleej Times Exclusive: US Embassy Chargé d'Affaires Sean Murphy discusses the regions big issues",
            "Coffee and camel rides at sunrise: everything you want in the Abu Dhabi desert",
            "How To Cook DATE RICE - Food Recipe",
            "The future of Aviation? Dubai This Week joins Etihad’s inaugural A350 flight to London",
            "View of the Palm Jumeirah from ‘The Next Level",


        )

        val description = "The present Ruler of Abu Dhabi, he is the third son of the late Sheikh Zayed bin Sultan Al Nahyan, who was the Founding Father of the nation and the first President of the UAE. The present Ruler of Abu Dhabi, he is the third son of the late Sheikh Zayed bin Sultan Al Nahyan, who was the Founding Father of the nation and the first President of the UAE. "
        val studio = arrayOf(
            "Khaleej Times",
            "Khaleej Times",
            "Khaleej Times",
            "Khaleej Times",
            "Khaleej Times",
            "Khaleej Times",
            "Khaleej Times",
            "Khaleej Times"
        )
        val videoUrl = arrayOf(
             "https://api.khaleejtimes.com/apps/videos/5.mp4",
            "https://api.khaleejtimes.com/apps/videos/4.mp4",
            "https://api.khaleejtimes.com/apps/videos/3.mp4",
            "https://api.khaleejtimes.com/apps/videos/2.mp4",
            "https://api.khaleejtimes.com/apps/videos/6.mp4",
            "https://api.khaleejtimes.com/apps/videos/11.mp4",
            "https://api.khaleejtimes.com/apps/videos/12.mp4",
            "https://api.khaleejtimes.com/apps/videos/13.mp4",

             )
        val bgImageUrl = arrayOf(
            "https://api.khaleejtimes.com/apps/images/2.png",
            "https://api.khaleejtimes.com/apps/images/4.png",
            "https://api.khaleejtimes.com/apps/images/6.png",
            "https://api.khaleejtimes.com/apps/images/3.png",
            "https://api.khaleejtimes.com/apps/images/5.png",
            "https://api.khaleejtimes.com/apps/images/11.png",
            "https://api.khaleejtimes.com/apps/images/12.png",
            "https://api.khaleejtimes.com/apps/images/13.png"
        )
        val cardImageUrl = arrayOf(
            "https://api.khaleejtimes.com/apps/images/6.png",
            "https://api.khaleejtimes.com/apps/images/4.png",
            "https://api.khaleejtimes.com/apps/images/2.png",
            "https://api.khaleejtimes.com/apps/images/1.png",
            "https://api.khaleejtimes.com/apps/images/5.png",
            "https://api.khaleejtimes.com/apps/images/11.png",
            "https://api.khaleejtimes.com/apps/images/12.png",
            "https://api.khaleejtimes.com/apps/images/13.png",
            "https://api.khaleejtimes.com/apps/images/14.png",
            "https://api.khaleejtimes.com/apps/images/15.png"
        )

        val list = title.indices.map {
            buildMovieInfo(
                title[it],
                description,
                studio[it],
                videoUrl[it],
                cardImageUrl[it],
                bgImageUrl[it]
            )
        }

        return list
    }

    private fun buildMovieInfo(
        title: String,
        description: String,
        studio: String,
        videoUrl: String,
        cardImageUrl: String,
        backgroundImageUrl: String
    ): Movie {
        val movie = Movie()
        movie.id = count++
        movie.title = title
        movie.description = description
        movie.studio = studio
        movie.cardImageUrl = cardImageUrl
        movie.backgroundImageUrl = backgroundImageUrl
        movie.videoUrl = videoUrl
        return movie
    }
}