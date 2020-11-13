package exercicios.atividadeAvaliativa4;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

public class Num1 {
    public static void main(String[] args) {
        String arquivo1 = "C:\\teste\\arquivo.txt";
        byte[] bytes1;
        try {
            bytes1 = Files.readAllBytes(Paths.get(arquivo1));
            String texto1 = Charset.defaultCharset().decode (ByteBuffer.wrap(bytes1)).toString();
            System.out.println(texto1);
        }catch (NoSuchFileException nsfe){
            System.out.println("Arquivo ou diretório não existe");
        }catch (IOException ioe) {
            System.out.println("Algum erro ocorreu");;
        } 
    }
}
