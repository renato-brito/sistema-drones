package br.com.fiap.kafkamessage.repository;

import br.com.fiap.kafkamessage.dto.DroneInfoDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DroneInfoDTORepository extends MongoRepository<DroneInfoDTO, Long> {
}
