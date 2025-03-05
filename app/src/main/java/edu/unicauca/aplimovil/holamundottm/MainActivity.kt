package edu.unicauca.aplimovil.holamundottm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import edu.unicauca.aplimovil.holamundottm.ui.theme.HolaMundoTTMTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            HolaMundoTTMTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.primaryContainer
                ) {
                    Saludador("Telematica")
                }
            }

        }
    }
}

@Composable
fun Saludador(nombre: String){
    Text(
        text = "Hola $nombre",
        modifier = Modifier.padding(all=24.dp)
        )
}

@Preview
@Composable
fun PreviewSaludador(){
    Saludador("Cristhian")
}

@Preview
@Composable
fun PreviewSaludador2(){
    Saludador("Jose")
}


@Preview
@Composable
fun PreviewSaludadorConTema(){
    HolaMundoTTMTheme {
        Surface(
            color = MaterialTheme.colorScheme.secondaryContainer
        ) {
            Saludador("Telematica")
        }
    }
}





