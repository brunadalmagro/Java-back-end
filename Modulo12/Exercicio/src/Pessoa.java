public abstract class Pessoa {
    private String situacao;
    private String nomeCompleto;
    private Double ValorTotalDevido;
    private String TipoCredito;
    private Double UtilizacaoCredito;

    public Double getUtilizacaoCredito() {
        return UtilizacaoCredito;
    }

    public void setUtilizacaoCredito(Double utilizacaoCredito) {
        UtilizacaoCredito = utilizacaoCredito;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public Double getValorTotalDevido() {
        return ValorTotalDevido;
    }

    public void setValorTotalDevido(Double valorTotalDevido) {
        ValorTotalDevido = valorTotalDevido;
    }

    public String getTipoCredito() {
        return TipoCredito;
    }

    public void setTipoCredito(String tipoCredito) {
        TipoCredito = tipoCredito;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

}

