package work_with_binaryFiles;

import java.io.*;

public class DataOutpuStreamInputStream {
    public static void main(String[] args) {
        try(DataOutputStream fileOutputStream = new DataOutputStream(new FileOutputStream("test.bin"));
        DataInputStream fileInputStream = new DataInputStream(new FileInputStream("test.bin"))){
            fileOutputStream.writeBoolean(true);
            fileOutputStream.writeByte(5);
            fileOutputStream.writeShort(120);
            fileOutputStream.writeInt(10000);
            fileOutputStream.writeLong(111111111L);
            fileOutputStream.writeDouble(5.9);

            System.out.println(fileInputStream.readBoolean());
            System.out.println(fileInputStream.readByte());
            System.out.println(fileInputStream.readShort());
            System.out.println(fileInputStream.readInt());
            System.out.println(fileInputStream.readLong());
            System.out.println(fileInputStream.readDouble());

            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
