<h1 align="center">📄 Informe sobre Patrones de Diseño</h1>

Este informe se centra en el uso del patrón de diseño Factory Method. El patrón Factory Method proporciona una manera de crear objetos de un tipo particular en una interfaz común, permitiendo la creación de diferentes tipos de notas de manera modular y extensible.

## 🙆👨‍💻 Autores (Ctrl + Click para ver los perfiles)
Este informe ha sido elaborado por el Grupo 13 del curso de Programación de Aplicaciones Móviles Nativas (PAMN).
  
[![GitHub](https://img.shields.io/badge/GitHub-Ana%20del%20Carmen%20Santana%20Ojeda-red?style=flat-square&logo=github)](https://github.com/AnaSantana016)

[![GitHub](https://img.shields.io/badge/GitHub-Alejandro%20David%20Arzola%20Saavedra-blue?style=flat-square&logo=github)](https://github.com/AlejandroDavidArzolaSaavedra)
  

## 📑 Contenido del Informe
El informe se divide en varias secciones principales:

📋 Sección 1: Diseño de la Estructura de Clases
En esta parte del documento, se elabora la estructura de clases para una aplicación de notas en Kotlin, utilizando el patrón Factory Method. Las notas pueden ser de tres tipos: texto, imagen y audio.

📱 Sección 2: Detalles de las Clases
En esta sección, se presenta un diagrama de clases que incluye el código correspondiente, acompañado de una descripción detallada para cada clase.

☁ Sección 3: Reflexión sobre Cambios Futuros
En este segmento, se abordan diversas preguntas relacionadas con el patrón de diseño que será implementado en la aplicación mencionada.

# Compilacion del codigo

El codigo puede compilarse en el siguiente enlace con Ctrl + Click: [ Enlace al código aplicando el patrón de diseño Factory](https://play.kotlinlang.org/#eyJ2ZXJzaW9uIjoiMS45LjEwIiwicGxhdGZvcm0iOiJqYXZhIiwiYXJncyI6IiIsIm5vbmVNYXJrZXJzIjp0cnVlLCJ0aGVtZSI6ImlkZWEiLCJjb2RlIjoiLy8vLy8vLy8vLy8vLy8vLy8vLy8vLy8vLy8vLy8vLy8vLy8vLy8vXG4vLyBQQVRST04gREUgRElTRcORTyBGQUNUT1JZIEVOIEFORFJPSURcbi8vIEBEQVRFOiAyOC8xMC8yMDIzXG4vLyBAQVVUSE9SQTogQURDU09cbi8vIEBVVEhPUjogQURBU1xuLy8vLy8vLy8vLy8vLy8vLy8vLy8vLy8vLy8vLy8vLy8vLy8vL1xuXG4vLyBJbnRlcmZheiBwYXJhIGxhcyBub3Rhc1xuaW50ZXJmYWNlIE5vdGEge1xuICAgIGZ1biBtb3N0cmFyQ29udGVuaWRvKClcbn1cblxuLy8gQ2xhc2UgY29uY3JldGEgcGFyYSBsYSBub3RhIGRlIHRleHRvXG5jbGFzcyBOb3RhVGV4dG8ocHJpdmF0ZSB2YWwgY29udGVuaWRvOiBTdHJpbmcpIDogTm90YSB7XG4gICAgb3ZlcnJpZGUgZnVuIG1vc3RyYXJDb250ZW5pZG8oKSA9IHByaW50bG4oXCJOb3RhIGRlIFRleHRvOiAkY29udGVuaWRvXCIpXG59XG5cbi8vIENsYXNlIGNvbmNyZXRhIHBhcmEgbGEgbm90YSBkZSBpbWFnZW5cbmNsYXNzIE5vdGFJbWFnZW4ocHJpdmF0ZSB2YWwgcnV0YUltYWdlbjogU3RyaW5nKSA6IE5vdGEge1xuICAgIG92ZXJyaWRlIGZ1biBtb3N0cmFyQ29udGVuaWRvKCkgPSBwcmludGxuKFwiTm90YSBkZSBJbWFnZW46ICRydXRhSW1hZ2VuXCIpXG59XG5cbi8vIENsYXNlIGNvbmNyZXRhIHBhcmEgbGEgbm90YSBkZSBhdWRpb1xuY2xhc3MgTm90YUF1ZGlvKHByaXZhdGUgdmFsIHJ1dGFBdWRpbzogU3RyaW5nKSA6IE5vdGEge1xuICAgIG92ZXJyaWRlIGZ1biBtb3N0cmFyQ29udGVuaWRvKCkgPSBwcmludGxuKFwiTm90YSBkZSBBdWRpbzogJHJ1dGFBdWRpb1wiKVxufVxuXG4vLyBDbGFzZSBjb25jcmV0YSBwYXJhIGxhIG5vdGEgZGUgYXVkaW9cbmNsYXNzIE5vdGFWaWRlbyhwcml2YXRlIHZhbCBydXRhVmlkZW86IFN0cmluZykgOiBOb3RhIHtcbiAgICBvdmVycmlkZSBmdW4gbW9zdHJhckNvbnRlbmlkbygpID0gcHJpbnRsbihcIk5vdGEgZGUgVmlkZW86ICRydXRhVmlkZW9cIilcbn1cblxuLy8gSW50ZXJmYXogcGFyYSBsYSBmw6FicmljYSBkZSBub3Rhc1xuaW50ZXJmYWNlIEZhYnJpY2FOb3RhcyB7XG4gICAgZnVuIGNyZWFyTm90YSgpOiBOb3RhXG59XG5cbi8vIEltcGxlbWVudGFjacOzbiBjb25jcmV0YSBkZSBsYSBmw6FicmljYSBwYXJhIG5vdGFzIGRlIHRleHRvXG5jbGFzcyBGYWJyaWNhTm90YVRleHRvKHByaXZhdGUgdmFsIGNvbnRlbmlkbzogU3RyaW5nKSA6IEZhYnJpY2FOb3RhcyB7XG4gICAgb3ZlcnJpZGUgZnVuIG1vc3RyYXJDb250ZW5pZG8oKSA9IHByaW50bG4oXCJOb3RhIGRlIFRleHRvOiAkY29udGVuaWRvXCIpXG59XG5cbi8vIENsYXNlIGNvbmNyZXRhIHBhcmEgbGEgbm90YSBkZSBpbWFnZW5cbmNsYXNzIE5vdGFJbWFnZW4ocHJpdmF0ZSB2YWwgcnV0YUltYWdlbjogU3RyaW5nKSA6IE5vdGEge1xuICAgIG92ZXJyaWRlIGZ1biBtb3N0cmFyQ29udGVuaWRvKCkgPSBwcmludGxuKFwiTm90YSBkZSBJbWFnZW46ICRydXRhSW1hZ2VuXCIpXG59XG5cbi8vIENsYXNlIGNvbmNyZXRhIHBhcmE)


## 📄 Compilación del Informe

1. Abre tu proyecto en Overleaf (asegúrate de haber creado una cuenta en Overleaf y de haber importado tu proyecto allí).

2. Localiza el archivo "patrones.tex" en el proyecto en Overleaf.

3. Haz clic en el archivo "patrones.tex" para abrirlo en el editor de Overleaf.

4. En la parte superior del editor, verás un botón llamado "Recompilar" o "Compilar" (puede variar según la versión de Overleaf). Haz clic en este botón.

5. Overleaf se encargará de compilar automáticamente el documento LaTeX y generará el archivo PDF correspondiente.

6. Una vez que haya finalizado la compilación, podrás descargar el archivo PDF resultante desde la interfaz de Overleaf.

## 🤝 Contribuciones
Si desea contribuir a este informe o realizar mejoras, le invitamos a hacerlo. Puede abrir problemas (issues) o enviar solicitudes de extracción (pull requests) para colaborar en el desarrollo del informe.

Por favor, contáctenos si tiene preguntas o comentarios sobre el informe.
