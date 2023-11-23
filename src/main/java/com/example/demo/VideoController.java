package com.example.demo;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class VideoController {

    @MessageMapping("/videoFrame")
    @SendTo("/topic/videoFrames")
    public VideoFrame sendVideoFrame(VideoFrame videoFrame) {
        return new VideoFrame(videoFrame.getFrame());
    }
}