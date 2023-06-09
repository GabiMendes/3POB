package br.edu.faeterj;

public class Reserva {

    private int id;
    public int idQuarto;
    public int idCama;
    public int idCliente;
    public String dataEntrada;
    public String dataSaida;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getIdQuarto() {
        return idQuarto;
    }
    public void setIdQuarto(int idQuarto) {
        this.idQuarto = idQuarto;
    }
    public int getIdCama() {
        return idCama;
    }
    public void setIdCama(int idCama) {
        this.idCama = idCama;
    }
    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public String getDataEntrada() {
        return dataEntrada;
    }
    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
    public String getDataSaida() {
        return dataSaida;
    }
    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Reserva(int id, int idQua) {

    }

    public Reserva(int id, int idQuarto, int idCama, int idCliente, String dataEntrada, String dataSaida)
    {
        this.id = id;
        this.idQuarto = idQuarto;
        this.idCama = idCama;
        this.idCliente = idCliente;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    //Trabalhar nos detalhes abaixo
    public String detReserva() {
        String result = "ID: " + id +
                ", ID do Quarto: " + Quarto.getId() +
                ", ID da Cama: " + Cama.getId() +
                ", ID do Cliente: " + Cliente.getId() +
                ", Data de Entrada: " + dataEntrada +
                ", Data de Saída: " + dataSaida;
    }
}
