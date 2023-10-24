///////////////////////////////////////
// PATRON DE DISEÑO FACTORY EN ANDROID
// @DATE: 24/10/2023
// @AUTHORA: ADCSO
// @UTHOR: ADAS
/////////////////////////////////////

// Interfaz para las notas
interface Nota {
    fun mostrarContenido()
}

// Clase concreta para la nota de texto
class NotaTexto(private val contenido: String) : Nota {
    override fun mostrarContenido() = println("Nota de Texto: $contenido")
}

// Clase concreta para la nota de imagen
class NotaImagen(private val rutaImagen: String) : Nota {
    override fun mostrarContenido() = println("Nota de Imagen: $rutaImagen")
}

// Clase concreta para la nota de audio
class NotaAudio(private val rutaAudio: String) : Nota {
    override fun mostrarContenido() = println("Nota de Audio: $rutaAudio")
}

// Clase concreta para la nota de audio
class NotaVideo(private val rutaVideo: String) : Nota {
    override fun mostrarContenido() = println("Nota de Video: $rutaVideo")
}

// Interfaz para la fábrica de notas
interface FabricaNotas {
    fun crearNota(): Nota
}

// Implementación concreta de la fábrica para notas de texto
class FabricaNotaTexto(private val contenido: String) : FabricaNotas {
    override fun crearNota(): Nota {
        return NotaTexto(contenido)
    }
}

// Implementación concreta de la fábrica para notas de imagen
class FabricaNotaImagen(private val rutaImagen: String) : FabricaNotas {
    override fun crearNota(): Nota {
        return NotaImagen(rutaImagen)
    }
}

// Implementación concreta de la fábrica para notas de audio
class FabricaNotaAudio(private val rutaAudio: String) : FabricaNotas {
    override fun crearNota(): Nota {
        return NotaAudio(rutaAudio)
    }
}

// Implementación concreta de la fábrica para notas de video
class FabricaNotaVideo(private val rutaVideo: String) : FabricaNotas {
    override fun crearNota(): Nota {
        return NotaVideo(rutaVideo)
    }
}

fun main() {
     // Crear fábricas de notas
    val fabricaTexto: FabricaNotas = FabricaNotaTexto("Contenido de la nota de texto")
    val fabricaImagen: FabricaNotas = FabricaNotaImagen("ruta/imagen.jpg")
    val fabricaAudio: FabricaNotas = FabricaNotaAudio("ruta/audio.mp3")
	val fabricaVideo: FabricaNotas = FabricaNotaVideo("ruta/video.mp4")
	
    // Crear notas utilizando las fábricas
    val notaTexto: Nota = fabricaTexto.crearNota()
    val notaImagen: Nota = fabricaImagen.crearNota()
    val notaAudio: Nota = fabricaAudio.crearNota()
	val notaVideo: Nota = fabricaVideo.crearNota()
    
	// Mostrar el contenido de las notas
    notaTexto.mostrarContenido()
    notaImagen.mostrarContenido()
    notaAudio.mostrarContenido()
    notaVideo.mostrarContenido()
}
