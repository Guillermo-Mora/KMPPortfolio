package guillermomora.kmpportfolio.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SpacerSmall() {
    Spacer(modifier = Modifier.height(12.dp))
}


@Composable
fun SpacerNormal() {
    Spacer(modifier = Modifier.height(24.dp))
}

@Composable
fun SpacerBig() {
    Spacer(modifier = Modifier.height(64.dp))
}