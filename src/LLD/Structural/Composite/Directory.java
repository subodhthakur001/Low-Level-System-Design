package LLD.Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements  FileSystem{
    public String directoryName;
    List<FileSystem> fileSystemList;

    public Directory(String name){
        this.directoryName = name;
        fileSystemList = new ArrayList<>();
    }
    public void add(FileSystem fileSystemObj){
        fileSystemList.add(fileSystemObj);
    }
    @Override
    public void ls() {
        System.out.println("Directory name is " + directoryName);
        for(FileSystem fileSystemObj : fileSystemList){
            fileSystemObj.ls();
        }

    }
}
