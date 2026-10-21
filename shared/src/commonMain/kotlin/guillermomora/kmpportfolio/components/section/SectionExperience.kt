package guillermomora.kmpportfolio.components.section

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import guillermomora.kmpportfolio.AppColor
import guillermomora.kmpportfolio.components.SpacerSmall
import guillermomora.kmpportfolio.components.TextNormal
import guillermomora.kmpportfolio.components.TextSection

@Composable
fun SectionExperience(
    experienceEntries: List<ExperienceEntry>,
    title: String
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        TextSection(
            text = title
        )
        experienceEntries.forEachIndexed { index, entry ->
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                TextNormal(
                    text = entry.companyName,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.weight(2f)
                )
                Spacer(modifier = Modifier.width(4.dp))
                TextNormal(
                    text = entry.dates,
                    color = AppColor.w2,
                    maxLines = 1,
                    textAlign = TextAlign.End,
                    modifier = Modifier.weight(
                        weight = 2f,
                        fill = false
                    )
                )
            }
            TextNormal(
                text = entry.role,
                color = AppColor.w2
            )
            if (index + 1 < experienceEntries.size) {
                SpacerSmall()
                HorizontalDivider(
                    color = AppColor.w2,
                    thickness = 0.5.dp
                )
                SpacerSmall()
            }
        }
    }
}

data class ExperienceEntry(
    val companyName: String,
    val role: String,
    val dates: String
)