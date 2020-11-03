package model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import entidad.Docente;
import util.MySqlDBConexion;

public class DocenteModel {
	
	private static final Log log = LogFactory.getLog(DocenteModel.class);
	
	
		public int insertaDocente (Docente obj){
			int salida = -1;
			
			Connection conn = null;
			PreparedStatement pstm = null;
			try {
				
				conn = MySqlDBConexion.getConexion();
				String sql ="insert into docente values(null,?,?,?,?,?)";
				pstm = conn.prepareStatement(sql);
				pstm.setString(1, obj.getNombre());
				pstm.setString(2, obj.getApellido());
				pstm.setString(3, obj.getSexo());
				pstm.setString(4, obj.getFechaNacimiento());
				pstm.setString(5, obj.getDni());
				log.info(pstm);
				//La variable contiene el número de registros en la BD
				salida = pstm.executeUpdate();
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally{
				try {
					if(pstm != null) pstm.close();
					if(conn != null) conn.close();
				} catch (Exception e2) {
				}
			}
			
			
			return salida;
		}
	}
