package LLD.Structural.Composite;

public class File implements FileSystem{

    public String filename;

    public File (String name){
        this.filename = name;
    }

    @Override
    public void ls() {
        System.out.println("Filename is " + filename);
    }
}
