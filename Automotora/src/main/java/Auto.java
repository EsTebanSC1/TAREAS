class Auto extends Vehiculo {
    private String puertas;
    private String patente;
    public Auto(String marca, String modelo,String puertas, String patente) {
        super(marca, modelo);
        this.puertas = puertas;
        this.patente = patente;
    }
}