public class NotificacoesSMS implements Notificacoes {
    
    @Override
    public void enviaNotificacoes(String tipo, double valor) {

        System.out.println("enviando notificacao por SMS, "+ tipo + ", Valor: "+ valor);
    }

    
    
}
