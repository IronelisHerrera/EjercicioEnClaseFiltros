package EjercicioEnClases;

import static spark.Spark.port;
import static spark.Spark.staticFiles;

public class Main {
    public static void main(String[] args) {

        port(8080);
        staticFiles.location("/publico");

        new TemplateLoginControler().CogeForumularioUsuario();


    }
}