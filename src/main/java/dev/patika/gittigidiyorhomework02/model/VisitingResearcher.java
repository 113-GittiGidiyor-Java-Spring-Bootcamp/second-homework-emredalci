package dev.patika.gittigidiyorhomework02.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class VisitingResearcher extends Instructor{

    //instance variables
    @Column(name = "hourly_salary")
    private double hourlySalary;

    //constructor


    public VisitingResearcher(String name, String address, String phoneNumber, double hourlySalary) {
        super(name, address, phoneNumber);
        this.hourlySalary = hourlySalary;
    }

    public VisitingResearcher() {
    }

    // getters & setters

    public double getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    //equals & hashCode & toString

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        VisitingResearcher that = (VisitingResearcher) o;
        return Double.compare(that.hourlySalary, hourlySalary) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hourlySalary);
    }

    @Override
    public String toString() {
        return "VisitingResearcher{" +
                "hourlySalary=" + hourlySalary +
                '}';
    }

}
