Hola, quería indicaros un poco las principales decisiones que he tomado:

- He decidido realizar el test utilizando Spring Boot, dado que se me consultó si había trabajado con ella. 
- He cambiado el valor por defecto del puerto del Tomcat embebido de "8080" a "8090".
- He creado dos test básicos, configurados de forma que pueden correr con Spring boot.
- La gestión de las respuestas de los servicios es bastante básica, dentro del tiempo que tenía disponible para completar la prueba prefería centrarme en la parte back como tal.
- Tal y como ha pasado en el punto anterior, he creado una gestión muy básica de excepciones. Quería mostrar que conozco e utilizo excepciones propias sin hacer una gestión muy compleja de ellas.
- Al igual que los dos anteriores también he gestionado logs propios, sin esmerarme demasiado, utilizando la herramienta de logging por defecto, mostrando tres mensajes distintos a modo de respuesta a la llamada REST (uno si está vacío, otro si se produce excepción, y el general mostrando la lista original y la resultante). También se podrían ver más mensajes si se bajara el nivel de las trazas por defecto.

Adjunto "sortByBinaryOnesProject-0.0.1-SNAPSHOT.jar" que sería el jar a ejecutar utilizando el comando "java -jar .\sortByBinaryOnesProject-0.0.1-SNAPSHOT.jar", y también los archivos fuente del proyecto.

Un saludo.