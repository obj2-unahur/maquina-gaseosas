# Maquina de gaseosas

Se solicita modelar con objetos el comportamiento de una máquina expendedora de gaseosas. La máquina solo vende un tipo de gaseosa y de un solo tamaño.
El funcionamiento de la máquina es simple, el cliente ingresa el dinero estipulado y presiona la palanca para obtener la bebida. La máquina sirve la bebida y, si corresponde, retorna el cambio.

En el diseño se debe tener en cuenta lo siguiente:

* Si el cliente presiona la palanca sin haber ingresado el dinero, la máquina no debe servir la bebida sino informale el precio de la misma.
* Si el cliente ingresa dinero pero no es suficiente, la maquina no debe servir la bebida sino informale el valor faltante.

Por otro lado, si la maquina no tiene bebidas disponibles:
* Si el cliente ingresa dinero, la máquina deberia devolver el dinero ingresado e informar que está sin stock al cliente.
* Si el cliente presiona la palanca, la máquina debería informar que está sin stock al cliente.
