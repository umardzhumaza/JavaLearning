package work_with_files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferWriteFile {
    public static void main(String[] args) {
        try(RandomAccessFile accessFile = new RandomAccessFile("test.txt","rw");
            FileChannel fileChannel = accessFile.getChannel()){

            ByteBuffer byteBuffer = ByteBuffer.allocate(25);
            StringBuilder stix = new StringBuilder();

            int readByte = fileChannel.read(byteBuffer);
            while(readByte>0){
                System.out.println("Read " + readByte);

                byteBuffer.flip();
                while(byteBuffer.hasRemaining()){
                    stix.append((char)byteBuffer.get());
                }
                byteBuffer.clear();
                readByte = fileChannel.read(byteBuffer);
            }
            System.out.println(stix);

            String text = "\nThe most beautiful experience we can have is the mysterious.";
            ByteBuffer buffer2 = ByteBuffer.wrap(text.getBytes());
            fileChannel.write(buffer2);

//            ByteBuffer buffer2 = ByteBuffer.allocate(text.getBytes().length);
//            buffer2.put(text.getBytes());
//            buffer2.flip();
//            fileChannel.write(buffer2);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
