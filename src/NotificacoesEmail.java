public class NotificacoesEmail implements Notificacoes {
   
    @Override
    public void enviaNotificacoes(String tipo, double valor) {

        System.out.println("enviando notificacao por email, " + tipo + ", Valor: " + valor);
    }
    
}
