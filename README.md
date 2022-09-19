<h2>Servidor y Cliente UDP para el envio y recepción de las cotizaciones del dólar en distintos Bancos/Financieras</h2>

Siguiendo la consigna del ejercicio tomo a cada banco/financiera como un cliente que envia los valores de compra y venta de sus cotizaciones individualmente a un servidor, que finalmente termina recolectando estos datos y los imprime por pantalla del lado del servidor.

El archivo de Cotizacion.java fue creado desde cero para representar los distintos datos útiles asociados a la cotización de la moneda del dólar de algún Banco/Financiera.

El archivo de CotizacionJSON.java fue en gran parte inspirado en el proporcionado por el profesor en clase, siendo este adaptado para su funcionamiento con los datos utilizados para las Cotizaciones.

Los archivos UDPClient.java y UDPServer.java fueron adaptados con respecto a los proporcionados por el profesor para que en este caso no usen una base de datos, tengan una impresión de datos más limpia, y sean compatibles con los datos requeridos para una correcta cotización del dólar para distintos Bancos/Financieras.
