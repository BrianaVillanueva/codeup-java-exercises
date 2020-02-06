package movies;

//create a class named Movie//
public class movie {
    private String name;  //it should have private fields for name and category//
    private String category;

    //and a constructor that sets both of these//
    public movie(String name, String category){
        this.name = name; //you are setting
        this.category = category;// both here//
    }

    //create methods to access these properties and change them to getters/setters//
    public String getName() {
        return name;
    }

    public void setName(String name){ //parameter is: //
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
