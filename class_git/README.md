# CLASE 1 MIÉRCOLES 27 DE MARZO DEL 2024

 > Lo que vimos en la clase anterior:
<sub>
Abrimos la terminal de Git Bash en Window o la terminal de Ubuntu, tambien la terminal de Mac, y comenzamos con los siguientes comandos y creación de directorios</sub>

´´´sh
pwd  # Vemos la ruta de la carpeta en la que estamos
cd # Es para navegar a una carpeta: change directory -> cambiar de directorio
cd / # Nos llava al home, en la raíz del disco
cd ~ # La virgulilla significa que estamos en el lugar de los documentos o del usuario
ls # Esto es listar los archivos, nos muestra todos los archivos en la raíz
ls -al # El espacio -al significa que es un argumento especial para ver archivos ocultos
# Usar la flecha hacía arriba nos muestra el último comando utilizado
ls -l # Muestra casi todos los archivos sin los que están ocultos
ls -a # Muestra el grupo de archivos pero no en una lista
clear #Limpia la consola o ctrl + l
cd .. # Nos devuelve a la carpeta anterior
cd U + tab #Esto se usa para un autocompletado o para buscar una referencia
cd /D # Cambiamos de disco en window
df -h # Muestra todos los directorios en Ubuntu
cd /mnt/d # Cambia de directorio usando WSL Ubuntu en window
´´´


## AHORA COMENZAMOS CON LA CREACIÓN DE CARPETAS

´´´sh
cd ..
cd ..
cd /mnt/c
cd ~ # Vamos a la raíz
mkdir Tecnicatura #Recordar que en window las mayúsculas no tienen relevancia, pero si en Linux
cd tecnicatura
mkdir Python
mkdir Java
mkdir JavaScript
´´´
<sub>
Revisar y ejecutar cada comando, hacerlo como practica</sub>
<sub>
Profesor Ariel Betancud</sub>

CLASE 3 MIÉRCOLES 10 DE ABRIL DEL 2024
Analizar cambios en los archivos de tu proyecto Git parte 3

Ingresamos de la siguiente manera:

Abrir git bash en Window o la terminal de Linux o de Mac: al abrir Git Bash hacerlo como administrador, en terminal también o usar sudo para permisos especiales.

cd tecnicatura #Ingresamos al direcotorio donde están nuestras carpetas de trabajo

ls #Vemos los archivos y directorios que ya tenemos

cd git #No hay nada

cd .. #Salimos

rm historia.txt #Eliminamos el archivo que habíamos hecho, esto en git bash (window) esto es para practica

rm Git #rm: cannot remove 'Git': Is a directory

rm --recursive -R Git #By default, rm does not remove directories.  Use the --recursive (-r or -R) arguments

option to remove each listed directory, too, along with all of its contents. Esto es para practica

rm --help #Nos muestra lo que les puse arriba como documentación en Inglés.

mkdir class-git #Creamos la carpeta o directorio para trabajar en Git local por ahora.

cd class-git #Entramos para crear el README.md para este sector.

touch README.md #Vamos a crear un archivo nuevo, md significa markdown y se pueden trabajar con editores de texto, este es un lenguaje que transforma el texto a html.

Enlace a la documentación en GitHub de MARKDOWN

Leemos la documentación para ir creando en README.md como lo enseña GitHub.

code . #Abrimos VSC para editar el archivo.

Empezamos a cargar lo visto en las clases anteriores (Comandos) en el README y pasamos a commitear

git status

git add .

git status

git commit -m "Cargamos el README dentro del directorio class-git"

git status

git log #Para ver los dos commits hechos: Si tienes commiteada alguna clase anterior veras mas commits de los que yo tengo.

cd ..

cd ..

Revisar y ejecutar cada comando, hacerlo como practica

Profesor Ariel Betancud

