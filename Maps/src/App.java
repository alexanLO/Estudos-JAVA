import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        Map<String, Integer> votos = new LinkedHashMap<>();

        // "D:\\in.txt"
        System.out.print("Entre com o caminho do arquivo: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {

                String[] fields = line.split(",");
                String name = fields[0];
                int voto = Integer.parseInt(fields[1]);

                if (votos.containsKey(name)) {
                    int votosTotal = votos.get(name);
                    votos.put(name, voto + votosTotal);
                } else {
                    votos.put(name, voto);
                }
                line = br.readLine();

            }
            System.out.println("Votos total:");
            for (String key : votos.keySet()) {
                System.out.println(key + ": " + votos.get(key));
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
