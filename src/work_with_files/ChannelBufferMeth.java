package work_with_files;

import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferMeth {
    public static void main(String[] args) {
        try(RandomAccessFile accessFile = new RandomAccessFile("test.txt","r");
        FileChannel channel = accessFile.getChannel()) {

            ByteBuffer buffer = ByteBuffer.allocate(5);
            channel.read(buffer);
            buffer.flip();
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());
            buffer.rewind();//просто вернет указатель в начало
            System.out.println((char)buffer.get());
            System.out.println("-------------------------------");
            buffer.compact();//если не хотите использовать clear() помещает непрочитанные байты в начало,а указатель после для записи новых байт
            channel.read(buffer);
            buffer.flip();
            while(buffer.hasRemaining()){
                System.out.println((char)buffer.get());
            }
            System.out.println("-------------------------------");
            buffer.clear();//помещает указатель в начало и начинает затирать буффер новыми байтами
            channel.read(buffer);
            buffer.flip();//возвращает указатель для чтения
            System.out.println((char)buffer.get());
            buffer.mark();//помечает этот указатель чтобы потом можно было вернуться
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());
            buffer.reset();//вернуться на помеченный указатель
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
