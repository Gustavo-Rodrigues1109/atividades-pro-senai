import static java.lang.IO.*;
void main() {

    println("Digite o turno do dia em que voce estuda (M , T ou N ");
      String turno_de_estudo = readln();

    if (turno_de_estudo.equals("M")){
        println("Bom dia");
    }

    else if (turno_de_estudo.equals("T")) {
     println("Boa tarde");
    }
else if (turno_de_estudo.equals("N")) {
    println(" Boa noite");
    }
else{
    println("Valor invalido");
    }
}
