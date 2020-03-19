package com.company;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;

public class FileTransferClient {

    private static final String HOST = "";
    private static final int PORT = 0;

    public static void main(String[] args) throws Exception {


        //инициализируем сокет
        //TODO: задайте правильные значения констант HOST и PORT
        Socket socket = new Socket(InetAddress.getByName(HOST), PORT);

        /**
         * далее небходимо создать массив байт, в который будет считываться
         * файл, для примера возьмем размер 10000, т.е. наш файл будет примерно 10 кб
         */
        //TODO: создайте массив байт который бы мог вместить 10 КБ
        //byte[] contents = new byte[];

        /**
         * как ранее в примере с сервером, нам понадобится поток файлового вывода
         * и буферизованный поток вывода
         */
        //TODO: раскоментируйте следующий участок кода и дополните его своими данными
        //FileOutputStream fos = new FileOutputStream(/*ЗДЕСЬ ПОЛНЫЙ ПУТЬ К ФАЙЛУ*/);
        //BufferedOutputStream bos = new BufferedOutputStream(/*ЗДЕСЬ ЭКЗЕМПЛЯР FileOutputStream*/);

        /**
         * теперь необходимо получить inputStream от нашего сокета раскоментируйте следующий участок кода и дополните его
         */
        //TODO: раскоментируйте следующий участок кода и дополните его
        //InputStream is = socket.get...;

        /**
         * алгоритм ниже осуществляет чтение и запись файла
         */
        //TODO: введите переменную состояния
        //int bytesRead = 0;

        //TODO: введите в условие цикла значение, которое обозначает конец файла (гугл в помощь)
        //while((bytesRead=is.read(contents))!= /*ЦЕЛОЧИСЛЕННОЕ ЗНАЧЕНИЕ, ОБОЗНАЧАЮЩЕЕ КОНЕЦ ФАЙЛА*/)
        //    bos.write(contents, 0, bytesRead);

        //TODO: освободите буферезованный поток вывода и закройте сокет
        //bos/*МЕТОД ОСВОБОЖДЕНИЯ ПОТОКА*/;
        //socket/*МЕТОД ЗАКРЫТИЯ СОКЕТА*/;

        //TODO: выведите сообщение об успешном сохранении файла
        //System.out.println("ВАШЕ СООБЩЕНИЕ");
    }
}
