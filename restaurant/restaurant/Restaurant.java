package restaurant.restaurant;

public class Restaurant {
    private MenuItem[] menuItems;
    private int maxMenuItemCount = 1000;

    public Restaurant(MenuItem[] menuItems) {
        this.menuItems = new MenuItem[maxMenuItemCount];

        for (int i = 0; i < menuItems.length; i++) {
            this.menuItems[i] = menuItems[i];
        }
    }
    public void addItem(MenuItem item) {
        if (isDuplicateItem(item))
            return;

        for (int i = 0; i < this.menuItems.length; i++) {
            if (this.menuItems[i] == null) {
                this.menuItems[i] = item;
                return;
            }
        }
    }
    public boolean removeItem(String name) {
        for (int i = 0; i < this.menuItems.length; i++) {
            if (this.menuItems[i] != null && this.menuItems[i].getName().equals(name)){
                this.menuItems[i] = null;
                return true;
            }
        }

        return false;
    }
    private boolean isDuplicateItem(MenuItem menuItem) {
        for (int i = 0; i < this.menuItems.length; i++) {
            if (menuItems[i] != null && menuItems[i].getName().equals(menuItem.getName())) {
                return true;
            }
        }

        return false;
    }
}
