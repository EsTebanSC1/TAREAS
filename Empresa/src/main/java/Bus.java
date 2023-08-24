class Bus {
    private String patente;
    private String marca;
    private int año;
    private double precio;

    public Bus(String patente, String marca, int año, double precio) {
        this.patente = patente;
        this.marca = marca;
        this.año = año;
        this.precio = precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getPatente() {
        return patente;
    }

    public double getPrecio() {
        return precio;
    }
}
