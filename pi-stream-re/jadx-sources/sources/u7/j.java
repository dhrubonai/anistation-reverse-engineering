package u7;

import f9.x;
import java.util.concurrent.TimeUnit;
import r6.h0;
import t7.y;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f10321a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f10322b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f10323c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f10324d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f10325e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f10326f;

    /* renamed from: g, reason: collision with root package name */
    public static final x f10327g;

    /* renamed from: h, reason: collision with root package name */
    public static final x f10328h;

    static {
        String str;
        int i10 = y.f10092a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f10321a = str;
        f10322b = h0.T0("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i11 = y.f10092a;
        if (i11 < 2) {
            i11 = 2;
        }
        f10323c = h0.U0("kotlinx.coroutines.scheduler.core.pool.size", i11, 1, 0, 8);
        f10324d = h0.U0("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f10325e = TimeUnit.SECONDS.toNanos(h0.T0("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f10326f = f.f10316g;
        f10327g = new x(0);
        f10328h = new x(1);
    }
}
