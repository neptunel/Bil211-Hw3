

public class Ash  extends Tree{
    public Ash(String name,int age,String address){
        super(name,age,address);
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String newName) {
        name =newName;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String newAddress) {
        address=newAddress;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int newAge) {
        age=newAge;
    }

    @Override
    public int compareTo(Tree ashTree){
        if(this.age<ashTree.age){
            return -1;
        }
        else if(this.age>ashTree.age){
            return 1;
        }
        else if(this.age==ashTree.age){
            if(this.name.compareTo(ashTree.name)<0){
                return -1;
            }
            else if(this.name.compareTo(ashTree.name)>0) {
                return 1;
            }
            else if(this.name.compareTo(ashTree.name)==0){
               if(this.address.compareTo(ashTree.address)<0){
                   return -1;
               }
               else if(this.address.compareTo(ashTree.address)>0){
                   return 1;
               }
               else if(this.address.compareTo(ashTree.address)==0){
                   return 0;
               }

            }
            return 0;
        }
        return 0;
    }

    @Override
    public void printMessage() {
        System.out.println("This is an Ash tree named " +this.getName()+" !");
    }

    @Override
    public String toString() {
       String infos="Type: "+this.getClass().getSimpleName()+"\n"+"Name: "+getName()+"\n"+"Age: "+getAge()+"\n"+"Address: "+getAddress()+"\n";

        return infos;
    }
}
