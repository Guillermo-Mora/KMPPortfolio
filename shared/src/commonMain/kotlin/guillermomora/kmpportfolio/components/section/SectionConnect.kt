package guillermomora.kmpportfolio.components.section

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import guillermomora.kmpportfolio.AppColor
import guillermomora.kmpportfolio.components.TextNormal
import guillermomora.kmpportfolio.components.TextSection

@Composable
fun SectionConnect(
    connectEntries: List<ConnectEntry>,
    title: String
) {
    TextSection(
        text = title
    )
    connectEntries.forEach { entry ->
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            entry.baseUrl?.let { baseUrl ->
                TextNormal(
                    text = "${baseUrl}/",
                    color = AppColor.w2,
                )
            }
            TextNormal(
                text = entry.profileUrl,
            )

        }
    }
}

data class ConnectEntry(
    val baseUrl: String? = null,
    val profileUrl: String
)