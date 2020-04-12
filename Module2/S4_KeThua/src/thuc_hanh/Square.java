package thuc_hanh;

/*Chú ý: trong thực tế,một “square” không phải là một “rectangle”,
        do đó quan hệ “lớp square là lớp con của lớp rectangle” là không hợp lý.
        Tình huống ở đây được đưa ra chỉ với mục đích luyện tập hiện thực hóa mô tả thành giản đồ UML
        và triển khai mã theo bản vẽ.

        Không phải mọi quan hệ kiểu “cái này là cái kia” đều nên được mô phỏng thông qua mối quan hệ thừa kế.
        Ví dụ một hình vuông là một hình chữ nhật, nhưng không nên mở rộng lớp hình chữ nhật để có lớp hình vuông,
        vì những thuộc tính width và height là không thích hợp cho hình vuông.
        Thay vào đó, lớp hình vuông nên mở rộng lớp hình hình học và mở rộng thêm với thuộc tính side.
*/
public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setHeight(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setHeight(double height) {
        setSide(height);
    }

    @Override
    public String toString() {
        return "A Square with side = " + getSide()
                + ", which is a subclass of " + super.toString();
    }
}