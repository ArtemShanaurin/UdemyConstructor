public class Box {
    int width;
    int height;
    int length;

    private Box(int i){
        width = height = length = i;
    }

   private Box(){
        width = height = length = 1;
    }

   private Box(int width, int height, int length){
        this.width = width;
        this.height = height;
        this.length = length;
    }

   private Box(Box box1, Box box2){
        this.width = box1.width + box2.width;
        this.height = box1.height +1;
    }

    Box newBox(Box box){
        return new Box ( this.width + width, this.height + height, this.length + length);
    }

    int volume() {
        return width * height * length;
    }
}
