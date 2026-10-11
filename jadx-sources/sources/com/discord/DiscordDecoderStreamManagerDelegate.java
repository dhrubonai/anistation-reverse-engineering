package com.discord;

import android.view.Surface;
import com.discord.org.webrtc.AndroidVideoDecoder;
import java.util.function.Consumer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface DiscordDecoderStreamManagerDelegate {
    void addOnConsumerReadyListener(String str, Consumer<Surface> consumer);

    Surface getStreamConsumer(String str);

    void registerStreamProducer(String str, AndroidVideoDecoder androidVideoDecoder);

    void removeOnConsumerReadyListener(String str, Consumer<Surface> consumer);
}
