
public class Editor extends SkilledEmployee {
    private boolean prefersPaperEditing;
    
    public void setPrefersPaperEditing(boolean pref){
        prefersPaperEditing = true;
    }
    
    public String getEditingPreference(){
        if(prefersPaperEditing = true){
            return "Paper";
        }
        else {
            return "Electronic";
        }
    }

    public void print(){
        super.print();
        System.out.println("Editing preference: " + this.getEditingPreference());
    }
}
