function bai1() {
    let result1 = "1";
    let num2 = 0;
    let num1 = 1;
    let numbers = parseInt(prompt("Nhập số lượng n số Fibonacci đầu tiên muốn in:"));
    for (let i = 1; i < numbers; i++) {
        num = num2 + num1;
        result1 += " " + num;
        num2 = num1;
        num1 = num;
    }
    document.getElementById("result1").innerText = numbers + " số Fibonacci đầu tiên: " + result1;
}

function bai2() {
    let n = parseInt(prompt("Nhập vào số nguyên dương cần tính giai thừa:"));
    document.getElementById("result2").innerText = n + "! = " + factorial(n);
}

function factorial(x) {
    if (x === 0 || x === 1) return 1;
    else return x * factorial(x - 1);
}

function bai3() {
    for (let i = 1; i <= 5; i++) {
        for (let j = 1; j <= i; j++) {
            document.getElementById("result3a").innerText += "*";
        }
        for (let k = 1; k <= 5 - i; k++) {
            document.getElementById("result3a").innerText += " ";
        }
        document.getElementById("result3a").innerText += "\n";
    }

    for (let i = 0; i <= 5; i++) {
        for (let j = 1; j <= i; j++) {
            document.getElementById("result3b").innerText += " ";
        }
        for (let k = 1; k <= 5 - i; k++) {
            document.getElementById("result3b").innerText += "*";
        }
        document.getElementById("result3b").innerText += "\n";
    }

    for (let i = 1; i <= 5; i++) {
        for (let j = 1; j <= 5 - i; j++) {
            document.getElementById("result3c").innerHTML += "&nbsp&nbsp";
        }
        for (let k = 1; k <= i; k++) {
            document.getElementById("result3c").innerText += "*";
        }
        document.getElementById("result3c").innerHTML += "<br>";
    }

    for (let i = 0; i <= 5; i++) {
        for (let j = 1; j <= i; j++) {
            document.getElementById("result3d").innerHTML += "&nbsp&nbsp";
        }
        for (let k = 1; k <= 5 - i; k++) {
            document.getElementById("result3d").innerText += "*";
        }
        document.getElementById("result3d").innerHTML += "<br>";
    }
}

function bai4() {
    document.getElementById("result4").innerHTML = "";
    let n = parseInt(prompt("Nhập chiều dài hình chữ nhật muốn in:"));
    for (let i = 1; i <= n; i++) {
        document.getElementById("result4").innerText += "*";
    }
    document.getElementById("result4").innerHTML += "<br>";
    for (let i = 1; i <= n / 4; i++) {
        for (let j = 1; j <= n; j++) {
            switch (j) {
                case 1: {
                    document.getElementById("result4").innerText += "*";
                    break;
                }
                case (n): {
                    document.getElementById("result4").innerText += "*";
                    document.getElementById("result4").innerHTML += "<br>";
                    break;
                }
                default: {
                    document.getElementById("result4").innerHTML += "&nbsp;&nbsp;";
                }
            }
        }
    }
    for (let i = 1; i <= n; i++) {
        document.getElementById("result4").innerText += "*";
    }
}

function bai5() {
    let originalAmount = parseInt(prompt("Nhập số tiền ban đầu:"));
    let months = parseInt(prompt("Nhập số tháng cho vay:"));
    let interest = parseFloat(prompt("Nhập lãi suất hàng tháng (%):"));
    let total = originalAmount;
    for (let i = 1; i <= months; i++) {
        total = total + total * interest / 100;
    }
    alert("Tổng số tiền nhận được sau " + months + " tháng là: " + total);
}

function bai6() {
    document.getElementById("result6").innerHTML = "";
    let heartSize = parseInt(prompt("Nhập kích thước trái tim:"));
    let n1 = heartSize * 4 + 1; //Nhập size = 3 => n1 = 13;
    let n2 = (n1 + 1) / 2; // n2 = 7;
    let n3 = (n2 + 1) / 2; // n3 = 4;
    for (let i = 0; i < n3 - 1; i++) {
        for (let j = 1; j < n1; j++) {
            switch (j) {
                case (n2 - heartSize - i):
                case (n2 - heartSize + i):
                case (n2 + heartSize - i):
                case (n2 + heartSize + i): {
                    document.getElementById("result6").innerText += "*";
                    break;
                }
                default: {
                    document.getElementById("result6").innerHTML += "&nbsp;&nbsp;";
                }
            }
        }
        document.getElementById("result6").innerHTML += "<br>";
    }
    for (let k = 1; k <= n1; k++) {
        switch (k) {
            case 1:
            case n2:
            case n1: {
                document.getElementById("result6").innerText += "*";
                break;
            }
            default: {
                document.getElementById("result6").innerHTML += "&nbsp;&nbsp;";
            }
        }
    }
    document.getElementById("result6").innerHTML += "<br>";
    for (let i = 0; i < n2; i++) {
        for (let j = 0; j < n1; j++) {
            switch (j) {
                case i:
                case (n1 - i - 1): {
                    document.getElementById("result6").innerText += "*";
                    break;
                }
                default: {
                    document.getElementById("result6").innerHTML += "&nbsp;&nbsp;";
                }
            }
        }
        document.getElementById("result6").innerHTML += "<br>";
    }
}