package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Uno mille";
        carro1.ano = 2010;
        carro1.modelo = "Way";

        carro2.nome = "Corolla";
        carro2.ano = 2025;
        carro2.modelo = "GLi";

        System.out.println("Carro 1: \n" + "Nome: " + carro1.nome + "; Ano: " + carro1.ano + "; Modelo: " + carro1.modelo);
        System.out.println("Carro 2: \n" + "Nome: " + carro2.nome + "; Ano: " + carro2.ano + "; Modelo: " + carro2.modelo);
    }

}
