public class Person {
private String name;
private String lastName;
private int age;
private String hobby;
private String gender;
private String education;

public Person(){
}

public Person(String name,String lastName,int age,String hobby,String gender,String education){
this.name=name;
this.lastName=lastName;
this.age=age;
this.hobby=hobby;
this.gender=gender;
this.education=education;

}
public void setName(String name){
this.name=name;
}
public String getName(){
return name;
}

public void setLastName(String lastName){
this.lastName=lastName;
}
public String getLastName(){
return lastName;
}

public void setAge(int age){
this.age=age;
}
public int Age(){
return age;
}
public void setHobby(String hobby){
this.hobby=hobby;
}
public String getHobby(){
return hobby;
}
public void setGender(String gender){
this.gender=gender;
}
public String getGender(){
return gender;
}
public void setEducation(String education){
this.education=education;
}
public String getEducation(){
return education;
}

@Override 
public String toString(){
	return "name: " + name + 
           "\nlastName: " + lastName + 
           "\nage: " + age +
           "\nhobby: " + hobby +
           "\ngender: " + gender +
           "\neducation: " + education;
} 
}