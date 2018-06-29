package edu.tesji.cliente;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.InetAddress;
import java.net.Socket;
import javax.swing.JOptionPane;

public class EnviarArchivo {

    private String nombreArchivo = "";

    public EnviarArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public void enviarArchivo() {

        try {
            //String ip;
//            ip = JOptionPane.showInputDialog("Ingresa Ip");
            InetAddress direccion = InetAddress.getByName("192.168.1.17");

            Socket socket = new Socket(direccion, 5000);
            socket.setSoTimeout(2000);
            socket.setKeepAlive(true);
            File archivo = new File(nombreArchivo);

            int tamañoArchivo = (int) archivo.length();

            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            JOptionPane.showMessageDialog(null, "Enviando... " + archivo.getName());

            // Enviamos el nombre del archivo 
            dos.writeUTF(archivo.getName());

            // Enviamos el tamaño del archivo
            dos.writeInt(tamañoArchivo);

            // Creamos flujo de entrada para realizar la lectura del archivo en bytes
            FileInputStream fis = new FileInputStream(nombreArchivo);
            BufferedInputStream bis = new BufferedInputStream(fis);

            // Creamos el flujo de salida para enviar los datos del archivo en bytes
            BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());

            // Creamos un array de tipo byte con el tamaño del archivo 
            byte[] buffer = new byte[tamañoArchivo];

            // Leemos el archivo y lo introducimos en el array de bytes 
            bis.read(buffer);

            // Realizamos el envio de los bytes que conforman el archivo
            for (int i = 0; i < buffer.length; i++) {
                bos.write(buffer[i]);
            }

            JOptionPane.showMessageDialog(null, "Archivo " + archivo.getName()+" Enviado con éxito");
            // Cerramos socket y flujos
            bis.close();
            bos.close();
            socket.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString()+"\n Vuelve A Intentarlo");
            
        }
    }
}