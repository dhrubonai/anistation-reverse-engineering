package c1;

import java.io.IOException;

/* loaded from: classes.dex */
public class r0 extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1887a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1888b;

    public r0(String str, Exception exc, boolean z9, int i10) {
        super(str, exc);
        this.f1887a = z9;
        this.f1888b = i10;
    }

    public static r0 a(String str, RuntimeException runtimeException) {
        return new r0(str, runtimeException, true, 1);
    }

    public static r0 b(String str, Exception exc) {
        return new r0(str, exc, true, 4);
    }

    public static r0 c(String str) {
        return new r0(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return super.getMessage() + "{contentIsMalformed=" + this.f1887a + ", dataType=" + this.f1888b + "}";
    }
}
