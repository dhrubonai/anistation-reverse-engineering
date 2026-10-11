package h1;

import java.io.IOException;

/* loaded from: classes.dex */
public class i extends IOException {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f4582b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f4583a;

    public i(int i10) {
        this.f4583a = i10;
    }

    public i(int i10, Throwable th) {
        super(th);
        this.f4583a = i10;
    }

    public i(String str, int i10) {
        super(str);
        this.f4583a = i10;
    }

    public i(int i10, String str, Throwable th) {
        super(str, th);
        this.f4583a = i10;
    }
}
