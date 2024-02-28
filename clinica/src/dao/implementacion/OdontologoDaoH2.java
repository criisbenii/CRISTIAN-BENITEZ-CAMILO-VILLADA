package dao.implementacion;

import dao.BD;
import dao.IDao;
import model.Odontologo;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

public class OdontologoDaoH2 implements IDao<Odontologo> {

    private static final Logger LOGGER=Logger.getLogger(OdontologoDaoH2.class);
    private  static final String INSERT_ONDONTOLOGO="INSERT INTO ODONTOLOGO(NUM_MATRICULA,NOMBRE,APELLIDO) VALUES (?,?,?)";
    @Override
    public Odontologo guardar(Odontologo odontologo){
       LOGGER.info("Estamos guardando un odontologo");
        Connection connection=null;
        try{
            connection= BD.getConnection();
            PreparedStatement preparedStatement=connection.prepareStatement(INSERT_ONDONTOLOGO, Statement.RETURN_GENERATED_KEYS);
        }catch (Exception e){

        }
        return null;
    }
    @Override
    public List<Odontologo>listarTodos(){return null;}
}
