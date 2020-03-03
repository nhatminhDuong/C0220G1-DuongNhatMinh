function bai1() {
    for (let i = 0; i <= 100; i++) {
        setTimeout(function () {
            document.getElementById("result1").innerText = i;
        }, 200);
        if (i === 99) alert("Done!");
    }
}

function bai2() {
    let temperature = parseInt(prompt("Nhập nhiệt độ: "));
    while (temperature > 100 || temperature < 20) {
        if (temperature > 100) {
            alert("Giảm nhiệt độ!");
        }
        if (temperature < 20) {
            alert("Tăng nhiệt độ!");
        }
        temperature = parseInt(prompt("Nhập nhiệt độ mới: "));
    }
    alert("Nhiệt độ hiện tại là: " + temperature)
}

function bai3() {
    let fibonacciNumbers = [];
    let n = parseInt(prompt("Nhập số lượng n số đầu tiên trong dãy Fibonacci muốn in ra:"));
    fibonacciNumbers[0] = 1;
    let num2 = 0;
    let num1 = 1;
    let num;
    for (let i = 1; i <= n; i++) {
        num = num2 + num1;
        num2 = num1;
        num1 = num;
        fibonacciNumbers[i] = num;
    }
    fibonacciNumbers[n] = null;
    document.getElementById("result3").innerText = n + " số Fibonacci đầu tiên là: " + fibonacciNumbers;
}
function bai4() {
    let num2 = 1;
    let num1 = 1;
    let num;
    let isDivisibleBy5 = false;
    while (1){
        num = num2 + num1;
        if (num % 5 === 0) {
            isDivisibleBy5 = true;
            break;
        }
        num2 = num1;
        num1 = num;
    }
    document.getElementById("result4").innerText = "Số đầu tiên trong dãy Fibonacci chia hết cho 5 là " + num;
}
function bai5() {
    let n = parseInt(prompt("Nhập số lượng n số Fibonacci đầu tiên cần tính tổng:"));
    let num2 = 0;
    let num1 = 1;
    let num;
    let sum = num2 + num1;
    for (let i = 1; i < n; i++) {
        num = num2 + num1;
        sum += num;
        num2 = num1;
        num1 = num;
    }
    document.getElementById("result5").innerText = "Tổng của " + n + " số Fibonacci đầu tiên là: " + sum;
}
function bai6() {
    let n = parseInt(prompt("Nhập số lượng n số chia hết cho 7 đầu tiên trong dãy số tự nhiên cần tính tổng:"));
    let count = 0;
    let i = 1;
    let sum = 0;
    while (count < n){
        if (i % 7 === 0) {
            sum += i;
            count++;
        }
        i++;
    }
    document.getElementById("result6").innerText = "Tổng của " + n + " số tự nhiên đầu tiên chia hết cho 7 là " + sum;
}
function bai7() {
    let text = "";
    for (let i = 1; i <= 100; i++){
        if (i % 3 === 0 && i % 5 === 0){
            text += " FizzBuzz";
        }
        else if (i % 3 === 0) {
            text += " Fizz";
        }
        else if (i % 5 === 0) {
            text += " Buzz"
        }
        else {
            text += " " + i;
        }
    }
    document.getElementById("result7").innerText = text;
}