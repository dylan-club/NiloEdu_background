package com.nicklaus.servicevideo.service.impl;

import com.nicklaus.servicevideo.entity.Video;
import com.nicklaus.servicevideo.mapper.VideoMapper;
import com.nicklaus.servicevideo.service.VideoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author nicklaus
 * @since 2020-12-09
 */
@Service
public class VideoServiceImpl extends ServiceImpl<VideoMapper, Video> implements VideoService {

}
