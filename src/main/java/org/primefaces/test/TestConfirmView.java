package org.primefaces.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "testConfirmView")
@ViewScoped
public class TestConfirmView implements Serializable {
     
	private static final long serialVersionUID = 1L;
	
	private Record selRow;
    private List<Record> rows;
    
    @PostConstruct  
    public void init() {
    	rows = new ArrayList<>();        
    	
        rows.add(new Record(1, "Mojarra"));
        rows.add(new Record(2, "Myfaces"));
		rows.add(new Record(3, "Eclipselink"));
		rows.add(new Record(4, "Hibernate"));
		rows.add(new Record(5, "Spring"));        
		rows.add(new Record(6, "Primefaces"));        
    }

	public Record getSelRow() {
		return selRow;
	}

	public void setSelRow(Record selRow) {
		this.selRow = selRow;
	}

	public List<Record> getRows() {
		return rows;
	}

	public void setRows(List<Record> rows) {
		this.rows = rows;
	}
    
    
   
	
}
