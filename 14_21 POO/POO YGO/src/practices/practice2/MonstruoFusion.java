package practices.practice2;

public class MonstruoFusion extends Monstruo {

    //ATRIBUTOS
    private String material1;
    private String material2;


    //CONSTRUCTOR
    public MonstruoFusion() {
    }

    public MonstruoFusion(String nombre, int ataque, int defensa, int nivel, String material1, String material2) {
        super(nombre, ataque, defensa, nivel);
        this.material1 = material1;
        this.material2 = material2;
    }

    //METODOS
    @Override
    public String mostrarInformacion() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.mostrarInformacion());
        sb.append("\nMaterial 1: " + getMaterial1());
        sb.append("\nMaterial 2: " + getMaterial2());
        return sb.toString();
    }

    public void realizarFusion(){
        System.out.println("Fusiono a "+getMaterial1()+" y mi "+ getMaterial2()+" para crear a "+getNombre());
    }


    //GET AND SET
    public String getMaterial1() {
        return material1;
    }

    public void setMaterial1(String material1) {
        this.material1 = material1;
    }

    public String getMaterial2() {
        return material2;
    }

    public void setMaterial2(String material2) {
        this.material2 = material2;
    }


}
