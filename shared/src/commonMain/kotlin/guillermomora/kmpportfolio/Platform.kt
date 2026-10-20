package guillermomora.kmpportfolio

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform