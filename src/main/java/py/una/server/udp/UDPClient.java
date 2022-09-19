package py.una.server.udp;


import java.io.*;
import java.net.*;

import py.una.entidad.Cotizacion;
import py.una.entidad.CotizacionJSON;

class UDPClient {

    public static void main(String a[]) throws Exception {

        String direccionServidor = "127.0.0.1";

        int puertoServidor = 9876;
        
        try {

            BufferedReader inFromUser =
                    new BufferedReader(new InputStreamReader(System.in));

            DatagramSocket clientSocket = new DatagramSocket();

            InetAddress IPAddress = InetAddress.getByName(direccionServidor);
            System.out.println("Conexión establecida con Servidor");

            byte[] sendData = new byte[1024];
            byte[] receiveData = new byte[1024];

            System.out.print("Ingrese el nombre del banco/financiera: ");
            String strBanco = inFromUser.readLine();
            
            System.out.print("Ingrese el valor de compra: ");
            String compra = inFromUser.readLine();
            System.out.print("Ingrese el valor de venta: ");
            String venta = inFromUser.readLine();
            
            Long com = 0L, ven = 0L;
            try {
            	com = Long.parseLong(compra);
            	ven = Long.parseLong(venta);
            }catch(Exception e1) {
            	System.out.println(e1.getMessage());
            }
            
            Cotizacion c = new Cotizacion(strBanco, com, ven);
            
            String datoPaquete = CotizacionJSON.objetoString(c); 
            sendData = datoPaquete.getBytes();
            
            DatagramPacket sendPacket =
                    new DatagramPacket(sendData, sendData.length, IPAddress, puertoServidor);

            clientSocket.send(sendPacket);

            DatagramPacket receivePacket =
                    new DatagramPacket(receiveData, receiveData.length);

            clientSocket.setSoTimeout(10000);

            try {
                clientSocket.receive(receivePacket);

                String respuesta = new String(receivePacket.getData());
                
                InetAddress returnIPAddress = receivePacket.getAddress();
                int port = receivePacket.getPort();

                System.out.println("Cotizacion subida");
                
            } catch (SocketTimeoutException ste) {

                System.out.println("TimeOut: El paquete udp se asume perdido.");
            }
            clientSocket.close();
        } catch (UnknownHostException ex) {
            System.err.println(ex);
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}