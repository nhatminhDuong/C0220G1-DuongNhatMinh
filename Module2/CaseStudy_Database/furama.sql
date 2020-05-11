create database furama;

create table ViTri (
	IDViTri int primary key not null,
    TenViTri varchar(45)
);

create table TrinhDo (
	IDTrinhDo int primary key not null,
    TrinhDo varchar(45)
);

create table BoPhan (
	IDBoPhan int primary key not null,
    TenBoPhan varchar(45)
);

create table NhanVien (
	IDNhanVien int primary key not null,
    HoTen varchar(45),
    IDViTri int,
    IDTrinhDo int,
    IDBoPhan int,
    NgaySinh date,
    SoCMND varchar(45),
    Luong varchar(45),
    SDT varchar(45),
    Email varchar(45),
    DiaChi varchar(45),
	foreign key (IDViTri) references ViTri(IDViTri),
	foreign key (IDTrinhDo) references TrinhDo(IDTrinhDo),
	foreign key (IDBoPhan) references BoPhan(IDBoPhan)
);

create table LoaiKhach (
	IDLoaiKhach int primary key not null,
    TenLoaiKhach varchar(45)
);

create table KhachHang (
	IDKhachHang int primary key not null,
    IDLoaiKhach int,
    HoTen varchar(45),
    NgaySinh Date,
    SoCMND varchar(45),
    SDT varchar(45),
    Email varchar(45),
    DiaChi varchar(45),
    foreign key (IDLoaiKhach) references LoaiKhach(IDLoaiKhach)
);

create table KieuThue (
	IDKieuThue int primary key not null,
    TenKieuThue varchar(45),
);

create table LoaiDichVu (
	IDLoaiDichVu int primary key not null,
    TenLoaiDichVu varchar(45)
);

create table DichVu (
	IDDichVu int primary key not null,
    TenDichVu varchar(45),
    DienTich int,
    SoTang int,
    SoNguoiToiDa int,
    ChiPhiThue varchar(45),
    IDKieuThue int,
    IDLoaiDichVu int,
    TrangThai varchar(45),
    foreign key (IDKieuThue) references KieuThue(IDKieuThue),
    foreign key (IDLoaiDichVu) references LoaiDichVu(IDLoaiDichVu)
);

create table DichVuDiKem (
	IDDichVuDiKem int primary key not null,
    TenDichVuDiKem varchar(45),
    Gia int,
    DonVi int,
    TrangThaiKhaDung varchar(45)
);

create table HopDongChiTiet (
	IDHopDongChiTiet int primary key not null,
    IDHopDong int,
    IDDichVuDiKem int,
    SoLuong int,
    foreign key (IDDichVuDiKem) references DichVuDiKem(IDDichVuDiKem)
);

create table HopDong (
	IDHopDong int primary key not null,
    IDNhanVien int,
    IDKhachHang int,
    IDDichVu int,
    NgayLamHopDong date,
    NgayKetThuc date,
    TienDatCoc int,
    TongTien int,
    foreign key (IDNhanVien) references NhanVien(IDNhanVien),
    foreign key (IDKhachHang) references KhachHang(IDKhachHang),
    foreign key (IDDichVu) references DichVu(IDDichVu)
);

alter table HopDongChiTiet
add foreign key (IDHopDong) references HopDong(IDHopDong);

insert into ViTri (IDViTri, TenViTri)
values
(1, 'Le tan'),
(2, 'Phuc vu'),
(3, 'Chuyen vien'),
(4, 'Giam sat'),
(5, 'Quan ly'),
(6, 'Giam doc');

insert into TrinhDo (IDTrinhDo, TrinhDo)
values
(1, 'Trung cap'),
(2, 'Cao dang'),
(3, 'Dai hoc'),
(4, 'Sau dai hoc');

insert into BoPhan
values
(1, 'Sale - Marketing'),
(2, 'Hanh Chinh'),
(3, 'Phuc Vu'),
(4, 'Quan Ly');

insert into NhanVien (IDNhanVien, HoTen, IDViTri, IDTrinhDo, IDBoPhan, NgaySinh, SoCMND, Luong, SDT, Email, DiaChi)
values
(1, 'Huy Le', 6, 4, 4, '1988-11-12', '135264972', '5000', '0912548321', 'huyle@codegym.vn', 'Da Nang'),
(2, 'Khang Nguyen Van', 3, 2, 2, '1995-02-01', '695821364', '1000', '0903625487', 'khang123@codegym.vn', 'Quang Nam'),
(3, 'Phu Pham', 5, 4, 4, '1996-12-20', '698213654', '2000', '0874632519', 'phupham456@codegym.vn', 'Hue'),
(4, 'Hoa Phan', 1, 2, 3, '1998-06-30', '362519874', '400', '0862351479', 'hoapham321@codegym.vn', 'Hue'),
(5, 'Thanh Le', 4, 4, 4, '1995-05-21', '362514789', '1200', '0342612549', 'thanhle111@codegym.vn', 'Gia Lai'),
(6, 'Cuong Nguyen', 2, 1, 3, '2000-04-05', '654823197', '250', '0986325142', 'cuongnguyen789@codegym.vn', 'Da Nang'); 

-- TASK 2: Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K”
-- 		  và có tối đa 15 ký tự.
select *
from NhanVien
where length(HoTen) <= 15 and (HoTen like 'H%' OR HoTen like 'T%' OR HoTen like 'K%');

insert into LoaiKhach
values
(1, 'Diamond'),
(2, 'Platinum'),
(3, 'Gold'),
(4, 'Silver'),
(5, 'Member');

insert into KhachHang (IDKhachHang, IDLoaiKhach, HoTen, NgaySinh, SoCMND, SDT, Email, DiaChi)
values
(1, 2, 'Nam Tran', '1991-12-01', '236598214', '0958426851', 'namtran1kh@codegym.vn', 'Vinh'),
(2, 1, 'Son Nguyen', '2000-01-01', '3269874621', '0986251472', 'sonnguyen2kh@codegym.vn', 'Da Nang'),
(3, 1, 'Binh Le', '1967-03-20', '986251346', '098213542', 'binhle3kh@codegym.vn', 'Ha Tinh'),
(4, 4, 'Phu Pham', '2003-02-02', '862843928', '0973251248', 'phupham@codegym.vn', 'Da Nang'),
(5, 1, 'Quang Le', '1982-06-13', '492843916', '0382364972', 'quangle@codegym.vn', 'Vinh'),
(6, 1, 'Phuong Nguyen', '1999-12-05', '362974816', '0342698128', 'phuongnguyen@codegym.vn', 'Quang Ngai'),
(7, 5, 'Phuong Nguyen', '1994-12-05', '362394816', '0342696197', 'phuongnguyenqn@codegym.vn', 'Quang Nam');

-- TASK 3: Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
select *
from KhachHang
where
(DiaChi = 'Da Nang' or DiaChi = 'Quang Tri')
and
((year(curdate()) - year(NgaySinh) >= 18) and (year(curdate()) - year(NgaySinh) <= 50));

insert into KieuThue (IDKieuThue, TenKieuThue)
values
(1, 'Year'),
(2, 'Month'),
(3, 'Day'),
(4, 'Hour');

insert into LoaiDichVu (IDLoaiDichVu, TenLoaiDichVu)
values
(1, 'Villa'),
(2, 'House'),
(3, 'Room');

insert into DichVu (IDDichVu, TenDichVu, DienTich, SoTang, SoNguoiToiDa, ChiPhiThue, IDKieuThue, IDLoaiDichVu, TrangThai)
values
(1, 'Villa Peace', 300, 4, 5, 1000, 3, 1, 'Dang thue'),
(2, 'Villa Soul Kitchen', 400, 3, 8, 1200, 2, 1, 'Dang thue'),
(3, 'House The White Eagle', 200, 3, 4, 650, 4, 2, 'Sap tra'),
(4, 'House Happy Bears', 180, 2, 3, 500, 3, 2, 'Con trong'),
(5, 'Room The Old Time', 60, 1, 2, 250, 2, 2, 'Dang thue'),
(6, 'Room A Little Bird', 50, 1, 2, 220, 2, 3, 'Con trong'),
(7, 'House Three Bananas', 150, 2, 3, 300, 2, 2, 'Con trong');

insert into HopDong (IDHopDong, IDNhanVien, IDKhachHang, IDDichVu, NgayLamHopDong, NgayKetThuc, TienDatCoc, TongTien)
values
(1, 2, 5, 4, '2018-04-01', '2018-04-15', 200, 700),
(2, 3, 3, 5, '2020-02-02', '2020-02-16', 200, 1200),
(3, 4, 6, 6, '2018-04-03', '2018-04-17', 200, 720),
(4, 5, 2, 1, '2019-11-11', '2019-11-12', 200, 730),
(5, 6, 2, 1, '2019-03-05', '2019-05-25', 200, 740),
(6, 2, 2, 3, '2020-05-06', '2020-05-21', 200, 750),
(7, 3, 2, 6, '2019-12-01', '2020-01-01', 400, 1000);

-- TASK 4: Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần.
-- Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng.
-- Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
select KhachHang.IDKhachHang, KhachHang.Hoten, HopDong.IDHopDong, count(*) as 'Số lần đặt'
from KhachHang
join HopDong on KhachHang.IDKhachHang = HopDong.IDKhachHang
where IDLoaiKhach = 1
group by KhachHang.HoTen
order by count(*);

insert into DichVuDiKem (IDDichVuDiKem, TenDichVuDiKem, Gia, DonVi, TrangThaiKhaDung)
values
(1, 'Massage', 50, 1, 'available'),
(2, 'Karaoke', 25, 1, 'available'),
(3, 'Food', 20, 1, 'available'),
(4, 'Drinks', 15, 1, 'available'),
(5, 'Car', 60, 1, 'available');

-- TASK 5: Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc, TongTien
-- (Với TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia, với SoLuong và Giá là từ bảng DichVuDiKem)
-- cho tất cả các Khách hàng đã từng đặt phỏng. (Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).
select KhachHang.IDKhachHang, KhachHang.HoTen, LoaiKhach.TenLoaiKhach, HopDong.IDHopDong, DichVu.TenDichVu,
		HopDong.NgayLamHopDong, HopDong.NgayKetThuc, HopDong.TongTien
from (KhachHang join LoaiKhach on KhachHang.IDLoaiKhach = LoaiKhach.IDLoaiKhach)
left join (HopDong join DichVu on HopDong.IDDichVu = DichVu.IDDichVu)
on KhachHang.IDKhachHang = HopDong.IDKhachHang;

-- TASK 6: Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu của tất cả các loại Dịch vụ chưa từng được
-- khách hàng thực hiện đặt từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3).
select DichVu.IDDichVu, DichVu.TenDichVu, DichVu.DienTich, DichVu.ChiPhiThue, LoaiDichVu.TenLoaiDichVu
from DichVu
join LoaiDichVu on DichVu.IDLoaiDichVu = LoaiDichVu.IDLoaiDichVu
where IDDichVu not in (select DichVu.IDDichVu from HopDong
join DichVu on DichVu.IDDichVu = HopDong.IDDichVu
where HopDong.NgayLamHopDong > '2019-03-31');

-- TASK 7: Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu
-- của tất cả các loại dịch vụ đã từng được Khách hàng đặt phòng trong năm 2018 nhưng chưa từng được Khách hàng đặt phòng  trong năm 2019.
select DichVu.IDDichVu, DichVu.TenDichVu, DichVu.DienTich, DichVu.SoNguoiToiDa, DichVu.ChiPhiThue, LoaiDichVu.TenLoaiDichVu
from DichVu
join LoaiDichVu on DichVu.IDLoaiDichVu = LoaiDichVu.IDLoaiDichVu
where 
IDDichVu in (select DichVu.IDDichVu from HopDong
join DichVu on DichVu.IDDichVu = HopDong.IDDichVu
where year(HopDong.NgayLamHopDong) = 2018)
and
IDDichVu not in (select DichVu.IDDichVu from HopDong
join DichVu on DichVu.IDDichVu = HopDong.IDDichVu
where year(HopDong.NgayLamHopDong) = 2019);

select DichVu.IDDichVu, DichVu.TenDichVu, DichVu.DienTich, DichVu.SoNguoiToiDa, DichVu.ChiPhiThue, LoaiDichVu.TenLoaiDichVu
from DichVu
join LoaiDichVu on DichVu.IDLoaiDichVu = LoaiDichVu.IDLoaiDichVu
where 
IDDichVu in (select IDDichVu from HopDong
where year(HopDong.NgayLamHopDong) = 2018)
and
IDDichVu not in (select IDDichVu from HopDong
where year(HopDong.NgayLamHopDong) = 2019);

-- CODE CLARIFY TASK 7
-- select DichVu.IDDichVu, DichVu.TenDichVu, HopDong.NgayLamHopDong from HopDong
-- join DichVu on DichVu.IDDichVu = HopDong.IDDichVu
-- where year(HopDong.NgayLamHopDong) = 2018;

-- TASK 8: Hiển thị thông tin HoTenKhachHang có trong hệ thống, với yêu cầu HoThenKhachHang không trùng nhau.
-- CACH 1:
select distinct HoTen
from KhachHang;

-- CACH 2:
select HoTen
from KhachHang
group by HoTen;

-- CACH 3:
select HoTen
from KhachHang
union
select HoTen
from KhachHang;

-- CACH 4;
select HoTen
from KhachHang kh1
where not exists (
select HoTen 
from KhachHang kh2
where kh2.HoTen = kh1.HoTen and kh1.IDKhachHang > kh2.IDKhachHang);

-- TASK 9: Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2020
-- thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.
select month(NgayLamHopDong) as 'Tháng', count(*) as 'Số lần đặt trong tháng', sum(TongTien) as 'Tổng doanh thu trong tháng'
from HopDong
where year(NgayLamHopDong) = 2020
group by month(NgayLamHopDong);

-- CODE CLARIFY TASK 9
-- select *
-- from HopDong
-- where year(NgayLamHopDong) = 2020;

insert into HopDongChiTiet (IDHopDongChiTiet, IDHopDong, IDDichVuDiKem, SoLuong)
values
(1, 1, 3, 1),
(2, 1, 4, 1),
(3, 2, 1, 1),
(4, 3, 5, 1),
(5, 4, 2, 1),
(6, 4, 4, 1),
(7, 4, 5, 1),
(8, 5, 1, 1),
(9, 6, 3, 1),
(10, 6, 4, 1),
(11, 7, 3, 1);

-- TASK 10: Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm.
-- Kết quả hiển thị bao gồm IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, SoLuongDichVuDiKem
-- (được tính dựa trên việc count các IDHopDongChiTiet).
select HopDong.IDHopDong, NgayLamHopDong, NgayKetThuc, TienDatCoc, count(*) as SoLuongDichVuDiKem
from HopDongChiTiet
join HopDong on HopDongChiTiet.IDHopDong = HopDong.IDHopDong
group by HopDongChiTiet.IDHopDong;

-- TASK 11: Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi những Khách hàng có TenLoaiKhachHang là “Diamond”
-- và có địa chỉ là “Vinh” hoặc “Quảng Ngãi”.
select KhachHang.IDKhachHang, HoTen, DiaChi, TenLoaiKhach, DichVuDiKem.IDDichVuDiKem, TenDichVuDiKem, Gia, DonVi, TrangThaiKhaDung
from LoaiKhach
join KhachHang on LoaiKhach.IDLoaiKhach = KhachHang.IDLoaiKhach
join HopDong on KhachHang.IDKhachHang = HopDong.IDKhachHang
join HopDongChiTiet on HopDong.IDHopDong = HopDongChiTiet.IDHopDong
join DichVuDiKem on HopDongChiTiet.IDDichVuDiKem = DichVuDiKem.IDDichVuDiKem
where TenLoaiKhach = 'Diamond' and (DiaChi = 'Vinh' or DiaChi = 'Quang Ngai');

-- TASK 12: Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang, TenDichVu, SoLuongDichVuDiKem
-- (được tính dựa trên tổng Hợp đồng chi tiết), TienDatCoc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2019
-- nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2019.
select HopDong.IDHopDong, NhanVien.HoTen as TenNhanVien, KhachHang.Hoten as TenKhachHang, KhachHang.SDT, TenDichVu,
TienDatCoc, count(*) as SoLuongDichVuDiKem
from HopDong
join DichVu on HopDong.IDDichVu = DichVu.IDDichVu
join HopDongChiTiet on HopDong.IDHopDong = HopDongChiTiet.IDHopDong
join DichVuDiKem on HopDongChiTiet.IDDichVuDiKem = DichVuDiKem.IDDichVuDiKem
join KhachHang on HopDong.IDKhachHang = KhachHang.IDKhachHang
join NhanVien on HopDong.IDNhanVien = NhanVien.IDNhanVien
where
DichVu.IDDichVu in (select IDDichVu from HopDong where month(NgayLamHopDong) in (10, 11, 12)) and
DichVu.IDDichVu not in (select IDDichVu from HopDong where NgayLamHopDong between '2019-01-01' and '2019-06-30')
and 
month(NgayLamHopDong) in (10, 11, 12)
group by HopDongChiTiet.IDHopDong;

-- TASK 13: Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng.
-- (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).
select HopDong.IDHopDong, TenLoaiDichVu, TenDichVuDiKem, count(DichVuDiKem.IDDIchVuDIKem) as SoLanSuDung
from HopDong
join DichVu on HopDong.IDDichVu = DichVu.IDDichVu
join LoaiDichVu on DichVu.IDLoaiDichVu = LoaiDichVU.IDLoaiDichVu
join HopDongChiTiet on HopDong.IDHopDong = HopDongChiTiet.IDHopDong
join DichVuDiKem on HopDongChiTiet.IDDichVuDiKem = DichVuDiKem.IDDichVuDiKem
group by DichVuDiKem.IDDichVuDiKem
having SoLanSuDung = (select max(BangThongKe2.SoLanSuDung)
					from (
					select DichVuDiKem.IDDichVuDiKem, count(*) as SoLanSuDung
					from HopDongChiTiet
					join DichVuDiKem on HopDongChiTiet.IDDichVuDiKem = DichVuDiKem.IDDichVuDiKem
					group by IDDichVuDiKem) as BangThongKe2);

-- TASK 14: Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất.
-- Thông tin hiển thị bao gồm IDHopDong, TenLoaiDichVu, TenDichVuDiKem, SoLanSuDung.
select HopDong.IDHopDong, TenLoaiDichVu, TenDichVuDiKem, count(DichVuDiKem.IDDIchVuDIKem) as SoLanSuDung
from HopDong
join DichVu on HopDong.IDDichVu = DichVu.IDDichVu
join LoaiDichVu on DichVu.IDLoaiDichVu = LoaiDichVU.IDLoaiDichVu
join HopDongChiTiet on HopDong.IDHopDong = HopDongChiTiet.IDHopDong
join DichVuDiKem on HopDongChiTiet.IDDichVuDiKem = DichVuDiKem.IDDichVuDiKem
group by DichVuDiKem.IDDichVuDiKem
having SoLanSuDung = 1;

-- TASK 15: Hiển thi thông tin của tất cả nhân viên bao gồm IDNhanVien, HoTen, TrinhDo, TenBoPhan, SoDienThoai, DiaChi mới chỉ
-- lập được tối đa 3 hợp đồng
 -- (từ năm 2018 đến 2019.)

select NhanVien.IDNhanVien, NhanVien.HoTen, TrinhDo, TenBoPhan, NhanVien.SDT as SoDienThoai, DiaChi
from NhanVien
join TrinhDo on NhanVien.IDTrinhDo = TrinhDo.IDTrinhDo
join BoPhan on NhanVien.IDBoPhan = BoPhan.IDBoPhan
left join HopDong on NhanVien.IDNhanVien = HopDong.IDNhanVien
group by NhanVien.IDNhanVien
having NhanVien.IDNhanVien not in (select IDNhanVien from HopDong)
or
count(HopDong.IDNhanVien) <= 3;

-- TASK 16: Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2018 đến năm 2020.
delete from NhanVien
where not exists (
select NhanVien.IDNhanVien
from HopDong
where year(NgayLamHopDong) between 2018 and 2020  
and HopDong.IDNhanVien = NhanVien.IDNhanVien)
and IDNhanVien > 0; -- this condition is to trick safe update mode.

-- TASK 17: Cập nhật thông tin những khách hàng có TenLoaiKhachHang từ  Platinium lên Diamond, chỉ cập nhật những khách hàng đã từng đặt phòng
-- với tổng Tiền thanh toán trong năm 2019 là lớn hơn 1500$.

-- CÁCH 1:
update KhachHang
set KhachHang.IDLoaiKhach = (select IDLoaiKhach from LoaiKhach where TenLoaiKhach = 'Diamond')
where KhachHang.IDLoaiKhach = (select IDLoaiKhach from LoaiKhach where TenLoaiKhach = 'Platinum')
and
KhachHang.IDKhachHang in (select IDKhachHang from (select HopDong.IDKhachHang, sum(HopDong.TongTien) as TongThanhToanTrongNam
													from HopDong
													where year(NgayLamHopDong) = 2019
													group by HopDong.IDKhachHang
													having TongThanhToanTrongNam > 1500) as temp);

-- CÁCH 2:                                                    
update KhachHang, (select HopDong.IDKhachHang, sum(HopDong.TongTien) as TongThanhToanTrongNam
													from HopDong
													where year(NgayLamHopDong) = 2019
													group by HopDong.IDKhachHang
													having TongThanhToanTrongNam > 1500) as temp
set KhachHang.IDLoaiKhach = (select IDLoaiKhach from LoaiKhach where TenLoaiKhach = 'Diamond')
where KhachHang.IDLoaiKhach = (select IDLoaiKhach from LoaiKhach where TenLoaiKhach = 'Platinum')
and KhachHang.IDKhachHang = temp.IDKhachHang;

-- TASK 18: Xóa những khách hàng có hợp đồng trước năm 2016 (chú ý ràng buộc giữa các bảng)
set SQL_SAFE_UPDATES = 0; -- turn-off-safe-update

delete KhachHang, HopDong, HopDongChiTiet
from KhachHang
inner join HopDong on KhachHang.IDKhachHang = HopDong.IDKhachHang
inner join HopDongChiTiet on HopDong.IDHopDong = HopDongChiTiet.IDHopDong
where not exists (select HopDong.IDHopDong
					where year (NgayLamHopDong) > 2016
					and KhachHang.IDKhachHang = HopDong.IDKhachHang);
set SQL_SAFE_UPDATES = 1; -- turn-on-safe-update

-- TASK 19: Cập nhật giá cho các Dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2019 lên gấp đôi.
update DichVuDiKem
inner join (select TenDichVuDiKem 
			from HopDongChiTiet 
            inner join DichVuDiKem on DichVuDiKem.IDDichVuDiKem = HopDongChiTiet.IDDichVuDiKem
            group by DichVuDiKem.IDDichVuDiKem
            having count(HopDongChiTiet.IDDichVuDiKem) > 10) as temp
set DichVuDiKem.Gia = DichVuDiKem.Gia * 2
where DichVuDiKem.TenDichVuDiKem = temp.TenDichVuDiKem
and IDDichVuDiKem > 0; -- this condition is to trick safe update mode instead of using SQL_SAFE_UPDATES = 0.

-- TASK 20: Hiển thị thông tin của tất cả các Nhân viên và Khách hàng có trong hệ thống, thông tin hiển thị
-- bao gồm ID (IDNhanVien, IDKhachHang), HoTen, Email, SoDienThoai, NgaySinh, DiaChi.
select NhanVien.IDNhanVien, NhanVien.HoTen, NhanVien.Email, NhanVien.SDT, NhanVien.NgaySinh, NhanVien.DiaChi, "NhanVien" as fromTable
from NhanVien
union all
select KhachHang.IDKhachHang, KhachHang.HoTen, KhachHang.Email, KhachHang.SDT, KhachHang.NgaySinh, KhachHang.DiaChi, "KhachHang" as fromTable
from KhachHang;

                    

