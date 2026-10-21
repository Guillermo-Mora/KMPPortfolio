package guillermomora.kmpportfolio

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import guillermomora.kmpportfolio.components.*
import guillermomora.kmpportfolio.components.section.*
import kmpportfolio.shared.generated.resources.Res
import kmpportfolio.shared.generated.resources.guillermo_mora_mortes
import org.jetbrains.compose.resources.painterResource

@Composable
@Preview(
    widthDp = 1080,
    heightDp = 1080
)
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
    val educationEntries = listOf(
        EducationEntry(
            degree = "Bachelor in Computer Science",
            dates = "2026 ∙ Now",
            averageGrade = ""
        ),
        EducationEntry(
            degree = "Higher Vocational Qualification in Multiplatform Application Development",
            dates = "2024 ∙ 2026",
            averageGrade = " 9 ∙ Highest Honours"
        ),
        EducationEntry(
            degree = "Intermediate Vocational Qualification in Microcomputer Systems and Networks",
            dates = "2022 ∙ 2024",
            averageGrade = " 9"
        ),
    )
    val connectEntries = listOf(
        ConnectEntry(
            profileUrl = "guillermomora@tutamail.com",
        ),
        ConnectEntry(
            baseUrl = "linkedin.com",
            profileUrl = "guillermo-mora-mortes"
        ),
        ConnectEntry(
            baseUrl = "github.com",
            profileUrl = "Guillermo-Mora"
        )
    )
    Page {
        SectionMain {
            //USAR LA FUENTE DE JETBRAINS MONO PARA EL PORTAFOLIO WEB Y VER QUE TAL QUEDA
            //Añadir sección sólo con las tecnologías, o en vez de eso poner los iconos de las tecnologías debajo de
            // la imagen de cada proyecto.
            SpacerBig()
            Image(
                painter = painterResource(Res.drawable.guillermo_mora_mortes),
                contentDescription = null,
                Modifier
                    .size(120.dp)
                    .clip(CircleShape)
            )
            SpacerNormal()
            TextNormal(
                text = "I'm Guillermo Mora Mortes, a software developer based in Valencia."
            )
            TextNormal(
                text = "I build full-stack applications focused on creating useful, accessible software for everyone."
            )
            SpacerNormal()
            SectionExperience(
                title = "EXPERIENCE",
                experienceEntries = experienceEntries
            )
            SpacerNormal()
            SectionEducation(
                educationEntries = educationEntries,
                title = "EDUCATION"
            )
            SpacerNormal()
            TextSection(
                text = "FEATURES"
            )
            SpacerNormal()
            SectionConnect(
                title = "CONNECT",
                connectEntries = connectEntries,
            )
            SpacerNormal()
        }
        SectionProjects {
            SpacerNormal()
            TextSection(
                text = "PROJECTS"
            )
        }
    }
}