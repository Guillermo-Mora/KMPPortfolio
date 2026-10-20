package guillermomora.kmpportfolio

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import guillermomora.kmpportfolio.components.ExperienceEntry
import guillermomora.kmpportfolio.components.ExperienceSection
import guillermomora.kmpportfolio.components.MainSection
import guillermomora.kmpportfolio.components.Page
import guillermomora.kmpportfolio.components.ProjectsSection
import kmpportfolio.shared.generated.resources.Res
import kmpportfolio.shared.generated.resources.guillermo_mora_mortes
import org.jetbrains.compose.resources.painterResource

@Composable
@Preview
fun App() {
    val experienceEntries = listOf(
        ExperienceEntry(
            companyName = "UPV",
            role = "Internship - Developer",
            dates = "April ∙ June 2026"
        ),
        ExperienceEntry(
            companyName = "Ahora Software",
            role = "Internship - Developer",
            dates = "May 2025"
        ),
        ExperienceEntry(
            companyName = "Doctor Phone",
            role = "Internship - Repair and web developer",
            dates = "April ∙ June 2024"
        ),
    )
    Page {
        MainSection {
            //USAR LA FUENTE DE JETBRAINS MONO PARA EL PORTAFOLIO WEB Y VER QUE TAL QUEDA
            //Añadir sección sólo con las tecnologías, o en vez de eso poner los iconos de las tecnologías debajo de
            // la imagen de cada proyecto.
            Spacer(modifier = Modifier.height(64.dp))
            Image(
                painter = painterResource(Res.drawable.guillermo_mora_mortes),
                contentDescription = null,
                Modifier
                    .size(120.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = "I'm Guillermo Mora Mortes, a software developer based in Valencia.",
                color = AppColor.w1,
                lineHeight = 28.sp
            )
            Text(
                text = "I build full-stack applications focused on creating useful, accessible software for everyone.",
                color = AppColor.w1,
                lineHeight = 28.sp
            )
            Spacer(modifier = Modifier.height(24.dp))
            ExperienceSection(experienceEntries)
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = "FEATURES",
                color = AppColor.w2,
                lineHeight = 28.sp,
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = "CONNECT",
                color = AppColor.w2,
                lineHeight = 28.sp,
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "guillermomora@tutamail.com",
                color = AppColor.w1,
                lineHeight = 28.sp
            )
            Row {
                Text(
                    text = "linkedin.com/",
                    color = AppColor.w2,
                    lineHeight = 28.sp
                )
                Text(
                    text = "guillermo-mora-mortes",
                    color = AppColor.w1,
                    lineHeight = 28.sp
                )
            }
            Row {
                Text(
                    text = "github.com/",
                    color = AppColor.w2,
                    lineHeight = 28.sp
                )
                Text(
                    text = "Guillermo-Mora",
                    color = AppColor.w1,
                    lineHeight = 28.sp
                )
            }
        }
        ProjectsSection {
            Spacer(modifier = Modifier.height(64.dp))
            Text(
                text = "CONNECT",
                color = AppColor.w2,
                lineHeight = 28.sp,
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}