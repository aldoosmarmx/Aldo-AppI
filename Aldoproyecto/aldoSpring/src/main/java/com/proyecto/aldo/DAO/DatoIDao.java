package com.proyecto.aldo.DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import com.proyecto.aldo.entity.dato;
@Repository
public class DatoIDao  extends JdbcDaoSupport {

	@Autowired
    DataSource ds;
	@Autowired
    private JdbcTemplate jt;
	@PostConstruct
    private void initialize(){
        setDataSource(ds);
    }


	
	public ArrayList<dato> findALL() {
		ArrayList<dato> arrd=null;	
		List<Map<String, Object>> rst;
		dato d;
		rst = getJdbcTemplate().queryForList("select * from dato");
		if(!rst.isEmpty()) {
			arrd = new ArrayList();
			for(Map<String,Object> arrLin:rst) {
				d=  new dato();
				d.setId((Integer)arrLin.get("ID"));
				d.setEmi((Integer)arrLin.get("EMI"));
				d.setAnio((Integer)arrLin.get("ANIO"));
				arrd.add(d);
			}
		}
		       return arrd;
		
	}

}
