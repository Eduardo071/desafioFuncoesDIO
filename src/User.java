public class User {
    int qtdVitorias;
    int qtdDerrotas;
    String nome;

    public void verificarRank(int qtdVitorias, int qtdDerrotas) {
        if ((qtdVitorias - qtdDerrotas) < 10) {
            System.out.println("O Herói " + nome + " tem um saldo de " + (qtdVitorias - qtdDerrotas)
                    + " e está no nível de Ferro");
        } else if ((qtdVitorias - qtdDerrotas) >= 11 && (qtdVitorias - qtdDerrotas) <= 20) {
            System.out.println("O Herói " + nome + " tem um saldo de " + (qtdVitorias - qtdDerrotas)
                    + " e está no nível de Bronze");

        } else if ((qtdVitorias - qtdDerrotas) >= 21 && (qtdVitorias - qtdDerrotas) <= 50) {
            System.out.println("O Herói " + nome + " tem um saldo de " + (qtdVitorias - qtdDerrotas)
                    + " e está no nível de Prata");

        } else if ((qtdVitorias - qtdDerrotas) >= 51 && (qtdVitorias - qtdDerrotas) <= 80) {
            System.out.println("O Herói " + nome + " tem um saldo de " + (qtdVitorias - qtdDerrotas)
                    + " e está no nível de Ouro");

        } else if ((qtdVitorias - qtdDerrotas) >= 81 && (qtdVitorias - qtdDerrotas) <= 90) {
            System.out.println("O Herói " + nome + " tem um saldo de " + (qtdVitorias - qtdDerrotas)
                    + " e está no nível de Diamante");

        } else if ((qtdVitorias - qtdDerrotas) >= 91 && (qtdVitorias - qtdDerrotas) <= 100) {
            System.out.println("O Herói " + nome + " tem um saldo de " + (qtdVitorias - qtdDerrotas)
                    + " e está no nível de Lendário");

        } else if ((qtdVitorias - qtdDerrotas) >= 101) {
            System.out.println("O Herói " + nome + " tem um saldo de " + (qtdVitorias - qtdDerrotas)
                    + " e está no nível de Imortal");

        }
    }
}
