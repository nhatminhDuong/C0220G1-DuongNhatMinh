select nhanvien.idNhanVien, nhanvien.hoTen, trinhdo.TrinhDo,bophan.tenBoPhan,nhanvien.SDT,nhanvien.diaChi
from nhanvien
join trinhdo on nhanvien.idTrinhDo = trinhdo.idTrinhDo
join bophan on nhanvien.idBoPhan = bophan.idBoPhan
 -- left join hopdong on hopdong.IdNhanVien = nhanvien.IDNhanVien
where exists (
	select idHopDong
    from hopdong
    where (year(hopdong.ngayLamHopDong) = 2018) and hopdong.idNhanVien = nhanvien.idNhanVien
    group by hopdong.idNhanVien
    having  count(hopdong.idNhanVien) <= 3)
 or not exists(
	select idNhanVien
    from hopdong
    where  hopdong.idNhanVien = nhanvien.idNhanVien)
or exists(
	select IDHopDong
    from hopdong
    where (IDHopDong in (select IDHopDong from (select IDNhanVien, IDhopDong, NgayLamHopDong
		from (
	select IDNhanVien, IDhopDong, NgayLamHopDong
		from (
		select IDNhanVien, year(NgayLamHopDong) as Nam, IDhopDong, NgayLamHopDong
			from hopdong
			order by IDNhanVien) as temp
			where Nam <> 2018) as temp1
			where IDNhanVien not in (select IDNhanVien
			from (
			select IDNhanVien, year(NgayLamHopDong) as Nam, IDhopDong, NgayLamHopDong
				from hopdong
				order by IDNhanVien) as temp
				where Nam = 2018)) as temp)) and hopdong.idNhanVien = nhanvien.idNhanVien
					group by hopdong.idNhanVien
    );