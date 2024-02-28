import dao.BD;
import model.Odontologo;
import service.OdontologoService;


public class Main {
    public static void main(String[] args) {
        BD.crearTabla();

        Odontologo odontologo = new Odontologo(123,"Pepito", "Rodriguez");


        OdontologoService ontologoService = new OdontologoService();

        ontologoService.guardar(odontologo);


        System.out.println("Este el sout: " + odontologo );

        ontologoService.listarTodos();
    }
}