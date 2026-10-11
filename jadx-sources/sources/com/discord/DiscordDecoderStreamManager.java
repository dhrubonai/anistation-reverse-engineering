package com.discord;

import android.view.Surface;
import com.discord.org.webrtc.AndroidVideoDecoder;
import defpackage.ze0;
import java.util.function.Consumer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class DiscordDecoderStreamManager {
    private static DiscordDecoderStreamManagerDelegate delegate = null;
    private static boolean surfaceDirectPathEnabled = false;

    public static void addOnConsumerReadyListener(String str, Consumer<Surface> consumer) {
        checkDelegate();
        delegate.addOnConsumerReadyListener(str, consumer);
    }

    private static void checkDelegate() {
        if (delegate != null) {
            return;
        }
        ze0.m("DiscordDecoderStreamManagerDelegate cannot be null.");
    }

    public static Surface getStreamConsumer(String str) {
        checkDelegate();
        return delegate.getStreamConsumer(str);
    }

    public static boolean isSurfaceDirectPathEnabled() {
        return surfaceDirectPathEnabled;
    }

    public static void registerStreamProducer(String str, AndroidVideoDecoder androidVideoDecoder) {
        checkDelegate();
        delegate.registerStreamProducer(str, androidVideoDecoder);
    }

    public static void removeOnConsumerReadyListener(String str, Consumer<Surface> consumer) {
        checkDelegate();
        delegate.removeOnConsumerReadyListener(str, consumer);
    }

    public static DiscordDecoderStreamManagerDelegate setDelegate(DiscordDecoderStreamManagerDelegate discordDecoderStreamManagerDelegate) {
        delegate = discordDecoderStreamManagerDelegate;
        return discordDecoderStreamManagerDelegate;
    }

    public static void setSurfaceDirectPathEnabled(boolean z) {
        surfaceDirectPathEnabled = z;
    }
}
