package bitcamp.java106.step07;

import java.beans.PropertyEditorSupport;
import java.sql.Date;

// 1) java.beans.PropertyEditorSupport를 상속받늗다.

public class CustomEngineEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
       String[] values = text.split(",");
       Engine engine = new Engine();
       engine.setMaker(values[0]);
       engine.setValve(Integer.parseInt(values[1]));
       engine.setCylinder(Integer.parseInt(values[2]));
       
       this.setValue(engine);
    }
    
}
