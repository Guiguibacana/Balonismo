    public class Pessoas {

        public class Pessoa {

            String nome;
            String CPF;
            String RG;
            String telefone;
            String telefoneContatoEmergencias;
            String endereco;
        }

        public class Piloto {
            String nome;
            String CPF;
            String numeroRegistroANAC;
        }

        public class Balao {
            public String numeroIdentificacao;
            public String registroRegularidade;
        }

        public class TermoCiencia {
            public Pessoa pessoa;

        }

        public class VooBalao {
            public Piloto piloto;
            public Balao balao;
            public TermoCiencia termoCiencia;
            public double valorVoo;
        }
    }


