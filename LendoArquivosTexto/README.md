### Código inicial para entendimento do processo
        // lendo o arquivo
        File file = new File("D:\\Programação\\Estudos-JAVA\\LendoArquivoTexto\\out\\summary.csv");
        // quando for ler o arquivo ele vai exigir que use o IOException para tratar
        // possiveis erros
        // então temos que fazer o código dentro de um try-catch.
        Scanner sc = null;

        try {

            // leitura do arquivo
            sc = new Scanner(file);
            // "hasNextLine" irá verificar se existe uma proxima linha para ser lida
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            // sc.close é chamado no finally para ele ser chamado se o código der certo ou não erro
            //o sc.close não fecha se o valor do scanner for null então é necessário usar um if para tratar isso.
            if(sc != null){
                sc.close();
            }
        }

        ------------------------------------------------------------------------------------------------------------
        
         ### Implementando de uma forma básica manualmente

        // guardando o caminho do arquivo
        String path = "D:\\Programação\\Estudos-JAVA\\LendoArquivoTexto\\out\\summary.csv";
        // stream de leitura de caracteres a partir de arquivos;
        FileReader fr = null;
        // otimizar o fr, br é uma abstração maior para deixar mais rápida a leitura
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            // esse comando ira fazer ler linha por linha do arquivo e quando acabar de ler
            // ficará null
            String line = br.readLine();
            while (line != null) {
                // imprimir linha por linha caso o line for diferente de null
                System.out.println(line);
                // depois que ele imprime a linha ele vai ler a proxzima linha e com o while ele
                // vai repetir isso até chegar em null
                line = br.readLine();

            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                // isso vai gerar um novo exception então ele deve ser declarado entro de outro
                // bloco try
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // esse código é apenas para entender como é o processo manualmente como isso
        // existe uma forma menos verbosa e menos complicada em fazer todo o processo,
        // veja o proximo exemplo

        ------------------------------------------------------------------------------------------------------------

        ### Bloco try-with-resource
        // ele é um bloco try que declara um ou mais recursos, e garante que esses
        // recursos serão fechados ao final do bloco

        //esse código é baseado no código anterior só que mais enxuto e com as boas praticas

        // guardando o caminho do arquivo
        String path = "D:\\Programação\\Estudos-JAVA\\LendoArquivoTexto\\out\\summary.csv";

        // os streams serão declarados como um parametro no try: 
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        ------------------------------------------------------------------------------------------------------------


        ### FileWrite: stream de escrita de caracteres em de arquivos.
        
            //Cria/Recria o arquivo: new FileWriter(path);
            //Acrescenta ao arquivo existente: new FileWriter(path, true);
        //BufferedWrite(mais rápido)

        //variavel com o que será escrito no arquivo;
        String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};

        String path = "caminho do arquivo";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            //lógica para gravar o lines no arquivo
            for(String line: lines){
                bw.write(line); 
                bw.newLine(); // para quebrar a linha
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        ------------------------------------------------------------------------------------------------------------

        ### Manipulando pastas com o File

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o caminho de uma pasta: ");
        String strPath = sc.nextLine();

        // pode ultilizar tanto para o caminho de um arquivo quanto de uma pasta
        File path = new File(strPath);

        // pegando os itens dentro da pasta e listando

        // para outras pastas
        File[] folders = path.listFiles(/* aqui tera uma função */File::isDirectory);
        System.out.println("FOLDERS");

        for (File folder : folders) {
            System.out.println(folder);
        }

        // arquivos
        File[] files = path.listFiles(/* aqui tera uma função */File::isFile);
        System.out.println("FILES");

        for (File file : files) {
            System.out.println(file);
        }

        // mkdir isso será criado uma sub pasta
        boolean success = new File(strPath, "\\subdir").mkdir();

        sc.close();
    }

        ------------------------------------------------------------------------------------------------------------

    ### Informações do caminho do arquivo

     Scanner sc = new Scanner(System.in);

        System.out.println("Digite o caminho do arquivo");
        String strPath = sc.nextLine();

        File path = new File(strPath);
        sc.close();

        // pegar só o nome do arquivo

        System.out.println("Name: " + path.getName());
        // pegando só o caminho do arquivo
        System.out.println("Caminho: " + path.getParent());
        // pegando o caminho completo
        System.out.println("Name: " + path.getPath());

        d:\Programação\Estudos-JAVA\LendoArquivoTexto