# DANP-ORIENTACION
LABORATORIO ORIENTACION

Se calcula la orientación según el acelerómetro y el magnetómetro.

![alt text](./images/formula.PNG)


El sistema computa los ángulos de orientación utilizando el sensor de campos geomagnéticos de un dispositivo junto con el acelerómetro del dispositivo. Cuando se usan estos dos sensores de hardware, el sistema proporciona datos para los siguientes tres ángulos de orientación:

Azimuth (grados de rotación sobre el eje z). Este es el ángulo entre la dirección del compás actual del dispositivo y el norte magnético. Si el borde superior del dispositivo apunta al norte magnético, el valor azimuth es de 0 grados; si el borde superior apunta al sur, el valor azimuth es de 180 grados. De igual modo, si el borde superior apunta al este, el valor azimuth es de 90 grados; en cambio, si apunta al oeste, el valor azimuth es de 270 grados.

Pitch (grados de rotación sobre el eje x). Este es el ángulo entre un plano paralelo a la pantalla del dispositivo y un plano paralelo al suelo. Si sostienes el dispositivo paralelo al suelo con el borde inferior lo más cerca posible de tu cuerpo e inclinas el borde superior del dispositivo hacia el suelo, el valor del ángulo de orientación pitch se convierte en positivo. La inclinación en sentido opuesto, es decir, alejando el borde superior del dispositivo respecto del suelo, provoca que el ángulo pitch se convierta en negativo. El rango de valores va de -180 grados a 180 grados.

Roll (grados de rotación en torno al eje y). Este es el ángulo entre un plano perpendicular a la pantalla del dispositivo y un plano perpendicular al suelo. Si sostienes el dispositivo paralelo al suelo con el borde inferior lo más cerca posible de tu cuerpo e inclinas el borde izquierdo del dispositivo hacia el suelo, el valor del ángulo de orientación roll se convierte en positivo. La inclinación en sentido opuesto, es decir, acerando el borde derecho del dispositivo hacia el suelo, provoca que el ángulo roll se convierta en negativo. El rango de valores va de -90 grados a 90 grados.

Referencias

Calcular la orientación
https://developer.android.com/guide/topics/sensors/sensors_position

emulador de rotacion
https://developer.android.com/guide/topics/sensors/sensors_overview

orientación de acelerometro
http://josejuansanchez.org/android-sensors-overview/accelerometer/README.html

Cómo usar acelerómetro pildoras informáticas
https://www.youtube.com/watch?v=kDFECsorfqE


