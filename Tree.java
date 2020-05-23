
public abstract class Tree implements Comparable<Tree>  {
    public String name;
    public String address;
    public int age;
    public Tree(String name,int age,String address){
        this.setName(name);
        this.setAge(age);
        this.setAddress(address);
    }

    public abstract String getName();
    public abstract void setName(String newName);
    public abstract String getAddress();
    public abstract void setAddress(String newAddress);
    public abstract int getAge();
    public abstract void setAge(int newAge);
    public abstract int compareTo(Tree t);
    public abstract void printMessage();
    public abstract String toString();


}
