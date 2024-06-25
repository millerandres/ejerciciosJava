package DeclaracionUsoDeArreglos;

public class UsoDeArreglos {
    public static void main(String[] args) {

        String [] meses =
                {
                "Enero","Febrero","Marzo","Abril",
                "Mayo","junio","julio","Agosto","Septiembre",
                "Octubre","Noviembre","Diciembre"
                };

        String[] mesesAño = new String[12];
        mesesAño[0]="Enero";
        mesesAño[1]="Febrero";
        mesesAño[2]="Marzo";
        mesesAño[3]="Abril";
        mesesAño[4]="Mayo";
        mesesAño[5]="junio";
        mesesAño[6]="julio";
        mesesAño[7]="Agosto";
        mesesAño[8]="Septiembre";
        mesesAño[9]="Octubre";
        mesesAño[10]="Noviembre";
        mesesAño[11]="Diciembre";

        System.out.println(meses[4]);

        for (int i =0; i<mesesAño.length;i++){
            String mes = mesesAño[i];
            System.out.println("El mes N°: "+(i+1)+ " es "+mes);
        }

        //creando un arreglo con objetos personalizados
        Celular[] cel = new Celular[3];

        cel[0] = new Celular("Huawey",6);
        cel[1] = new Celular("Lg",4);
        cel[2] = new Celular("Motorola",2);

        System.out.println("\n celulares y capacidades de memoria");
        for(Celular celular: cel){
            System.out.println("Marca: "+celular.getMarca()+" "+"Ram "+celular.getRam());
        }
    }
}

class Celular{
    private String Marca;
    private int ram;

    public Celular(String marca, int ram) {
        Marca = marca;
        this.ram = ram;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}