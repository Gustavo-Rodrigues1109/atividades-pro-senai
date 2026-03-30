import static java.lang.IO.*;
void main() {
    IO.println("digite a nota 1");
      float nota1 = Float.parseFloat(readln());
    IO.println("digite a nota 2");
      float nota2 = Float.parseFloat(readln());
    IO.println("digite a nota 3");
      float nota3 = Float.parseFloat(readln());
    IO.println("digite a nota 4");
      float nota4 = Float.parseFloat(readln());
      float media_final = (nota1 + nota2 + nota3 + nota4) / 4;
  
    if (media_final <= 3.9) {
          IO.println(nota1);
          IO.println(nota2);
          IO.println(nota3);
          IO.println(nota4);
          IO.println("Sua media final foi :     " + media_final);
          IO.println("Conceito : E");
          IO.println("VocÊ esta reprovado");
    } else if (media_final <= 5.9) {
          IO.println(nota1);
          IO.println(nota2);
          IO.println(nota3);
          IO.println(nota4);
          IO.println("Sua media final foi :     " + media_final);
          IO.println("Conceito : D");
          IO.println("Você esta reprovado");
    } else if (media_final <= 7.4) {
          IO.println(nota1);
          IO.println(nota2);
          IO.println(nota3);
          IO.println(nota4);
          IO.println("Sua media final foi :     " + media_final);
          IO.println("Conceito : C");
          IO.println("Você esta aprovado");
    } else if (media_final <= 8.9) {
          IO.println(nota1);
          IO.println(nota2);
          IO.println(nota3);
          IO.println(nota4);
          IO.println("Sua media final foi :     " + media_final);
          IO.println("Conceito : B");
          IO.println("Você esta aprovado");
    }
else  {
        IO.println(nota1);
        IO.println(nota2);
        IO.println(nota3);
        IO.println(nota4);
        IO.println("Sua media final foi :     " + media_final);
        IO.println("Conceito : A");
        IO.println("Você esta aprovado");
    }
}
