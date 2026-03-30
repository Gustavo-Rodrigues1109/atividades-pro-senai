import static java.lang.IO.*;
void main() {

    println("1 - opcao 1");
    println("2 - opcao 2");
    println("3 - opcao 3");
    println("4 - sair");


    println("digite um valor de 1 a 4 ");
    String valor = readln();

    if (valor.equals("1")) {

        println("Você selecionou a opção 1");
    } else if (valor.equals("2")) {

        println("Você selecionou a opção 2");

    }
    else if (valor.equals("3")) {

        println("Você selecionou a opção 3");
    }
    else if (valor.equals("4")) {

        println("Você selecionou sair");
    }
    else{
        println("valor invalido");
    }

    println("fim do programa");

}
