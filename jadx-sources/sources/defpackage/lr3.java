package defpackage;

import android.graphics.Shader;
import android.media.metrics.LogSessionId;
import android.view.View;
import android.window.SplashScreenView;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract /* synthetic */ class lr3 {
    public static /* bridge */ /* synthetic */ Shader.TileMode e() {
        return Shader.TileMode.DECAL;
    }

    public static /* bridge */ /* synthetic */ LogSessionId g() {
        return LogSessionId.LOG_SESSION_ID_NONE;
    }

    public static /* bridge */ /* synthetic */ SplashScreenView j(View view) {
        return (SplashScreenView) view;
    }

    public static /* bridge */ /* synthetic */ String k(LogSessionId logSessionId) {
        return logSessionId.getStringId();
    }

    public static /* bridge */ /* synthetic */ boolean x(LogSessionId logSessionId) {
        return logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE);
    }

    public static /* bridge */ /* synthetic */ boolean y(View view) {
        return view instanceof SplashScreenView;
    }
}
