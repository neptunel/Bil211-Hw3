
public class Oak extends Tree {
    public Oak(String name,int age,String address){
        super(name,age,address);
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String newName) {
        name=newName;
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
        age= newAge;
    }

    @Override
    public int compareTo(Tree oakTree) {
        if(this.name.compareTo(oakTree.name)!=0) {
            return this.name.compareTo(oakTree.name);
        }
        else {
            if(this.age>oakTree.age) {
                return 1;
            }
            else if(this.age<oakTree.age){
                return -1;
            }
            else if(this.age==oakTree.age){
                if(this.address.compareTo(oakTree.address)!=0)
                    return this.address.compareTo(oakTree.address);
                else
                    return 0;
            }

        }
        return 0;
    }

    @Override
    public void printMessage() {
        System.out.println("This is an Oak tree named "+this.getName()+" !");
    }

    @Override
    public String toString() {
        String infos="Type: "+this.getClass().getSimpleName()+"\n"+"Name: "+getName()+"\n"+"Age: "+getAge()+"\n"+"Address: "+getAddress()+"\n";

        return infos;
    }
}
