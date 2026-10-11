package com.discord.org.webrtc;

import android.media.MediaCodecInfo;
import com.discord.org.webrtc.EglBase;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class HardwareVideoDecoderFactory extends MediaCodecVideoDecoderFactory {
    private static final Predicate<MediaCodecInfo> defaultAllowedPredicate = new Predicate<MediaCodecInfo>() { // from class: com.discord.org.webrtc.HardwareVideoDecoderFactory.1
        @Override // com.discord.org.webrtc.Predicate
        public boolean test(MediaCodecInfo mediaCodecInfo) {
            return MediaCodecUtils.isHardwareAccelerated(mediaCodecInfo);
        }
    };

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public HardwareVideoDecoderFactory(com.discord.org.webrtc.EglBase.Context r2, com.discord.org.webrtc.Predicate<android.media.MediaCodecInfo> r3) {
        /*
            r1 = this;
            if (r3 != 0) goto L5
            com.discord.org.webrtc.Predicate<android.media.MediaCodecInfo> r3 = com.discord.org.webrtc.HardwareVideoDecoderFactory.defaultAllowedPredicate
            goto Lb
        L5:
            com.discord.org.webrtc.Predicate<android.media.MediaCodecInfo> r0 = com.discord.org.webrtc.HardwareVideoDecoderFactory.defaultAllowedPredicate
            com.discord.org.webrtc.Predicate r3 = r3.and(r0)
        Lb:
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.org.webrtc.HardwareVideoDecoderFactory.<init>(com.discord.org.webrtc.EglBase$Context, com.discord.org.webrtc.Predicate):void");
    }

    @Override // com.discord.org.webrtc.MediaCodecVideoDecoderFactory, com.discord.org.webrtc.VideoDecoderFactory
    public /* bridge */ /* synthetic */ VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        return super.createDecoder(videoCodecInfo);
    }

    @Override // com.discord.org.webrtc.MediaCodecVideoDecoderFactory, com.discord.org.webrtc.VideoDecoderFactory
    public /* bridge */ /* synthetic */ VideoCodecInfo[] getSupportedCodecs() {
        return super.getSupportedCodecs();
    }

    public HardwareVideoDecoderFactory(EglBase.Context context) {
        this(context, null);
    }

    @Deprecated
    public HardwareVideoDecoderFactory() {
        this(null);
    }
}
