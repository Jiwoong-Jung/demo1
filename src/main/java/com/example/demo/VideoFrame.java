package com.example.demo;

public class VideoFrame {
    private byte[] frame;

    public VideoFrame() {
    }

    public VideoFrame(byte[] frame) {
        this.frame = frame;
    }

    public byte[] getFrame() {
        return frame;
    }

    public void setFrame(byte[] frame) {
        this.frame = frame;
    }
}