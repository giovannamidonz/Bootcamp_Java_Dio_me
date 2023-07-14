package EstruturaDados;

public class Pilha {
    private No2 refNo2EntradaPilha ;

    public Pilha(){
        this.refNo2EntradaPilha = null;
    }

    public void push(No2 novoNo){
        No2 refAuxiliar = refNo2EntradaPilha;
        refNo2EntradaPilha = novoNo;
        refNo2EntradaPilha.setReNO2(refAuxiliar);
    }

    public No2 pop(){
        if(!this.isEmpty()){
            No2 noPoped = refNo2EntradaPilha;
            refNo2EntradaPilha = refNo2EntradaPilha.getReNO2();
            return noPoped;
        }
            return null;
    }
    public No2 top(){
        return refNo2EntradaPilha;
        //exibe a referencia
    }
    public boolean isEmpty(){
        return refNo2EntradaPilha == null ? true : false;
    }

    @Override
    public String toString() {
        String apresentacao = "--------------------\n";
        apresentacao += "    Pilha\n";
        apresentacao += "----------------------\n";

        No2 noAuxiliar = refNo2EntradaPilha;
        
        while(true){
            if(noAuxiliar != null){
                apresentacao += "[NO{dado = " + noAuxiliar.getDados()+ "}]\n";
                noAuxiliar = noAuxiliar.getReNO2();
            }else{
                break;
            }
        }
        apresentacao += "=================\n";
        return apresentacao;
    }
}
