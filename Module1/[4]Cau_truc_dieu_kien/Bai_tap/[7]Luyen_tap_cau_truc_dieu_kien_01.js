function bai1() {
    let a = prompt("Nhập số dương a:");
    let b = prompt("Nhập số dương b:");
    if ((a*1)%(b*1) !== 0) alert(a + " không chia hết cho " + b);
    else alert(a + " chia hết cho " + b);
}
function bai2() {
    let age = prompt("Nhập tuổi:");
    if (age > 15) alert("Học sinh đủ điều kiện vào học lớp 10.");
    else alert("Học sinh không đủ điều kiện vào học lớp 10.")
}
function bai3() {
    let num = parseInt(prompt("Nhập số nguyên:"));
    if (num === 0) alert ("Bạn đã nhập số 0.");
    else if (num > 0) alert ("Bạn đã nhập số dương.");
    else alert("Bạn đã nhập số âm.");
}
function bai4() {
    let firstNum = parseInt(prompt("Nhập số nguyên thứ nhất: "));
    let max = firstNum;
    let secondNum = parseInt(prompt("Nhập số nguyên thứ hai: "));
    if (max < secondNum) max = secondNum;
    let thirdNum = parseInt(prompt("Nhập số nguyên thứ ba: "));
    if (max < thirdNum) max = thirdNum;
    alert("Giá trị lớn nhất trong ba số là: " + max);
}
function bai5() {
    let dailyPoint = parseInt(prompt("Nhập điểm bài kiểm tra:"));
    let midTermPoint = parseInt(prompt("Nhập điểm thi giữa kì:"));
    let endTermPoint = parseInt(prompt("Nhập điểm thi cuối kì:"));
    let average = dailyPoint * 0.2 + midTermPoint * 0.2 + endTermPoint * 0.6;
    if (average >= 8.5) alert("Điểm trung bình: " + average.toFixed(2) + "\nLoại: Giỏi");
    else if (average >= 7) alert("Điểm trung bình: " + average.toFixed(2) + "\nLoại: Khá");
    else if (average >= 5.5) alert("Điểm trung bình: " + average.toFixed(2) + "\nLoại: Trung bình khá");
    else alert("Điểm trung bình: " + average.toFixed(2) + "\nLoại: Trung bình");
}
function bai6() {
    let revenue = parseInt(prompt("Nhập doanh số: "));
    if (revenue > 14000000) alert("Hoa hồng (5% doanh số): " + revenue*0.05);
    else alert("Hoa hồng (3% doanh số) " + revenue*0.03);
}
function bai7() {
    let minutes = parseInt(prompt("Nhập số phút sử dụng điện thoại:"));
    let total = 25000;
    if (minutes <= 50) total += minutes * 600
    else if (minutes <= 200) total += minutes*50 + (minutes-50)*400;
    else total += minutes*50 + minutes*150 + (minutes-200)*200;
    alert("Tổng tiền cước là: " + total);
}