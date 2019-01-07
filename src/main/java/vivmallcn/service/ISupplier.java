package vivmallcn.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import vivmallcn.domain.Supplier;

public interface ISupplier {
	List<Supplier> findAll();

	boolean isExists(String id);

	Supplier save(Supplier supplier);

	Supplier findByid(String id);

	void active(String[] arr_id);

	void disabled(String[] arr_id);

	void delete(String[] arr_id);

	void delete(String id);
	
	Page<Supplier> findAll(Pageable pageable);
}
