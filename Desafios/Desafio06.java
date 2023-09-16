// Desafio 006 - Faça um programa que leia a largura e a altura de uma parede em metros, e calcule
// a sua área e a quantidade de tinta necessária para pintá-la, sabendo que cada litro de tinta pinta
// uma área de 2 metros quadrados.

public class Desafio06 extends BaseDesafio 
{

  public Desafio06() {}

    @Override

    public void Executar()
    {
      double alt, lar, h, tinta;

      System.out.println("Informe o a altura em metros:");
      alt = this.sc.nextInt();

      System.out.println("\nInforme o a largura em metros:");
      lar = this.sc.nextInt();

      h = alt * lar;

      System.out.println("\n Área da parede: "+ h + "m²");
      tinta = h / 2;
      this.sc.close();
      System.out.println("\n Quantidade de tinta necessária: "+tinta+" L\n");
    }
}