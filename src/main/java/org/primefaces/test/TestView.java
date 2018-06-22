package org.primefaces.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "testView")
@ViewScoped
public class TestView implements Serializable {
       
    private List<RecordParent> parents = new ArrayList<>();
    
    @PostConstruct  
    public void init() {
                
        List<Record> children1 = new ArrayList<>();
				     children1.add(new Record(1, "Mojarra"));
				     children1.add(new Record(2, "Myfaces"));
        
		List<Record> children2 = new ArrayList<>();
			         children2.add(new Record(3, "Eclipselink"));
			         children2.add(new Record(4, "Hibernate"));
			         
		RecordParent parent1 = new RecordParent(children1);
		RecordParent parent2 = new RecordParent(children2);
		
		parents.add(parent1);
		parents.add(parent2);
        
    }

	public List<RecordParent> getParents() {
		return parents;
	}

	public void setParents(List<RecordParent> parents) {
		this.parents = parents;
	}

   
	
}
