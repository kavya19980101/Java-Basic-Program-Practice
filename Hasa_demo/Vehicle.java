package Hasa_demo;

public class Vehicle {
    private int id;
    private String model;


    public String Show() {
        return "Vehicle{" +
                "id=" + id +
                ", model='" + model + '\'' +
                '}';
    }

    Vehicle(int id, String model)
    {
        this.id=id;
        this.model=model;
    }


   public void getid()
    {
        this.id=id;
    }

        public int Set_id(int id)
    {
        return id;
    }

    public void get_model()
    {
        this.model=model;
    }


        public String set_Model(String model) {
        return model;
    }
}
