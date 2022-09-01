package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Exceptions5 {
    public static void main(String[] args) throws IOException, ParseException {
        run();
        /*2 Catch
        try {
            run();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }*/
        /* MultiCatch
        try {
            run();
        } catch (IOException e | RuntimeException) {
            throw new RuntimeException(e);
        }*/
        /* TakeAllException
        try {
            run();
        } catch (Exception e) {
        }*/
    }

    public static void run () throws IOException, ParseException, FileNotFoundException {

    }
}
