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
            private String numeroIdentificacao;
            private String registroRegularidade;
        }

        public class TermoCiencia {
            private Pessoa pessoa;

        }

        public class VooBalao {
            private Piloto piloto;
            private Balao balao;
            private TermoCiencia termoCiencia;
            private double valorVoo;




        } //calvo
    }


