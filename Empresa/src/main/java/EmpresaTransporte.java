import java.util.ArrayList;
import java.util.List;
class EmpresaTransporte {
    private List<Bus> buses;

    public EmpresaTransporte(List<Bus> buses) {
        this.buses = new ArrayList<>();
    }

    public void agregarBus(Bus bus) {
        buses.add(bus);
        System.out.println("Se ha agregado un nuevo bus.");
    }

    public List<Bus> buscarBusesPorValor(double valor) {
        List<Bus> busesEncontrados = new ArrayList<>();
        for (Bus bus : buses) {
            if (bus.getPrecio() == valor) {
                busesEncontrados.add(bus);
            }
        }
        return busesEncontrados;
    }

    public void eliminarBus(String patente) {
        for (int i = 0; i < buses.size(); i++) {
            if (buses.get(i).getPatente().equals(patente)) {
                buses.remove(i);
                System.out.println("Se ha eliminado el bus con patente: " + patente);
                return;
            }
        }
        System.out.println("No se encontró un bus con la patente proporcionada.");
    }

    public void comprarBus(Bus bus) {
        buses.add(bus);
        System.out.println("Se ha comprado un nuevo bus.");
    }

    public void venderBus(String patente) {
        for (int i = 0; i < buses.size(); i++) {
            if (buses.get(i).getPatente().equals(patente)) {
                buses.remove(i);
                System.out.println("Se ha vendido el bus con patente: " + patente);
                return;
            }
        }
        System.out.println("No se encontró un bus con la patente proporcionada.");
    }
}

