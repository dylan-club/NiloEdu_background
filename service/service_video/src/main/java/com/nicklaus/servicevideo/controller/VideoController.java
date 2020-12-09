package com.nicklaus.servicevideo.controller;



import com.nicklaus.commonbase.Result;
import com.nicklaus.servicevideo.service.VideoService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author nicklaus
 * @since 2020-12-09
 */
@RestController
@RequestMapping("/serviceVideo/video")
@Api(tags = "Android调用后台视频api")
public class VideoController {

    @Autowired
    private VideoService videoService;

    @GetMapping("findVideoList")
    public Result getAllVideoList(){
        return Result.ok().data("videos", videoService.list(null));
    }
}

