function bai1() {
    alert("Xin chào.");
}

function bai2() {
    let a = parseInt(prompt("Nhập số:"));
    alert(plusOne(a));
}

function plusOne(x) {
    return x + 1;
}

function bai3() {
    let a = parseInt(prompt("Nhập số thứ nhất:"));
    let b = parseInt(prompt("Nhập số thứ hai:"));
    checkTwoIntegers(a, b);
}

function checkTwoIntegers(x, y) {
    if (x > y) alert("Bạn đã nhập số thứ nhất lớn hơn số thứ hai");
    else {
        let sum = x + y;
        alert("Tổng hai số là: " + sum);
        return sum;
    }
}

function bai4() {
    let result = 0;
    alert("Giá trị trước khi gọi hàm: result = " + result);
    result = addNumbers();
    alert("Giá trị sau khi gọi hàm: result = " + result);
}

function addNumbers() {
    let firstNum = 4;
    let secondNum = 8;
    result = firstNum + secondNum;
    return result;
}

function bai5() {
    let celebs = ["Polaris","Aldebaran","Deneb","Vega","Altair","Dubhe","Regulus"];
    let constellations = ["Ursa Minor","Tarurus","Cygnus","Lyra","Aquila","Ursa Major","Leo"];
}
