package records.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import records.entities.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Integer> {
}
