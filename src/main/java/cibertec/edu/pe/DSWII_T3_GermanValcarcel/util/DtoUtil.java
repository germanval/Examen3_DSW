package cibertec.edu.pe.DSWII_T3_GermanValcarcel.util;

import cibertec.edu.pe.DSWII_T3_GermanValcarcel.model.dto.DtoEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class DtoUtil {
    public DtoEntity convertirtADto(Object obj, DtoEntity mapper){
        return new ModelMapper().map(obj,mapper.getClass());
    }
    public Object convertirDtoEntity(Object obj, DtoEntity mapper){
        return new ModelMapper().map(mapper,obj.getClass());
    }
}
