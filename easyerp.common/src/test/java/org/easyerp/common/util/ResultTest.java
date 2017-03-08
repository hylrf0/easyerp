package org.easyerp.common.util;

import org.junit.Test;

/**
 * Created by Administrator on 2017/3/8 0008.
 */
public class ResultTest {

    @Test
    public void resultTest() {
        Result result = Result.warpErrorResult(ErrorCode.LOGIN_FAILED);
    }
}
