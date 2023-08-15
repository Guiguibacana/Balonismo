public class Main {

 public static void main(String[] args) {

 // Criando objetos para o exemplo

       Pessoas pessoa1 = new Pessoas();

        pessoa1.setNome("João");

         pessoa1.setCPF("123456789");
 // ... definir outros atributos para pessoa1





         Pessoas.Piloto piloto1 = new Piloto();

        piloto1.setNome("Carlos");

        piloto1.setCPF("987654321");

     // ... definir outros atributos para piloto1




          Balao balao1 = new Balao();

        balao1.setNumeroIdentificacao("B123");

        balao1.setRegistroRegularidade("ABC123");

        // ... definir outros atributos para balao1




        TermoCiencia termoCiencia1 = new TermoCiencia();

        termoCiencia1.setPessoa(pessoa1);




        VooBalao vooBalao1 = new VooBalao();

        vooBalao1.setPiloto(piloto1);

        vooBalao1.setBalao(balao1);

        vooBalao1.setTermoCiencia(termoCiencia1);

        vooBalao1.setValorVoo(300.00);




        // ...










[29/06 07:13] Vitoria Baldim de Oliveira




// Classe Cliente




        public class Cliente {

    private String nome;

    private int idade;

    private String endereco;

   

            // Construtor padrão

            public Cliente() {

    }

   

            // Construtor que solicita todos os dados

            public Cliente(String nome, int idade, String endereco) {

        this.nome = nome;

        this.idade = idade;

        this.endereco = endereco;

    }

   

            // Construtor personalizado

            public Cliente(String nome) {

        this.nome = nome;

        this.idade = 0;

        this.endereco = "";

    }

   

            // Getters e Setters

            public String getNome() {

        return nome;

    }

   

            public void setNome(String nome) {

        this.nome = nome;

    }

   

            public int getIdade() {

        return idade;

    }

   

            public void setIdade(int idade) {

        this.idade = idade;

    }

   

            public String getEndereco() {

        return endereco;

    }

   

            public void setEndereco(String endereco) {

        this.endereco = endereco;

    }

        }





// Classe Produto




        public class Produto {

    private String nome;

    private double preco;

    private int quantidade;

   

            // Construtor padrão

            public Produto() {

    }

   

            // Construtor que solicita todos os dados

            public Produto(String nome, double preco, int quantidade) {

        this.nome = nome;

        this.preco = preco;

        this.quantidade = quantidade;

    }

   

            // Construtor personalizado

            public Produto(String nome) {

        this.nome = nome;

        this.preco = 0.0;

        this.quantidade = 0;

    }

   

            // Getters e Setters

            public String getNome() {

        return nome;

    }

   

            public void setNome(String nome) {

        this.nome = nome;

    }

   

            public double getPreco() {

        return preco;

    }

   

            public void setPreco(double preco) {

        this.preco = preco;

    }

   

            public int getQuantidade() {

        return quantidade;

    }

   

            public void setQuantidade(int quantidade) {

        this.quantidade = quantidade;

    }

        }





// Classe Venda




import java.util.Date;




        public class Venda {

    private Cliente cliente;

    private Produto produto;

    private int quantidade;

    private Date data;

   

            // Construtor padrão

            public Venda() {

    }

   

            // Construtor que solicita todos os dados

            public Venda(Cliente cliente, Produto produto, int quantidade, Date data) {

        this.cliente = cliente;

        this.produto = produto;

        this.quantidade = quantidade;

        this.data = data;

    }

   

            // Construtor personalizado

            public Venda(Cliente cliente, Produto produto) {

        this.cliente = cliente;

        this.produto = produto;

        this.quantidade = 0;

        this.data = new Date();

    }

   

            // Getters e Setters

            public Cliente getCliente() {

        return cliente;

    }

   

            public void setCliente(Cliente cliente) {

        this.cliente = cliente;

    }

   

            public Produto getProduto() {

        return produto;

    }

   

            public void setProduto(Produto produto) {

        this.produto = produto;

    }

   

            public int getQuantidade() {

        return quantidade;

    }

   

            public void setQuantidade(int quantidade) {

        this.quantidade = quantidade





