### Escuela Colombiana de Ingeniería
### Examen Final
### Temperature Converter API

#### Juan Daniel Dueñas Rivera


## Descripción de la arquitectura

La arquitectura consta de un front end que recibe los datos que se quieren convertir, estos datos son capturados por un cliente javascript que tiene configurado un controlador que se encarga de hacer los llamados al API; una vez se hace el llamado el API, el API en su controlador tiene un backend que soporta la funcionalidad de conversión a través de la implementación de una interfaz. Se dicidió que los servicios queden como un contrato o una interfaz por si en algún momento se requiere agregar servicios de conversión también a grados Kelvin, mejorando atributos de flexibilidad. La implementación de la interfaz hace el calculo del procesamiento de la conversión y toma la respuesta el API para devolverla en formato json el calculo hecho. Como limitantes sería bueno ver hasta que punto atributos de escalibilidad son soportados y de eficiencia o tiempos de respuesta, ya que actualmente no se tiene sino solo un servidor soportando la operación de solicitudes, esto significa que si la aplicación empieza a ser muy consultado puede que ahogue el servidor, por lo tanto se tendría que entrar a revisar si se requieren de varias instancias de las API que soporten la carga, adicionando también balanceadores de carga que orquestes las peticiones a las instancias de las API. Otro punto a mejorar de esta versión inicial es el tiempo de respuesta, el cual se puede mejorar utilizando esquemas de caché y evitando reprocesamiento al servidor, simplemente utilizando un buffer por el lado del servidor o un caché por el lado del cliente para aquellas consultas de la temperatura que son más comunes.
end.



## [link Heroku](https://intense-depths-33651.herokuapp.com/)