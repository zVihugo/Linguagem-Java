//Nome: Victor Hugo Favaro Moreira
//RA: 2503581

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class pesquisa_classes_wrappers {
    public static void main(String[] args){
        InputStreamReader c = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(c);

        int opU = 0;
        String str = "";
        boolean menu = true; //variavel para manter o while

        while(menu){
            System.out.println("USO DE CLASSES WRAPPERS - MENU DE OPCOES");
            System.out.println("1) INTEGER");
            System.out.println("2) BOOLEAN");
            System.out.println("3) CHARACTER");
            System.out.println("4) DOUBLE");
            System.out.println("5) BYTE");
            System.out.println("6) SHORT");
            System.out.println("7) FLOAT");
            System.out.println("8) LONG");
            System.out.println("0) SAIR");

            System.out.println("Escolha a opcao desejada: ");
            try{
                opU = Integer.parseInt(cd.readLine());
            }
            catch(IOException ioe){
                System.out.println("PANE NO SISTEMA, ALGUEM ME DESCONFIGUROU");
            }

            switch (opU) {
                case 1:
                    System.out.println("\nSelecionado a conversão para Integer: \n");
                    System.out.println("Insira uma String: ");
                    try{
                        str = cd.readLine();
                        int inteiro = convertStr_Int(str);
                        System.out.println("O valor inteiro é: " + inteiro + "\n");
                    }
                    catch(IOException ioe){
                        System.out.println("Erro de entrada!!!!");
                    }
                    break;
                case 2:
                    System.out.println("\nSelecionada a conversão para Boolean: \n");
                    Boolean b = convertInt_Bo(opU);
                    System.out.println("O valor b (Boolean) e: " + b + "\n");
                    break;
                case 3:
                    char letM = 'B';
                    char letMin = ConvertCharM_Min(letM);
                    System.out.println("Letra maiúscula: " + letM);
                    System.out.println("Letra minúscula: " + letMin);
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("\nSelecionado a conversão para Double: \n");
                    System.out.println("Utilizando o comando ParseDouble, temos: ");
                    String  qualquer = "3.5897"; //Aqui é declarado uma string qualquer
                    Double f = ConvertStr_Doub(qualquer);
                    System.out.println("Em tipo abstrato string: " + qualquer);
                    System.out.println("Transformado para Double: " + f);
                    System.out.println("");

                    break;
                case 5:
                    System.out.println("\nSelecionado a conversão para Byte: \n");
                    break;
                case 6:
                    System.out.println("\nSelecionado a conversão para short: \n");
                    break;
                case 7:
                    System.out.println("\nSelecionado a conversão para float: \n");
                    break;
                case 8: 
                    System.out.println("\nSelecionado a conversão para Long: \n");
                    break;
                case 0:
                    System.out.println("\nMenu encerrado com sucesso!!!\n");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nOpcao invalida, a escolha deve estar entre 1 e 9 ( que seria o 0)!!!! \n");
            }
        }  
    }   


    //Classe Integer: metódo para conversão de tipos "ParteInt() e ToString()"
    //Basicamento vai transformar uma String para Int e também, transforma int em String
    //Fonte de referencia: https://www.freecodecamp.org/portuguese/news/da-string-ao-int-em-java-como-converter-uma-string-em-um-inteiro/

    public static int convertStr_Int(String str1){
        int inteiro = Integer.parseInt(str1);
        return inteiro;
    }

    //Classe Boolean: metódo boleeano para retorno
    //Tem como finalidade, verificar se e verdadeiro ou falso
    //De acordo com a documentacao do java, encontrada no site da oracle, o boolean, retorna true, para qualquer valor diferente de 0
    //Referencia: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html

    public static boolean convertInt_Bo(int num){
        return num != 0;
    }

    //Classe Character: vamos utilizar os conhecidos UpperCase e LowCase
    //Tem como finalidade, pegar char e transforma-los em letras minusculas, mesmo que sejam digitados maiusculos
    //Bom vamos lá, esse método ele retorna um char, em minusculo, tal char que já está declarado dentro do meu case 3, nota-se, que tal transformação é feita pelo comando toLowerCase()
    //Referencia: https://www.javaguides.net/2018/08/character-wrapper-class-in-java.html

    public static char ConvertCharM_Min(char let){
        return Character.toLowerCase(let);
    }

    //Classe Double: metódo ParseDouble
    //Bom, aqui utilizaremos um dos metódos da classe Wrapper doube, o ParseDouble, no qual ele pega uma string e transforma em double
    //Referencia: https://www.geeksforgeeks.org/double-parsedouble-method-in-java-with-examples/

    public static double ConvertStr_Doub(String qualquer1){
        Double transforma = Double.parseDouble(qualquer1);
        return transforma;
    }
}