package model_entities;

import java.io.Serializable;
import java.util.Date;

public class Seller implements Serializable{
    private String nome;
    private Integer id;
    private String email;
    private Date BirthDate;
    private Double BaseSalary;

    private static final long serialVersionUID  = 1L;

    private Department department;


    public Seller() {
    }


    public Seller(String nome, Integer id, String email, Date birthDate, Double baseSalary, Department department) {
        this.nome = nome;
        this.id = id;
        this.email = email;
        BirthDate = birthDate;
        BaseSalary = baseSalary;
        this.department = department;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }


    @Override
    public String toString() {
        return "Seller [nome=" + nome + ", id=" + id + ", email=" + email + ", BirthDate=" + BirthDate + ", BaseSalary="
                + BaseSalary + ", department=" + department + "]";
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Seller other = (Seller) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }


    public Department getDepartment() {
        return department;
    }


    public void setDepartment(Department department) {
        this.department = department;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public Date getBirthDate() {
        return BirthDate;
    }


    public void setBirthDate(Date birthDate) {
        BirthDate = birthDate;
    }


    public Double getBaseSalary() {
        return BaseSalary;
    }


    public void setBaseSalary(Double baseSalary) {
        BaseSalary = baseSalary;
    }


    
}


