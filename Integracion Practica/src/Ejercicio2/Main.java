package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Continente America = new Continente();

        Ciudad CABA = new Ciudad(true,"CABA");
        Ciudad GodoyCruz = new Ciudad(false,"Godoy Cruz");
        Ciudad SanRafael = new Ciudad(false, "San Rafael");
        Ciudad Malargue = new Ciudad(false, "Malargue");

        Provincia Mendoza = new Provincia("Mendoza");
        Provincia SanLuis = new Provincia("San Luis");
        Provincia BuenosAires = new Provincia("Buenos Aires");

        Pais Argentina = new Pais("Ciudad Autonoma de Buenos Aires","Argentina");

        Ciudad SantiagoChile = new Ciudad(true,"Santiago de Chile");
        Provincia AreaMetropolitanaChile  = new Provincia("Area Metropolitana de Chile");
        Pais Chile = new Pais("Santiago de Chile","Chile");

        Mendoza.agregarCiudades(GodoyCruz);
        Mendoza.agregarCiudades(SanRafael);
        Mendoza.agregarCiudades(Malargue);
        Mendoza.agregarProvincias_limitrofes(SanLuis);

        BuenosAires.agregarCiudades(CABA);

        Argentina.agregarProvincias(Mendoza);
        Argentina.agregarProvincias(SanLuis);
        Argentina.agregarProvincias(BuenosAires);

        America.agregarPaises(Argentina);

        AreaMetropolitanaChile.agregarCiudades(SantiagoChile);
        Chile.agregarProvincias(AreaMetropolitanaChile);

        America.agregarPaises(Chile);

        Argentina.agregarPaises_limitrofes(Chile);
        Argentina.agregarProvincias_limitrofes(AreaMetropolitanaChile);
        Chile.agregarProvincias_limitrofes(Mendoza);
        Chile.agregarPaises_limitrofes(Argentina);

        System.out.println("Ciudades de Mendoza: " + Mendoza.getCiudades());
        System.out.println("Provincias limítrofes de Mendoza: " + Mendoza.getProvincias_limitrofes());
        System.out.println("Capital de Argentina: " + Argentina.getCapital());
        System.out.println("Provincias de Argentina: " + Argentina.getProvincias());
        System.out.println("Provincias limítrofes de Argentina: " + Argentina.getProvincias_limitrofes());
        System.out.println("Países limítrofes de Argentina: " + Argentina.getPaises_limitrofes());
        System.out.println("Países de América: " + America.getPaises());

    }
}
