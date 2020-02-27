let state = false;
// let number1 = document.getElementById("number1");
// let number2 = document.getElementById("number2");
function toggle() {
        let x = document.getElementById("simplify");
        let y = document.getElementById("expand");
    if (state) {
        document.querySelector("#toggle").innerHTML = "Expand";
        x.style.display = "block";
        y.style.display = "none";
        state = !state;
    }
    else {
        document.querySelector("#toggle").innerHTML = "Simplify";
        x.style.display = "none";
        y.style.display = "block";
        state = !state;
    }
}
function changeColor(x) {
    x.style.background = "#4d94ff";
}
function changeBack(x) {
    x.style.background = "lightgrey";
}
function changeNumBack(x) {
    x.style.background = "#f2f2f2";
}
function addition() {
    // getNum();
    let sum = (parseInt(number1.value) + parseInt(number2.value));
    document.getElementById("result").innerText = "Tổng của 2 số là: " + sum;
}
function subtraction() {
    let diff = (parseInt(number1.value) - parseInt(number2.value));
    document.getElementById("result").innerText = "Hiệu của 2 số là: " + diff;
}
function multiplication() {
    let pro = (parseInt(number1.value) * parseInt(number2.value));
    document.getElementById("result").innerText = "Tích của 2 số là: " + pro;
}
function division() {
    if (number2.value === "0") alert("Số bị chia không được bằng 0. Vui lòng nhập lại!");
    else
    {
        let quo = (parseInt(number1.value) / parseInt(number2.value));
        document.getElementById("result").innerText = "Thương của 2 số là: " + quo;
    }
}
