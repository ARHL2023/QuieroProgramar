package _146_Enum;

//AL CREAR DONDE DICES CLASS... ELEGIR ENUM
public enum Color {

    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    NARANJO("Naranjo");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

}//ENUM
