package RemoverEspaciosEnBlanco;

public class RemoverEspacios {
    public static void main(String[] args) {
        String texto = "    \tprueba del texto \t\n";
        System.out.println(texto);
        //para remover los espacion usamos el metodo trim: pero tambien usamos el metodo strip
        System.out.println(texto.strip());
        System.out.println(texto.trim());
    }
}
