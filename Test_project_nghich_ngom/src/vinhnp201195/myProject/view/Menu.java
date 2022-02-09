package vinhnp201195.myProject.view;

public abstract class Menu {
    public void Menu()
    {
        System.out.println("1. Them");
        System.out.println("2. Sua");
        System.out.println("3. Xoa");
        System.out.println("4. Thoat");
    }

    public abstract void Create();
    public abstract void Read();
    public abstract void Update();
    public abstract void Delete();
}
