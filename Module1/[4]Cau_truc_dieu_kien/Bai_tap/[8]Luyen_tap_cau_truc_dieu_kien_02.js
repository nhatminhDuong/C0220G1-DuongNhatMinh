function bai1() {
    let tempC = prompt("Nhập độ C:");
    let tempF = tempC*1 * 9/5 + 32;
    alert("Độ F tương ứng là: " + tempF);
}
function bai2() {
    let meter = prompt("Nhập mét:");
    let feet = meter*1 * 3.2808;
    alert("Feet tương ứng là: " + feet);
}
function bai3() {
    let side = parseInt(prompt("Nhập cạnh hình vuông:"));
    let area = side * side;
    alert("Diện tích hình vuông là: " + area);
}
function bai4() {
    let side1 = parseInt(prompt("Nhập cạnh thứ nhất:"));
    let side2 = parseInt(prompt("Nhập cạnh thứ hai:"));
    let area = side1 * side2;
    alert("Diện tích hình chữ nhật là: " + area);
}
function bai5() {
    let side1 = parseInt(prompt("Nhập cạnh thứ nhất:"));
    let side2 = parseInt(prompt("Nhập cạnh thứ hai:"));
    let area = side1 * side2 / 2;
    alert("Diện tích tam giác vuông là: " + area);
}
function bai6() {
    let a = parseInt(prompt("ax + b = 0\nNhập hệ số a:"));
    let b = parseInt(prompt("ax + b = 0\nNhập hệ số b:"));
    if (a === 0){
        if (b === 0) alert("Phương trình có vô số nghiệm.");
        else alert("Phương trình vô nghiệm.");
    }
    else alert("Phương trình có nghiệm duy nhất: x = " + -b/a);
}
function bai7() {
    let a = parseInt(prompt("ax\u00B2 + bx + c = 0\nNhập hệ số a \u2260 0:"));
    let b = parseInt(prompt("ax\u00B2 + bx + c = 0\nNhập hệ số b:"));
    let c = parseInt(prompt("ax\u00B2 + bx + c = 0\nNhập hệ số c:"));
    let delta = b*b - 4*a*c;
    if (delta < 0 ) alert("Phương trình vô nghiệm");
    else if (delta === 0) alert("Phương trình có nghiệm kép: x = " -b/2*a);
    else alert("Phương trình có nghiệm 2 nghiệm phân biệt:\nx1 = " + (-b+Math.sqrt(delta))/2*a + "\nx2 = " + (-b-Math.sqrt(delta))/2*a);
}
function bai8() {
    let a = prompt("Nhập tuổi: ");
    if (a > 0 && a < 120) alert("Hợp lệ.");
    else alert("Số vừa nhập không phải tuổi của một người.");
}
function bai9() {
    let a = parseInt(prompt("Nhập cạnh thứ nhất:"));
    let b = parseInt(prompt("Nhập cạnh thứ hai:"));
    let c = parseInt(prompt("Nhập cạnh thứ ba:"));
    let isTriangle = false;
    if (a > 0 && b>0 && c>0 && a+b>c && a+c>b && b+c>a) isTriangle = true;
    if (isTriangle) alert("Ba số vừa nhập là cạnh của một tam giác");
    else alert("Ba số vừa nhập không phải là cạnh của một tam giác");
}
function bai10() {
    let elecMeter = parseInt(prompt("Nhập số công tơ điện sử dụng (kWh):"));
    let price = 0;
    let priceList = [1.678, 1.734, 2.014, 2.536, 2.834, 2.927];
    if (elecMeter <= 50) price = elecMeter * priceList[0];
    else if (elecMeter <= 100) price = 50 * priceList[0] + (elecMeter-50) * priceList[1];
    else if (elecMeter <= 200) price = 50 * priceList[0] + 50 * priceList[1] + (elecMeter-100) * priceList[2];
    else if (elecMeter <= 300) price = 50 * priceList[0] + 50 * priceList[1] + 100 * priceList[2] + (elecMeter-200) * priceList[3];
    else if (elecMeter <= 400) price = 50 * priceList[0] + 50 * priceList[1] + 100 * priceList[2] + 100 * priceList[3] + (elecMeter-300) * priceList[4];
    else price = 50 * priceList[0] + 50 * priceList[1] + 100 * priceList[2] + 100 * priceList[3] + 100 * priceList[4] + (elecMeter-400) * priceList[5];
    alert("Số tiền điện phải trả là: " + price + " vnd");
}
