# coroutine

### 1. Primera Rutina

Una rutina es una instancia de computación suspendible. Es conceptualmente similar a un subproceso, en el sentido de que necesita un bloque de código para ejecutarse que funciona simultáneamente con el resto del código

![primera](https://github.com/davidmoralesluis/coroutine/assets/91198406/1a8f9c5d-a33b-4641-bb4e-aefee6268dcb)

### 2. Función de suspensión 

Una función suspendida es una función que puede pausar su ejecución sin bloquear el hilo en el que se está ejecutando.
  
![supend](https://github.com/davidmoralesluis/coroutine/assets/91198406/23a56b80-47fc-4abb-b751-1ea803c3d3ac)

### 3. Generador de alcance y concurrencia

Se puede usar un generador coroutineScope dentro de cualquier función de suspensión para realizar múltiples operaciones simultáneas.

![image](https://github.com/davidmoralesluis/coroutine/assets/91198406/10296523-54fd-4ca1-9089-b4e7e4dad5bd)

### 4. Un trabajo explícito

Un generador de corrutinas de lanzamiento devuelve un objeto Job que es un identificador de la corrutina lanzada y se puede usar para esperar explícitamente a que se complete.

![image](https://github.com/davidmoralesluis/coroutine/assets/91198406/2ee4a137-1964-4cee-8d02-b835dfe39dff)



