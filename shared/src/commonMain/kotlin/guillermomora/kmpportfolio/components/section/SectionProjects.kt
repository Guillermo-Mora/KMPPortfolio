package guillermomora.kmpportfolio.components.section

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import guillermomora.kmpportfolio.AppColor

@Composable
fun SectionProjects(
    content: @Composable () -> Unit
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
            content()
        }
    }
}