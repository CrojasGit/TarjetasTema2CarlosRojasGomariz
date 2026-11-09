Explicacion:

window -> state:
he puesto un tamaño fijo de la ventana para que siempre se vea como quiero (y asi no haya nada que se quede sin caber)

Surface -> la he puesto para cambiar el fondo de toda la ventana (porque he puesto que se estire lo maximo posible)

La primera column la he hecho lo mas grande posible para que las cartas tengan todo el espacio posible para rellenar

He hecho que las tarjetas se puedan instanciar con el compose tarjeta, para no repetir codigo

Dentro del codigo, todos los paddings que he puesto han sido a medida para que se vea lo mas fiel posible a la foto

He puesto el modifier shape roundedcornershape para tener las esquinas redondeadas

He usado CardDefaults.cardColors porque ha sido la primera solucion que he encontrado para ponerle el color que queria a la carta

El elevation dentro de la card es para la sombra de cada carta

Para distribuir los objetos dentro de la carta he usado la siguiente disposicion:

Row (para dividir la carta en Foto | texto)
    Image
    Column (Los textos se distribuyen verticalmente)
        Text
        Text
        Divisor horizontal
        Row(son 2 textos colocados consecutivamente, uno en negrita y otro no)
            Text
            Text
        Row (por la misma razon
)           Text
            Text

En la primera row le pongo un height para que se parezca a la foto
Los modifiers de la imagen son para que se vea igual que en la foto
Me he asegurado de que la imagen se coloque en el centro de la carta verticalmente 

El vertical Arrangement spaceEvently hace que la distribucion de los objetos sea equitativa verticalmente (mismo espacio entre medias)

El resto de modifiers no son mas que estilos para los textos y estiramiento para que las row se vean como toca
