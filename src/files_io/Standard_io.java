package files_io;

import java.io.IOException;
import java.io.InputStreamReader;

public class Standard_io {
    public static void main(String[] args) throws IOException {

        //Standard input and output
        InputStreamReader cin = null;

        try {
            cin = new InputStreamReader(System.in);
            System.out.println("Enter 'q' to quit.");
            char c;
            do {
                c = (char) cin.read();
                System.out.print(c);
            }while (c!= 'q');
        }
        finally {
            if (cin != null){
                cin.close();
            }
        }
    }
}
