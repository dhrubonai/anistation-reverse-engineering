package h0;

import android.app.Notification;
import android.content.Context;
import android.media.AudioFocusRequest;

/* loaded from: classes.dex */
public abstract /* synthetic */ class f {
    public static /* synthetic */ Notification.Builder c(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static /* synthetic */ AudioFocusRequest.Builder e(int i10) {
        return new AudioFocusRequest.Builder(i10);
    }

    public static /* synthetic */ AudioFocusRequest.Builder i(AudioFocusRequest audioFocusRequest) {
        return new AudioFocusRequest.Builder(audioFocusRequest);
    }

    public static /* synthetic */ void m() {
    }
}
