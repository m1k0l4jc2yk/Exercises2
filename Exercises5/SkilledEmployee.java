import java.util.ArrayList;


public class SkilledEmployee extends Employee{
    public ArrayList skillList = new ArrayList();
    
    public void setSkill(String skill){
        skillList.add(skill);
    }
    
    public ArrayList getSkills(){
        return skillList;
    }

     public void print(){   
    //public void displayInformation(){
        super.print();
        System.out.println("Employee has the following skills: ");
        for(Object obj : skillList){
            System.out.println("\t"+ obj);
        }
    }

}
