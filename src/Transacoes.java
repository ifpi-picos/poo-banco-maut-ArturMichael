import java.time.LocalDate;
import java.util.Date;

public class Transacoes {
    private double valor;
    private String tipo;
    private Date data;

    public Transacoes(String tipo, double valor) {
        this.valor = valor;
        this.tipo = tipo;
        this.data = new Date();
    }

    public double getValor() {
        return valor;
    }

    public String getTipo() {
        return tipo;
    }

    public Date getData() {
        return data;
    }
    
        public void setValor(double valor) {
            this.valor = valor;
        }
    
        public void setTipo(String tipo) {
            this.tipo = tipo;
        }
    
        public void setData(Date data) {
            this.data = data;
        }

    @Override
    public String toString() {
        return "Transacoes [data=" + data + ", tipo=" + tipo + ", valor=" + valor + "]";
    }




    
}
