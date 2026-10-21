package guillermomora.kmpportfolio.components.section

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import guillermomora.kmpportfolio.AppColor
import guillermomora.kmpportfolio.components.SpacerBig
import guillermomora.kmpportfolio.components.SpacerNormal
import guillermomora.kmpportfolio.components.TextSection
import kmpportfolio.shared.generated.resources.Res
import kmpportfolio.shared.generated.resources.guillermo_mora_mortes
import org.jetbrains.compose.resources.painterResource

@Composable
fun SectionProjects(
    projectsEntries: List<ProjectEntry>,
    title: String
) {
    Column(
        modifier = Modifier
            .background(AppColor.w4)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Column(
            modifier = Modifier
                .padding(horizontal = 24.dp)
                .widthIn(max = 600.dp)
                .fillMaxWidth()
        ) {
            SpacerBig()
            TextSection(
                text = title
            )
            projectsEntries.forEach { entry ->
                TextSection(
                    text = entry.title
                )
                Image(
                    painter = painterResource(Res.drawable.guillermo_mora_mortes),
                    contentDescription = null,
                    Modifier
                        .size(120.dp)
                        .clip(CircleShape)
                )
            }
            SpacerBig()
        }
    }
}

data class ProjectEntry(
    val title: String
)