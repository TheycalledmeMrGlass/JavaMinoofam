package com.company;

import java.util.List;

public class Service {
    private Service(){};
    private static Service service=new Service();
    public static Service getInstance(){
        return service;
    }
public List<Entity>report(Entity entity1)throws Exception{
        List<Entity>entityList;
        try(Repository repository=new Repository()){
            entityList=repository.select(entity1);
        }
        return entityList;
}
    public void save(Entity entity)throws Exception{
try(Repository repository1=new Repository()){
if(entity.getId()==1){
    System.out.println(" Bar hajm internet shoma 2 gigabyte afzodeh shod");
    System.out.println("hazine ghabel pardakht:1000 toman");
    repository1.update(entity);
    repository1.commit();
}
else if(entity.getId()==2){
    System.out.println("Bar hajm internet shoma 4 gigabyte afzodeh shod");
    System.out.println("hazine ghabel pardakht:2000 toman");
    repository1.update(entity);
    repository1.commit();
}
else if(entity.getId()==3){
    System.out.println("Bar hajm internet shoma 10 gigabyte afzodeh shod");
    System.out.println("hazine ghabel pardakht:5000 toman");
    repository1.update(entity);
    repository1.commit();
}
else if(entity.getId()==4){
    System.out.println("Bar hajm internet shoma 25 gigabyte afzodeh shod");
    System.out.println("hazine ghabel pardakht:10000 toman");
    repository1.update(entity);
    repository1.commit();
}

}
    }
}
