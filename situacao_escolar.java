import static java.lang.IO.*;
void main() {
    IO.println("digite a nota 1");
      float not1 = Float.parseFloat(readln());
    IO.println("digite a nota 2");
      float not2 = Float.parseFloat(readln());
    IO.println("digite a nota 3");
      float not3 = Float.parseFloat(readln());
    IO.println("digite a nota 4");
      float not4 = Float.parseFloat(readln());
        float media = not1 + not2 + not3 + not4
    
    if (media >= 9.0 && media <= 10.0) {
    conceito = 'A';
    } else if (media >= 7.5) {
    conceito = 'B';
    } else if (media >= 6.0) {
    conceito = 'C';
    } else if (media >= 4.0) {
    conceito = 'D';
    } else {
    conceito = 'E';
    }

    String situacao;

    if (conceito == 'A' || conceito == 'B' || conceito == 'C') {
    situacao = "APROVADO";
    } else {
    situacao = "REPROVADO";
    

    }
}
