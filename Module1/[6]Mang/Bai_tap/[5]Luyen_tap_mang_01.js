function bai1() {
    let r = document.getElementById("result1");
    let inputArray = [];
    let text = "Các phần tử hơn 10 là:";
    for (let i = 0; i < 10; i++) {
        inputArray[i] = parseInt(prompt("Nhập số thứ " + i + " của mảng"));
        if (inputArray[i] >= 10) {
            text += " " + inputArray[i];
        }
    }
    r.innerText = "Mảng đã cho: ";
    for (let i = 0; i < 10; i++) {
        r.innerText += " " + inputArray[i];
    }
    r.innerText += "\n" + text;
}

function bai2() {
    let r = document.getElementById("result2");
    let inputArray = [];
    let text = "Các số lớn hơn 10 là:";
    for (let i = 0; i < 10; i++) {
        inputArray[i] = parseInt(prompt("Nhập số thứ " + i + " của mảng"));
        if (inputArray[i] >= 10) {
            text += " array[" + i + "] = " + inputArray[i] + ",";
        }
    }
    r.innerText = "Mảng đã cho: ";
    for (let i = 0; i < 10; i++) {
        r.innerText += " " + inputArray[i];
    }
    r.innerText += "\n" + text;
}

function bai3() {
    let r = document.getElementById("result3");
    let inputArray = [];
    let i = 0;
    inputArray[i] = parseInt(prompt("Nhập số thứ " + i + " của mảng"));
    let max = inputArray[i];
    let maxIndex = i;
    let sum = inputArray[i];
    let average;
    for (let i = 1; i < 10; i++) {
        inputArray[i] = parseInt(prompt("Nhập số thứ " + i + " của mảng"));
        if (inputArray[i] > max) {
            max = inputArray[i];
            maxIndex = i;
        }
        sum += inputArray[i];
    }
    average = sum / inputArray.length;
    r.innerText = "Mảng đã cho: ";
    for (let i = 0; i < 10; i++) {
        r.innerText += " " + inputArray[i];
    }
    r.innerText += "\n" + "Phần tử lớn nhất của mảng: array[" + maxIndex + "] = " + max
        + "\n" + "Trung bình cộng các phần tử của mảng: " + average;
}

function bai4() {
    let r = document.getElementById("result4");
    let inputArray = [];
    for (let i = 0; i < 10; i++) {
        inputArray[i] = parseInt(prompt("Nhập số thứ " + i + " của mảng"));
    }
    r.innerText = "Mảng đã cho: ";
    for (let i = 0; i < 10; i++) {
        r.innerText += " " + inputArray[i];
    }
    for (let i = 0, j = inputArray.length - 1; i < j; i++, j--) {
        let temp = inputArray[i];
        inputArray[i] = inputArray[j];
        inputArray[j] = temp;
    }
    r.innerText += "\nMảng đảo ngược: ";
    for (let i = 0; i < 10; i++) {
        r.innerText += " " + inputArray[i];
    }
}

function bai5() {
    let inputString = prompt("Nhập chuỗi: ");
    let negativeNum = "-";
    let i = 1;
    if (inputString.indexOf("-") !== -1) {
        while (inputString[inputString.indexOf("-") + i] * 1 == inputString[inputString.indexOf("-") + i]) {
            negativeNum += inputString[inputString.indexOf("-") + i];
            i++
        }
    }
    if (i === 1) document.getElementById("result5").innerText = "Không có số nguyên âm trong chuỗi";
    else document.getElementById("result5").innerText = negativeNum;

}

function bai6() {

}

function bai7() {

}

function bai8() {
    let r = document.getElementById("result8");
    let inputArray = [];
    for (let i = 0; i < 10; i++) {
        inputArray[i] = parseInt(prompt("Nhập số thứ " + i + " của mảng"));
    }
    r.innerText = "Mảng đã cho: ";
    for (let i = 0; i < 10; i++) {
        r.innerText += " " + inputArray[i];
    }
    for (let i = inputArray.length - 1; i > 0; i--) {
        for (let j = 0; j < i; j++) {
            if (inputArray[j] < inputArray[j + 1]) {
                let temp = inputArray[j];
                inputArray[j] = inputArray[j + 1];
                inputArray[j + 1] = temp;
            }
        }
    }
    r.innerText += "\nMảng đã sắp xếp: ";
    for (let i = 0; i < 10; i++) {
        r.innerText += " " + inputArray[i];
    }
}