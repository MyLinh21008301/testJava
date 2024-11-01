package iuh.se.repository;

import java.util.List;
import java.util.Optional;

public interface IRepository<T> {
	boolean them(T t);
	boolean xoa(T t);
	boolean capNhat(T t);
	List<T> layDS();
	Optional<T> layTheoMa(Object...objects);
}
