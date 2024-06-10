Al momento hay dos clases, una de estudiantes, y otra de matematicas. En el main se itera un while loop, hasta que nadie mas quiera realizar el examen. Se piden los datos, como el nombre, apellido, 
y edad del estudiante. Dentro del while loop, se encontrara con un for loop de 8 iteraciones, por las 8 preguntas del examen. Dentro del loop, se hace un switch case con un numero random,
para ver que problema le aparecera al usuario. Dado problema, el usuario ingresa su respuesta, y la consola le dice al usuario si tiene la respuesta correcta o no. Si ingresa la respuesta correcta,
se aumentara un contador de respuestasCorrectas que fue inicializado antes del for loop. Al final de las 8 iteraciones, se calcula la nota con un double. Si este double es mayor a 60, el estudiante aprobo  el examen,
a lo contrario, si saca menos, reprobo el examen. Se asigna un String del estado del examen, dependiendo de la nota del estudiante, y despues todos los datos, como los nombres, edad, nota, y estado,
se usan para crear un objeto Estudiante, el cual se agregara al un ArrayList tipo Estudiante.
El while loop correra hasta que el usuario le haga saber que ningun otro estudiante realizara el examen. Despues de esto, se imprimira los datos de todos los estudiantes que realizaron el examen. 
