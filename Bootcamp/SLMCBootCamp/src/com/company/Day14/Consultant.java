package com.company.Day14;

import java.time.LocalDate;

public class Consultant extends Person{
    private LocalDate contStart, contEnd;
    public Consultant(int constId){
        super(constId);
    }

    public LocalDate getContStart() {
        return contStart;
    }

    public String toString(){
        return super.toString()+" Consultant from: "+contStart+" to "+contEnd;
    }

    public void setContStart(LocalDate contStart) {
        this.contStart = contStart;
    }

    public LocalDate getContEnd() {
        return contEnd;
    }

    public void setContEnd(LocalDate contEnd) {
        this.contEnd = contEnd;
    }
}
