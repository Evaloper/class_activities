package week1_curriculum_activities.class_activity_3;

abstract public class Shape {
    int num;

    public Shape(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public abstract void draw();

    public void display(){
        System.out.println("Displaying shape");
    }
}
