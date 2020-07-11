package com.xj.work.ruku.service.Impl;

import com.xj.work.common.PaginationData;
import com.xj.work.ruku.entity.dto.InputWareHouseDTO;
import com.xj.work.ruku.entity.vo.StoreVo;
import com.xj.work.ruku.service.InputWareHouseService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @description
 * @Author jianglinfeng
 * @Date 2020/7/10 0010
        **/
@Service
public class InputWareHouseServiceImpl implements InputWareHouseService {
    @Override
    public String ruKuWeiHu(InputWareHouseDTO inputWareHouseDTO) {
        String mRID = null;
        if (inputWareHouseDTO.getOperateMode().equals("add")){
            mRID = "";


        }else if (inputWareHouseDTO.getOperateMode().equals("update")){
            if (!StringUtils.isEmpty(inputWareHouseDTO.getStoreVo().getMRID())){
                throw new RuntimeException("记录已存在！");
            }
        }else if (inputWareHouseDTO.getOperateMode().equals("delete")){

        }

        return mRID;
    }

    @Override
    public PaginationData<List<StoreVo>> getstoreListList(InputWareHouseDTO inputWareHouseDTO) {

        return null;
    }
}
