package com.ayowole.observer;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

class NewsBuilder {
    
    private News tiding;
    
    private Set<ActionAfterCreateTiding> actionsAfterCreateTiding;
    
    public NewsBuilder() {
        tiding = new News();
        actionsAfterCreateTiding = new HashSet<>();
    }
    
    public NewsBuilder addTitle(String title) {
        tiding.setTitle(title);
        
        return this;
    }
    
    public NewsBuilder addDescription(String description) {
        tiding.setDescription(description);
        
        return this;
    }
    
    public NewsBuilder addActionAfterCreateTiding(ActionAfterCreateTiding action) {
        actionsAfterCreateTiding.add(action);
        
        return this;
    }
    
    private void addCreationDate() {
        tiding.setCreationDate(LocalDateTime.now());
    }
    
    public News build() {
        addCreationDate();
        
        actionsAfterCreateTiding.forEach( (action) -> action.execute(tiding) );
        
        return tiding;
    }
}
