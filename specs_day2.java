class specs_day2
{
    String processor;
    int fro_cam,back_cam,storage,ram;
    specs(String processor,int fro_cam,int back_cam,int storage,int ram)
    {
        this.processor=processor;
        this.fro_cam=fro_cam;
        this.back_cam=back_cam;
        this.storage=storage;
        this.ram=ram;
    }
    public void display()
    {
        System.out.println("Processor"+processor);
        System.out.println("Front Camera"+fro_cam);
        System.out.println("Back camera"+back_cam);
        System.out.println("Storage"+storage);
        System.out.println("Ram"+ram); 
    }
}
