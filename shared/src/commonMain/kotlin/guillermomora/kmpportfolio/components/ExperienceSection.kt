package guillermomora.kmpportfolio.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import guillermomora.kmpportfolio.AppColor

@Composable
fun ExperienceSection(
    experienceEntries: List<ExperienceEntry>
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(
            text = "EXPERIENCE",
            color = AppColor.w2,
            lineHeight = 28.sp,
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold
        )
        experienceEntries.forEachIndexed { index, entry ->
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    text = entry.companyName,
                    color = AppColor.w1,
                    lineHeight = 28.sp
                )
                Text(
                    text = entry.dates,
                    color = AppColor.w2,
                    lineHeight = 28.sp
                )
            }
            Text(
                text = entry.role,
                color = AppColor.w2,
                lineHeight = 28.sp
            )
            if (index + 1 < experienceEntries.size) {
                Spacer(modifier = Modifier.height(12.dp))
                HorizontalDivider(
                    color = AppColor.w2,
                    thickness = 0.5.dp
                )
                Spacer(modifier = Modifier.height(12.dp))
            }
        }
    }
}

data class ExperienceEntry(
    val companyName: String,
    val role: String,
    val dates: String
)