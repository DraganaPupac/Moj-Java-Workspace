class Frog {
    private String name;
    private int age;
    private String color;
     
    public void setName(String name) {
        this.name = name;
    }
     
    public void setAge(int age) {
        this.age = age;
    }
     
    public String getName() {
        return name;
    }
     
    public int getAge() {
        return age;
    }
     
    public void setInfo(String name, int age, String color) {
        setName(name);
        setAge(age);
        setColor(color);
    }
	
	public void setColor(String color) {
		this.color = color;
		}
 
	public String getColor() {
    return color;
		}
}

	public class App {
 
    public static void main(String[] args) {
     
        Frog frog1 = new Frog();
         
        frog1.setName("Zabac Miko");
        frog1.setAge(2);
        frog1.setColor("crvena");
         
        System.out.println(frog1.getName());
        System.out.println(frog1.getAge());
        System.out.println(frog1.getColor());
        
        Frog frog2 = new Frog();
        
        frog2.setName("Krekece");
        
        System.out.println(frog2.getName());
    
    }
    
   
     
    }

 