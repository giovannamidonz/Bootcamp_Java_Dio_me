package EstruturaDados;

public class No2 {
        private int dados;
        private No2 reNO = null;

        public No2(){

        }
        public No2(int dados) {
            this.dados = dados;
        }

        public int getDados() {
            return dados;
        }

        public void setDados(int dados) {
            this.dados = dados;
        }

        public No2 getReNO2() {
            return reNO;
        }

        public void setReNO2(No2 reNO2) {
            this.reNO = reNO2;
        }

        @Override
        public String toString() {
            return "dados=" + dados ;
        }
}


