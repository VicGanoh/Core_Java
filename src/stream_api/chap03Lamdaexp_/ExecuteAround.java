package stream_api.chap03Lamdaexp_;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExecuteAround {

    private static final String FILE = ExecuteAround.class.getResource("./data.txt").getFile();

    public static void main(String[] args) throws IOException {

        String result =  processFile((BufferedReader br) ->
            br.readLine()
        );
    }

    public static String processFileLimited() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE))){
            return br.readLine();
        }
    }

    public static String processFile(BufferedReaderProcessor p) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader(FILE))){
            return p.process(br);
        }
    }

    @FunctionalInterface
    public interface BufferedReaderProcessor{

        String process(BufferedReader b) throws IOException;
    }
}

