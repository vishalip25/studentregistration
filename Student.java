package jbr.springmvc.model;

public class Student {

  private String Name;
  private String Email;
  private String Age;
  private String dept;
  private String year;
 

  public String getName() {
    return name;
  }

  public void setName(String Name) {
    System.out.println("Name: " + name);
    this.name = name;
  }

  public String getEmail() {
    return Email;
  }

  public void setEmail(String Email) {
    this.Email = Email;
  }

  public String getYear() {
    return year;
  }

  public void setYear(String year) {

    this.year = year;
  }

  public String getDept() {
    return dept;
  }

  public void setdept(String dept) {
    
    this.dept = dept;
  }

  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }

 
}
