package com.discord.org.webrtc;

import com.discord.org.webrtc.Camera2Session;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements VideoSink {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;

    public /* synthetic */ a(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }

    @Override // com.discord.org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                ((Camera1Session) obj).lambda$listenForTextureFrames$0(videoFrame);
                return;
            default:
                Camera2Session.CaptureSessionCallback.a((Camera2Session.CaptureSessionCallback) obj, videoFrame);
                return;
        }
    }
}
