# Check-DNI-Regular-Exp
Validación de DNI y NIE mediante expresiones regulares.

# Requisitos funcionales
La solución que programamos hace unos días para chequear si un DNI era válido sólo funciona correctamente para “españoles con documento nacional de identidad (DNI) asignado por el Ministerio del Interior”.
Nos encargan ahora que extendamos el programa para que valide también el NIE o número de identidad extranjero, documento para “extranjeros residentes en España e identificados por la Policía”.

El formato del NIE es:
- Letra X + 7 números + dígito de control
- Letra Y + 7 números + dígito de control
- Letra Z + 7 números + dígito de control

según el [Número de Identificación Fiscal en la Wikipedia.](https://es.wikipedia.org/wiki/N%C3%BAmero_de_identificaci%C3%B3n_fiscal)

Ejemplos:

`"X1234567T", "Y1234567T", "Z1234567T"`

Además, como nuestros programadores/as vienen de la FP Dual del Borja Moll y practican la mejora e integración continua, han decidido optimizar el código del programa DNI para chequear la validez del DNI o NIE introducido utilizando expresiones regulares.
# Expresiones regulares
## Reglas de escritura

Primero has de comprender qué es una expresión regular y cuáles son las reglas mediante las cuales se escriben. Luego, has de aprender cómo utilizarlas en Java.
Las expresiones regulares son patrones que seleccionan (filtran) determinadas cadenas de caracteres cuando se aplican sobre un string.

Ejemplos:

`[abc]` selecciona un carácter que será a, b, o c. 

`[^xyz]` selecciona un carácter excepto x, y, z. 

`[a-p]` selecciona un carácter comprendido entre `a` y `p`.

`[a-cx-z]` selecciona un carácter comprendido entre `a` y `c`, o entre `x` y `z`, lo cual incluiría a, b, c, x, y, z.

`[a-z&&[^aeiou]]` selecciona una letra minúscula menos las vocales. En otras palabras, una consonante en minúscula.

`[a-zA-Z]+` selecciona cualquier palabra en un string. Por ejemplo: “*Todas las palabras en esta frase se seleccionan*“.

`\b\w{4}\b` selecciona palabras de 4 letras en un string. Por ejemplo: “drink *beer*, it’s very nice!” 

`\b\d{3}[-.]?\d{3}[-.]?\d{4}\b` selecciona teléfonos en un string con los formatos: 444-555-1234, 246.555.8888, 1235554567.

- En esta [herramienta web RegExr](https://regexr.com/) puedes testear tus expresiones regulares. Tiene muchos ejemplos. Aquí aprenderás cuáles son sus reglas.

## Clases Java

- Has de utilizar las clases `Pattern` y `Matcher`.
- En la clase `Matcher` presta especial atención al método `find()`.
- Los métodos `group()`, `start()` y `end()` de la clase `Matcher` son muy útiles para nuestros propósitos.

En el capítulo 14 del libro Beginning Java 8 Fundamentals encontrarás todo lo que necesitas conocer sobre cómo utilizar expresiones regulares en Java, y también sobre sus reglas de escritura.

También puedes leer este [Java Tutorials: Regular Expressions](https://docs.oracle.com/javase/tutorial/essential/regex/intro.html) de Oracle, donde aprenderás a escribir código para utilizarlas en Java (y también sobre sus reglas de escritura).

