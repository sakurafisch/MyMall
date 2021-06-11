package com.winnerwinter.mymall.service;

import com.winnerwinter.mymall.common.api.CommonResult;


public interface UmsMemberService {
    CommonResult generateAuthCode(String telephone);

    CommonResult verifyAuthCode(String telephone, String authCode);
}
