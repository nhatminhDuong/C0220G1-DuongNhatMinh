function bai1(){
    let inputLy;
    let inputHoa;
    let inputSinh;
    inputLy = prompt("Nhập điểm Vậy Lý:");
    inputHoa = prompt("Nhập điểm Hóa học:");
    inputSinh = prompt("Nhập điểm Sinh học:");


    let diemLy = parseInt(inputLy);
    let diemHoa = parseInt(inputHoa);
    let diemSinh = parseInt(inputSinh);

    let total = (diemLy+diemHoa+diemSinh);
    let avr = total/3;
    document.getElementById("tong").innerHTML = "Điểm tổng: " + total;
    document.getElementById("trungBinh").innerHTML = "Điểm trung bình: " + avr;
}
function bai2(){
    let inputNhietDo;
    inputNhietDo = prompt("Nhập độ C:");
    let doC = parseInt(inputNhietDo);
    let doF = doC*1.8 + 32;
    document.getElementById("nhietDo").innerHTML = "Độ F tương ứng là: " + doF;
}
function bai3(){
    let inputR1;
    inputR1 = prompt("Nhập bán kính hình tròn:");
    let r1 = parseInt(inputR1);
    let s = r1*r1*3.14;
    document.getElementById("dienTich").innerHTML = "Diện tính hình tròn là: " + s;
}
function bai4(){
    let inputR2;
    inputR2 = prompt("Nhập bán kình hình tròn:");
    let r2 = parseInt(inputR2);
    let p = r2*2*3.14;
    document.getElementById("chuVi").innerHTML = "Chu vi hình tròn là: " + p;
}
