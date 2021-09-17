package camp.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import camp.dto.BeerDTO;
import camp.entity.Beer;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
