import java.time.LocalDate;

public class Transacoes {
    private double valor;
    private String tipo;
    private LocalDate data;

    public Transacoes(LocalDate localDate, double valor2, String tipo2) {
        this.valor = valor;
        this.tipo = tipo;
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public String getTipo() {
        return tipo;
    }

    public LocalDate getData() {
        return data;
    }
    
        public void setValor(double valor) {
            this.valor = valor;
        }
    
        public void setTipo(String tipo) {
            this.tipo = tipo;
        }
    
        public void setData(LocalDate data) {
            this.data = data;
        }

    @Override
    public String toString() {
        return "Transacoes [data=" + data + ", tipo=" + tipo + ", valor=" + valor + "]";
    }




    
}
