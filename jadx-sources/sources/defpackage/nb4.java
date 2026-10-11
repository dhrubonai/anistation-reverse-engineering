package defpackage;

import com.google.android.gms.cast.framework.media.internal.ResourceProvider;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nb4 {
    public List a = ob4.f0;
    public int[] b = ob4.g0;
    public final int c = b("smallIconDrawableResId");
    public final int d = b("stopLiveStreamDrawableResId");
    public final int e = b("pauseDrawableResId");
    public final int f = b("playDrawableResId");
    public final int g = b("skipNextDrawableResId");
    public final int h = b("skipPrevDrawableResId");
    public final int i = b("forwardDrawableResId");
    public final int j = b("forward10DrawableResId");
    public final int k = b("forward30DrawableResId");
    public final int l = b("rewindDrawableResId");
    public final int m = b("rewind10DrawableResId");
    public final int n = b("rewind30DrawableResId");
    public final int o = b("disconnectDrawableResId");

    public static int b(String str) {
        try {
            Map map = ResourceProvider.a;
            Integer num = (Integer) ResourceProvider.class.getMethod("findResourceByName", String.class).invoke(null, str);
            if (num != null) {
                return num.intValue();
            }
            return 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return 0;
        }
    }

    public final ob4 a() {
        return new ob4(this.a, this.b, 10000L, null, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, b("notificationImageSizeDimenResId"), b("castingToDeviceStringResId"), b("stopLiveStreamStringResId"), b("pauseStringResId"), b("playStringResId"), b("skipNextStringResId"), b("skipPrevStringResId"), b("forwardStringResId"), b("forward10StringResId"), b("forward30StringResId"), b("rewindStringResId"), b("rewind10StringResId"), b("rewind30StringResId"), b("disconnectStringResId"), null, false, false);
    }
}
