

public class Test {
    //Verilen Tree arrayini baştan sona gezer ve ağaçların mesajlarını printMessage() metodu ile ekrana basar.
    public static void printAllMessages(Tree[] trees){
       for (int i=0;i<trees.length;i++)
           trees[i].printMessage();
    }
    //Verilen Tree arrayini küçükten büyüğe sıralar.
    //Aynı tip ağaçlar için verilen compareTo metotlarını kullanır.
    // Farklı iki tip ağaç arasında her zaman Linden < Ash < Oak sıralaması gözetilir.
    public static void sort(Tree[] trees){
        Tree holder;
        for(int i=0;i<trees.length;i++) {
            for(int j=0;j<trees.length-1;j++) {
                if(trees[j].getClass().equals(trees[j+1].getClass())) {
                    int control = trees[j].compareTo(trees[j+1]);
                    if(control > 0) {
                        holder = trees[j];
                        trees[j] = trees[j+1];
                        trees[j+1] = holder;
                    }
                }
                else {
                    if(trees[j+1] instanceof Linden) {
                        holder = trees[j];
                        trees[j] = trees[j+1];
                        trees[j+1] = holder;
                    }
                    else if(trees[j] instanceof Oak) {
                        if(trees[j+1] instanceof Ash) {
                            holder = trees[j];
                            trees[j] = trees[j+1];
                            trees[j+1] = holder;
                        }
                    }
                }
            }
        }


    }
    //Verilen Tree arrayini baştan sona gezer ve ağaçları ekrana toString() metodları ile basar.
    public static void printAll(Tree[] tree){
        for (int i=0;i<tree.length;i++)
            System.out.println(tree[i].toString());
    }

    public static void main(String[] args) {
        Ash[] ashTrees = new Ash[4];
        Ash ash1 = new Ash("Sorbus americana", 15, "172 West 107 Street");
        Ash ash2 = new Ash("Fraxinus quadrangulata", 25, "105 Water Street");
        Ash ash3 = new Ash("Sorbus hybrida", 25, "86-11 34 Avenue");
        Ash ash4 = new Ash("Sorbus americana", 15, "172 East 107 Street");
        ashTrees[0]=ash1;
        ashTrees[1]=ash2;
        ashTrees[2]=ash3;
        ashTrees[3]=ash4;
        printAll(ashTrees);
        System.out.println("***");
        printAllMessages(ashTrees);
        System.out.println("***");
        sort(ashTrees);
        printAll(ashTrees);
        System.out.println("***");
        Oak[] oaks = new Oak[5];
        Oak oak1 = new Oak("Quercus velutina",120, "203 Avenue A");
        Oak oak2 = new Oak("Quercus marilandica",5, "515 Grand Street");
        Oak oak3 = new Oak("Quercus robur",74, "123 West Street");
        Oak oak4 = new Oak("Quercus robur",15, "123 Water Street");
        Oak oak5 = new Oak("Quercus marilandica",5, "515 East Street");
        oaks[0] = oak1;
        oaks[1] = oak2;
        oaks[2] = oak3;
        oaks[3] = oak4;
        oaks[4] = oak5;
        printAll(oaks);
        System.out.println("***");
        printAllMessages(oaks);
        System.out.println("***");
        sort(oaks);
        printAll(oaks);
        System.out.println("***");
        Linden[] lindens = new Linden[4];
        Linden linden1= new Linden("Tilia x europaea",10,"Mc Graw Avenue");
        Linden linden2= new Linden("Tilia x europaea",15,"Mc Graw Avenue");
        Linden linden3= new Linden("Tilia tomentosa",10,"Mc Graw Avenue");
        Linden linden4= new Linden("Tilia tomentosa",34,"21 University Place");
        lindens[0]=linden1;
        lindens[1]=linden2;
        lindens[2]=linden3;
        lindens[3]=linden4;
        printAll(lindens);
        System.out.println("***");
        printAllMessages(lindens);
        System.out.println("***");
        sort(lindens);
        printAll(lindens);
        System.out.println("***");
        Tree[] combined = new Tree[6];
        combined[0]=linden1;
        combined[1]=ash2;
        combined[2]=ash1;
        combined[3]=oak1;
        combined[4]=linden2;combined[5]=oak2;
        printAll(combined);
        System.out.println("***");
        printAllMessages(combined);
        System.out.println("***");
        sort(combined);
        printAll(combined);
    }
}
