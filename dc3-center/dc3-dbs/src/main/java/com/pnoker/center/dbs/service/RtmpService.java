/*
 * Copyright 2019 Pnoker. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.pnoker.center.dbs.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.pnoker.common.model.rtmp.Rtmp;

import java.util.List;

/**
 * <p>Copyright(c) 2019. Pnoker All Rights Reserved.
 * <p>Author     : Pnoker
 * <p>Email      : pnokers@gmail.com
 * <p>Description: Rtmp 服务接口
 */
public interface RtmpService {
    /**
     * 获取 Rtmp任务 数据列表
     *
     * @return
     */
    List<Rtmp> list(Wrapper<Rtmp> wrapper);

    int insert(Rtmp rtmp);
}
