package com.company;

public class Service {
    private Service(){ }
    private static Service service=new Service();
    public static Service getInstance(){return service;}
    public void save(Entity sell)throws Exception{
        try(Repository repository1=new Repository()){
            repository1.insert(sell);
            repository1.commit();
        }
    }
    public void report(Entity sell)throws Exception{
        try(Repository repository=new Repository()){
            repository.choose(sell);
        }
    }
}
