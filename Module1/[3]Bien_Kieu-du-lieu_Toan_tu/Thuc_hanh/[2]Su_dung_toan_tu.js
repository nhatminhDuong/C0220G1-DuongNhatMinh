let inputWidth;
let inputHeight;

inputWidth = prompt("Nhập chiều rộng hcn: ");
inputHeight = prompt("Nhập chiều dài hcn: ");

let width = parseInt(inputWidth);
let height = parseInt(inputHeight);
let area = height * width;
document.write("Chiều rộng hcn: " + width);
document.write("<br>");
document.write("Chiều dài hcn: " + height);
document.write("<br>");
document.write("Diện tích hcn: " + area);