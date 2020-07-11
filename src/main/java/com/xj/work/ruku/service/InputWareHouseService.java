package com.xj.work.ruku.service;

        import com.xj.work.common.PaginationData;
        import com.xj.work.ruku.entity.dto.InputWareHouseDTO;
        import com.xj.work.ruku.entity.vo.StoreVo;

        import java.util.List;

/**
 * @description
 * @Author jianglinfeng
 * @Date 2020/7/10 0010
 **/
public interface InputWareHouseService {
    String ruKuWeiHu(InputWareHouseDTO inputWareHouseDTO);

    PaginationData<List<StoreVo>> getstoreListList(InputWareHouseDTO inputWareHouseDTO);
}

