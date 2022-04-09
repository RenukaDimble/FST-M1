package activities;

public class Activity5 {
    public static void main(String[] args) {
        String title = "FST TRAINING";
        book newNovel = new mybook();
        newNovel.setTitle(title);
        ;
        System.out.println("The title is: " + newNovel.getTitle());
    }
}
    abstract class book{
        String title;
        abstract void setTitle(String s);
        String getTitle()
        {
            return title;
        }
    }


    class mybook extends book {
        public void setTitle(String s) {
            title = s;
        }
    }

