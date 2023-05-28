/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serenty.clases;

/**
 *
 * @author Sebastián Dosman
 */
public class ConsultasDB {
    public static final String SELECT_ROLUSUARIO_CORREO_CONTRASENA = "SELECT ROL_USUARIO FROM USUARIO WHERE CORREO_USUARIO='%s' AND CONTRASENA_USUARIO='%s'";
    public static final String SELECT_IDUSUARIO_CORREO_CONTRASENA = "SELECT ID_USUARIO FROM USUARIO WHERE CORREO_USUARIO='%s' AND CONTRASENA_USUARIO='%s'";
    public static final String SELECT_TESTPRESENTADO_IDUSUARIO = "SELECT TEST_PRESENTADO FROM PACIENTE WHERE ID_USUARIO='%s'";
    public static final String SELECT_ANSIEDADPACIENTE_IDUSUARIO = "SELECT ANSIEDAD_PACIENTE FROM PACIENTE WHERE ID_USUARIO='%s'";
    public static final String SELECT_CONTRASENAUSUARIO_CORREO = "SELECT CONTRASENA_USUARIO FROM USUARIO WHERE CORREO_USUARIO='%s'";   
    public static final String SELECT_IDPACIENTE_IDUSUARIO = "SELECT ID_PACIENTE FROM PACIENTE WHERE ID_USUARIO='%s'";
    public static final String SELECT_IDPACIENTE_NOMBRE = "SELECT ID_PACIENTE FROM PACIENTE WHERE NOMBRE_PACIENTE='%s' AND APELLIDO_PACIENTE='%s'";
    public static final String SELECT_PACIENTE_IDPACIENTE = "SELECT NOMBRE_PACIENTE, APELLIDO_PACIENTE FROM PACIENTE WHERE ID_PACIENTE='%s'";
    public static final String SELECT_IDPSICOLOGO_IDUSUARIO = "SELECT ID_PSICOLOGO FROM PSICOLOGO WHERE ID_USUARIO='%s'";
    public static final String SELECT_IDPSICOLOGO_NOMBRE = "SELECT ID_PSICOLOGO FROM PSICOLOGO WHERE NOMBRE_PSICOLOGO='%s' AND APELLIDO_PSICOLOGO='%s'";
    public static final String SELECT_CITA_IDPACIENTE = "SELECT c.ID_CITA, p.NOMBRE_PSICOLOGO, p.APELLIDO_PSICOLOGO, c.FECHA_CITA, c.HORA_CITA, c.MODALIDAD_CITA, c.DIRECCION_CITA, c.ESTADO_CITA " +
                                                        "FROM CITA c " +
                                                        "INNER JOIN CITA_USUARIO cu ON c.ID_CITA=cu.ID_CITA " +
                                                        "INNER JOIN PSICOLOGO p ON cu.ID_PSICOLOGO=p.ID_PSICOLOGO " +
                                                        "WHERE cu.ID_PACIENTE='%s' " +
                                                        "AND c.ESTADO_CITA!='Cancelada' " +
                                                        "AND c.ESTADO_CITA!='Finalizada'";
    public static final String SELECT_CITA_IDPACIENTE_DOS = "SELECT c.ID_CITA, p.NOMBRE_PSICOLOGO, c.FECHA_CITA, c.HORA_CITA, c.MODALIDAD_CITA, c.DIRECCION_CITA, c.DESCRIPCION_CITA, c.ESTADO_CITA " +
                                                        "FROM CITA c " +
                                                        "INNER JOIN CITA_USUARIO cu ON c.ID_CITA=cu.ID_CITA " +
                                                        "INNER JOIN PSICOLOGO p ON cu.ID_PSICOLOGO=p.ID_PSICOLOGO " +
                                                        "WHERE cu.ID_PACIENTE='%s' " +
                                                        "AND (c.ESTADO_CITA='Cancelada' OR c.ESTADO_CITA='Reagendada')";
    public static final String SELECT_CITA_IDPACIENTE_TRES = "SELECT c.ID_CITA, p.NOMBRE_PSICOLOGO, c.FECHA_CITA, c.HORA_CITA, c.MODALIDAD_CITA, c.DIRECCION_CITA, c.ESTADO_CITA " +
                                                        "FROM CITA c " +
                                                        "INNER JOIN CITA_USUARIO cu ON c.ID_CITA=cu.ID_CITA " +
                                                        "INNER JOIN PSICOLOGO p ON cu.ID_PSICOLOGO=p.ID_PSICOLOGO " +
                                                        "WHERE cu.ID_PACIENTE='%s' " +
                                                        "AND (c.ESTADO_CITA='Finalizada')";
    public static final String SELECT_PSICOLOGO_IDPSICOLOGO = "SELECT TIPOID_PSICOLOGO, NOMBRE_PSICOLOGO, APELLIDO_PSICOLOGO FROM PSICOLOGO WHERE ID_PSICOLOGO='%s'";
    public static final String SELECT_CITA_IDPSICOLOGO = "SELECT c.ID_CITA, p.NOMBRE_PACIENTE, p.APELLIDO_PACIENTE, c.FECHA_CITA, c.HORA_CITA, c.MODALIDAD_CITA, c.DIRECCION_CITA, c.ESTADO_CITA " +
                                                        "FROM CITA c " +
                                                        "INNER JOIN CITA_USUARIO cu ON c.ID_CITA=cu.ID_CITA " +
                                                        "INNER JOIN PACIENTE p ON cu.ID_PACIENTE=p.ID_PACIENTE " +
                                                        "WHERE cu.ID_PSICOLOGO='%s' " +
                                                        "AND c.ESTADO_CITA!='Cancelada' " +
                                                        "AND c.ESTADO_CITA!='Finalizada'";
    public static final String SELECT_CITA_IDPSICOLOGO_DOS = "SELECT c.ID_CITA, p.NOMBRE_PACIENTE, c.FECHA_CITA, c.HORA_CITA, c.MODALIDAD_CITA, c.DIRECCION_CITA, c.DESCRIPCION_CITA, c.ESTADO_CITA " +
                                                        "FROM CITA c " +
                                                        "INNER JOIN CITA_USUARIO cu ON c.ID_CITA=cu.ID_CITA " +
                                                        "INNER JOIN PACIENTE p ON cu.ID_PACIENTE=p.ID_PACIENTE " +
                                                        "WHERE cu.ID_PSICOLOGO='%s' " +
                                                        "AND (c.ESTADO_CITA='Cancelada' OR c.ESTADO_CITA='Reagendada')";
    public static final String SELECT_CITA_IDPSICOLOGO_TRES = "SELECT c.ID_CITA, p.NOMBRE_PACIENTE, c.FECHA_CITA, c.HORA_CITA, c.MODALIDAD_CITA, c.DIRECCION_CITA, c.ESTADO_CITA " +
                                                        "FROM CITA c " +
                                                        "INNER JOIN CITA_USUARIO cu ON c.ID_CITA=cu.ID_CITA " +
                                                        "INNER JOIN PACIENTE p ON cu.ID_PACIENTE=p.ID_PACIENTE " +
                                                        "WHERE cu.ID_PSICOLOGO='%s' " +
                                                        "AND (c.ESTADO_CITA='Finalizada')";
    
    public static final String SELECT_ALL_PSICOLOGO = "SELECT * FROM PSICOLOGO";
    
    public static final String SELECT_SOME_PACIENTE = "SELECT NOMBRE_PACIENTE, APELLIDO_PACIENTE, ANSIEDAD_PACIENTE FROM PACIENTE";
    public static final String SELECT_SOME_PACIENTE_DOS = "SELECT ID_PACIENTE, TIPOID_PACIENTE, NOMBRE_PACIENTE, APELLIDO_PACIENTE, TELEFONO_PACIENTE, GENERO_PACIENTE, FECHANAC_PACIENTE, ANSIEDAD_PACIENTE FROM PACIENTE";
    public static final String SELECT_SOME_PACIENTE_TRES = "SELECT NOMBRE_PACIENTE, APELLIDO_PACIENTE, ANSIEDAD_PACIENTE FROM PACIENTE";
    public static final String SELECT_SOME_PSICOLOGO = "SELECT NOMBRE_PSICOLOGO, APELLIDO_PSICOLOGO FROM PSICOLOGO";
    public static final String SELECT_SOME_PSICOLOGO_DOS = "SELECT ID_PSICOLOGO, TIPOID_PSICOLOGO, NOMBRE_PSICOLOGO, APELLIDO_PSICOLOGO, TELEFONO_PSICOLOGO, GENERO_PSICOLOGO, TIPOENT_PSICOLOGO, ESPECIALIDAD_PSICOLOGO FROM PSICOLOGO";
    
    public static final String INSERT_INTO_USUARIO = "INSERT INTO USUARIO(CORREO_USUARIO, CONTRASENA_USUARIO, ROL_USUARIO) VALUES('%s', '%s', '%s')";
    public static final String INSERT_INTO_PACIENTE = "INSERT INTO PACIENTE(ID_PACIENTE, TIPOID_PACIENTE, NOMBRE_PACIENTE, APELLIDO_PACIENTE, TELEFONO_PACIENTE, GENERO_PACIENTE, FECHANAC_PACIENTE, TEST_PRESENTADO, ID_USUARIO) "
                                                    + "VALUES('%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', LAST_INSERT_ID())";
    public static final String INSERT_INTO_PSICOLOGO = "INSERT INTO PSICOLOGO(ID_PSICOLOGO, TIPOID_PSICOLOGO, NOMBRE_PSICOLOGO, APELLIDO_PSICOLOGO, TELEFONO_PSICOLOGO, GENERO_PSICOLOGO, TIPOENT_PSICOLOGO, ESPECIALIDAD_PSICOLOGO, FECHANAC_PSICOLOGO, ID_USUARIO) "
                                                    + "values('%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', LAST_INSERT_ID())";
    public static final String INSERT_INTO_CITA = "INSERT INTO CITA(FECHA_CITA, HORA_CITA, MODALIDAD_CITA, DIRECCION_CITA, ESTADO_CITA) "
                                                    + "VALUES('%s', '%s', '%s', '%s', '%s')";
    public static final String INSERT_INTO_CITAUSUARIO = "INSERT INTO CITA_USUARIO(ID_CITA, ID_PACIENTE, ID_PSICOLOGO) "
                                                    + "VALUES(LAST_INSERT_ID(), '%s', '%s')";
    
    public static final String UPDATE_TESTPRESENTADO_IDUSUARIO = "UPDATE PACIENTE SET TEST_PRESENTADO='%s' WHERE ID_USUARIO='%s'";
    public static final String UPDATE_ANSIEDAD_IDUSUARIO = "UPDATE PACIENTE SET ANSIEDAD_PACIENTE='%s' WHERE ID_USUARIO='%s'";
    public static final String UPDATE_CITA_IDCITA = "UPDATE CITA SET DESCRIPCION_CITA='%s', ESTADO_CITA='Cancelada' WHERE ID_CITA='%s'";
    public static final String UPDATE_CITA_IDCITA_DOS = "UPDATE CITA SET FECHA_CITA='%s', MODALIDAD_CITA='%s', HORA_CITA='%s', DIRECCION_CITA='%s', DESCRIPCION_CITA='%s', ESTADO_CITA='%s' WHERE ID_CITA='%s'";
    public static final String UPDATE_PSICOLOGO_IDPSICOLOGO = "UPDATE PSICOLOGO SET TIPOENT_PSICOLOGO='%s', TELEFONO_PSICOLOGO='%s', ESPECIALIDAD_PSICOLOGO='%s' WHERE ID_PSICOLOGO='%s'";
    public static final String UPDATE_PACIENTE_IDPACIENTE = "UPDATE PACIENTE SET TIPOID_PACIENTE='%s', TELEFONO_PACIENTE='%s' WHERE ID_PACIENTE='%s'";
}
