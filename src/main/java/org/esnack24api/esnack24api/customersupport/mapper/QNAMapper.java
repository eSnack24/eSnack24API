package org.esnack24api.esnack24api.customersupport.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.esnack24api.esnack24api.customersupport.dto.QNADetailDTO;
import org.esnack24api.esnack24api.customersupport.dto.QNAListDTO;
import java.util.List;

@Mapper
public interface QNAMapper {
    // 내가 작성한 QNA 목록 조회QQ
    List<QNAListDTO> selectMyQNAList(int uno);

    // QNA 상세 내용 조회
    QNADetailDTO selectQNADetail(int qno);
}