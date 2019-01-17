package records.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import records.entities.Record;
import records.repository.RecordRepository;

import java.util.List;

@Service
public class RecordService {

    @Autowired
    private RecordRepository recordRepository;

    public List<Record> findAll(Integer page) {
        Pageable pageable = PageRequest.of(page, 10);
        Page<Record> pageList = recordRepository.findAll(pageable);
        return pageList.getContent();
    }
}
