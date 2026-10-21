package guillermomora.kmpportfolio.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import guillermomora.kmpportfolio.AppColor

@Composable
fun TextNormal(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = AppColor.w1,
    lineHeight: TextUnit = 28.sp,
    fontWeight: FontWeight? = null,
    textAlign: TextAlign? = null,
    maxLines: Int = Int.MAX_VALUE
) {
    Text(
        text = text,
        color = color,
        lineHeight = lineHeight,
        fontWeight = fontWeight,
        modifier = modifier,
        textAlign = textAlign,
        maxLines = maxLines
    )
}

@Composable
fun TextSection(
    text: String
) {
    Text(
        text = text,
        color = AppColor.w2,
        lineHeight = 28.sp,
        fontSize = 12.sp,
        fontWeight = FontWeight.Bold,
    )
}